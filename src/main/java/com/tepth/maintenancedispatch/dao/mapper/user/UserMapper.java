package com.tepth.maintenancedispatch.dao.mapper.user;

import com.tepth.maintenancedispatch.dao.model.user.User;
import com.tepth.maintenancedispatch.dao.model.user.UserExample;
import java.util.List;
import java.util.Map;

import com.tepth.maintenancedispatch.dto.inner.Worker;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {
    long countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<User> selectByOrganizationAndRole(@Param("organizationId") Integer organizationId, @Param("roleId") Integer roleId);

    /**
     * @Author royle.huang
     * @Date 2019/2/20 9:06
     * @Description 通过车辆查询司机信息
     **/
    List<User> selectDriverByVehicleId(@Param("vehicleId") Integer vehicleId);

    /**
     * @Author royle.huang
     * @Date 2019/2/22 14:35
     * @Description 查询在线状态、人数
     **/
    long countByOrganizationAndRoleAndStatus(@Param("organizationId") Integer organizationId, @Param("roleId") Integer roleId, @Param("onlineStatus") Integer onlineStatus);

    /**
     * @Author royle.huang
     * @Date 2019/2/22 14:35
     * @Description 分页查询技工列表
     **/
    List<Worker> queryWorkerListByPage(Map<String, Object> map);

    /**
     * @Author royle.huang
     * @Date 2019/2/22 14:35
     * @Description 分页查询技工列表
     **/
    Long queryWorkerListByPageCount(Map<String, Object> map);

    long countIdleWorker(@Param("organizationId") Integer organizationId, @Param("roleId") Integer roleId);
}