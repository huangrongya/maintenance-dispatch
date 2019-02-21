package com.tepth.maintenancedispatch.dto.inner;

import lombok.Data;

/**
 * @Author royle.huang
 * @Date 2019/2/20 19:43
 * @Description 工位
 **/
@Data
public class WorkStation {

    private Integer id;

    /**
     * 名称
     */
    private String name;
    /**是否推荐 0否 1是**/
    private Integer recommend;

}
