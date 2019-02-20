package com.tepth.maintenancedispatch.filter;

import ch.qos.logback.core.CoreConstants;
import com.alibaba.fastjson.JSONObject;
import com.tepth.maintenancedispatch.dto.inner.UserInfo;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

/**
 * @Description: 日志切面
 * @Author: royle
 * @Date: 2018/09/25
 */
@Component
@Aspect
@Slf4j
public class PermissionAspect {


    @Pointcut("execution(public * com.tepth.maintenancedispatch.controller..*.*(..)) && !execution(public * com.tepth.maintenancedispatch.controller.login.LoginController.login(..))")
    public void controllerPointCut(){ }

    @Around("controllerPointCut()")
    public Object permissionFilter(ProceedingJoinPoint joinPoint) throws Throwable {
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();

        HttpServletRequest request = attributes.getRequest();
        String url = request.getRequestURL().toString();
        Object[] params = joinPoint.getArgs();
        if (!url.endsWith("login")){
            //TODO 验证token, 获取用户信息
            //用户信息放入request
            UserInfo user = new UserInfo();
            user.setId(1);
            user.setJobNo("9527");
            user.setUserName("李狗蛋");
            user.setOrganizationId(4);
            user.setOrganizationName("新牌坊维修厂");
            if (params != null && params.length != 0){
                String param = (String) params[0];
                JSONObject paramJson = JSONObject.parseObject(param);
                paramJson.put("user", user);
                params[0] = JSONObject.toJSONString(paramJson);
            }

        }
        return joinPoint.proceed(params);
    }


}
