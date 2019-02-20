package com.tepth.maintenancedispatch.service.user.impl;

import com.tepth.maintenancedispatch.comm.Constant;
import com.tepth.maintenancedispatch.dao.mapper.repair.RepairMapper;
import com.tepth.maintenancedispatch.dao.mapper.user.UserMapper;
import com.tepth.maintenancedispatch.dao.model.repair.Repair;
import com.tepth.maintenancedispatch.dao.model.repair.RepairExample;
import com.tepth.maintenancedispatch.dao.model.user.User;
import com.tepth.maintenancedispatch.dto.GetWorkerInfoResponse;
import com.tepth.maintenancedispatch.dto.inner.BaseRequest;
import com.tepth.maintenancedispatch.dto.inner.UserInfo;
import com.tepth.maintenancedispatch.service.user.IWorkerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author royle.huang
 * @Date 2019/2/15 17:15
 * @Description 技工service
 **/
@Service
@Slf4j
public class WorkerServiceImpl implements IWorkerService {

    @Autowired
    UserMapper userMapper;
    @Autowired
    RepairMapper repairMapper;

    @Override
    public GetWorkerInfoResponse queryWorkersMainPage(BaseRequest request) {

        GetWorkerInfoResponse response = new GetWorkerInfoResponse();
        UserInfo user = request.getUser();
        //查找组织下面的技工
        List<User> workers = userMapper.selectByOrganizationAndRole(user.getOrganizationId(), Constant.MAINTENANCE_DISPATCHER_ROLE_ID);
        response.setWorkers(workers);
        int online=0, offline=0;
        if (!workers.isEmpty()){
            for (User worker : workers) {
                if (worker.getOnlineStatus()==1){
                    online++;
                }else if (worker.getOnlineStatus()==2){
                    offline++;
                }
            }
        }
        response.setOnline(online);
        response.setOffline(offline);
        //查询工单，获取技工工位
        RepairExample example = new RepairExample();
        RepairExample.Criteria criteria = example.createCriteria();
        criteria.andOrgMaintenanceIdEqualTo(user.getOrganizationId()).andWorkerIdIsNotNull();
        List<Repair> repairs = repairMapper.selectByExample(example);
        //工位-技工
        Map<String, String> areaWorkers = new HashMap<>();
        for (Repair repair : repairs) {
            if (repair.getFactoryAreaId() != null){
                areaWorkers.put(repair.getFactoryAreaId()+"", repair.getWorkerId());
            }
        }
        response.setAreaWorkers(areaWorkers);
        return response;
    }
}
