package com.tepth.maintenancedispatch.dto;

import com.tepth.maintenancedispatch.dto.inner.BaseResponse;
import com.tepth.maintenancedispatch.dto.inner.Phenomenon;
import lombok.Data;

import java.util.List;

/**
 * @Author royle.huang
 * @Date 2019/2/21 11:34
 * @Description 获取故障列表
 **/
@Data
public class GetPhenamenonResponse extends BaseResponse {

    List<Phenomenon> faults;
}
