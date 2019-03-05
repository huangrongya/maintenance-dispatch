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

}