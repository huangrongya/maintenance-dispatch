package com.tepth.maintenancedispatch.controller.login;

import com.alibaba.fastjson.JSONObject;
import com.tepth.maintenancedispatch.comm.ErrorConstant;
import com.tepth.maintenancedispatch.dao.model.organization.MaintenanceFactory;
import com.tepth.maintenancedispatch.dto.UserLoginResponse;
import com.tepth.maintenancedispatch.dto.inner.BaseResponse;
import com.tepth.maintenancedispatch.dto.inner.MaintenanceFactoryVO;
import com.tepth.maintenancedispatch.dto.inner.UserInfo;
import com.tepth.maintenancedispatch.exception.ServiceException;
import com.tepth.maintenancedispatch.service.login.ILoginService;
import com.tepth.maintenancedispatch.service.organization.IMaintenanceFactoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.nio.charset.Charset;
import java.util.Arrays;

@RestController
@RequestMapping("/maintenance-dispatch")
@Slf4j
public class LoginController {


    @Autowired
    ILoginService loginService;

    @PostMapping("login")
    public BaseResponse login(String loginName, String pwd){

        UserLoginResponse response = loginService.login(loginName, pwd);

        //
        return response;
    }


}
