package com.tepth.maintenancedispatch.service.repair;

import com.tepth.maintenancedispatch.dao.model.repair.Repair;
import com.tepth.maintenancedispatch.dto.AddRepairRequest;
import com.tepth.maintenancedispatch.dto.GetRepairListPagingRequest;
import com.tepth.maintenancedispatch.dto.inner.BaseResponse;
import com.tepth.maintenancedispatch.dto.inner.PageResponse;

public interface IRepairService {
    /**
     * @Author royle.huang
     * @Date 2019/2/19 14:29
     * @Description 分页查询维修单
     **/
    PageResponse<Repair> queryRepairListByPage(GetRepairListPagingRequest request);

    /**
     * @Author royle.huang
     * @Date 2019/2/19 17:52
     * @Description 报修
     **/
    BaseResponse addRepairInfo(AddRepairRequest request);
}
