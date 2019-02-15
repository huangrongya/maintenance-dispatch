package com.tepth.maintenancedispatch.dto.inner;

import lombok.Data;

import java.util.Date;

/**
 * @Author royle.huang
 * @Date 2019/2/15 11:31
 * @Description 车辆查询
 **/
@Data
public class VehicleVo {
    private Integer id;

    /**
     * 车辆自编号
     */
    private String vehicleNo;

    /**
     * 车牌号
     */
    private String licenseNo;

    /**
     * IC卡号
     */
    private String icCardNo;

    /**
     * 档案号
     */
    private String archiveNo;

    /**
     * 登记日期
     */
    private Date recordDate;

    /**
     * 是否车联网：0-否 1-是
     */
    private Byte isNetworking;

    /**
     * 车型id
     */
    private Integer vehicleModelId;

    /**
     * 线路id
     */
    private Integer vehicleLineId;

    /**维保作业状态：1-待回厂(站) 2-已回厂(站) 3-司机已交车 4-已过检 5-已竣检 6-司机已接车 7-已出厂**/
    private Integer repairStatus;

    /**作业工位id：维修厂区域id**/
    private Integer factoryAreaId;
}
