package com.tepth.maintenancedispatch.dto.inner;

import lombok.Data;

@Data
public class VehicleListVo {

    private Integer id;
    private String vehicleNo;
    private String licenseNo;
    private String lineName;
    private String lineNo;
    private String organization;
}
