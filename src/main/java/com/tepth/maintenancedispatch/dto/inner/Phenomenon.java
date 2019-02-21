package com.tepth.maintenancedispatch.dto.inner;

import lombok.Data;

import java.util.Date;

/**
 * @Author royle.huang
 * @Date 2019/2/21 11:32
 * @Description 故障现象
 **/
@Data
public class Phenomenon {
    private Integer id;

    /**
     * 名称
     */
    private String name;

    /**
     * 描述
     */
    private String describes;

    /**
     * 别名
     */
    private String alias;


    /**
     * 车辆系别
     */
    private Integer seriesId;
    private String series;

}
