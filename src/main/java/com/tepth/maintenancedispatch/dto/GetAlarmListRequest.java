package com.tepth.maintenancedispatch.dto;

import com.tepth.maintenancedispatch.dto.inner.PageRequest;
import lombok.Data;

import java.util.Date;

@Data
public class GetAlarmListRequest extends PageRequest {

    private String vehicleNo;

    private Date startDate;

    private Date endDate;

    private Integer alarmLevel;
}
