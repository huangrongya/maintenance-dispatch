package com.tepth.maintenancedispatch.service.organization;

import com.tepth.maintenancedispatch.dao.model.organization.MaintenanceFactory;

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
    MaintenanceFactory queryFactoryByOrganizationId(Integer organizationId);
}
