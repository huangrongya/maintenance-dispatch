package com.tepth.maintenancedispatch.controller.repair;

import com.alibaba.fastjson.JSONObject;
import com.tepth.maintenancedispatch.comm.Constant;
import com.tepth.maintenancedispatch.dao.model.repair.Repair;
import com.tepth.maintenancedispatch.dto.AddRepairRequest;
import com.tepth.maintenancedispatch.dto.DistributStationRequest;
import com.tepth.maintenancedispatch.dto.GetRepairListPagingRequest;
import com.tepth.maintenancedispatch.dto.SearchFaultRequest;
import com.tepth.maintenancedispatch.dto.inner.BaseResponse;
import com.tepth.maintenancedispatch.dto.inner.PageResponse;
import com.tepth.maintenancedispatch.dto.inner.RepairVO;
import com.tepth.maintenancedispatch.service.repair.IRepairService;
import com.tepth.maintenancedispatch.util.HttpUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.nio.charset.Charset;
import java.util.Arrays;

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

    @Value("${url.fault.search}")
    String searchUrl;
    @Value("${url.fault.add}")
    String addUrl;

    /**
     * @Author royle.huang
     * @Date 2019/2/20 10:03
     * @Description 添加故障
     **/
    @PostMapping("/fault/add")
    public String addProblem(@RequestBody String json){
        //调用司机端接口
        HttpHeaders requestHeaders = new HttpHeaders();
        requestHeaders.set("Content-Type", "application/json;charset=utf-8");
        requestHeaders.setAcceptCharset(Arrays.asList(Charset.forName("utf-8")));
        HttpEntity<String> requestEntity = new HttpEntity<>(json, requestHeaders);
        String responseStr = HttpUtil.commHttpRequest(addUrl, HttpMethod.POST, requestEntity, String.class);
        return responseStr;
    }

    /**
     * @Author royle.huang
     * @Date 2019/2/20 10:07
     * @Description 搜索故障
     **/
    @PostMapping("/fault")
    public String searchFault(@RequestBody String json){
        SearchFaultRequest request = JSONObject.parseObject(json, SearchFaultRequest.class);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("faultName", request.getFaultName());
        jsonObject.put("token", request.getToken());
        //调用司机端接口
        HttpHeaders requestHeaders = new HttpHeaders();
        requestHeaders.set("Content-Type", "application/json;charset=utf-8");
        requestHeaders.setAcceptCharset(Arrays.asList(Charset.forName("utf-8")));
        HttpEntity<String> requestEntity = new HttpEntity<>(JSONObject.toJSONString(jsonObject), requestHeaders);
        String responseStr = HttpUtil.commHttpRequest(searchUrl, HttpMethod.POST, requestEntity, String.class);
        return responseStr;
    }
    
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
        PageResponse<Repair> response = repairService.queryRepairListByPageStatusArr(request);
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
        PageResponse<Repair> response = repairService.queryRepairListByPageStatusArr(request);
        return response;
    }


    /**
     * @Author royle.huang
     * @Date 2019/2/20 10:31
     * @Description 作业列表
     **/
    @PostMapping("/page")
    public PageResponse<RepairVO> queryRepairListByPageComm(@RequestBody String json){
        GetRepairListPagingRequest request = JSONObject.parseObject(json, GetRepairListPagingRequest.class);
        PageResponse<RepairVO> response = repairService.queryRepairListByPageComm(request);
        return response;
    }

    /**
     * @Author royle.huang
     * @Date 2019/2/21 9:44
     * @Description 分配工位和班组
     **/
    @PostMapping("/station/add")
    public BaseResponse distributionWorkStations(@RequestBody String json){
        DistributStationRequest request = JSONObject.parseObject(json, DistributStationRequest.class);
        BaseResponse response = repairService.distributeWorkStation(request);
        return response;
    }



}
