package com.tepth.maintenancedispatch.dao.mapper.vehicle;

import com.tepth.maintenancedispatch.dao.model.vehicle.Vehicle;
import com.tepth.maintenancedispatch.dao.model.vehicle.VehicleExample;
import java.util.List;
import java.util.Map;

import com.tepth.maintenancedispatch.dto.inner.VehicleVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface VehicleMapper {
    long countByExample(VehicleExample example);

    int deleteByExample(VehicleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Vehicle record);

    int insertSelective(Vehicle record);

    List<Vehicle> selectByExample(VehicleExample example);

    Vehicle selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Vehicle record, @Param("example") VehicleExample example);

    int updateByExample(@Param("record") Vehicle record, @Param("example") VehicleExample example);

    int updateByPrimaryKeySelective(Vehicle record);

    int updateByPrimaryKey(Vehicle record);

    /**
     * @Author royle.huang
     * @Date 2019/2/15 12:00
     * @Description 通过组织id查询在维修中的车辆信息
     **/
    List<VehicleVo> selectVehicleRepairingByOrganizationId(Integer organizationId);

    /**
     * @Author royle.huang
     * @Date 2019/2/27 9:11
     * @Description 分页查询车辆列表
     **/
    List<VehicleVo> queryListByPage(Map<String, Object> map);

    /**
     * @Author royle.huang
     * @Date 2019/2/27 9:12
     * @Description 总记录数
     **/
    long queryListByPageCount(Map<String, Object> map);
}