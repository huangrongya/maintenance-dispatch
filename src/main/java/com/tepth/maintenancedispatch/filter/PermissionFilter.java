package com.tepth.maintenancedispatch.filter;

import com.tepth.maintenancedispatch.dto.inner.UserInfo;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @Author royle.huang
 * @Date 2019/2/12 10:51
 * @Description 鉴权
 **/
@WebFilter
public class PermissionFilter implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        String url = ((HttpServletRequest)servletRequest).getRequestURI();
        if (url.endsWith("login")){
            filterChain.doFilter(servletRequest,servletResponse);
        }
        //TODO 验证token, 获取用户信息
        //用户信息放入request
        UserInfo user = new UserInfo();
        user.setId(1);
        user.setJobNo("9527");
        user.setUserName("李狗蛋");
        user.setOrganizationId(4);
        user.setOrganizationName("新牌坊维修厂");
        servletRequest.setAttribute("user", user);
    }

    @Override
    public void destroy() {

    }
}
