package com.tepth.maintenancedispatch.dto;

import com.tepth.maintenancedispatch.dto.inner.BaseRequest;
import lombok.Data;

/**
 * @Author royle.huang
 * @Date 2019/2/21 9:49
 * @Description 分配工位、班组
 **/
@Data
public class DistributStationRequest extends BaseRequest {
    /**班组id**/
    private Integer group;
    /**工位id**/
    private Integer station;
    /**工单id**/
    private Integer repair;
}
