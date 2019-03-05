package com.tepth.maintenancedispatch.service.repair.impl;

import com.alibaba.fastjson.JSONObject;
import com.tepth.maintenancedispatch.comm.*;
import com.tepth.maintenancedispatch.dao.mapper.material.MaterialApplyMapper;
import com.tepth.maintenancedispatch.dao.mapper.repair.FaultPhenomenonMapper;
import com.tepth.maintenancedispatch.dao.mapper.repair.RepairMapper;
import com.tepth.maintenancedispatch.dao.mapper.vehicle.VehicleAlarmMapper;
import com.tepth.maintenancedispatch.dao.model.repair.Repair;
import com.tepth.maintenancedispatch.dto.*;
import com.tepth.maintenancedispatch.dto.inner.*;
import com.tepth.maintenancedispatch.exception.ServiceException;
import com.tepth.maintenancedispatch.service.repair.IRepairService;
import com.tepth.maintenancedispatch.util.CommonUtil;
import com.tepth.maintenancedispatch.util.HttpUtil;
import com.tepth.maintenancedispatch.util.PageUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.nio.charset.Charset;
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
    @Autowired
    VehicleAlarmMapper vehicleAlarmMapper;
    @Autowired
    MaterialApplyMapper materialApplyMapper;

    @Value("${url.alarm.type}")
    String alarmTypeUrl;
    @Value("${url.alarm.history}")
    String alarmHistoryUrl;

    private String appId = "vmApi2";
    private String authKey = "C85756EDA6EF41E983985836BCFC5BA2";
    private String workCode = "TepthV201";
    private String sourceType = "Bus_CQ";

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
        map.put("workerId", request.getWorkerId());
        map.put("driverId", request.getDriverId());
        map.put("vehicleId", request.getVehicleId());
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
        //判断当前工位是否有作业中的车辆
        long count = repairMapper.countByProcessStatusAndAreaId(Constant.PROCESS_STATUS_WORKING, repair.getFactoryAreaId());
        if (count>0){
            response.setCode(ErrorConstant.STATION_WORKING_CODE);
            response.setMsg(ErrorConstant.STATION_WORKING_MSG);
            return response;
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
            repairDetail.setWorks(plans);
            //领料记录
            List<Material> materials = materialApplyMapper.queryMaterialByRepairId(repairDetail.getId());
            repairDetail.setMaterials(materials);
            //TODO 操作记录

        }
        response.setRepairDetail(repairDetail);
        return response;
    }

    @Override
    public String queryAlarmListByPage(GetAlarmListRequest request) {

        String[] listVehicleCode = {request.getVehicleNo()};
        Date startDate = request.getStartDate();
        Date endDate = request.getEndDate();
        Integer alarmLevel = request.getAlarmLevel();
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("appId", appId);
        jsonObject.put("authKey", authKey);
        jsonObject.put("workCode", workCode);
        jsonObject.put("sourceType", sourceType);
        jsonObject.put("listVehicleCode", listVehicleCode);
        jsonObject.put("startDate", startDate);
        jsonObject.put("endDate", endDate);
        jsonObject.put("alarmLevel", alarmLevel);
        HttpHeaders requestHeaders = new HttpHeaders();
        requestHeaders.set("Content-Type", "application/json;charset=utf-8");
        requestHeaders.setAcceptCharset(Arrays.asList(Charset.forName("utf-8")));
        HttpEntity<String> requestEntity = new HttpEntity<>(jsonObject.toJSONString(), requestHeaders);
        String responseStr = HttpUtil.commHttpRequest(alarmHistoryUrl, HttpMethod.POST, requestEntity, String.class);

        return responseStr;
    }

    @Override
    public String queryAlarmType() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("appId", appId);
        jsonObject.put("authKey", authKey);
        jsonObject.put("workCode", workCode);
        jsonObject.put("sourceType", sourceType);
        HttpHeaders requestHeaders = new HttpHeaders();
        requestHeaders.set("Content-Type", "application/json;charset=utf-8");
        requestHeaders.setAcceptCharset(Arrays.asList(Charset.forName("utf-8")));
        HttpEntity<String> requestEntity = new HttpEntity<>(jsonObject.toJSONString(), requestHeaders);
        String responseStr = HttpUtil.commHttpRequest(alarmTypeUrl, HttpMethod.POST, requestEntity, String.class);
        System.out.println(responseStr);
        return responseStr;
    }
}
