package com.tepth.maintenancedispatch.dto.inner;

import com.tepth.maintenancedispatch.dao.model.factory.FactoryArea;
import lombok.Data;

import java.util.List;

/**
 * @Author royle.huang
 * @Date 2019/2/14 17:30
 * @Description 维修厂查询
 **/
@Data
public class MaintenanceFactoryVO {

    /**
     * id
     */
    private Integer id;

    /**
     * 名称
     */
    private String name;

    /**
     * 经度
     */
    private Double lat;

    /**
     * 纬度
     */
    private Double lng;
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
    /**维修厂区域**/
    private List<FactoryArea> factoryAreas;
}
