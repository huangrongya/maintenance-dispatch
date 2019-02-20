package com.tepth.maintenancedispatch.dao.mapper.vehicle;

import com.tepth.maintenancedispatch.dao.model.vehicle.VehicleLine;
import com.tepth.maintenancedispatch.dao.model.vehicle.VehicleLineExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface VehicleLineMapper {
    long countByExample(VehicleLineExample example);

    int deleteByExample(VehicleLineExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(VehicleLine record);

    int insertSelective(VehicleLine record);

    List<VehicleLine> selectByExample(VehicleLineExample example);

    VehicleLine selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") VehicleLine record, @Param("example") VehicleLineExample example);

    int updateByExample(@Param("record") VehicleLine record, @Param("example") VehicleLineExample example);

    int updateByPrimaryKeySelective(VehicleLine record);

    int updateByPrimaryKey(VehicleLine record);
}