package com.tepth.maintenancedispatch.dao.model.repair;

import java.io.Serializable;
import java.util.Date;

/**
 * tb_fault_phenomenon
 * @author 
 */
public class FaultPhenomenon implements Serializable {
    private Integer id;

    /**
     * 名称
     */
    private String name;

    /**
     * 描述
     */
    private String describes;

    /**
     * 别名
     */
    private String alias;

    /**
     * 录入人
     */
    private Integer operateUserId;

    /**
     * 录入时间
     */
    private Date operateTime;

    /**
     * 车辆系别id
     */
    private Integer vehicleSeriesId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescribes() {
        return describes;
    }

    public void setDescribes(String describes) {
        this.describes = describes;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public Integer getOperateUserId() {
        return operateUserId;
    }

    public void setOperateUserId(Integer operateUserId) {
        this.operateUserId = operateUserId;
    }

    public Date getOperateTime() {
        return operateTime;
    }

    public void setOperateTime(Date operateTime) {
        this.operateTime = operateTime;
    }

    public Integer getVehicleSeriesId() {
        return vehicleSeriesId;
    }

    public void setVehicleSeriesId(Integer vehicleSeriesId) {
        this.vehicleSeriesId = vehicleSeriesId;
    }
}