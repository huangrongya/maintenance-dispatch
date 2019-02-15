package com.tepth.maintenancedispatch.dao.mapper.factory;

import com.tepth.maintenancedispatch.dao.model.factory.MaintenanceFactory;
import com.tepth.maintenancedispatch.dao.model.factory.MaintenanceFactoryExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface MaintenanceFactoryMapper {
    long countByExample(MaintenanceFactoryExample example);

    int deleteByExample(MaintenanceFactoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MaintenanceFactory record);

    int insertSelective(MaintenanceFactory record);

    List<MaintenanceFactory> selectByExample(MaintenanceFactoryExample example);

    MaintenanceFactory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MaintenanceFactory record, @Param("example") MaintenanceFactoryExample example);

    int updateByExample(@Param("record") MaintenanceFactory record, @Param("example") MaintenanceFactoryExample example);

    int updateByPrimaryKeySelective(MaintenanceFactory record);

    int updateByPrimaryKey(MaintenanceFactory record);
}