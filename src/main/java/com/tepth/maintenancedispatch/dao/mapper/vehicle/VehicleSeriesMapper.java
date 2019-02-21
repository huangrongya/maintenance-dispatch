package com.tepth.maintenancedispatch.dao.mapper.vehicle;

import com.tepth.maintenancedispatch.dao.model.vehicle.VehicleSeries;
import com.tepth.maintenancedispatch.dao.model.vehicle.VehicleSeriesExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface VehicleSeriesMapper {
    long countByExample(VehicleSeriesExample example);

    int deleteByExample(VehicleSeriesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(VehicleSeries record);

    int insertSelective(VehicleSeries record);

    List<VehicleSeries> selectByExample(VehicleSeriesExample example);

    VehicleSeries selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") VehicleSeries record, @Param("example") VehicleSeriesExample example);

    int updateByExample(@Param("record") VehicleSeries record, @Param("example") VehicleSeriesExample example);

    int updateByPrimaryKeySelective(VehicleSeries record);

    int updateByPrimaryKey(VehicleSeries record);
}