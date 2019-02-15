package com.tepth.maintenancedispatch.controller.user;

import com.alibaba.fastjson.JSONObject;
import com.tepth.maintenancedispatch.dto.inner.BaseRequest;
import com.tepth.maintenancedispatch.dto.inner.BaseResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author royle.huang
 * @Date 2019/2/15 17:05
 * @Description 技工
 **/
@RestController("dispatch/worker")
public class WorkerController {

    /**
     * @Author royle.huang
     * @Date 2019/2/15 17:11
     * @Description 查询主页面显示的技工信息
     **/
    @PostMapping("workerInfo")
    public BaseResponse queryWorkersMainPage(@RequestBody String json){
        BaseRequest request = JSONObject.parseObject(json, BaseRequest.class);

        return null;
    }
}
