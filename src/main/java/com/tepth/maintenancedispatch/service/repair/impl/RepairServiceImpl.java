package com.tepth.maintenancedispatch.service.repair.impl;

import com.tepth.maintenancedispatch.comm.Global;
import com.tepth.maintenancedispatch.comm.Page;
import com.tepth.maintenancedispatch.comm.QueryPage;
import com.tepth.maintenancedispatch.dao.mapper.repair.RepairMapper;
import com.tepth.maintenancedispatch.dao.model.repair.Repair;
import com.tepth.maintenancedispatch.dto.AddRepairRequest;
import com.tepth.maintenancedispatch.dto.GetRepairListPagingRequest;
import com.tepth.maintenancedispatch.dto.inner.BaseResponse;
import com.tepth.maintenancedispatch.dto.inner.PageResponse;
import com.tepth.maintenancedispatch.dto.inner.UserInfo;
import com.tepth.maintenancedispatch.service.repair.IRepairService;
import com.tepth.maintenancedispatch.util.PageUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author royle.huang
 * @Date 2019/2/19 14:02
 * @Description 维修工单service
 **/
@Service
@Slf4j
public class RepairServiceImpl implements IRepairService {

    @Autowired
    RepairMapper repairMapper;

    @Override
    public PageResponse<Repair> queryRepairListByPage(GetRepairListPagingRequest request) {
        PageResponse<Repair> response = new PageResponse<>();
        UserInfo userInfo = request.getUser();
        QueryPage page = Global.getQueryPage(request);
        Map<String, Object> map = new HashMap<>();
        map.put("queryPage", page);
        map.put("statusArr", request.getStatusArr());
        map.put("organizationId", userInfo.getOrganizationId());
        List<Repair> repairList = repairMapper.queryListByPageWithStatusArr(map);
        if (repairList != null){
            repairList.sort(Comparator.comparing(Repair::getGmtCreate));
        }
        long total = repairMapper.queryListByPageCountWithStatusArr(map);
        response.setPageList(repairList);
        response.setTotalCount(total);
        response.setTotalPage(PageUtil.getTotalPage(total, request.getRow()));
        return response;
    }

    @Override
    public BaseResponse addRepairInfo(AddRepairRequest request) {
        BaseResponse response = new BaseResponse();
        //TODO 调用司机端接口 添加
        return response;
    }
}
