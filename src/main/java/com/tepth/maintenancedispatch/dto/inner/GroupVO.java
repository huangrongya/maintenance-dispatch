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
     * @Author royle.huang
     * @Date 2019/2/21 9:26
     * @Description 是否推荐 0否 1推荐
     **/
    private Integer recommend;
}
