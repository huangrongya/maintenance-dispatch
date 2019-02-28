package com.tepth.maintenancedispatch.controller.vehicle;

import com.alibaba.fastjson.JSONObject;
import com.tepth.maintenancedispatch.dto.*;
import com.tepth.maintenancedispatch.dto.inner.*;
import com.tepth.maintenancedispatch.service.repair.IRepairService;
import com.tepth.maintenancedispatch.service.vehicle.IVehicleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author royle.huang
 * @Date 2019/2/14 18:00
 * @Description 车辆管理controller
 **/
@RestController
@RequestMapping("dispatch/vehicle")
@Slf4j
public class VehicleController {

    @Autowired
    IVehicleService vehicleService;
    @Autowired
    IRepairService repairService;


    /**
     * @Author royle.huang
     * @Date 2019/2/27 10:32
     * @Description 报警记录
     **/
    @PostMapping("/alarm")
    public PageResponse<Alarm> queryAlarmListByPage(@RequestBody String json){
        GetAlarmListRequest request = JSONObject.parseObject(json, GetAlarmListRequest.class);
        PageResponse<Alarm> response = repairService.queryAlarmListByPage(request);
        return response;
    }


    /**
     * @Author royle.huang
     * @Date 2019/2/27 10:13
     * @Description 车辆作业记录列表
     **/
    @PostMapping("/repair")
    public PageResponse<RepairVO> queryRepairListByPage(@RequestBody String json){
        GetRepairListPagingRequest request = JSONObject.parseObject(json, GetRepairListPagingRequest.class);
        PageResponse<RepairVO> response  = repairService.queryRepairListByPageComm(request);
        return response;
    }


    /**
     * @Author royle.huang
     * @Date 2019/2/27 10:12
     * @Description 等待交车的车辆列表
     **/
    @PostMapping("/waiting")
    public PageResponse<VehicleVo> queryVehicleWaitingByPage(@RequestBody String json){
        PageRequest request = JSONObject.parseObject(json, PageRequest.class);
        request.setKeyWord("waiting");
        PageResponse<VehicleVo> response = vehicleService.queryVehicleListByPage(request);
        return response;
    }

    /**
     * @Author royle.huang
     * @Date 2019/2/28 18:46
     * @Description 未确认
     **/
    @PostMapping("/unconfirmed")
    public PageResponse<VehicleVo> queryVehicleUnconfirmedByPage(@RequestBody String json){
        PageRequest request = JSONObject.parseObject(json, PageRequest.class);
        request.setKeyWord("unconfirmed");
        PageResponse<VehicleVo> response = vehicleService.queryVehicleListByPage(request);
        return response;
    }

    /**
     * @Author royle.huang
     * @Date 2019/2/28 18:47
     * @Description 未进厂
     **/
    @PostMapping("/out")
    public PageResponse<VehicleVo> queryVehicleOutByPage(@RequestBody String json){
        PageRequest request = JSONObject.parseObject(json, PageRequest.class);
        request.setKeyWord("out");
        PageResponse<VehicleVo> response = vehicleService.queryVehicleListByPage(request);
        return response;
    }

    /**
     * @Author royle.huang
     * @Date 2019/2/28 18:47
     * @Description 已进厂
     **/
    @PostMapping("/in")
    public PageResponse<VehicleVo> queryVehicleInByPage(@RequestBody String json){
        PageRequest request = JSONObject.parseObject(json, PageRequest.class);
        request.setKeyWord("in");
        PageResponse<VehicleVo> response = vehicleService.queryVehicleListByPage(request);
        return response;
    }

    @PostMapping("/unexchanged")
    public PageResponse<VehicleVo> queryVehicleUnExchangedByPage(@RequestBody String json){
        PageRequest request = JSONObject.parseObject(json, PageRequest.class);
        request.setKeyWord("unexchanged");
        PageResponse<VehicleVo> response = vehicleService.queryVehicleListByPage(request);
        return response;
    }

    /**
     * @Author royle.huang
     * @Date 2019/2/28 10:38
     * @Description 等待出厂的车辆列表
     **/
    @PostMapping("/finish")
    public PageResponse<VehicleVo> queryVehicleFinishByPage(@RequestBody String json){
        PageRequest request = JSONObject.parseObject(json, PageRequest.class);
        request.setKeyWord("finish");
        PageResponse<VehicleVo> response = vehicleService.queryVehicleListByPage(request);
        return response;
    }

    /**
     * @Author royle.huang
     * @Date 2019/2/26 18:09
     * @Description 车辆列表
     **/
    @PostMapping("/list")
    public PageResponse<VehicleVo> queryVehicleListByPage(@RequestBody String json){
        PageRequest request = JSONObject.parseObject(json, PageRequest.class);
        PageResponse<VehicleVo> response = vehicleService.queryVehicleListByPage(request);
        return response;
    }


    /**
     * @Author royle.huang
     * @Date 2019/2/19 19:41
     * @Description 输入车辆编号查询车辆信息
     **/
    @RequestMapping("/no")
    public GetVehicleByNoResponse queryVehicleByNo(@RequestBody String json){
        GetVehicleByNoRequest request = JSONObject.parseObject(json, GetVehicleByNoRequest.class);
        GetVehicleByNoResponse response = vehicleService.queryVehicleByNo(request.getVehicleNo());
        return response;
    }

    /**
     * @Author royle.huang
     * @Date 2019/2/15 9:43
     * @Description 首页获取车辆信息
     **/
    @PostMapping("/count")
    @ResponseBody
    public GetVehicleInfoResponse queryVehicleInfoMainPage(@RequestBody String json){
        GetVehicleInfoRequest request = JSONObject.parseObject(json, GetVehicleInfoRequest.class);
        GetVehicleInfoResponse response = vehicleService.queryVehicleInfoMainPage(request);
        return response;
    }

}
