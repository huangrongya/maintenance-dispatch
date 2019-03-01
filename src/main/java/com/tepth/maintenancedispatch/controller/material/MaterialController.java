package com.tepth.maintenancedispatch.controller.material;

import com.alibaba.fastjson.JSONObject;
import com.tepth.maintenancedispatch.dto.GetMaterialListRequest;
import com.tepth.maintenancedispatch.dto.GetCostListResponse;
import com.tepth.maintenancedispatch.dto.GetMaterialInfoResponse;
import com.tepth.maintenancedispatch.dto.inner.BaseRequest;
import com.tepth.maintenancedispatch.dto.inner.Material;
import com.tepth.maintenancedispatch.dto.inner.PageRequest;
import com.tepth.maintenancedispatch.dto.inner.PageResponse;
import com.tepth.maintenancedispatch.service.material.IMaterialService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author royle.huang
 * @Date 2019/2/18 16:37
 * @Description 物资controller
 **/
@RestController
@Slf4j
@RequestMapping("dispatch/material")
public class MaterialController {


    @Autowired
    IMaterialService materialService;

    /**
     * @Author royle.huang
     * @Date 2019/2/18 16:43
     * @Description 主页查询物资列表
     **/
    @PostMapping("/count")
    public GetMaterialInfoResponse queryMaterialCountMainPage(@RequestBody String json){
        BaseRequest request = JSONObject.parseObject(json, BaseRequest.class);
        GetMaterialInfoResponse response = materialService.queryMaterialCountMainPage(request);
        return response;
    }
    
    /**
     * @Author royle.huang
     * @Date 2019/2/28 10:44
     * @Description 缺料列表
     **/
    @PostMapping("/lack")
    public PageResponse<Material> queryMaterialShortListByPage(@RequestBody String json){
        GetMaterialListRequest request = JSONObject.parseObject(json, GetMaterialListRequest.class);
        request.setKeyWord("lack");
        PageResponse<Material> response = materialService.queryMaterialListByPage(request);
        return response;
    }

    /**
     * @Author royle.huang
     * @Date 2019/2/28 19:37
     * @Description 物料成本列表（默认当天）
     **/
    @PostMapping("cost")
    public GetCostListResponse<Material> queryCostList(@RequestBody String json){
        GetMaterialListRequest request = JSONObject.parseObject(json, GetMaterialListRequest.class);
        GetCostListResponse<Material> response = materialService.queryCostList(request);
        return response;
    }

    /**
     * @Author royle.huang
     * @Date 2019/3/1 9:38
     * @Description 当前工位物料列表
     **/
    @PostMapping("/area")
    public PageResponse<Material> queryMaterialListArea(@RequestBody String json){
        GetMaterialListRequest request = JSONObject.parseObject(json, GetMaterialListRequest.class);
        GetCostListResponse<Material> response = materialService.queryMaterialListArea(request);
        return response;
    }

    /**
     * @Author royle.huang
     * @Date 2019/3/1 10:05
     * @Description 缺料待采列表
     **/

}
