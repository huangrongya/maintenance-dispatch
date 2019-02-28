package com.tepth.maintenancedispatch.service.user.impl;

import com.tepth.maintenancedispatch.comm.*;
import com.tepth.maintenancedispatch.dao.mapper.repair.RepairMapper;
import com.tepth.maintenancedispatch.dao.mapper.repair.RepairTaskMapper;
import com.tepth.maintenancedispatch.dao.mapper.user.UserMapper;
import com.tepth.maintenancedispatch.dao.model.repair.Repair;
import com.tepth.maintenancedispatch.dao.model.repair.RepairExample;
import com.tepth.maintenancedispatch.dao.model.repair.RepairTask;
import com.tepth.maintenancedispatch.dao.model.repair.RepairTaskExample;
import com.tepth.maintenancedispatch.dto.GetWorkerInfoResponse;
import com.tepth.maintenancedispatch.dto.inner.*;
import com.tepth.maintenancedispatch.exception.ServiceException;
import com.tepth.maintenancedispatch.service.user.IWorkerService;
import com.tepth.maintenancedispatch.util.PageUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.*;

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
    @Autowired
    RepairTaskMapper repairTaskMapper;

    @Override
    public GetWorkerInfoResponse queryWorkersMainPage(BaseRequest request) {

        GetWorkerInfoResponse response = new GetWorkerInfoResponse();
        UserInfo user = request.getUser();
        //查找组织下面的技工
        long online = userMapper.countByOrganizationAndRoleAndStatus(user.getOrganizationId(), Constant.ROLE_ID_WORKER, Constant.ONLINE);
        //查询工单作业中状态下作业人员数量
        int working = 0;
        List<Integer> idList = getWorkingIdList();
        working=idList.size();

        int idle = (int) (online-working);
        if (idle<0){
            throw new ServiceException(RspCodeEnum.FAIL.getCode(), RspCodeEnum.FAIL.getDesc());
        }
        response.setOnline(Math.toIntExact(online));
        response.setIdle(idle);
        return response;
    }

    private List<Integer> getWorkingIdList() {
        RepairExample example = new RepairExample();
        RepairExample.Criteria criteria = example.createCriteria();
        criteria.andJobProcessStatusEqualTo(Constant.PROCESS_STATUS_WORKING);
        List<Repair> repairs = repairMapper.selectByExample(example);
        List<Integer> idList = new ArrayList<>();
        if (!repairs.isEmpty()) {
            for (Repair repair : repairs) {
                //维修
                RepairTaskExample taskExample = new RepairTaskExample();
                RepairTaskExample.Criteria taskCriteria = taskExample.createCriteria();
                taskCriteria.andRepairIdEqualTo(repair.getId());
                List<RepairTask> list = repairTaskMapper.selectByExample(taskExample);
                if (!list.isEmpty()) {
                    for (RepairTask repairTask : list) {
                        String userIdStr = repairTask.getTaskUserId();
                        if (!StringUtils.isEmpty(userIdStr)) {
                            String[] arr = userIdStr.split(",");
                            if (arr.length != 0) {
                                for (String s : arr) {
                                    idList.add(Integer.parseInt(s));
                                }
                            }
                        }
                    }
                }
                //过检
                String userIdStr = repair.getPassUserId();
                if (!StringUtils.isEmpty(userIdStr)) {
                    String[] arr = userIdStr.split(",");
                    if (arr.length != 0) {
                        for (String s : arr) {
                            idList.add(Integer.parseInt(s));
                        }
                    }
                }
                //竣检
                userIdStr = repair.getCompleteUserId();
                if (!StringUtils.isEmpty(userIdStr)) {
                    String[] arr = userIdStr.split(",");
                    if (arr.length != 0) {
                        for (String s : arr) {
                            idList.add(Integer.parseInt(s));
                        }
                    }
                }
            }
        }
        return idList;
    }

    @Override
    public PageResponse<Worker> queryWorkerListByPage(PageRequest request) {
        PageResponse<Worker> response = new PageResponse<>();
        QueryPage page = Global.getQueryPage(request);
        Map<String, Object> map = new HashMap<>();
        map.put("queryPage", page);
        if ("idle".equals(request.getKeyWord())){
            //查询工单绑定的用户id列表
            List<Integer> idList = getWorkingIdList();
            map.put("workingId", idList);
        }
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
        response.setTotalCount(total);
        response.setTotalPage(PageUtil.getTotalPage(total, request.getRow()));
        return response;
    }
}
