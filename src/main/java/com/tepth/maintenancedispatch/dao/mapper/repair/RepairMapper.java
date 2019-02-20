package com.tepth.maintenancedispatch.dao.mapper.repair;

import com.tepth.maintenancedispatch.dao.model.repair.Repair;
import com.tepth.maintenancedispatch.dao.model.repair.RepairExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface RepairMapper {
    long countByExample(RepairExample example);

    int deleteByExample(RepairExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Repair record);

    int insertSelective(Repair record);

    List<Repair> selectByExample(RepairExample example);

    Repair selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Repair record, @Param("example") RepairExample example);

    int updateByExample(@Param("record") Repair record, @Param("example") RepairExample example);

    int updateByPrimaryKeySelective(Repair record);

    int updateByPrimaryKey(Repair record);

    /**
     * @Author royle.huang
     * @Date 2019/2/19 16:03
     * @Description 首页工单待作业
     **/
    List<Repair> queryListByPageWithStatusArr(Map<String, Object> map);

    /**
     * @Author royle.huang
     * @Date 2019/2/19 16:05
     * @Description 首页工单待作业
     **/
    long queryListByPageCountWithStatusArr(Map<String, Object> map);
}