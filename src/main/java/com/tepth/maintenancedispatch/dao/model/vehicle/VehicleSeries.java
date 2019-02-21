package com.tepth.maintenancedispatch.dao.model.vehicle;

import java.io.Serializable;
import java.util.Date;

/**
 * tb_vehicle_series
 * @author 
 */
public class VehicleSeries implements Serializable {
    private Integer id;

    /**
     * 名称
     */
    private String name;

    /**
     * 描述
     */
    private String description;

    /**
     * 设置人
     */
    private Integer operateUserId;

    /**
     * 设置时间
     */
    private Date operateTime;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
}