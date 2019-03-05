package com.tepth.maintenancedispatch.dao.model.factory;

import java.io.Serializable;

/**
 * tb_organization
 * @author 
 */
public class Organization implements Serializable {
    private Integer id;

    /**
     * 名称
     */
    private String name;

    /**
     * 组织编码
     */
    private String organizationNo;

    /**
     * 简称
     */
    private String shortName;

    /**
     * 备注
     */
    private String remark;

    /**
     * 机构类型：0-总公司 1-分公司 2-维修厂 3-小修组 4-保养组 5-驻站点 6-工位
     */
    private Byte orgType;

    /**
     * 上级id组合：例/1/2/4/
     */
    private String pOrganizationId;

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

    public String getOrganizationNo() {
        return organizationNo;
    }

    public void setOrganizationNo(String organizationNo) {
        this.organizationNo = organizationNo;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Byte getOrgType() {
        return orgType;
    }

    public void setOrgType(Byte orgType) {
        this.orgType = orgType;
    }

    public String getpOrganizationId() {
        return pOrganizationId;
    }

    public void setpOrganizationId(String pOrganizationId) {
        this.pOrganizationId = pOrganizationId;
    }
}