package com.tepth.maintenancedispatch.service.user.impl;

import com.tepth.maintenancedispatch.comm.Global;
import com.tepth.maintenancedispatch.comm.QueryPage;
import com.tepth.maintenancedispatch.dao.mapper.repair.RepairMapper;
import com.tepth.maintenancedispatch.dao.mapper.user.UserMapper;
import com.tepth.maintenancedispatch.dto.inner.BaseRequest;
import com.tepth.maintenancedispatch.dto.inner.Driver;
import com.tepth.maintenancedispatch.dto.inner.PageRequest;
import com.tepth.maintenancedispatch.dto.inner.PageResponse;
import com.tepth.maintenancedispatch.service.user.IDriverService;
import com.tepth.maintenancedispatch.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author royle.huang
 * @Date 2019/2/28 9:24
 * @Description 司机service
 **/
@Service
public class DriverServiceImpl implements IDriverService {

    @Autowired
    UserMapper userMapper;
    @Autowired
    RepairMapper repairMapper;


    @Override
    public PageResponse queryDriverListByPage(PageRequest request) {
        PageResponse<Driver> response = new PageResponse<>();

        QueryPage page = Global.getQueryPage(request);
        Map<String, Object> map = new HashMap<>();
        map.put("queryPage", page);
        List<Driver> list = userMapper.queryDriverListByPage(map);
        long total = userMapper.queryDriverListByPageCount(map);
        response.setPageList(list);
        response.setTotalCount(total);
        response.setTotalPage(PageUtil.getTotalPage(total, request.getRow()));
        return response;
    }
}
