package com.tepth.maintenancedispatch.dto.inner;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class RepairDetail {

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
    private Integer rescue;

    /**
     * 是否车辆事故：0-否 1-是
     */
    private Integer accident;

    /**
     * 报修时间
     */
    private Date addTime;

    /**
     * 作业开始时间
     */
    private Date startTime;

    /**
     * 完成时间
     */
    private Date finishTime;

    /**
     * 到厂时间
     */
    private Date arrivalTime;

    /**
     * 离厂时间
     */
    private Date leaveTime;

    /**作业持续时间**/
    private Long workingTime;

    /**
     * 维保作业状态：1-待回厂(站) 2-已回厂(站) 3-司机已交车 4-已过检 5-已竣检 6-司机已接车 7-已出厂
     */
    private Byte status;

    /**
     * 救援作业状态：1-已报救援 2-已安排 3-施救已出发 4-施救已到达 6-施救已接车 7-施救已交车 8-施救待回厂 9-施救已回厂
     */
    private Byte rescueStatus;


    /**
     * 临时故障id（，隔开）
     */
    private String tempFaultId;


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
    private String workerName;
    /**过检**/
    private String completeCheck;
    /**竣检**/
    private String passCheck;


    /**班组名称**/
    private String groupName;
    /**班组名称**/
    private String workStation;
    /**司机名**/
    private String driverName;
    /**车辆编号**/
    private String vehicleNo;

    /**
     * 作业过程状态：1-待作业 2-作业中 3-已完成
     */
    private Byte jobProcessStatus;

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
     * 机调员id：司机申请则此字段为空
     */
    private Integer dispatchUserId;


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

    /**故障**/
    List<Phenomenon> faults;
    /**作业项**/
    List<RepairPlan> works;

}
