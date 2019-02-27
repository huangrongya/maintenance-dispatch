package com.tepth.maintenancedispatch.controller.vehicle;

import com.alibaba.fastjson.JSONObject;
import com.tepth.maintenancedispatch.dao.model.vehicle.Vehicle;
import com.tepth.maintenancedispatch.dto.GetVehicleByNoRequest;
import com.tepth.maintenancedispatch.dto.GetVehicleByNoResponse;
import com.tepth.maintenancedispatch.dto.GetVehicleInfoRequest;
import com.tepth.maintenancedispatch.dto.GetVehicleInfoResponse;
import com.tepth.maintenancedispatch.dto.inner.PageRequest;
import com.tepth.maintenancedispatch.dto.inner.PageResponse;
import com.tepth.maintenancedispatch.dto.inner.VehicleVo;
import com.tepth.maintenancedispatch.service.vehicle.IVehicleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
