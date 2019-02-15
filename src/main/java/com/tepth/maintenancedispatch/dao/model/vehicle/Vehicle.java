package com.tepth.maintenancedispatch.dao.model.vehicle;

import java.io.Serializable;
import java.util.Date;

/**
 * tb_vehicle
 * @author 
 */
public class Vehicle implements Serializable {
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

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    public String getLicenseNo() {
        return licenseNo;
    }

    public void setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo;
    }

    public String getIcCardNo() {
        return icCardNo;
    }

    public void setIcCardNo(String icCardNo) {
        this.icCardNo = icCardNo;
    }

    public String getArchiveNo() {
        return archiveNo;
    }

    public void setArchiveNo(String archiveNo) {
        this.archiveNo = archiveNo;
    }

    public Date getRecordDate() {
        return recordDate;
    }

    public void setRecordDate(Date recordDate) {
        this.recordDate = recordDate;
    }

    public Byte getIsNetworking() {
        return isNetworking;
    }

    public void setIsNetworking(Byte isNetworking) {
        this.isNetworking = isNetworking;
    }

    public Integer getVehicleModelId() {
        return vehicleModelId;
    }

    public void setVehicleModelId(Integer vehicleModelId) {
        this.vehicleModelId = vehicleModelId;
    }

    public Integer getVehicleLineId() {
        return vehicleLineId;
    }

    public void setVehicleLineId(Integer vehicleLineId) {
        this.vehicleLineId = vehicleLineId;
    }
}