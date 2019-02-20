package com.tepth.maintenancedispatch.dao.model.material;

import java.io.Serializable;
import java.util.Date;

/**
 * tb_material_apply
 * @author 
 */
public class MaterialApply implements Serializable {
    private Integer id;

    /**
     * 申请时间
     */
    private Date applyTime;

    /**
     * 申请数量
     */
    private Short applyAmount;

    /**
     * 库存数量
     */
    private Short stockAmount;

    /**
     * 缺料到货时间
     */
    private Date arrivalTime;

    /**
     * 审核状态：1-待审批、2-已审批
     */
    private Byte auditingStatus;

    /**
     * 领用状态：1-待料中、2-已领用、3-已退料
     */
    private Byte materialStatus;

    /**
     * 领用组织id
     */
    private Integer organizationId;

    /**
     * 用户id(申请技工)
     */
    private Integer userId;

    /**
     * 车辆id
     */
    private Integer vehicleId;

    /**
     * 类型 1.零部件 2.耗材
     */
    private Integer partsType;

    /**
     * 零部件id/耗材id
     */
    private Integer partsId;

    /**
     * 维修厂区域id：库房、工位
     */
    private Integer factoryAreaId;

    /**
     * 维保记录id
     */
    private Integer repairId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }

    public Short getApplyAmount() {
        return applyAmount;
    }

    public void setApplyAmount(Short applyAmount) {
        this.applyAmount = applyAmount;
    }

    public Short getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(Short stockAmount) {
        this.stockAmount = stockAmount;
    }

    public Date getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(Date arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public Byte getAuditingStatus() {
        return auditingStatus;
    }

    public void setAuditingStatus(Byte auditingStatus) {
        this.auditingStatus = auditingStatus;
    }

    public Byte getMaterialStatus() {
        return materialStatus;
    }

    public void setMaterialStatus(Byte materialStatus) {
        this.materialStatus = materialStatus;
    }

    public Integer getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Integer organizationId) {
        this.organizationId = organizationId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Integer vehicleId) {
        this.vehicleId = vehicleId;
    }

    public Integer getPartsType() {
        return partsType;
    }

    public void setPartsType(Integer partsType) {
        this.partsType = partsType;
    }

    public Integer getPartsId() {
        return partsId;
    }

    public void setPartsId(Integer partsId) {
        this.partsId = partsId;
    }

    public Integer getFactoryAreaId() {
        return factoryAreaId;
    }

    public void setFactoryAreaId(Integer factoryAreaId) {
        this.factoryAreaId = factoryAreaId;
    }

    public Integer getRepairId() {
        return repairId;
    }

    public void setRepairId(Integer repairId) {
        this.repairId = repairId;
    }
}