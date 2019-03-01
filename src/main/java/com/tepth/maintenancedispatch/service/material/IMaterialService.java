package com.tepth.maintenancedispatch.service.material;

import com.tepth.maintenancedispatch.dto.GetCostListResponse;
import com.tepth.maintenancedispatch.dto.GetMaterialInfoResponse;
import com.tepth.maintenancedispatch.dto.GetMaterialListRequest;
import com.tepth.maintenancedispatch.dto.inner.BaseRequest;
import com.tepth.maintenancedispatch.dto.inner.Material;
import com.tepth.maintenancedispatch.dto.inner.PageRequest;
import com.tepth.maintenancedispatch.dto.inner.PageResponse;

/**
 * @Author royle.huang
 * @Date 2019/2/18 16:38
 * @Description 物资service
 **/
public interface IMaterialService {
    /**
     * @Author royle.huang
     * @Date 2019/2/18 16:51
     * @Description 查询主页物料展示数据
     **/
    GetMaterialInfoResponse queryMaterialCountMainPage(BaseRequest request);

    /**
     * @Author royle.huang
     * @Date 2019/2/28 11:03
     * @Description 分页查询物料列表
     **/
    PageResponse<Material> queryMaterialListByPage(GetMaterialListRequest request);

    /**
     * @Author royle.huang
     * @Date 2019/2/28 19:52
     * @Description 查询物料列表 包含成本
     **/
    GetCostListResponse<Material> queryCostList(GetMaterialListRequest request);

    /**
     * @Author royle.huang
     * @Date 2019/3/1 9:49
     * @Description 查询当前工位物料列表
     **/
    GetCostListResponse<Material> queryMaterialListArea(GetMaterialListRequest request);
}
