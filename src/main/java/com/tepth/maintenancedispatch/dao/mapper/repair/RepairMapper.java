package com.tepth.maintenancedispatch.dao.mapper.repair;

import com.tepth.maintenancedispatch.dao.model.repair.Repair;
import com.tepth.maintenancedispatch.dao.model.repair.RepairExample;
import java.util.List;
import java.util.Map;

import com.tepth.maintenancedispatch.dto.inner.RepairDetail;
import com.tepth.maintenancedispatch.dto.inner.RepairPlan;
import com.tepth.maintenancedispatch.dto.inner.RepairVO;
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
    List<RepairVO> queryListByPageWithProcessStatus(Map<String, Object> map);

    /**
     * @Author royle.huang
     * @Date 2019/2/19 16:05
     * @Description 首页工单待作业
     **/
    long queryListByPageCountWithProcessStatus(Map<String, Object> map);

    /**
     * @Author royle.huang
     * @Date 2019/2/20 10:50
     * @Description 通用分页查询
     **/
    List<RepairVO> queryListByPage(Map<String, Object> map);

    /**
     * @Author royle.huang
     * @Date 2019/2/20 10:50
     * @Description 通用分页查询
     **/
    long queryListByPageCount(Map<String, Object> map);

    /**
     * @Author royle.huang
     * @Date 2019/2/26 14:29
     * @Description 获取工单详情
     **/
    RepairDetail selectRepairDetailById(Integer id);

    /**
     * @Author royle.huang
     * @Date 2019/2/26 17:04
     * @Description 系统作业项
     **/
    List<RepairPlan> selectSysRepairPlanByDiaId(@Param("diaId")Integer diaId);

    /**
     * @Author royle.huang
     * @Date 2019/2/26 17:05
     * @Description 临时作业项
     **/
    List<RepairPlan> selectTempRepairPlanByDiaId(@Param("diaId")Integer diaId);

    /**
     * @Author royle.huang
     * @Date 2019/2/28 17:58
     * @Description 当前工位作业数量
     **/
    long countByProcessStatusAndAreaId(@Param("processStatus")byte processStatus, @Param("factoryAreaId")Integer factoryAreaId);
}