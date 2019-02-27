package com.tepth.maintenancedispatch.service.repair;

import com.tepth.maintenancedispatch.dto.*;
import com.tepth.maintenancedispatch.dto.inner.Alarm;
import com.tepth.maintenancedispatch.dto.inner.BaseResponse;
import com.tepth.maintenancedispatch.dto.inner.PageResponse;
import com.tepth.maintenancedispatch.dto.inner.RepairVO;

public interface IRepairService {
    /**
     * @Author royle.huang
     * @Date 2019/2/19 14:29
     * @Description 分页查询维修单
     **/
    PageResponse<RepairVO> queryRepairListByPageStatusArr(GetRepairListPagingRequest request);

    /**
     * @Author royle.huang
     * @Date 2019/2/19 17:52
     * @Description 报修
     **/
    BaseResponse addRepairInfo(AddRepairRequest request);

    /**
     * @Author royle.huang
     * @Date 2019/2/20 10:40
     * @Description 通用分页查询维修单
     **/
    PageResponse<RepairVO> queryRepairListByPageComm(GetRepairListPagingRequest request);

    /**
     * @Author royle.huang
     * @Date 2019/2/21 9:52
     * @Description 分配工位、班组
     **/
    BaseResponse distributeWorkStation(DistributStationRequest request);

    /**
     * @Author royle.huang
     * @Date 2019/2/21 10:39
     * @Description 交车给技工
     **/
    BaseResponse exchangeVehicleToWorker(RepairIdRequest request);

    /**
     * @Author royle.huang
     * @Date 2019/2/21 10:55
     * @Description 交车给司机
     **/
    BaseResponse exchangeVehicleToDriver(RepairIdRequest request);

    /**
     * @Author royle.huang
     * @Date 2019/2/21 11:03
     * @Description 查询故障信息
     **/
    GetPhenamenonResponse queryFaultList(RepairIdRequest request);

    /**
     * @Author royle.huang
     * @Date 2019/2/26 9:14
     * @Description 查询工单详情
     **/
    GetRepairDetailResponse queryRepairDetail(Integer repairId);

    /**
     * @Author royle.huang
     * @Date 2019/2/27 10:38
     * @Description 获取报警记录列表
     **/
    PageResponse<Alarm> queryAlarmListByPage(GetAlarmListRequest request);
}
