package com.tepth.maintenancedispatch.dto;

import com.tepth.maintenancedispatch.dao.model.factory.Organization;
import com.tepth.maintenancedispatch.dto.inner.BaseResponse;
import lombok.Data;

import java.util.List;

@Data
public class GetGroupListResponse extends BaseResponse {

    List<Organization> organizationList;
}
