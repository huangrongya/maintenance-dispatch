package com.tepth.maintenancedispatch.service.login;

import com.tepth.maintenancedispatch.dto.UserLoginResponse;

/**
 * @Author royle.huang
 * @Date 2019/2/14 17:41
 * @Description 登录业务
 **/
public interface ILoginService {
    /**
     * @Author royle.huang
     * @Date 2019/2/14 17:43
     * @Description 登录
     **/
    UserLoginResponse login(String loginName, String pwd);
}
