package com.tepth.maintenancedispatch.dto;

import com.tepth.maintenancedispatch.dto.inner.BaseRequest;
import lombok.Data;

/**
 * @Author royle.huang
 * @Date 2019/2/20 10:10
 * @Description 搜索故障
 **/

@Data
public class SearchFaultRequest extends BaseRequest {
    String faultName;
}
