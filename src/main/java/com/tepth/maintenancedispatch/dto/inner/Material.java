package com.tepth.maintenancedispatch.dto.inner;

import lombok.Data;

import java.util.Date;

@Data
public class Material {

    private Integer id;
    /**审核状态：1-待审批、2-已审批**/
    private Integer auditingStatus;
    /**领用状态：0-领料申请中、1-待料中、2-已领用、3-已退料 4、退料申请中 5、待料结束**/
    private Integer materialStatus;

    /**
     * 申请时间
     */
    private Date applyTime;

    /**
     * 申请数量
     */
    private Short applyAmount;
    private Double price;

    /**
     * 用户id(申请技工)
     */
    private Integer workerId;
    private String workerName;

    /**
     * 车辆id
     */
    private Integer vehicleId;
    private String vehicleNo;

    /**
     * 类型 1.零部件 2.耗材
     */
    private Integer partsType;

    /**
     * 零部件id/耗材id
     */
    private Integer partsId;
    private String materialNo;
    private String materialName;
    private String materialImg;

    private Long continued;


}
