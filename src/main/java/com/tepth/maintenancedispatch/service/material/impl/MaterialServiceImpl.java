package com.tepth.maintenancedispatch.service.material.impl;

import com.tepth.maintenancedispatch.comm.Constant;
import com.tepth.maintenancedispatch.comm.Global;
import com.tepth.maintenancedispatch.comm.QueryPage;
import com.tepth.maintenancedispatch.dao.mapper.material.MaterialApplyMapper;
import com.tepth.maintenancedispatch.dao.model.material.MaterialApply;
import com.tepth.maintenancedispatch.dao.model.material.MaterialApplyExample;
import com.tepth.maintenancedispatch.dto.GetCostListResponse;
import com.tepth.maintenancedispatch.dto.GetMaterialInfoResponse;
import com.tepth.maintenancedispatch.dto.GetMaterialListRequest;
import com.tepth.maintenancedispatch.dto.inner.*;
import com.tepth.maintenancedispatch.service.material.IMaterialService;
import com.tepth.maintenancedispatch.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author royle.huang
 * @Date 2019/2/18 16:38
 * @Description 物资service
 **/
@Service
public class MaterialServiceImpl implements IMaterialService {

    @Autowired
    MaterialApplyMapper materialApplyMapper;

    @Override
    public GetMaterialInfoResponse queryMaterialCountMainPage(BaseRequest request) {
        GetMaterialInfoResponse response = new GetMaterialInfoResponse();
        UserInfo userInfo = request.getUser();
        MaterialApplyExample example = new MaterialApplyExample();
        MaterialApplyExample.Criteria criteria = example.createCriteria();
        //待料
        criteria.andOrganizationIdEqualTo(userInfo.getOrganizationId()).andMaterialStatusEqualTo(Constant.MATERIAL_WAITING);
        long lack = materialApplyMapper.countByExample(example);
        response.setLack(lack);

        //当天花费
        Date today = new Date();

        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("startDate", today);
        paramMap.put("organizationId", userInfo.getOrganizationId());
        Double cost = materialApplyMapper.selectCostByDate(paramMap);
        response.setCost(cost);

        return response;
    }

    @Override
    public PageResponse<Material> queryMaterialListByPage(GetMaterialListRequest request) {
        PageResponse<Material> response = new PageResponse<>();
        UserInfo userInfo = request.getUser();
        QueryPage page = Global.getQueryPage(request);
        Map<String, Object> map = new HashMap<>();
        map.put("queryPage", page);
        map.put("partsId", request.getPartsId());
        map.put("partsType", request.getPartsType());
        map.put("materialStatus", request.getMaterialStatus());
        map.put("startDate", request.getStartDate());
        map.put("endDate", request.getEndDate());
        map.put("vehicleNo", request.getVehicleNo());
        map.put("organizationId", userInfo.getOrganizationId());
        List<Material> list = materialApplyMapper.queryListByPage(map);
        long total = materialApplyMapper.queryListByPageCount(map);
        response.setPageList(list);
        response.setTotalCount(total);
        response.setTotalPage(PageUtil.getTotalPage(total, page.getPageSize()));
        return response;
    }

    @Override
    public GetCostListResponse<Material> queryCostList(GetMaterialListRequest request) {
        GetCostListResponse<Material> response = new GetCostListResponse<>();
        if (request.getStartDate()==null){
            request.setStartDate(new Date());
        }
        PageResponse<Material> pageResponse = queryMaterialListByPage(request);
        //计算花费
        List<Material> materials = pageResponse.getPageList();
        double cost = 0d;
        if (!materials.isEmpty()){
            for (Material material : materials) {
                if (material.getApplyAmount() != null && material.getPrice() != null){
                    cost+=material.getApplyAmount()*material.getPrice();
                }
            }
        }

        response.setCost(cost);

        long total = pageResponse.getTotalCount();
        long page = pageResponse.getTotalPage();
        response.setPageList(materials);
        response.setTotalCount(total);
        response.setTotalPage(page);
        return response;
    }

    @Override
    public GetCostListResponse<Material> queryMaterialListArea(GetMaterialListRequest request) {

        //TODO 物料库存
        return null;
    }
}
