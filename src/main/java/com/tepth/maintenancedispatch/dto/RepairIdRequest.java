package com.tepth.maintenancedispatch.dto;

import com.tepth.maintenancedispatch.dto.inner.BaseRequest;
import lombok.Data;

/**
 * @Author royle.huang
 * @Date 2019/2/21 10:32
 * @Description 交车
 **/

@Data
public class RepairIdRequest extends BaseRequest {

    private Integer repairId;
}
