package com.tepth.maintenancedispatch.dao.model.user;

import java.io.Serializable;
import java.util.Date;

/**
 * tb_user
 * @author 
 */
public class User implements Serializable {
    private Integer id;

    /**
     * 工号
     */
    private String jobNo;

    /**
     * 密码
     */
    private String password;

    /**
     * 手机号
     */
    private String mobileNo;

    /**
     * 用户姓名
     */
    private String userName;

    /**
     * 大头照
     */
    private String headImgUrl;

    /**
     * 班次：上1休2 、三休一
     */
    private String scheduling;

    /**
     * 在岗状态：1-在岗 2-空闲 3-下班
     */
    private Byte onlineStatus;

    /**
     * 设置人
     */
    private Integer operateUserId;

    /**
     * 设置时间
     */
    private Date operateTime;

    /**
     * 组织机构id
     */
    private Integer organizationId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getJobNo() {
        return jobNo;
    }

    public void setJobNo(String jobNo) {
        this.jobNo = jobNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getHeadImgUrl() {
        return headImgUrl;
    }

    public void setHeadImgUrl(String headImgUrl) {
        this.headImgUrl = headImgUrl;
    }

    public String getScheduling() {
        return scheduling;
    }

    public void setScheduling(String scheduling) {
        this.scheduling = scheduling;
    }

    public Byte getOnlineStatus() {
        return onlineStatus;
    }

    public void setOnlineStatus(Byte onlineStatus) {
        this.onlineStatus = onlineStatus;
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

    public Integer getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Integer organizationId) {
        this.organizationId = organizationId;
    }
}