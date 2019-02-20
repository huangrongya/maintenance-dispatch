package com.tepth.maintenancedispatch.dao.model.vehicle;

import java.io.Serializable;

/**
 * tb_vehicle_line
 * @author 
 */
public class VehicleLine implements Serializable {
    private Integer id;

    /**
     * 线路名称
     */
    private String lineName;

    /**
     * 线路编号
     */
    private String lineNo;

    /**
     * 组织编码
     */
    private String organizationId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLineName() {
        return lineName;
    }

    public void setLineName(String lineName) {
        this.lineName = lineName;
    }

    public String getLineNo() {
        return lineNo;
    }

    public void setLineNo(String lineNo) {
        this.lineNo = lineNo;
    }

    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }
}