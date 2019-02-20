package com.tepth.maintenancedispatch.dto;

import com.tepth.maintenancedispatch.dao.model.factory.FactoryArea;
import com.tepth.maintenancedispatch.dto.inner.BaseResponse;
import lombok.Data;

import java.util.List;

@Data
public class GetWorkStationResponse extends BaseResponse {

    List<FactoryArea> areaList;
}
