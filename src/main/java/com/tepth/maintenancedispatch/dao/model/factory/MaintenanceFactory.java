package com.tepth.maintenancedispatch.dao.model.factory;

import java.io.Serializable;

/**
 * tb_maintenance_factory
 * @author 
 */
public class MaintenanceFactory implements Serializable {
    /**
     * id
     */
    private Integer id;

    /**
     * 组织id
     */
    private Integer organizationId;

    /**
     * 经度
     */
    private Double lat;

    /**
     * 纬度
     */
    private Double lng;

    /**
     * 维修厂名称
     */
    private String name;

    /**
     * 图片链接
     */
    private String imgPath;

    /**
     * 图片高度
     */
    private Double imgHeight;

    /**
     * 图片宽度
     */
    private Double imgWidth;

    /**
     * 厂区标位置信息 json
     */
    private String iconPosition;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Integer organizationId) {
        this.organizationId = organizationId;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLng() {
        return lng;
    }

    public void setLng(Double lng) {
        this.lng = lng;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public Double getImgHeight() {
        return imgHeight;
    }

    public void setImgHeight(Double imgHeight) {
        this.imgHeight = imgHeight;
    }

    public Double getImgWidth() {
        return imgWidth;
    }

    public void setImgWidth(Double imgWidth) {
        this.imgWidth = imgWidth;
    }

    public String getIconPosition() {
        return iconPosition;
    }

    public void setIconPosition(String iconPosition) {
        this.iconPosition = iconPosition;
    }
}