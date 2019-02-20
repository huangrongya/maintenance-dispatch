package com.tepth.maintenancedispatch.dto;

import com.tepth.maintenancedispatch.dto.inner.BaseRequest;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * @Author royle.huang
 * @Date 2019/2/19 17:48
 * @Description 添加工单
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddRepairRequest extends BaseRequest {
    /**是否需要救援：0-否 1-是**/
    Boolean rescue;

    /**是否车辆事故：0-否 1-是**/
    Boolean accident;

    /**工单类型：1-单独报修 2-单独保养 3-保养+报修**/
    Integer type;

    /**司机id**/
    Integer driverId;

    /**车辆id**/
    Integer vehicleId;

    /**故障id，'，'隔开**/
    String faultIds;

    /**报送机构：1-报驻站点 2-报维修厂**/
    Integer organizationType;
}
