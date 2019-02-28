package com.tepth.maintenancedispatch.controller.material;

import com.alibaba.fastjson.JSONObject;
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
     * @Description 领料列表
     **/
    @PostMapping("/short")
    public PageResponse<Material> queryMaterialShortListByPage(@RequestBody String json){
        PageRequest request = JSONObject.parseObject(json, PageRequest.class);
        request.setKeyWord("short");
        PageResponse<Material> response = materialService.queryMaterialListByPage(request);
        return response;
    }
}
