package com.tepth.maintenancedispatch.controller.user;

import com.alibaba.fastjson.JSONObject;
import com.tepth.maintenancedispatch.dto.GetWorkerInfoResponse;
import com.tepth.maintenancedispatch.dto.GetWorkerListMainPageRequest;
import com.tepth.maintenancedispatch.dto.inner.BaseRequest;
import com.tepth.maintenancedispatch.dto.inner.BaseResponse;
import com.tepth.maintenancedispatch.service.user.IWorkerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.Max;
import java.util.List;

/**
 * @Author royle.huang
 * @Date 2019/2/15 17:05
 * @Description 技工
 **/
@RestController
@RequestMapping("dispatch/worker")
@Slf4j
public class WorkerController {

    @Autowired
    IWorkerService workerService;



    /**
     * @Author royle.huang
     * @Date 2019/2/15 17:11
     * @Description 查询主页面显示的技工信息
     **/
    @PostMapping("/count")
    public BaseResponse queryWorkersMainPage(@RequestBody String json) {
        BaseRequest request = JSONObject.parseObject(json, BaseRequest.class);
        GetWorkerInfoResponse response = workerService.queryWorkersMainPage(request);
        return response;
    }

}
