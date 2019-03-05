package com.tepth.maintenancedispatch.dto;

import com.tepth.maintenancedispatch.dao.model.factory.Organization;
import com.tepth.maintenancedispatch.dto.inner.BaseResponse;
import com.tepth.maintenancedispatch.dto.inner.GroupVO;
import lombok.Data;

import java.util.List;

@Data
public class GetGroupListResponse extends BaseResponse {

    List<GroupVO> groupList;
}
