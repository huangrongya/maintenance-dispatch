package com.tepth.maintenancedispatch.dao.mapper.vehicle;

import com.tepth.maintenancedispatch.dao.model.vehicle.VehicleAlarm;
import com.tepth.maintenancedispatch.dao.model.vehicle.VehicleAlarmExample;
import java.util.List;
import java.util.Map;

import com.tepth.maintenancedispatch.dto.inner.Alarm;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface VehicleAlarmMapper {
    long countByExample(VehicleAlarmExample example);

    int deleteByExample(VehicleAlarmExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(VehicleAlarm record);

    int insertSelective(VehicleAlarm record);

    List<VehicleAlarm> selectByExample(VehicleAlarmExample example);

    VehicleAlarm selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") VehicleAlarm record, @Param("example") VehicleAlarmExample example);

    int updateByExample(@Param("record") VehicleAlarm record, @Param("example") VehicleAlarmExample example);

    int updateByPrimaryKeySelective(VehicleAlarm record);

    int updateByPrimaryKey(VehicleAlarm record);

//    /**
//     * @Author royle.huang
//     * @Date 2019/2/27 10:44
//     * @Description 分页查询警报列表
//     **/
//    List<Alarm> queryListByPage(Map<String, Object> map);
//
//    /**
//     * @Author royle.huang
//     * @Date 2019/2/27 10:45
//     * @Description 警报列表总条数
//     **/
//    long queryListByPageCount(Map<String, Object> map);
}