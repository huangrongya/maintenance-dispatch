package com.tepth.maintenancedispatch.dao.mapper.repair;

import com.tepth.maintenancedispatch.dao.model.repair.FaultPhenomenon;
import com.tepth.maintenancedispatch.dao.model.repair.FaultPhenomenonExample;
import java.util.List;

import com.tepth.maintenancedispatch.dto.inner.Phenomenon;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface FaultPhenomenonMapper {
    long countByExample(FaultPhenomenonExample example);

    int deleteByExample(FaultPhenomenonExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(FaultPhenomenon record);

    int insertSelective(FaultPhenomenon record);

    List<FaultPhenomenon> selectByExample(FaultPhenomenonExample example);

    FaultPhenomenon selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FaultPhenomenon record, @Param("example") FaultPhenomenonExample example);

    int updateByExample(@Param("record") FaultPhenomenon record, @Param("example") FaultPhenomenonExample example);

    int updateByPrimaryKeySelective(FaultPhenomenon record);

    int updateByPrimaryKey(FaultPhenomenon record);

    /**
     * @Author royle.huang
     * @Date 2019/2/21 11:37
     * @Description 通过工单id查询故障列表
     **/
    Phenomenon queryPhenomenonInfoById(Integer id);
}