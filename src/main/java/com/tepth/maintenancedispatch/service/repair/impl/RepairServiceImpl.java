package com.tepth.maintenancedispatch.service.repair.impl;

import com.tepth.maintenancedispatch.comm.Global;
import com.tepth.maintenancedispatch.comm.QueryPage;
import com.tepth.maintenancedispatch.comm.RepairStatusEnum;
import com.tepth.maintenancedispatch.comm.RspCodeEnum;
import com.tepth.maintenancedispatch.dao.mapper.repair.RepairMapper;
import com.tepth.maintenancedispatch.dao.model.repair.Repair;
import com.tepth.maintenancedispatch.dto.AddRepairRequest;
import com.tepth.maintenancedispatch.dto.DistributStationRequest;
import com.tepth.maintenancedispatch.dto.ExchangeRequest;
import com.tepth.maintenancedispatch.dto.GetRepairListPagingRequest;
import com.tepth.maintenancedispatch.dto.inner.BaseResponse;
import com.tepth.maintenancedispatch.dto.inner.PageResponse;
import com.tepth.maintenancedispatch.dto.inner.RepairVO;
import com.tepth.maintenancedispatch.dto.inner.UserInfo;
import com.tepth.maintenancedispatch.exception.ServiceException;
import com.tepth.maintenancedispatch.service.repair.IRepairService;
import com.tepth.maintenancedispatch.util.PageUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * @Author royle.huang
 * @Date 2019/2/19 14:02
 * @Description 维修工单service
 **/
@Service
@Slf4j
public class RepairServiceImpl implements IRepairService {

    @Autowired
    RepairMapper repairMapper;

    @Override
    public PageResponse<RepairVO> queryRepairListByPageStatusArr(GetRepairListPagingRequest request) {
        PageResponse<RepairVO> response = new PageResponse<>();
        UserInfo userInfo = request.getUser();
        QueryPage page = Global.getQueryPage(request);
        Map<String, Object> map = new HashMap<>();
        map.put("queryPage", page);
        map.put("statusArr", request.getStatusArr());
        map.put("organizationId", userInfo.getOrganizationId());
        List<RepairVO> repairList = repairMapper.queryListByPageWithStatusArr(map);
        if (repairList != null){
            repairList.sort(Comparator.comparing(RepairVO::getGmtCreate));
        }
        long total = repairMapper.queryListByPageCountWithStatusArr(map);
        response.setPageList(repairList);
        response.setTotalCount(total);
        response.setTotalPage(PageUtil.getTotalPage(total, request.getRow()));
        return response;
    }

    @Override
    public BaseResponse addRepairInfo(AddRepairRequest request) {
        BaseResponse response = new BaseResponse();
        //TODO 调用司机端接口 添加
        return response;
    }

    @Override
    public PageResponse<RepairVO> queryRepairListByPageComm(GetRepairListPagingRequest request) {
        PageResponse<RepairVO> response = new PageResponse<>();
        UserInfo userInfo = request.getUser();
        QueryPage page = Global.getQueryPage(request);
        Map<String, Object> map = new HashMap<>();
        map.put("queryPage", page);
        map.put("type", request.getType());
        map.put("isMyDeal", request.getIsMyDeal());
        map.put("areaId", request.getAreaId());
        map.put("orgGroupId", request.getOrgGroupId());
        map.put("keyword", request.getKeyWord());
        map.put("status", request.getStatusArr());
        map.put("organizationId", userInfo.getOrganizationId());
        map.put("startDate", request.getStartDate());
        map.put("endDate", request.getEndDate());
        List<RepairVO> repairList = repairMapper.queryListByPage(map);
        long total = repairMapper.queryListByPageCount(map);
        response.setPageList(repairList);
        response.setTotalCount(total);
        response.setTotalPage(PageUtil.getTotalPage(total, page.getPageSize()));
        return response;
    }

    @Override
    public BaseResponse distributeWorkStation(DistributStationRequest request) {
        BaseResponse response = new BaseResponse();
        Integer repairId = request.getRepair();
        Integer groupId = request.getGroup();
        Integer stationId = request.getStation();
        Repair repair = repairMapper.selectByPrimaryKey(repairId);
        if (repair == null){
            throw new ServiceException(RspCodeEnum.USER_NOT_EXISTS.getCode(), RspCodeEnum.USER_NOT_EXISTS.getDesc());
        }
        repair.setOrgGroupId(groupId);
        repair.setFactoryAreaId(stationId);
        repair.setGmtModified(new Date());
        repairMapper.updateByPrimaryKeySelective(repair);
        return response;

    }

    @Override
    public BaseResponse exchangeVehicleToWorker(ExchangeRequest request) {
        BaseResponse response = new BaseResponse();
        Repair repair = repairMapper.selectByPrimaryKey(request.getRepairId());
        if (repair == null){
            throw new ServiceException(RspCodeEnum.USER_NOT_EXISTS.getCode(), RspCodeEnum.USER_NOT_EXISTS.getDesc());
        }
        if (!RepairStatusEnum.BACK_TO_FACTORY.getCode().equals(repair.getStatus())){
            throw new ServiceException(RspCodeEnum.VEHICLE_WRONG_STATUS.getCode(), RspCodeEnum.VEHICLE_WRONG_STATUS.getDesc());
        }
        repair.setStatus(RepairStatusEnum.EXCHANGE_TO_WORKER.getCode());
        repair.setGmtModified(new Date());
        repairMapper.updateByPrimaryKeySelective(repair);
        return response;
    }

    @Override
    public BaseResponse exchangeVehicleToDriver(ExchangeRequest request) {
        BaseResponse response = new BaseResponse();
        Repair repair = repairMapper.selectByPrimaryKey(request.getRepairId());
        if (repair == null){
            throw new ServiceException(RspCodeEnum.USER_NOT_EXISTS.getCode(), RspCodeEnum.USER_NOT_EXISTS.getDesc());
        }
        if (!RepairStatusEnum.VEHICLE_INSPECTION.getCode().equals(repair.getStatus())){
            throw new ServiceException(RspCodeEnum.VEHICLE_WRONG_STATUS.getCode(), RspCodeEnum.VEHICLE_WRONG_STATUS.getDesc());
        }
        repair.setStatus(RepairStatusEnum.EXCHANGE_TO_DRIVER.getCode());
        repair.setGmtModified(new Date());
        repairMapper.updateByPrimaryKeySelective(repair);
        return response;
    }
}
