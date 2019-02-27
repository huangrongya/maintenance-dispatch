package com.tepth.maintenancedispatch.dao.model.vehicle;

import java.io.Serializable;
import java.util.Date;

/**
 * tb_vehicle_alarm
 * @author 
 */
public class VehicleAlarm implements Serializable {
    private Integer id;

    /**
     * 预警时间
     */
    private Date addTime;

    /**
     * 预警类型
     */
    private Byte type;

    /**
     * 预警级别
     */
    private Byte level;

    /**
     * 预警内容
     */
    private String content;

    /**
     * 出现频率、次数
     */
    private Byte frequency;

    /**
     * 车辆id
     */
    private Integer vehicleId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Byte getLevel() {
        return level;
    }

    public void setLevel(Byte level) {
        this.level = level;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Byte getFrequency() {
        return frequency;
    }

    public void setFrequency(Byte frequency) {
        this.frequency = frequency;
    }

    public Integer getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Integer vehicleId) {
        this.vehicleId = vehicleId;
    }
}