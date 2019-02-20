package com.tepth.maintenancedispatch.service.factory;

import com.tepth.maintenancedispatch.dto.GetGroupListResponse;
import com.tepth.maintenancedispatch.dto.inner.BaseResponse;
import com.tepth.maintenancedispatch.dto.inner.MaintenanceFactoryVO;

/**
 * @Author royle.huang
 * @Date 2019/2/14 16:54
 * @Description 维修厂
 **/
public interface IMaintenanceFactoryService {
    /**
     * @Author royle.huang
     * @Date 2019/2/14 17:01
     * @Description 通过组织id 查询维修厂信息
     **/
    MaintenanceFactoryVO queryFactoryByOrganizationId(Integer organizationId);

    /**
     * @Author royle.huang
     * @Date 2019/2/20 15:00
     * @Description 查询班组信息
     **/
    GetGroupListResponse queryOrgGroupListByOrgId(Integer organizationId);

    /**
     * @Author royle.huang
     * @Date 2019/2/20 16:12
     * @Description 查询工位
     **/
    BaseResponse queryFactoryAreaStationList(Integer organizationId);
}
