package com.tepth.maintenancedispatch.dto;

import com.tepth.maintenancedispatch.dto.inner.PageRequest;
import lombok.Data;

/**
 * @Author royle.huang
 * @Date 2019/2/19 14:23
 * @Description 分页查询维修单
 **/
@Data
public class GetRepairListPagingRequest extends PageRequest {

    /**维保作业状态：1-待回厂(站) 2-已回厂(站) 3-司机已交车 4-已过检 5-已竣检 6-司机已接车 7-已出厂**/
    private Integer status;
    private Integer[] statusArr;

}
