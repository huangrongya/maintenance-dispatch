package com.tepth.maintenancedispatch.service.vehicle;

import com.tepth.maintenancedispatch.dto.GetVehicleInfoRequest;
import com.tepth.maintenancedispatch.dto.GetVehicleInfoResponse;

/**
 * @Author royle.huang
 * @Date 2019/2/15 9:02
 * @Description 车辆服务层
 **/
public interface IVehicleService {
    /**
     * @Author royle.huang
     * @Date 2019/2/15 9:39
     * @Description 查询首页车辆信息
     **/
    GetVehicleInfoResponse queryVehicleInfoMainPage(GetVehicleInfoRequest request);
}
