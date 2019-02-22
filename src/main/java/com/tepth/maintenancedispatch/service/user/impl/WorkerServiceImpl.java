package com.tepth.maintenancedispatch.service.user.impl;

import com.tepth.maintenancedispatch.comm.*;
import com.tepth.maintenancedispatch.dao.mapper.repair.RepairMapper;
import com.tepth.maintenancedispatch.dao.mapper.user.UserMapper;
import com.tepth.maintenancedispatch.dao.model.repair.Repair;
import com.tepth.maintenancedispatch.dao.model.repair.RepairExample;
import com.tepth.maintenancedispatch.dto.GetWorkerInfoResponse;
import com.tepth.maintenancedispatch.dto.inner.*;
import com.tepth.maintenancedispatch.exception.ServiceException;
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
        long online = userMapper.countByOrganizationAndRoleAndStatus(user.getOrganizationId(), Constant.ROLE_ID_WORKER, Constant.ONLINE);
        //查询工单作业中状态下作业人员数量
        int working = 0;
        RepairExample example = new RepairExample();
        RepairExample.Criteria criteria = example.createCriteria();
        criteria.andJobProcessStatusEqualTo(Constant.PROCESS_STATUS_WORKING);
        List<Repair> repairs = repairMapper.selectByExample(example);
        if (!repairs.isEmpty()){
            for (Repair repair : repairs) {
                //维修中
                if (RepairStatusEnum.EXCHANGE_TO_WORKER.getCode().equals(repair.getStatus())){
                    String workerIds = repair.getWorkerId();
                    if (workerIds!=null){
                        working += workerIds.split(",").length;
                    }
                }
                //过检
                if (RepairStatusEnum.PASS_CHECK.getCode().equals(repair.getStatus())){
                    String workerIds = repair.getWorkerId();
                    if (workerIds!=null){
                        working += workerIds.split(",").length;
                    }
                }
                //竣检
                if (RepairStatusEnum.COMPLETE_CHECK.getCode().equals(repair.getStatus())){
                    String workerIds = repair.getWorkerId();
                    if (workerIds!=null){
                        working += workerIds.split(",").length;
                    }
                }
            }
        }

        int idle = (int) (online-working);
        if (idle<0){
            throw new ServiceException(RspCodeEnum.FAIL.getCode(), RspCodeEnum.FAIL.getDesc());
        }
        response.setOnline(Math.toIntExact(online));
        response.setIdle(idle);
        return response;
    }

    @Override
    public PageResponse<Worker> queryWorkerListByPage(PageRequest request) {
        PageResponse<Worker> response = new PageResponse<>();
        QueryPage page = Global.getQueryPage(request);
        Map<String, Object> map = new HashMap<>();
        map.put("queryPage", page);
        map.put("organizationId", request.getUser().getOrganizationId());
        map.put("roleId", Constant.ROLE_ID_WORKER);
        List<Worker> workers = userMapper.queryWorkerListByPage(map);
        Long total = userMapper.queryWorkerListByPageCount(map);
        if (!workers.isEmpty()){
            for (Worker worker : workers) {
                worker.setOrganizationName(request.getUser().getOrganizationName());
            }
        }
        response.setPageList(workers);
        response.setTotalPage(total);
        return response;
    }
}
