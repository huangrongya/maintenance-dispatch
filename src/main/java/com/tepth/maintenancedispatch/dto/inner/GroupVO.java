package com.tepth.maintenancedispatch.dto.inner;

import lombok.Data;

/**
 * @Author royle.huang
 * @Date 2019/2/21 9:25
 * @Description 班组信息
 **/

@Data
public class GroupVO {

    private Integer id;

    /**
     * 名称
     */
    private String name;


    /**
     * @Author royle.huang
     * @Date 2019/2/21 9:26
     * @Description 是否推荐 0否 1推荐
     **/
    private Integer recommend;
}
