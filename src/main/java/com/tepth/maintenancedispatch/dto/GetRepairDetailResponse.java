package com.tepth.maintenancedispatch.dto;

import com.tepth.maintenancedispatch.dto.inner.BaseResponse;
import com.tepth.maintenancedispatch.dto.inner.RepairDetail;
import lombok.Data;

/**
 * @Author royle.huang
 * @Date 2019/2/26 9:13
 * @Description 工单详情
 **/
@Data
public class GetRepairDetailResponse extends BaseResponse {
    RepairDetail repairDetail;
}
