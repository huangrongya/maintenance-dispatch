package com.tepth.maintenancedispatch.dto;

import com.tepth.maintenancedispatch.dto.inner.BaseResponse;
import com.tepth.maintenancedispatch.dto.inner.VehicleVo;
import lombok.Data;

import java.util.List;

/**
 * @Author royle.huang
 * @Date 2019/2/15 9:27
 * @Description 首页获取车辆信息返回
 **/
@Data
public class GetVehicleInfoResponse extends BaseResponse {
    List<VehicleVo> vehicleList;

    Integer toBeConfirmed;
    Integer toBeExchanged;
    Integer isNotIn;
    Integer isIn;

}
