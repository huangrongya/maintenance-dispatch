package com.tepth.maintenancedispatch.dao.model.material;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MaterialApplyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MaterialApplyExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andApplyTimeIsNull() {
            addCriterion("apply_time is null");
            return (Criteria) this;
        }

        public Criteria andApplyTimeIsNotNull() {
            addCriterion("apply_time is not null");
            return (Criteria) this;
        }

        public Criteria andApplyTimeEqualTo(Date value) {
            addCriterion("apply_time =", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotEqualTo(Date value) {
            addCriterion("apply_time <>", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeGreaterThan(Date value) {
            addCriterion("apply_time >", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("apply_time >=", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeLessThan(Date value) {
            addCriterion("apply_time <", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeLessThanOrEqualTo(Date value) {
            addCriterion("apply_time <=", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeIn(List<Date> values) {
            addCriterion("apply_time in", values, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotIn(List<Date> values) {
            addCriterion("apply_time not in", values, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeBetween(Date value1, Date value2) {
            addCriterion("apply_time between", value1, value2, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotBetween(Date value1, Date value2) {
            addCriterion("apply_time not between", value1, value2, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyAmountIsNull() {
            addCriterion("apply_amount is null");
            return (Criteria) this;
        }

        public Criteria andApplyAmountIsNotNull() {
            addCriterion("apply_amount is not null");
            return (Criteria) this;
        }

        public Criteria andApplyAmountEqualTo(Short value) {
            addCriterion("apply_amount =", value, "applyAmount");
            return (Criteria) this;
        }

        public Criteria andApplyAmountNotEqualTo(Short value) {
            addCriterion("apply_amount <>", value, "applyAmount");
            return (Criteria) this;
        }

        public Criteria andApplyAmountGreaterThan(Short value) {
            addCriterion("apply_amount >", value, "applyAmount");
            return (Criteria) this;
        }

        public Criteria andApplyAmountGreaterThanOrEqualTo(Short value) {
            addCriterion("apply_amount >=", value, "applyAmount");
            return (Criteria) this;
        }

        public Criteria andApplyAmountLessThan(Short value) {
            addCriterion("apply_amount <", value, "applyAmount");
            return (Criteria) this;
        }

        public Criteria andApplyAmountLessThanOrEqualTo(Short value) {
            addCriterion("apply_amount <=", value, "applyAmount");
            return (Criteria) this;
        }

        public Criteria andApplyAmountIn(List<Short> values) {
            addCriterion("apply_amount in", values, "applyAmount");
            return (Criteria) this;
        }

        public Criteria andApplyAmountNotIn(List<Short> values) {
            addCriterion("apply_amount not in", values, "applyAmount");
            return (Criteria) this;
        }

        public Criteria andApplyAmountBetween(Short value1, Short value2) {
            addCriterion("apply_amount between", value1, value2, "applyAmount");
            return (Criteria) this;
        }

        public Criteria andApplyAmountNotBetween(Short value1, Short value2) {
            addCriterion("apply_amount not between", value1, value2, "applyAmount");
            return (Criteria) this;
        }

        public Criteria andStockAmountIsNull() {
            addCriterion("stock_amount is null");
            return (Criteria) this;
        }

        public Criteria andStockAmountIsNotNull() {
            addCriterion("stock_amount is not null");
            return (Criteria) this;
        }

        public Criteria andStockAmountEqualTo(Short value) {
            addCriterion("stock_amount =", value, "stockAmount");
            return (Criteria) this;
        }

        public Criteria andStockAmountNotEqualTo(Short value) {
            addCriterion("stock_amount <>", value, "stockAmount");
            return (Criteria) this;
        }

        public Criteria andStockAmountGreaterThan(Short value) {
            addCriterion("stock_amount >", value, "stockAmount");
            return (Criteria) this;
        }

        public Criteria andStockAmountGreaterThanOrEqualTo(Short value) {
            addCriterion("stock_amount >=", value, "stockAmount");
            return (Criteria) this;
        }

        public Criteria andStockAmountLessThan(Short value) {
            addCriterion("stock_amount <", value, "stockAmount");
            return (Criteria) this;
        }

        public Criteria andStockAmountLessThanOrEqualTo(Short value) {
            addCriterion("stock_amount <=", value, "stockAmount");
            return (Criteria) this;
        }

        public Criteria andStockAmountIn(List<Short> values) {
            addCriterion("stock_amount in", values, "stockAmount");
            return (Criteria) this;
        }

        public Criteria andStockAmountNotIn(List<Short> values) {
            addCriterion("stock_amount not in", values, "stockAmount");
            return (Criteria) this;
        }

        public Criteria andStockAmountBetween(Short value1, Short value2) {
            addCriterion("stock_amount between", value1, value2, "stockAmount");
            return (Criteria) this;
        }

        public Criteria andStockAmountNotBetween(Short value1, Short value2) {
            addCriterion("stock_amount not between", value1, value2, "stockAmount");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeIsNull() {
            addCriterion("arrival_time is null");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeIsNotNull() {
            addCriterion("arrival_time is not null");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeEqualTo(Date value) {
            addCriterion("arrival_time =", value, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeNotEqualTo(Date value) {
            addCriterion("arrival_time <>", value, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeGreaterThan(Date value) {
            addCriterion("arrival_time >", value, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("arrival_time >=", value, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeLessThan(Date value) {
            addCriterion("arrival_time <", value, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeLessThanOrEqualTo(Date value) {
            addCriterion("arrival_time <=", value, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeIn(List<Date> values) {
            addCriterion("arrival_time in", values, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeNotIn(List<Date> values) {
            addCriterion("arrival_time not in", values, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeBetween(Date value1, Date value2) {
            addCriterion("arrival_time between", value1, value2, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeNotBetween(Date value1, Date value2) {
            addCriterion("arrival_time not between", value1, value2, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andAuditingStatusIsNull() {
            addCriterion("auditing_status is null");
            return (Criteria) this;
        }

        public Criteria andAuditingStatusIsNotNull() {
            addCriterion("auditing_status is not null");
            return (Criteria) this;
        }

        public Criteria andAuditingStatusEqualTo(Byte value) {
            addCriterion("auditing_status =", value, "auditingStatus");
            return (Criteria) this;
        }

        public Criteria andAuditingStatusNotEqualTo(Byte value) {
            addCriterion("auditing_status <>", value, "auditingStatus");
            return (Criteria) this;
        }

        public Criteria andAuditingStatusGreaterThan(Byte value) {
            addCriterion("auditing_status >", value, "auditingStatus");
            return (Criteria) this;
        }

        public Criteria andAuditingStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("auditing_status >=", value, "auditingStatus");
            return (Criteria) this;
        }

        public Criteria andAuditingStatusLessThan(Byte value) {
            addCriterion("auditing_status <", value, "auditingStatus");
            return (Criteria) this;
        }

        public Criteria andAuditingStatusLessThanOrEqualTo(Byte value) {
            addCriterion("auditing_status <=", value, "auditingStatus");
            return (Criteria) this;
        }

        public Criteria andAuditingStatusIn(List<Byte> values) {
            addCriterion("auditing_status in", values, "auditingStatus");
            return (Criteria) this;
        }

        public Criteria andAuditingStatusNotIn(List<Byte> values) {
            addCriterion("auditing_status not in", values, "auditingStatus");
            return (Criteria) this;
        }

        public Criteria andAuditingStatusBetween(Byte value1, Byte value2) {
            addCriterion("auditing_status between", value1, value2, "auditingStatus");
            return (Criteria) this;
        }

        public Criteria andAuditingStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("auditing_status not between", value1, value2, "auditingStatus");
            return (Criteria) this;
        }

        public Criteria andMaterialStatusIsNull() {
            addCriterion("material_status is null");
            return (Criteria) this;
        }

        public Criteria andMaterialStatusIsNotNull() {
            addCriterion("material_status is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialStatusEqualTo(Byte value) {
            addCriterion("material_status =", value, "materialStatus");
            return (Criteria) this;
        }

        public Criteria andMaterialStatusNotEqualTo(Byte value) {
            addCriterion("material_status <>", value, "materialStatus");
            return (Criteria) this;
        }

        public Criteria andMaterialStatusGreaterThan(Byte value) {
            addCriterion("material_status >", value, "materialStatus");
            return (Criteria) this;
        }

        public Criteria andMaterialStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("material_status >=", value, "materialStatus");
            return (Criteria) this;
        }

        public Criteria andMaterialStatusLessThan(Byte value) {
            addCriterion("material_status <", value, "materialStatus");
            return (Criteria) this;
        }

        public Criteria andMaterialStatusLessThanOrEqualTo(Byte value) {
            addCriterion("material_status <=", value, "materialStatus");
            return (Criteria) this;
        }

        public Criteria andMaterialStatusIn(List<Byte> values) {
            addCriterion("material_status in", values, "materialStatus");
            return (Criteria) this;
        }

        public Criteria andMaterialStatusNotIn(List<Byte> values) {
            addCriterion("material_status not in", values, "materialStatus");
            return (Criteria) this;
        }

        public Criteria andMaterialStatusBetween(Byte value1, Byte value2) {
            addCriterion("material_status between", value1, value2, "materialStatus");
            return (Criteria) this;
        }

        public Criteria andMaterialStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("material_status not between", value1, value2, "materialStatus");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdIsNull() {
            addCriterion("organization_id is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdIsNotNull() {
            addCriterion("organization_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdEqualTo(Integer value) {
            addCriterion("organization_id =", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdNotEqualTo(Integer value) {
            addCriterion("organization_id <>", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdGreaterThan(Integer value) {
            addCriterion("organization_id >", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("organization_id >=", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdLessThan(Integer value) {
            addCriterion("organization_id <", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdLessThanOrEqualTo(Integer value) {
            addCriterion("organization_id <=", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdIn(List<Integer> values) {
            addCriterion("organization_id in", values, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdNotIn(List<Integer> values) {
            addCriterion("organization_id not in", values, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdBetween(Integer value1, Integer value2) {
            addCriterion("organization_id between", value1, value2, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("organization_id not between", value1, value2, "organizationId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andVehicleIdIsNull() {
            addCriterion("vehicle_id is null");
            return (Criteria) this;
        }

        public Criteria andVehicleIdIsNotNull() {
            addCriterion("vehicle_id is not null");
            return (Criteria) this;
        }

        public Criteria andVehicleIdEqualTo(Integer value) {
            addCriterion("vehicle_id =", value, "vehicleId");
            return (Criteria) this;
        }

        public Criteria andVehicleIdNotEqualTo(Integer value) {
            addCriterion("vehicle_id <>", value, "vehicleId");
            return (Criteria) this;
        }

        public Criteria andVehicleIdGreaterThan(Integer value) {
            addCriterion("vehicle_id >", value, "vehicleId");
            return (Criteria) this;
        }

        public Criteria andVehicleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("vehicle_id >=", value, "vehicleId");
            return (Criteria) this;
        }

        public Criteria andVehicleIdLessThan(Integer value) {
            addCriterion("vehicle_id <", value, "vehicleId");
            return (Criteria) this;
        }

        public Criteria andVehicleIdLessThanOrEqualTo(Integer value) {
            addCriterion("vehicle_id <=", value, "vehicleId");
            return (Criteria) this;
        }

        public Criteria andVehicleIdIn(List<Integer> values) {
            addCriterion("vehicle_id in", values, "vehicleId");
            return (Criteria) this;
        }

        public Criteria andVehicleIdNotIn(List<Integer> values) {
            addCriterion("vehicle_id not in", values, "vehicleId");
            return (Criteria) this;
        }

        public Criteria andVehicleIdBetween(Integer value1, Integer value2) {
            addCriterion("vehicle_id between", value1, value2, "vehicleId");
            return (Criteria) this;
        }

        public Criteria andVehicleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("vehicle_id not between", value1, value2, "vehicleId");
            return (Criteria) this;
        }

        public Criteria andPartsTypeIsNull() {
            addCriterion("parts_type is null");
            return (Criteria) this;
        }

        public Criteria andPartsTypeIsNotNull() {
            addCriterion("parts_type is not null");
            return (Criteria) this;
        }

        public Criteria andPartsTypeEqualTo(Integer value) {
            addCriterion("parts_type =", value, "partsType");
            return (Criteria) this;
        }

        public Criteria andPartsTypeNotEqualTo(Integer value) {
            addCriterion("parts_type <>", value, "partsType");
            return (Criteria) this;
        }

        public Criteria andPartsTypeGreaterThan(Integer value) {
            addCriterion("parts_type >", value, "partsType");
            return (Criteria) this;
        }

        public Criteria andPartsTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("parts_type >=", value, "partsType");
            return (Criteria) this;
        }

        public Criteria andPartsTypeLessThan(Integer value) {
            addCriterion("parts_type <", value, "partsType");
            return (Criteria) this;
        }

        public Criteria andPartsTypeLessThanOrEqualTo(Integer value) {
            addCriterion("parts_type <=", value, "partsType");
            return (Criteria) this;
        }

        public Criteria andPartsTypeIn(List<Integer> values) {
            addCriterion("parts_type in", values, "partsType");
            return (Criteria) this;
        }

        public Criteria andPartsTypeNotIn(List<Integer> values) {
            addCriterion("parts_type not in", values, "partsType");
            return (Criteria) this;
        }

        public Criteria andPartsTypeBetween(Integer value1, Integer value2) {
            addCriterion("parts_type between", value1, value2, "partsType");
            return (Criteria) this;
        }

        public Criteria andPartsTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("parts_type not between", value1, value2, "partsType");
            return (Criteria) this;
        }

        public Criteria andPartsIdIsNull() {
            addCriterion("parts_id is null");
            return (Criteria) this;
        }

        public Criteria andPartsIdIsNotNull() {
            addCriterion("parts_id is not null");
            return (Criteria) this;
        }

        public Criteria andPartsIdEqualTo(Integer value) {
            addCriterion("parts_id =", value, "partsId");
            return (Criteria) this;
        }

        public Criteria andPartsIdNotEqualTo(Integer value) {
            addCriterion("parts_id <>", value, "partsId");
            return (Criteria) this;
        }

        public Criteria andPartsIdGreaterThan(Integer value) {
            addCriterion("parts_id >", value, "partsId");
            return (Criteria) this;
        }

        public Criteria andPartsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("parts_id >=", value, "partsId");
            return (Criteria) this;
        }

        public Criteria andPartsIdLessThan(Integer value) {
            addCriterion("parts_id <", value, "partsId");
            return (Criteria) this;
        }

        public Criteria andPartsIdLessThanOrEqualTo(Integer value) {
            addCriterion("parts_id <=", value, "partsId");
            return (Criteria) this;
        }

        public Criteria andPartsIdIn(List<Integer> values) {
            addCriterion("parts_id in", values, "partsId");
            return (Criteria) this;
        }

        public Criteria andPartsIdNotIn(List<Integer> values) {
            addCriterion("parts_id not in", values, "partsId");
            return (Criteria) this;
        }

        public Criteria andPartsIdBetween(Integer value1, Integer value2) {
            addCriterion("parts_id between", value1, value2, "partsId");
            return (Criteria) this;
        }

        public Criteria andPartsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("parts_id not between", value1, value2, "partsId");
            return (Criteria) this;
        }

        public Criteria andFactoryAreaIdIsNull() {
            addCriterion("factory_area_id is null");
            return (Criteria) this;
        }

        public Criteria andFactoryAreaIdIsNotNull() {
            addCriterion("factory_area_id is not null");
            return (Criteria) this;
        }

        public Criteria andFactoryAreaIdEqualTo(Integer value) {
            addCriterion("factory_area_id =", value, "factoryAreaId");
            return (Criteria) this;
        }

        public Criteria andFactoryAreaIdNotEqualTo(Integer value) {
            addCriterion("factory_area_id <>", value, "factoryAreaId");
            return (Criteria) this;
        }

        public Criteria andFactoryAreaIdGreaterThan(Integer value) {
            addCriterion("factory_area_id >", value, "factoryAreaId");
            return (Criteria) this;
        }

        public Criteria andFactoryAreaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("factory_area_id >=", value, "factoryAreaId");
            return (Criteria) this;
        }

        public Criteria andFactoryAreaIdLessThan(Integer value) {
            addCriterion("factory_area_id <", value, "factoryAreaId");
            return (Criteria) this;
        }

        public Criteria andFactoryAreaIdLessThanOrEqualTo(Integer value) {
            addCriterion("factory_area_id <=", value, "factoryAreaId");
            return (Criteria) this;
        }

        public Criteria andFactoryAreaIdIn(List<Integer> values) {
            addCriterion("factory_area_id in", values, "factoryAreaId");
            return (Criteria) this;
        }

        public Criteria andFactoryAreaIdNotIn(List<Integer> values) {
            addCriterion("factory_area_id not in", values, "factoryAreaId");
            return (Criteria) this;
        }

        public Criteria andFactoryAreaIdBetween(Integer value1, Integer value2) {
            addCriterion("factory_area_id between", value1, value2, "factoryAreaId");
            return (Criteria) this;
        }

        public Criteria andFactoryAreaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("factory_area_id not between", value1, value2, "factoryAreaId");
            return (Criteria) this;
        }

        public Criteria andRepairIdIsNull() {
            addCriterion("repair_id is null");
            return (Criteria) this;
        }

        public Criteria andRepairIdIsNotNull() {
            addCriterion("repair_id is not null");
            return (Criteria) this;
        }

        public Criteria andRepairIdEqualTo(Integer value) {
            addCriterion("repair_id =", value, "repairId");
            return (Criteria) this;
        }

        public Criteria andRepairIdNotEqualTo(Integer value) {
            addCriterion("repair_id <>", value, "repairId");
            return (Criteria) this;
        }

        public Criteria andRepairIdGreaterThan(Integer value) {
            addCriterion("repair_id >", value, "repairId");
            return (Criteria) this;
        }

        public Criteria andRepairIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("repair_id >=", value, "repairId");
            return (Criteria) this;
        }

        public Criteria andRepairIdLessThan(Integer value) {
            addCriterion("repair_id <", value, "repairId");
            return (Criteria) this;
        }

        public Criteria andRepairIdLessThanOrEqualTo(Integer value) {
            addCriterion("repair_id <=", value, "repairId");
            return (Criteria) this;
        }

        public Criteria andRepairIdIn(List<Integer> values) {
            addCriterion("repair_id in", values, "repairId");
            return (Criteria) this;
        }

        public Criteria andRepairIdNotIn(List<Integer> values) {
            addCriterion("repair_id not in", values, "repairId");
            return (Criteria) this;
        }

        public Criteria andRepairIdBetween(Integer value1, Integer value2) {
            addCriterion("repair_id between", value1, value2, "repairId");
            return (Criteria) this;
        }

        public Criteria andRepairIdNotBetween(Integer value1, Integer value2) {
            addCriterion("repair_id not between", value1, value2, "repairId");
            return (Criteria) this;
        }
    }

    /**
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}