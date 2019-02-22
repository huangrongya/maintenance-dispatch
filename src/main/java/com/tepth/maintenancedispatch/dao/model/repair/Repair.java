package com.tepth.maintenancedispatch.dao.model.repair;

import java.io.Serializable;
import java.util.Date;

/**
 * tb_repair
 * @author 
 */
public class Repair implements Serializable {
    private Integer id;

    /**
     * 工单号
     */
    private String orderNo;

    /**
     * 补充故障描述
     */
    private String additional;

    /**
     * 作业类型：1-小修 2-一级保养 3-二级保养 4-三级保养
     */
    private Byte type;

    /**
     * 报送机构类别：1-维修厂 2-驻站
     */
    private Byte category;

    /**
     * 是否需要救援：0-否 1-是
     */
    private Boolean rescue;

    /**
     * 是否车辆事故：0-否 1-是
     */
    private Boolean accident;

    /**
     * 报修时间
     */
    private Date addTime;

    /**
     * 到厂时间
     */
    private Date arrivalTime;

    /**
     * 完成时间
     */
    private Date finishTime;

    /**
     * 维保作业状态（维修厂）：1-待回厂(站) 2-已回厂(站) 3-司机已交车 4-已过检 5-已竣检 6-司机已接车 7-已出厂
     */
    private Byte status;

    /**
     * 作业过程状态：1-待作业 2-作业中 3-已完成 4-已失效（当工单被逻辑删除或取消后状态）
     */
    private Byte jobProcessStatus;

    /**
     * 救援作业状态：1-已报救援 2-已安排 3-施救已出发 4-施救已到达 6-施救已接车 7-施救已交车 8-施救待回厂 9-施救已回厂
     */
    private Byte rescueStatus;

    /**
     * 工单状态：1-进行中 2-已完成 3-已取消 -1-逻辑删除
     */
    private Byte state;

    /**
     * 系统故障现象id（，隔开）
     */
    private String faultPhenomenonId;

    /**
     * 临时故障现象id（，隔开）
     */
    private String tempFaultPhenomenonId;

    /**
     * 系统诊断id（，隔开）
     */
    private String sysFaultDiagnosticId;

    /**
     * 临时诊断id（，隔开）
     */
    private String tempFaultDiagnosticId;

    /**
     * 用户id（司机）
     */
    private Integer userId;

    /**
     * 机调员id：司机申请则此字段为空
     */
    private Integer dispatchUserId;

    /**
     * 车辆id
     */
    private Integer vehicleId;

    /**
     * 维保组织id：组织编码
     */
    private Integer orgMaintenanceId;

    /**
     * 作业班组id：组织编码
     */
    private Integer orgGroupId;

    /**
     * 维修人员id，用，隔开
     */
    private String workerId;

    /**
     * 作业工位id：维修厂区域id
     */
    private Integer factoryAreaId;

    /**
     * 过检人员id ，隔开
     */
    private String passUserId;

    /**
     * 竣检人员id ，隔开
     */
    private String completeUserId;

    /**
     * activiti流程实例id
     */
    private String processInstanceId;

    /**
     * 此行创建时间
     */
    private Date gmtCreate;

    /**
     * 此行修改时间
     */
    private Date gmtModified;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getAdditional() {
        return additional;
    }

    public void setAdditional(String additional) {
        this.additional = additional;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Byte getCategory() {
        return category;
    }

    public void setCategory(Byte category) {
        this.category = category;
    }

    public Boolean getRescue() {
        return rescue;
    }

    public void setRescue(Boolean rescue) {
        this.rescue = rescue;
    }

    public Boolean getAccident() {
        return accident;
    }

    public void setAccident(Boolean accident) {
        this.accident = accident;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Date getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(Date arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public Date getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Byte getJobProcessStatus() {
        return jobProcessStatus;
    }

    public void setJobProcessStatus(Byte jobProcessStatus) {
        this.jobProcessStatus = jobProcessStatus;
    }

    public Byte getRescueStatus() {
        return rescueStatus;
    }

    public void setRescueStatus(Byte rescueStatus) {
        this.rescueStatus = rescueStatus;
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }

    public String getFaultPhenomenonId() {
        return faultPhenomenonId;
    }

    public void setFaultPhenomenonId(String faultPhenomenonId) {
        this.faultPhenomenonId = faultPhenomenonId;
    }

    public String getTempFaultPhenomenonId() {
        return tempFaultPhenomenonId;
    }

    public void setTempFaultPhenomenonId(String tempFaultPhenomenonId) {
        this.tempFaultPhenomenonId = tempFaultPhenomenonId;
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

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getDispatchUserId() {
        return dispatchUserId;
    }

    public void setDispatchUserId(Integer dispatchUserId) {
        this.dispatchUserId = dispatchUserId;
    }

    public Integer getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Integer vehicleId) {
        this.vehicleId = vehicleId;
    }

    public Integer getOrgMaintenanceId() {
        return orgMaintenanceId;
    }

    public void setOrgMaintenanceId(Integer orgMaintenanceId) {
        this.orgMaintenanceId = orgMaintenanceId;
    }

    public Integer getOrgGroupId() {
        return orgGroupId;
    }

    public void setOrgGroupId(Integer orgGroupId) {
        this.orgGroupId = orgGroupId;
    }

    public String getWorkerId() {
        return workerId;
    }

    public void setWorkerId(String workerId) {
        this.workerId = workerId;
    }

    public Integer getFactoryAreaId() {
        return factoryAreaId;
    }

    public void setFactoryAreaId(Integer factoryAreaId) {
        this.factoryAreaId = factoryAreaId;
    }

    public String getPassUserId() {
        return passUserId;
    }

    public void setPassUserId(String passUserId) {
        this.passUserId = passUserId;
    }

    public String getCompleteUserId() {
        return completeUserId;
    }

    public void setCompleteUserId(String completeUserId) {
        this.completeUserId = completeUserId;
    }

    public String getProcessInstanceId() {
        return processInstanceId;
    }

    public void setProcessInstanceId(String processInstanceId) {
        this.processInstanceId = processInstanceId;
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