package com.tepth.maintenancedispatch.dto;

import com.tepth.maintenancedispatch.dao.model.user.User;
import com.tepth.maintenancedispatch.dto.inner.BaseResponse;
import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * @Author royle.huang
 * @Date 2019/2/15 17:09
 * @Description 主页面查询技工信息
 **/
@Data
public class GetWorkerInfoResponse extends BaseResponse {


//    Map<String, String> areaWorkers;

    Integer online;
    Integer idle;
}
