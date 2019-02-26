package com.tepth.maintenancedispatch.dto;

import com.tepth.maintenancedispatch.dto.inner.BaseRequest;
import lombok.Data;

@Data
public class GetRepairDetailRequest extends BaseRequest {

    private Integer repairId;
}
