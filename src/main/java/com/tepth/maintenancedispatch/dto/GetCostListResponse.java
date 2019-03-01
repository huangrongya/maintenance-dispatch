package com.tepth.maintenancedispatch.dto;

import com.tepth.maintenancedispatch.dto.inner.PageResponse;
import lombok.Data;

@Data
public class GetCostListResponse<T> extends PageResponse<T> {

    private Double cost;
}
