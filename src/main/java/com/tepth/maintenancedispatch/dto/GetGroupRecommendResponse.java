package com.tepth.maintenancedispatch.dto;

import com.tepth.maintenancedispatch.dto.inner.BaseResponse;
import com.tepth.maintenancedispatch.dto.inner.GroupVO;
import lombok.Data;

import java.util.List;

/**
 * @Author royle.huang
 * @Date 2019/2/21 9:28
 * @Description 推荐班组
 **/
@Data
public class GetGroupRecommendResponse extends BaseResponse {
    List<GroupVO> groupList;
}
