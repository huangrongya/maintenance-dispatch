package com.tepth.maintenancedispatch.service.factory;

import com.tepth.maintenancedispatch.dto.GetGroupListResponse;
import com.tepth.maintenancedispatch.dto.GetGroupRecommendResponse;
import com.tepth.maintenancedispatch.dto.GetWorkStationRecommendResponse;
import com.tepth.maintenancedispatch.dto.GetWorkStationResponse;
import com.tepth.maintenancedispatch.dto.inner.BaseRequest;
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
    GetWorkStationResponse queryFactoryAreaStationList(Integer organizationId);

    /**
     * @Author royle.huang
     * @Date 2019/2/20 19:47
     * @Description 推荐工位
     **/
    GetWorkStationRecommendResponse queryWorkStationRecommend(Integer organizationId);

    /**
     * @Author royle.huang
     * @Date 2019/2/21 9:31
     * @Description 推荐班组
     **/
    GetGroupRecommendResponse queryOrgGroupRecommend(BaseRequest request);
}
