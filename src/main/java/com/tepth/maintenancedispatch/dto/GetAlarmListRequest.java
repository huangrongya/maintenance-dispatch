package com.tepth.maintenancedispatch.dto;

import com.tepth.maintenancedispatch.dto.inner.PageRequest;
import lombok.Data;

@Data
public class GetAlarmListRequest extends PageRequest {

    private Integer vehicleId;
}
