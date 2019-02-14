package com.tepth.maintenancedispatch.dto.inner;

import lombok.Data;

/**
 * @Author royle.huang
 * @Date 2019/2/14 17:30
 * @Description 维修厂查询
 **/
@Data
public class MaintenanceFactoryVO {

    /**
     * id
     */
    private Integer id;

    /**
     * 名称
     */
    private String name;

    /**
     * 经度
     */
    private Double lat;

    /**
     * 纬度
     */
    private Double lng;
}
