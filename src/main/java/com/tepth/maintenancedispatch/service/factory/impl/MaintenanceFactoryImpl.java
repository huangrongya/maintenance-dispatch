package com.tepth.maintenancedispatch.service.factory.impl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.tepth.maintenancedispatch.comm.Constant;
import com.tepth.maintenancedispatch.comm.ErrorConstant;
import com.tepth.maintenancedispatch.dao.mapper.factory.FactoryAreaMapper;
import com.tepth.maintenancedispatch.dao.mapper.factory.MaintenanceFactoryMapper;
import com.tepth.maintenancedispatch.dao.mapper.factory.OrganizationMapper;
import com.tepth.maintenancedispatch.dao.mapper.repair.RepairMapper;
import com.tepth.maintenancedispatch.dao.model.factory.*;
import com.tepth.maintenancedispatch.dao.model.repair.RepairExample;
import com.tepth.maintenancedispatch.dto.GetGroupListResponse;
import com.tepth.maintenancedispatch.dto.GetGroupRecommendResponse;
import com.tepth.maintenancedispatch.dto.GetWorkStationRecommendResponse;
import com.tepth.maintenancedispatch.dto.GetWorkStationResponse;
import com.tepth.maintenancedispatch.dto.inner.BaseRequest;
import com.tepth.maintenancedispatch.dto.inner.GroupVO;
import com.tepth.maintenancedispatch.dto.inner.MaintenanceFactoryVO;
import com.tepth.maintenancedispatch.dto.inner.WorkStation;
import com.tepth.maintenancedispatch.exception.ServiceException;
import com.tepth.maintenancedispatch.service.factory.IMaintenanceFactoryService;
import com.tepth.maintenancedispatch.util.MyBeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @Author royle.huang
 * @Date 2019/2/14 16:55
 * @Description 维修厂service
 **/
@Service
public class MaintenanceFactoryImpl implements IMaintenanceFactoryService {

    @Autowired
    MaintenanceFactoryMapper maintenanceFactoryMapper;
    @Autowired
    FactoryAreaMapper factoryAreaMapper;
    @Autowired
    OrganizationMapper organizationMapper;
    @Autowired
    RepairMapper repairMapper;

    @Override
    public MaintenanceFactoryVO queryFactoryByOrganizationId(Integer organizationId) {
        MaintenanceFactoryVO vo = new MaintenanceFactoryVO();

        MaintenanceFactoryExample example = new MaintenanceFactoryExample();
        MaintenanceFactoryExample.Criteria criteria = example.createCriteria();
        criteria.andOrganizationIdEqualTo(organizationId);
        List<MaintenanceFactory> list = maintenanceFactoryMapper.selectByExample(example);
        if (list.isEmpty()){
            throw new ServiceException(ErrorConstant.DATABASE_NO_DATA_CODE+"", ErrorConstant.DATABASE_NO_DATA_MSG);
        }
        MaintenanceFactory factory = list.get(0);
        FactoryAreaExample factoryAreaExample = new FactoryAreaExample();
        FactoryAreaExample.Criteria factoryCriteria = factoryAreaExample.createCriteria();
        factoryCriteria.andOrganizationIdEqualTo(organizationId);
        List<FactoryArea> factoryAreaList = factoryAreaMapper.selectByExample(factoryAreaExample);

        MyBeanUtils.copyPropertiesIgnoreCase(factory, vo);
        vo.setIconPosition(JSONArray.parseArray(factory.getIconPosition().replace("\\", "")));
        vo.setFactoryAreas(factoryAreaList);
        return vo;
    }

    @Override
    public GetGroupListResponse queryOrgGroupListByOrgId(Integer organizationId) {
        GetGroupListResponse response = new GetGroupListResponse();
        List<Organization> organizationList = organizationMapper.queryOrgGroupByPid(organizationId);
        List<GroupVO> list = new ArrayList<>();
        for (Organization organization : organizationList) {
            GroupVO groupVO = new GroupVO();
            groupVO.setId(organization.getId());
            groupVO.setName(organization.getName());
        }
        response.setGroupList(list);
        return response;
    }

