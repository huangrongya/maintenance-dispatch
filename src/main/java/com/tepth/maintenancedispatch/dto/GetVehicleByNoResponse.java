package com.tepth.maintenancedispatch.dto;

import com.tepth.maintenancedispatch.dao.model.user.User;
import com.tepth.maintenancedispatch.dto.inner.BaseResponse;
import lombok.Data;

import java.util.List;

/**
 * @Author royle.huang
 * @Date 2019/2/19 19:45
 * @Description 精确查询车辆信息
 **/
@Data
public class GetVehicleByNoResponse extends BaseResponse {

    Integer vehicleId;
    String vehicleNo;
    String lineNo;
    String licenseNo;
    List<User> userList;
}
