package com.tepth.maintenancedispatch.dto;

import com.tepth.maintenancedispatch.dto.inner.PageRequest;
import lombok.Data;

import java.util.Date;

/**
 * @Author royle.huang
 * @Date 2019/2/28 19:43
 * @Description 获取物料成本列表
 **/
@Data
public class GetMaterialListRequest extends PageRequest {
    private Date startDate;
    private Date endDate;
    private String vehicleNo;
    private Integer areaId;
}
