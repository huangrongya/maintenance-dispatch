package com.tepth.maintenancedispatch.dao.model.factory;

import java.io.Serializable;

/**
 * tb_factory_area
 * @author 
 */
public class FactoryArea implements Serializable {
    private Integer id;

    /**
     * 名称
     */
    private String name;

    /**
     * 类型：1-工位 2-库房 3-总成库房 4-维保停车区 5-精修区 6-办公区 7-营运停车区 8-缓冲区
     */
    private Byte type;

    /**
     * 所属组织机构id
     */
    private Integer organizationId;

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

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Integer getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Integer organizationId) {
        this.organizationId = organizationId;
    }
}