package com.tepth.maintenancedispatch.dto;

import com.tepth.maintenancedispatch.dto.inner.BaseResponse;
import lombok.Data;

@Data
public class GetMaterialInfoResponse extends BaseResponse {

    /**缺料**/
    Long lack;
    /**成本**/
    Double cost;
}
