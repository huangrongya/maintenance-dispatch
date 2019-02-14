package com.tepth.maintenancedispatch.dto;

import com.tepth.maintenancedispatch.dto.inner.BaseResponse;
import com.tepth.maintenancedispatch.dto.inner.MaintenanceFactoryVO;
import com.tepth.maintenancedispatch.dto.inner.UserInfo;
import lombok.Data;

/**
 * @Author royle.huang
 * @Date 2019/2/2 10:19
 * @Description 用户登录返回信息
 **/
@Data
public class UserLoginResponse extends BaseResponse {

    private UserInfo userInfo;

    private MaintenanceFactoryVO maintenanceFactory;

}