    @Override
    public GetWorkStationResponse queryFactoryAreaStationList(Integer organizationId) {
        GetWorkStationResponse response = new GetWorkStationResponse();
        List<WorkStation> list = getWorkStations(organizationId);
        response.setWorkStation(list);
        return response;
    }

    private List<WorkStation> getWorkStations(Integer organizationId) {
        FactoryAreaExample example = new FactoryAreaExample();
        FactoryAreaExample.Criteria criteria = example.createCriteria();
        criteria.andOrganizationIdEqualTo(organizationId).andTypeEqualTo(Constant.AREA_TYPE_WORK_STATION);
        List<FactoryArea> areaList = factoryAreaMapper.selectByExample(example);
        List<WorkStation> list = new ArrayList<>();
        for (FactoryArea factoryArea : areaList) {
            WorkStation workStation = new WorkStation();
            workStation.setId(factoryArea.getId());
            workStation.setName(factoryArea.getName());
            workStation.setRecommend(0);
            list.add(workStation);
        }
        return list;
    }

    @Override
    public GetWorkStationRecommendResponse queryWorkStationRecommend(Integer organizationId) {
        GetWorkStationRecommendResponse response = new GetWorkStationRecommendResponse();
        List<WorkStation> list = getWorkStations(organizationId);
        if (list.isEmpty()){
            return response;
        }
        long min = 0;
        List<Integer> idList = new ArrayList<>();
        for (WorkStation workStation : list) {
            RepairExample example = new RepairExample();
            RepairExample.Criteria criteria = example.createCriteria();
            criteria.andFactoryAreaIdEqualTo(workStation.getId());
            long count = repairMapper.countByExample(example);
            if (min == count) {
                idList.add(workStation.getId());
            }else if (min > count){
                min = count;
                idList.clear();
                idList.add(workStation.getId());
            }
        }
        Random random = new Random();
        int index = random.nextInt(idList.size());
        long recommend = idList.get(index);
        for (WorkStation workStation : list) {
            if (workStation.getId()==recommend){
                workStation.setRecommend(1);
                break;
            }
        }
        response.setWorkStations(list);
        return response;

    }

    @Override
    public GetGroupRecommendResponse queryOrgGroupRecommend(BaseRequest request) {
        GetGroupRecommendResponse response = new GetGroupRecommendResponse();
        List<Organization> organizationList = organizationMapper.queryOrgGroupByPid(request.getUser().getOrganizationId());
        if (organizationList.isEmpty()){
            return response;
        }
        List<GroupVO> groupList = new ArrayList<>();
        for (Organization organization : organizationList) {
            GroupVO groupVO = new GroupVO();
            MyBeanUtils.copyPropertiesIgnoreCase(organization, groupVO);
            groupVO.setRecommend(0);
            groupList.add(groupVO);

        }

        //推荐
        long min = 0;
        List<Integer> idList = new ArrayList<>();
        for (GroupVO groupVO : groupList) {
            RepairExample example = new RepairExample();
            RepairExample.Criteria criteria = example.createCriteria();
            criteria.andOrgGroupIdEqualTo(groupVO.getId());
            long count = repairMapper.countByExample(example);
            if (min == count) {
                idList.add(groupVO.getId());
            }else if (min > count){
                min = count;
                idList.clear();
                idList.add(groupVO.getId());
            }
        }
        Random random = new Random();
        int index = random.nextInt(idList.size());
        long recommend = idList.get(index);
        for (GroupVO groupVO : groupList) {
            if (groupVO.getId()==recommend){
                groupVO.setRecommend(1);
                break;
            }
        }
        response.setGroupList(groupList);
        return response;
    }
}
