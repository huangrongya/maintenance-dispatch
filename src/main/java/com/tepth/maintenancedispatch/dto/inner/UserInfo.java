package com.tepth.maintenancedispatch.dto.inner;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.beans.Transient;
import java.util.Date;

/**
 * @Author royle.huang
 * @Date 2019/2/1 10:12
 * @Description 用户查询类
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserInfo {

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

    /**
     * 班次：上1休2 、三休一
     */
    private String scheduling;


    /**
     * 组织机构id
     */
    private Integer organizationId;

    private String organizationName;


}
