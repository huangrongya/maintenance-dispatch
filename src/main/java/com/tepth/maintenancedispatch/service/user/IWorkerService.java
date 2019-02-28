package com.tepth.maintenancedispatch.service.user;

import com.tepth.maintenancedispatch.dto.GetStationWorkerRequest;
import com.tepth.maintenancedispatch.dto.GetWorkerInfoResponse;
import com.tepth.maintenancedispatch.dto.inner.BaseRequest;
import com.tepth.maintenancedispatch.dto.inner.PageRequest;
import com.tepth.maintenancedispatch.dto.inner.PageResponse;
import com.tepth.maintenancedispatch.dto.inner.Worker;

/**
 * @Author royle.huang
 * @Date 2019/2/15 17:14
 * @Description 技工service
 **/
public interface IWorkerService {

    /**
     * @Author royle.huang
     * @Date 2019/2/22 11:58
     * @Description 查询展示的技工信息
     **/
    GetWorkerInfoResponse queryWorkersMainPage(BaseRequest request);

    /**
     * @Author royle.huang
     * @Date 2019/2/22 11:57
     * @Description 查询技工列表
     **/
    PageResponse<Worker> queryWorkerListByPage(PageRequest request);

    /**
     * @Author royle.huang
     * @Date 2019/2/28 16:49
     * @Description 工位技工列表
     **/
    PageResponse<Worker> queryWorkerListWorkStation(GetStationWorkerRequest request);
}
