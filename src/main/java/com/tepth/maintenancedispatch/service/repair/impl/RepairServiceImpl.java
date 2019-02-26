package com.tepth.maintenancedispatch.service.repair.impl;

import com.tepth.maintenancedispatch.comm.Global;
import com.tepth.maintenancedispatch.comm.QueryPage;
import com.tepth.maintenancedispatch.comm.RepairStatusEnum;
import com.tepth.maintenancedispatch.comm.RspCodeEnum;
import com.tepth.maintenancedispatch.dao.mapper.repair.FaultPhenomenonMapper;
import com.tepth.maintenancedispatch.dao.mapper.repair.RepairMapper;
import com.tepth.maintenancedispatch.dao.model.repair.Repair;
import com.tepth.maintenancedispatch.dto.*;
import com.tepth.maintenancedispatch.dto.inner.*;
import com.tepth.maintenancedispatch.exception.ServiceException;
import com.tepth.maintenancedispatch.service.repair.IRepairService;
import com.tepth.maintenancedispatch.util.CommonUtil;
import com.tepth.maintenancedispatch.util.PageUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

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
    @Autowired
    FaultPhenomenonMapper faultPhenomenonMapper;

    @Override
    public PageResponse<RepairVO> queryRepairListByPageStatusArr(GetRepairListPagingRequest request) {
        PageResponse<RepairVO> response = new PageResponse<>();
        UserInfo userInfo = request.getUser();
        QueryPage page = Global.getQueryPage(request);
        Map<String, Object> map = new HashMap<>();
        map.put("queryPage", page);
        map.put("processStatus", request.getProcessStatus());
        map.put("organizationId", userInfo.getOrganizationId());
        List<RepairVO> repairList = repairMapper.queryListByPageWithProcessStatus(map);
        if (repairList != null){
            repairList.sort(Comparator.comparing(RepairVO::getGmtCreate));
        }
        long total = repairMapper.queryListByPageCountWithProcessStatus(map);
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
        map.put("status", request.getStatus());
        map.put("organizationId", userInfo.getOrganizationId());
        map.put("startDate", request.getStartDate());
        map.put("endDate", request.getEndDate());
        map.put("workerId", request.getEndDate());
        map.put("driverId", request.getEndDate());
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
    public BaseResponse exchangeVehicleToWorker(RepairIdRequest request) {
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
    public BaseResponse exchangeVehicleToDriver(RepairIdRequest request) {
        BaseResponse response = new BaseResponse();
        Repair repair = repairMapper.selectByPrimaryKey(request.getRepairId());
        if (repair == null){
            throw new ServiceException(RspCodeEnum.USER_NOT_EXISTS.getCode(), RspCodeEnum.USER_NOT_EXISTS.getDesc());
        }
        if (!RepairStatusEnum.COMPLETE_CHECK.getCode().equals(repair.getStatus())){
            throw new ServiceException(RspCodeEnum.VEHICLE_WRONG_STATUS.getCode(), RspCodeEnum.VEHICLE_WRONG_STATUS.getDesc());
        }
        repair.setStatus(RepairStatusEnum.EXCHANGE_TO_DRIVER.getCode());
        repair.setGmtModified(new Date());
        repairMapper.updateByPrimaryKeySelective(repair);
        return response;
    }

    @Override
    public GetPhenamenonResponse queryFaultList(RepairIdRequest request) {
        GetPhenamenonResponse response = new GetPhenamenonResponse();
        Repair repair = repairMapper.selectByPrimaryKey(request.getRepairId());
        if (repair == null){
            throw new ServiceException(RspCodeEnum.USER_NOT_EXISTS.getCode(), RspCodeEnum.USER_NOT_EXISTS.getDesc());
        }
        String phenomenonStr = repair.getFaultPhenomenonId();
        if (CommonUtil.isEmpty(phenomenonStr)){
            return response;
        }
        String[] phenomenonArr = phenomenonStr.split(",");
        List<Phenomenon> phenomenonList = new ArrayList<>();
        for (String s : phenomenonArr) {
            Phenomenon phenomenon = faultPhenomenonMapper.queryPhenomenonInfoById(Integer.parseInt(s));
            phenomenonList.add(phenomenon);
        }
        response.setFaults(phenomenonList);
        return response;
    }

    @Override
    public GetRepairDetailResponse queryRepairDetail(Integer repairId) {
        GetRepairDetailResponse response = new GetRepairDetailResponse();
        //工单
        RepairDetail repairDetail = repairMapper.selectRepairDetailById(repairId);
        if (repairDetail!= null){
            //故障
            String faultIdStr = repairDetail.getFaultPhenomenonId();
            if (!StringUtils.isEmpty(faultIdStr)){
                List<Phenomenon> phenomenonList = new ArrayList<>();
                String[] faultArr = faultIdStr.split(",");
                for (String s : faultArr) {
                    Phenomenon phenomenon = faultPhenomenonMapper.queryPhenomenonInfoById(Integer.parseInt(s));
                    phenomenonList.add(phenomenon);
                }
                repairDetail.setFaults(phenomenonList);
            }
            //作业项
            List<RepairPlan> plans = new ArrayList<>();
            String sysIdStr = repairDetail.getSysFaultDiagnosticId();
            if (!StringUtils.isEmpty(sysIdStr)){
                String[] sysIdArr = sysIdStr.split(",");
                for (String s : sysIdArr) {
                    List<RepairPlan> list = repairMapper.selectSysRepairPlanByDiaId(Integer.parseInt(s));
                    plans.addAll(list);
                }
            }
            String tempIdStr = repairDetail.getTempFaultDiagnosticId();
            if (!StringUtils.isEmpty(tempIdStr)){
                String[] tempIdArr = tempIdStr.split(",");
                for (String s : tempIdArr) {
                    List<RepairPlan> list = repairMapper.selectTempRepairPlanByDiaId(Integer.parseInt(s));
                    plans.addAll(list);
                }
            }
            //TODO 操作记录 领料记录
        }
        return response;
    }
}
