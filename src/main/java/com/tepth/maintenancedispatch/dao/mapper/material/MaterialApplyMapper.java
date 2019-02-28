package com.tepth.maintenancedispatch.dao.mapper.material;

import com.tepth.maintenancedispatch.dao.model.material.MaterialApply;
import com.tepth.maintenancedispatch.dao.model.material.MaterialApplyExample;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.tepth.maintenancedispatch.dto.inner.Material;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface MaterialApplyMapper {
    long countByExample(MaterialApplyExample example);

    int deleteByExample(MaterialApplyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MaterialApply record);

    int insertSelective(MaterialApply record);

    List<MaterialApply> selectByExample(MaterialApplyExample example);

    MaterialApply selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MaterialApply record, @Param("example") MaterialApplyExample example);

    int updateByExample(@Param("record") MaterialApply record, @Param("example") MaterialApplyExample example);

    int updateByPrimaryKeySelective(MaterialApply record);

    int updateByPrimaryKey(MaterialApply record);

    Double selectCostByDate(Map<String, Object> map);

    /**
     * @Author royle.huang
     * @Date 2019/2/28 11:10
     * @Description 分页查询物料列表
     **/
    List<Material> queryListByPage(Map<String, Object> map);

    /**
     * @Author royle.huang
     * @Date 2019/2/28 11:10
     * @Description 物料总数
     **/
    long queryListByPageCount(Map<String, Object> map);
}