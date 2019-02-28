package com.tepth.maintenancedispatch.dao.model.repair;

import java.io.Serializable;
import java.util.Date;

/**
 * tb_repair_task
 * @author 
 */
public class RepairTask implements Serializable {
    private Integer id;

    /**
     * 任务状态：0-未完结 1-已完结（已完结任务关联的作业不可修改）
     */
    private Byte state;

    /**
     * 开始时间
     */
    private Date addTime;

    /**
     * 完成时间
     */
    private Date finishTime;

    /**
     * 过检状态：1-未过检 2-已过检
     */
    private Byte checkStatus;

    /**
     * 是否过、竣检回退：0-否 1-是
     */
    private Byte isReturn;

    /**
     * 车辆系别id
     */
    private Integer vehicleSeriesId;

    /**
     * 作业人id：多个，号隔开
     */
    private String taskUserId;

    /**
     * 故障现象id：多个，隔开
     */
    private String sysFaultId;

    /**
     * 临时故障现象id：多个，隔开
     */
    private String tempSysFaultId;

    /**
     * 系统诊断id：多个，隔开
     */
    private String sysFaultDiagnosticId;

    /**
     * 临时诊断id：多个，隔开
     */
    private String tempFaultDiagnosticId;

    /**
     * 系统作业方案id：多个，隔开
     */
    private String taskPlanId;

    /**
     * 工单id
     */
    private Integer repairId;

    /**
     * 创建时间
     */
    private Date gmtCreate;

    /**
     * 修改时间
     */
    private Date gmtModified;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Date getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    public Byte getCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(Byte checkStatus) {
        this.checkStatus = checkStatus;
    }

    public Byte getIsReturn() {
        return isReturn;
    }

    public void setIsReturn(Byte isReturn) {
        this.isReturn = isReturn;
    }

    public Integer getVehicleSeriesId() {
        return vehicleSeriesId;
    }

    public void setVehicleSeriesId(Integer vehicleSeriesId) {
        this.vehicleSeriesId = vehicleSeriesId;
    }

    public String getTaskUserId() {
        return taskUserId;
    }

    public void setTaskUserId(String taskUserId) {
        this.taskUserId = taskUserId;
    }

    public String getSysFaultId() {
        return sysFaultId;
    }

    public void setSysFaultId(String sysFaultId) {
        this.sysFaultId = sysFaultId;
    }

    public String getTempSysFaultId() {
        return tempSysFaultId;
    }

    public void setTempSysFaultId(String tempSysFaultId) {
        this.tempSysFaultId = tempSysFaultId;
    }

    public String getSysFaultDiagnosticId() {
        return sysFaultDiagnosticId;
    }

    public void setSysFaultDiagnosticId(String sysFaultDiagnosticId) {
        this.sysFaultDiagnosticId = sysFaultDiagnosticId;
    }

    public String getTempFaultDiagnosticId() {
        return tempFaultDiagnosticId;
    }

    public void setTempFaultDiagnosticId(String tempFaultDiagnosticId) {
        this.tempFaultDiagnosticId = tempFaultDiagnosticId;
    }

    public String getTaskPlanId() {
        return taskPlanId;
    }

    public void setTaskPlanId(String taskPlanId) {
        this.taskPlanId = taskPlanId;
    }

    public Integer getRepairId() {
        return repairId;
    }

    public void setRepairId(Integer repairId) {
        this.repairId = repairId;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }
}