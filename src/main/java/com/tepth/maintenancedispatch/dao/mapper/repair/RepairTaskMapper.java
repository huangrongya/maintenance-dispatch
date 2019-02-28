package com.tepth.maintenancedispatch.dao.mapper.repair;

import com.tepth.maintenancedispatch.dao.model.repair.RepairTask;
import com.tepth.maintenancedispatch.dao.model.repair.RepairTaskExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface RepairTaskMapper {
    long countByExample(RepairTaskExample example);

    int deleteByExample(RepairTaskExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RepairTask record);

    int insertSelective(RepairTask record);

    List<RepairTask> selectByExample(RepairTaskExample example);

    RepairTask selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RepairTask record, @Param("example") RepairTaskExample example);

    int updateByExample(@Param("record") RepairTask record, @Param("example") RepairTaskExample example);

    int updateByPrimaryKeySelective(RepairTask record);

    int updateByPrimaryKey(RepairTask record);
}