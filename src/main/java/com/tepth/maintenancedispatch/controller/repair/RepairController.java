package com.tepth.maintenancedispatch.controller.repair;

import com.alibaba.fastjson.JSONObject;
import com.tepth.maintenancedispatch.comm.Constant;
import com.tepth.maintenancedispatch.dao.model.repair.Repair;
import com.tepth.maintenancedispatch.dto.AddRepairRequest;
import com.tepth.maintenancedispatch.dto.GetRepairListPagingRequest;
import com.tepth.maintenancedispatch.dto.inner.BaseResponse;
import com.tepth.maintenancedispatch.dto.inner.PageRequest;
import com.tepth.maintenancedispatch.dto.inner.PageResponse;
import com.tepth.maintenancedispatch.service.repair.IRepairService;
import org.apache.tomcat.util.bcel.Const;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author royle.huang
 * @Date 2019/2/19 11:30
 * @Description 维修单
 **/
@RestController
@RequestMapping("dispatch/repair")
public class RepairController {

    @Autowired
    IRepairService repairService;

    
    


    
    /**
     * @Author royle.huang
     * @Date 2019/2/19 17:12
     * @Description 维修登记
     **/

    @RequestMapping("/add")
    public BaseResponse addRepairInfo(String json){
        AddRepairRequest request = JSONObject.parseObject(json, AddRepairRequest.class);
        BaseResponse response = repairService.addRepairInfo(request);
        return response;
    }

    /**
     * @Author royle.huang
     * @Date 2019/2/19 17:06
     * @Description 正在作业列表
     **/
    @RequestMapping("/working")
    public PageResponse<Repair> queryRepairListByPageWorking(@RequestBody String json){
        GetRepairListPagingRequest request = JSONObject.parseObject(json, GetRepairListPagingRequest.class);
        request.setPage(1);
        request.setRow(3);
        request.setStatusArr(Constant.REPAIR_STATUS_WORKING);
        PageResponse<Repair> response = repairService.queryRepairListByPage(request);
        return response;
    }


    /**
     * @Author royle.huang
     * @Date 2019/2/19 14:11
     * @Description 分页请求维修单列表 待作业
     **/
    @RequestMapping("/waiting")
    public PageResponse<Repair> queryRepairListByPageWaiting(@RequestBody String json){
        GetRepairListPagingRequest request = JSONObject.parseObject(json, GetRepairListPagingRequest.class);
        request.setPage(1);
        request.setRow(3);
        request.setStatusArr(Constant.REPAIR_STATUS_WAITING);
        PageResponse<Repair> response = repairService.queryRepairListByPage(request);
        return response;
    }

}
