package com.tepth.maintenancedispatch.dto.inner;

import lombok.Data;

import java.util.Date;

@Data
public class Alarm {

    private Integer id;

    /**
     * 预警时间
     */
    private Date addTime;

    /**
     * 预警类型
     */
    private String type;

    /**
     * 预警级别
     */
    private Byte level;

    /**
     * 预警内容
     */
    private String content;

    /**
     * 出现频率、次数
     */
    private Byte frequency;

}
