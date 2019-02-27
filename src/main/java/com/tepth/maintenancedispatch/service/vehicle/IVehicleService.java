package com.tepth.maintenancedispatch.service.vehicle;

import com.tepth.maintenancedispatch.dto.GetVehicleByNoResponse;
import com.tepth.maintenancedispatch.dto.GetVehicleInfoRequest;
import com.tepth.maintenancedispatch.dto.GetVehicleInfoResponse;
import com.tepth.maintenancedispatch.dto.inner.PageRequest;
import com.tepth.maintenancedispatch.dto.inner.PageResponse;
import com.tepth.maintenancedispatch.dto.inner.VehicleVo;

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

    /**
     * @Author royle.huang
     * @Date 2019/2/19 19:50
     * @Description 通过车辆编号查询车辆信息
     **/
    GetVehicleByNoResponse queryVehicleByNo(String vehicleNo);

    /**
     * @Author royle.huang
     * @Date 2019/2/26 18:15
     * @Description 分页查询厂区汽车列表
     **/
    PageResponse<VehicleVo> queryVehicleListByPage(PageRequest request);
}
