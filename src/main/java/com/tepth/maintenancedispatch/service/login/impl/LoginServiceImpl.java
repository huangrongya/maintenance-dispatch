package com.tepth.maintenancedispatch.service.login.impl;

import com.alibaba.fastjson.JSONObject;
import com.tepth.maintenancedispatch.comm.ErrorConstant;
import com.tepth.maintenancedispatch.dto.UserLoginResponse;
import com.tepth.maintenancedispatch.dto.inner.MaintenanceFactoryVO;
import com.tepth.maintenancedispatch.dto.inner.UserInfo;
import com.tepth.maintenancedispatch.exception.ServiceException;
import com.tepth.maintenancedispatch.service.login.ILoginService;
import com.tepth.maintenancedispatch.service.factory.IMaintenanceFactoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.nio.charset.Charset;
import java.util.Arrays;


/**
 * @Author royle.huang
 * @Date 2019/2/14 17:42
 * @Description 登录业务层
 **/
@Service
@Slf4j
public class LoginServiceImpl implements ILoginService {

    @Autowired
    IMaintenanceFactoryService maintenanceFactoryService;
    @Value("${url.login}")
    String url;

    @Override
    public UserLoginResponse login(String loginName, String pwd) {
        UserLoginResponse response = new UserLoginResponse();
        //调用登录接口,获取用户信息
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("loginName", loginName);
        jsonObject.put("pwd", pwd);
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders requestHeaders = new HttpHeaders();
        requestHeaders.set("Content-Type", "application/json;charset=utf-8");
        requestHeaders.setAcceptCharset(Arrays.asList(Charset.forName("utf-8")));
        HttpEntity<String> requestEntity = new HttpEntity<>(jsonObject.toJSONString(), requestHeaders);
        ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.POST, requestEntity, String.class);
        String responseStr = responseEntity.getBody();
        //TODO 错误码处理
        //从返回结果获取用户信息
        UserInfo userInfo = JSONObject.parseObject(responseStr, UserInfo.class);
        if (userInfo == null){
            log.info("未获取到用户信息： "+ loginName);
            throw new ServiceException(ErrorConstant.PARAM_INCOMPLETE_CODE, ErrorConstant.PARAM_INCOMPLETE_MSG);
        }
        //厂区信息
        if (userInfo.getOrganizationId() == null){
            log.info("未获取到用户组织信息： "+ userInfo.getId());
            throw new ServiceException(ErrorConstant.PARAM_INCOMPLETE_CODE, ErrorConstant.PARAM_INCOMPLETE_MSG);
        }
        MaintenanceFactoryVO maintenanceFactoryVO = maintenanceFactoryService.queryFactoryByOrganizationId(userInfo.getOrganizationId());
        response.setMaintenanceFactory(maintenanceFactoryVO);
        return response;
    }
}
