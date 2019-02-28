package com.tepth.maintenancedispatch.service.user;

import com.tepth.maintenancedispatch.dto.inner.BaseRequest;
import com.tepth.maintenancedispatch.dto.inner.PageRequest;
import com.tepth.maintenancedispatch.dto.inner.PageResponse;

public interface IDriverService {
    /**
     * @Author royle.huang
     * @Date 2019/2/28 9:28
     * @Description 分页查询司机列表
     **/
    PageResponse queryDriverListByPage(PageRequest request);
}
