package com.tepth.maintenancedispatch.dto;

import com.tepth.maintenancedispatch.dto.inner.BaseResponse;
import com.tepth.maintenancedispatch.dto.inner.WorkStation;
import lombok.Data;

import java.util.List;

/**
 * @Author royle.huang
 * @Date 2019/2/20 19:40
 * @Description 获取推荐工位
 **/
@Data
public class GetWorkStationRecommendResponse extends BaseResponse {
    List<WorkStation> workStations;
}
