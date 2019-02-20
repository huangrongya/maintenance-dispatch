package com.tepth.maintenancedispatch.service.vehicle.impl;

import com.tepth.maintenancedispatch.comm.RspCodeEnum;
import com.tepth.maintenancedispatch.dao.mapper.user.UserMapper;
import com.tepth.maintenancedispatch.dao.mapper.vehicle.VehicleLineMapper;
import com.tepth.maintenancedispatch.dao.mapper.vehicle.VehicleMapper;
import com.tepth.maintenancedispatch.dao.model.user.User;
import com.tepth.maintenancedispatch.dao.model.vehicle.Vehicle;
import com.tepth.maintenancedispatch.dao.model.vehicle.VehicleExample;
import com.tepth.maintenancedispatch.dao.model.vehicle.VehicleLine;
import com.tepth.maintenancedispatch.dao.model.vehicle.VehicleLineExample;
import com.tepth.maintenancedispatch.dto.GetVehicleByNoResponse;
import com.tepth.maintenancedispatch.dto.GetVehicleInfoRequest;
import com.tepth.maintenancedispatch.dto.GetVehicleInfoResponse;
import com.tepth.maintenancedispatch.dto.inner.VehicleVo;
import com.tepth.maintenancedispatch.exception.ServiceException;
import com.tepth.maintenancedispatch.service.vehicle.IVehicleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author royle.huang
 * @Date 2019/2/15 9:04
 * @Description 车辆服务层
 **/
@Slf4j
@Service
public class VehicleServiceImpl implements IVehicleService {

    @Autowired
    VehicleMapper vehicleMapper;
    @Autowired
    UserMapper userMapper;
    @Autowired
    VehicleLineMapper vehicleLineMapper;

    @Override
    public GetVehicleInfoResponse queryVehicleInfoMainPage(GetVehicleInfoRequest request) {
        GetVehicleInfoResponse response = new GetVehicleInfoResponse();
        Integer organizationId = request.getUser().getOrganizationId();
        List<VehicleVo> vehicleVoList = vehicleMapper.selectVehicleRepairingByOrganizationId(organizationId);
        //TODO 展示车辆不同状态数量信息， 等产品确认有哪些状态
        int toBeConfirmed= 0;
        int toBeExchanged= 0;
        int isNotIn= 0;
        int isIn=0;
        for (VehicleVo vehicleVo : vehicleVoList) {
            int status = vehicleVo.getRepairStatus();

        }
        response.setToBeConfirmed(toBeConfirmed);
        response.setToBeExchanged(toBeExchanged);
        response.setIsNotIn(isNotIn);
        response.setIsIn(isIn);
        response.setVehicleList(vehicleVoList);
        return response;
    }

    @Override
    public GetVehicleByNoResponse queryVehicleByNo(String vehicleNo) {
        GetVehicleByNoResponse response = new GetVehicleByNoResponse();
        VehicleExample example = new VehicleExample();
        VehicleExample.Criteria criteria = example.createCriteria();
        criteria.andVehicleNoEqualTo(vehicleNo);
        List<Vehicle> vehicleList = vehicleMapper.selectByExample(example);
        if (!vehicleList.isEmpty()){
            Vehicle vehicle = vehicleList.get(0);
            response.setVehicleId(vehicle.getId());
            response.setLicenseNo(vehicle.getLicenseNo());
            response.setVehicleNo(vehicleNo);
            //查询司机信息
            List<User> userList = userMapper.selectDriverByVehicleId(vehicle.getId());
            response.setUserList(userList);
            //查询线路
            VehicleLine vehicleLine = vehicleLineMapper.selectByPrimaryKey(vehicle.getVehicleLineId());
            if (vehicleLine != null){
                response.setLineNo(vehicleLine.getLineNo());
            }
        }else {
            throw new ServiceException(RspCodeEnum.VEHICLE_NOT_EXIT.getCode(), RspCodeEnum.VEHICLE_NOT_EXIT.getDesc());
        }
        return response;
    }
}