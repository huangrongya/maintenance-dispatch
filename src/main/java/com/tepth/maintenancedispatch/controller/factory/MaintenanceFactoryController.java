package com.tepth.maintenancedispatch.controller.factory;

import com.alibaba.fastjson.JSONObject;
import com.tepth.maintenancedispatch.dto.GetGroupListResponse;
import com.tepth.maintenancedispatch.dto.GetGroupRecommendResponse;
import com.tepth.maintenancedispatch.dto.GetWorkStationRecommendResponse;
import com.tepth.maintenancedispatch.dto.GetWorkStationResponse;
import com.tepth.maintenancedispatch.dto.inner.BaseRequest;
import com.tepth.maintenancedispatch.dto.inner.BaseResponse;
import com.tepth.maintenancedispatch.service.factory.IMaintenanceFactoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author royle.huang
 * @Date 2019/2/20 14:56
 * @Description 维修厂
 **/
@RestController
@RequestMapping("dispatch/factory")
public class MaintenanceFactoryController {

    @Autowired
    IMaintenanceFactoryService maintenanceFactoryService;

    /**
     * @Author royle.huang
     * @Date 2019/2/20 14:34
     * @Description 加载班组列表
     **/
    @PostMapping("/group")
    public BaseResponse queryOrgGroupList(@RequestBody String json){
        BaseRequest request = JSONObject.parseObject(json, BaseRequest.class);
        GetGroupListResponse response = maintenanceFactoryService.queryOrgGroupListByOrgId(request.getUser().getOrganizationId());
        return response;
    }

    /**
     * @Author royle.huang
     * @Date 2019/2/20 16:07
     * @Description 加载工位列表
     **/
    @PostMapping("/station")
    public BaseResponse queryFactoryAreaStationList(@RequestBody String json){
        BaseRequest request = JSONObject.parseObject(json, BaseRequest.class);
        GetWorkStationResponse response = maintenanceFactoryService.queryFactoryAreaStationList(request.getUser().getOrganizationId());
        return response;
    }

    /**
     * @Author royle.huang
     * @Date 2019/2/20 19:34
     * @Description 推荐工位
     **/
    @PostMapping("/station/recommend")
    public BaseResponse queryFactoryAreaStationRecommend(@RequestBody String json){
        BaseRequest request = JSONObject.parseObject(json, BaseRequest.class);
        GetWorkStationRecommendResponse response = maintenanceFactoryService.queryWorkStationRecommend(request.getUser().getOrganizationId());
        return response;

    }

    /**
     * @Author royle.huang
     * @Date 2019/2/21 9:24
     * @Description 推荐班组
     **/
    @PostMapping("/group/recommend")
    public BaseResponse queryGroupRecommend(@RequestBody String json){
        BaseRequest request = JSONObject.parseObject(json, BaseRequest.class);
        GetGroupRecommendResponse response = maintenanceFactoryService.queryOrgGroupRecommend(request);
        return response;
    }

}
