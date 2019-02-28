package com.tepth.maintenancedispatch.controller.user;


import com.alibaba.fastjson.JSONObject;
import com.tepth.maintenancedispatch.dto.GetRepairListPagingRequest;
import com.tepth.maintenancedispatch.dto.inner.*;
import com.tepth.maintenancedispatch.service.repair.IRepairService;
import com.tepth.maintenancedispatch.service.user.IDriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("dispatch/driver")
public class DriverController {

    @Autowired
    IDriverService driverService;
    @Autowired
    IRepairService repairService;
    
    /**
     * @Author royle.huang
     * @Date 2019/2/27 11:00
     * @Description 厂区司机列表
     **/
    @PostMapping("/rest")
    public PageResponse<Driver> queryDriverListWaiting(@RequestBody String json){
        PageRequest request = JSONObject.parseObject(json, PageRequest.class);
        PageResponse response = driverService.queryDriverListByPage(request);
        return  response;
    }

    /**
     * @Author royle.huang
     * @Date 2019/2/28 10:05
     * @Description 司机作业列表
     **/
    @PostMapping("/repair")
    public PageResponse<RepairVO> queryRepairListByPage(@RequestBody String json){
        GetRepairListPagingRequest request = JSONObject.parseObject(json, GetRepairListPagingRequest.class);
        PageResponse<RepairVO> response  = repairService.queryRepairListByPageComm(request);
        return response;
    }

}
