package com.tepth.maintenancedispatch.dao.mapper.factory;

import com.tepth.maintenancedispatch.dao.model.factory.FactoryArea;
import com.tepth.maintenancedispatch.dao.model.factory.FactoryAreaExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface FactoryAreaMapper {
    long countByExample(FactoryAreaExample example);

    int deleteByExample(FactoryAreaExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(FactoryArea record);

    int insertSelective(FactoryArea record);

    List<FactoryArea> selectByExample(FactoryAreaExample example);

    FactoryArea selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FactoryArea record, @Param("example") FactoryAreaExample example);

    int updateByExample(@Param("record") FactoryArea record, @Param("example") FactoryAreaExample example);

    int updateByPrimaryKeySelective(FactoryArea record);

    int updateByPrimaryKey(FactoryArea record);
}