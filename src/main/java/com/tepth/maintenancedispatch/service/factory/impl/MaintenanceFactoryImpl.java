package com.tepth.maintenancedispatch.service.factory.impl;

import com.tepth.maintenancedispatch.comm.ErrorConstant;
import com.tepth.maintenancedispatch.dao.mapper.factory.FactoryAreaMapper;
import com.tepth.maintenancedispatch.dao.mapper.factory.MaintenanceFactoryMapper;
import com.tepth.maintenancedispatch.dao.model.factory.FactoryArea;
import com.tepth.maintenancedispatch.dao.model.factory.FactoryAreaExample;
import com.tepth.maintenancedispatch.dao.model.factory.MaintenanceFactory;
import com.tepth.maintenancedispatch.dao.model.factory.MaintenanceFactoryExample;
import com.tepth.maintenancedispatch.dto.inner.MaintenanceFactoryVO;
import com.tepth.maintenancedispatch.exception.ServiceException;
import com.tepth.maintenancedispatch.service.factory.IMaintenanceFactoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

        vo.setLng(factory.getLng());
        vo.setLat(factory.getLat());
        vo.setName(factory.getName());
        vo.setId(factory.getId());
        vo.setFactoryAreas(factoryAreaList);
        return vo;
    }
}
