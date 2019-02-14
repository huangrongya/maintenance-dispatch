package com.tepth.maintenancedispatch.service.organization.impl;

import com.tepth.maintenancedispatch.comm.ErrorConstant;
import com.tepth.maintenancedispatch.dao.mapper.organization.MaintenanceFactoryMapper;
import com.tepth.maintenancedispatch.dao.model.organization.MaintenanceFactory;
import com.tepth.maintenancedispatch.dao.model.organization.MaintenanceFactoryExample;
import com.tepth.maintenancedispatch.exception.ServiceException;
import com.tepth.maintenancedispatch.service.organization.IMaintenanceFactoryService;
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

    @Override
    public MaintenanceFactory queryFactoryByOrganizationId(Integer organizationId) {
        MaintenanceFactoryExample example = new MaintenanceFactoryExample();
        MaintenanceFactoryExample.Criteria criteria = example.createCriteria();
        criteria.andOrganizationIdEqualTo(organizationId);
        List<MaintenanceFactory> list = maintenanceFactoryMapper.selectByExample(example);
        if (list.isEmpty()){
            throw new ServiceException(ErrorConstant.DATABASE_NO_DATA_CODE, ErrorConstant.DATABASE_NO_DATA_MSG);
        }
        return list.get(0);
    }
}
