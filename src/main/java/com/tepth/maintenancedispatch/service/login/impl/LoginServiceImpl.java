package com.tepth.maintenancedispatch.service.login.impl;

import com.alibaba.fastjson.JSONObject;
import com.tepth.maintenancedispatch.comm.Constant;
import com.tepth.maintenancedispatch.comm.ErrorConstant;
import com.tepth.maintenancedispatch.comm.RspCodeEnum;
import com.tepth.maintenancedispatch.dao.mapper.factory.OrganizationMapper;
import com.tepth.maintenancedispatch.dao.mapper.user.UserMapper;
import com.tepth.maintenancedispatch.dao.model.factory.Organization;
import com.tepth.maintenancedispatch.dao.model.factory.OrganizationExample;
import com.tepth.maintenancedispatch.dao.model.user.User;
import com.tepth.maintenancedispatch.dao.model.user.UserExample;
import com.tepth.maintenancedispatch.dto.UserLoginResponse;
import com.tepth.maintenancedispatch.dto.inner.MaintenanceFactoryVO;
import com.tepth.maintenancedispatch.dto.inner.UserInfo;
import com.tepth.maintenancedispatch.exception.ServiceException;
import com.tepth.maintenancedispatch.service.login.ILoginService;
import com.tepth.maintenancedispatch.service.factory.IMaintenanceFactoryService;
import com.tepth.maintenancedispatch.util.HttpUtil;
import com.tepth.maintenancedispatch.util.MyBeanUtils;
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
import java.util.List;


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
    @Autowired
    UserMapper userMapper;
    @Autowired
    OrganizationMapper organizationMapper;
    @Value("${url.login}")
    String url;

    @Override
    public UserLoginResponse login(String loginName, String pwd) {
        UserLoginResponse response = new UserLoginResponse();
        //调用登录接口,获取用户信息
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("jobNo", loginName);
        jsonObject.put("password", pwd);
        HttpHeaders requestHeaders = new HttpHeaders();
        requestHeaders.set("Content-Type", "application/json;charset=utf-8");
        requestHeaders.setAcceptCharset(Arrays.asList(Charset.forName("utf-8")));
        HttpEntity<String> requestEntity = new HttpEntity<>(jsonObject.toJSONString(), requestHeaders);
        String responseStr = HttpUtil.commHttpRequest(url, HttpMethod.POST, requestEntity, String.class);
        JSONObject responseJson = JSONObject.parseObject(responseStr, JSONObject.class);
        //错误码处理 角色限制
        String code = responseJson.getString("rspCode");
        if (!RspCodeEnum.SUCCESS.getCode().equals(code)){
            throw new ServiceException(RspCodeEnum.USER_ERROR_LOGIN.getCode(), RspCodeEnum.USER_ERROR_LOGIN.getDesc());
        }
        JSONObject[] roles = (JSONObject[]) responseJson.get("roles");
        boolean rightRole = false;
        for (JSONObject role : roles) {
            if (Constant.ROLE_ID_MAINTENANCE_DISPATCHER == role.getInteger("roleId")){
                rightRole = true;
                break;
            }
        }
        if (!rightRole){
            throw new ServiceException(ErrorConstant.USER_ROLE_ERROR_CODE+"", ErrorConstant.USER_ROLE_ERROR_MSG);
        }
        //获取用户信息
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andJobNoEqualTo(loginName);
        List<User> list = userMapper.selectByExample(example);
        User user = list.get(0);
        UserInfo userInfo = new UserInfo();
        MyBeanUtils.copyPropertiesIgnoreCase(user, userInfo);
        //组织名称
        Organization organization = organizationMapper.selectByPrimaryKey(userInfo.getOrganizationId());
        if (organization == null){
            log.info("未获取到用户组织信息： "+ userInfo.getId());
            throw new ServiceException(ErrorConstant.PARAM_INCOMPLETE_CODE+"", ErrorConstant.PARAM_INCOMPLETE_MSG);
        }
        userInfo.setOrganizationName(organization.getName());
        //厂区信息
        MaintenanceFactoryVO maintenanceFactoryVO = maintenanceFactoryService.queryFactoryByOrganizationId(userInfo.getOrganizationId());
//        MaintenanceFactoryVO maintenanceFactoryVO = maintenanceFactoryService.queryFactoryByOrganizationId(4);
        response.setMaintenanceFactory(maintenanceFactoryVO);
        return response;
    }


}
