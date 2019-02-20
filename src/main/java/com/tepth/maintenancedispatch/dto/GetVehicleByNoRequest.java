package com.tepth.maintenancedispatch.dto;

import com.tepth.maintenancedispatch.dto.inner.BaseRequest;
import lombok.Data;

/**
 * @Author royle.huang
 * @Date 2019/2/19 19:43
 * @Description 精确查询车辆信息
 **/
@Data
public class GetVehicleByNoRequest extends BaseRequest {
    String vehicleNo;
}
