package com.tepth.maintenancedispatch.dto.inner;

import lombok.Data;

@Data
public class Driver {

    private Integer id;

    /**
     * 工号
     */
    private String jobNo;

    /**
     * 手机号
     */
    private String mobileNo;

    /**
     * 用户姓名
     */
    private String userName;

    /**
     * 大头照
     */
    private String headImgUrl;

    /**组织名称**/
    private String organizationName;

    private String vehicleNo;
}
