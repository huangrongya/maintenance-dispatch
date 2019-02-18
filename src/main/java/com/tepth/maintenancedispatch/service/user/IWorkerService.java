package com.tepth.maintenancedispatch.service.user;

import com.tepth.maintenancedispatch.dto.GetWorkerInfoResponse;
import com.tepth.maintenancedispatch.dto.inner.BaseRequest;

/**
 * @Author royle.huang
 * @Date 2019/2/15 17:14
 * @Description 技工service
 **/
public interface IWorkerService {
    GetWorkerInfoResponse queryWorkersMainPage(BaseRequest request);
}
