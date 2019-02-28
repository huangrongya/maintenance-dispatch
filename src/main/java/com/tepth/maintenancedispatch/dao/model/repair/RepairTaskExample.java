package com.tepth.maintenancedispatch.dao.model.repair;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RepairTaskExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RepairTaskExample() {
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

        public Criteria andStateIsNull() {
            addCriterion("`state` is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("`state` is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Byte value) {
            addCriterion("`state` =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Byte value) {
            addCriterion("`state` <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Byte value) {
            addCriterion("`state` >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("`state` >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Byte value) {
            addCriterion("`state` <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Byte value) {
            addCriterion("`state` <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Byte> values) {
            addCriterion("`state` in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Byte> values) {
            addCriterion("`state` not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Byte value1, Byte value2) {
            addCriterion("`state` between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Byte value1, Byte value2) {
            addCriterion("`state` not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNull() {
            addCriterion("add_time is null");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNotNull() {
            addCriterion("add_time is not null");
            return (Criteria) this;
        }

        public Criteria andAddTimeEqualTo(Date value) {
            addCriterion("add_time =", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotEqualTo(Date value) {
            addCriterion("add_time <>", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThan(Date value) {
            addCriterion("add_time >", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("add_time >=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThan(Date value) {
            addCriterion("add_time <", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("add_time <=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeIn(List<Date> values) {
            addCriterion("add_time in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotIn(List<Date> values) {
            addCriterion("add_time not in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeBetween(Date value1, Date value2) {
            addCriterion("add_time between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("add_time not between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeIsNull() {
            addCriterion("finish_time is null");
            return (Criteria) this;
        }

        public Criteria andFinishTimeIsNotNull() {
            addCriterion("finish_time is not null");
            return (Criteria) this;
        }

        public Criteria andFinishTimeEqualTo(Date value) {
            addCriterion("finish_time =", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeNotEqualTo(Date value) {
            addCriterion("finish_time <>", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeGreaterThan(Date value) {
            addCriterion("finish_time >", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("finish_time >=", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeLessThan(Date value) {
            addCriterion("finish_time <", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeLessThanOrEqualTo(Date value) {
            addCriterion("finish_time <=", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeIn(List<Date> values) {
            addCriterion("finish_time in", values, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeNotIn(List<Date> values) {
            addCriterion("finish_time not in", values, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeBetween(Date value1, Date value2) {
            addCriterion("finish_time between", value1, value2, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeNotBetween(Date value1, Date value2) {
            addCriterion("finish_time not between", value1, value2, "finishTime");
            return (Criteria) this;
        }

        public Criteria andCheckStatusIsNull() {
            addCriterion("check_status is null");
            return (Criteria) this;
        }

        public Criteria andCheckStatusIsNotNull() {
            addCriterion("check_status is not null");
            return (Criteria) this;
        }

        public Criteria andCheckStatusEqualTo(Byte value) {
            addCriterion("check_status =", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusNotEqualTo(Byte value) {
            addCriterion("check_status <>", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusGreaterThan(Byte value) {
            addCriterion("check_status >", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("check_status >=", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusLessThan(Byte value) {
            addCriterion("check_status <", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusLessThanOrEqualTo(Byte value) {
            addCriterion("check_status <=", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusIn(List<Byte> values) {
            addCriterion("check_status in", values, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusNotIn(List<Byte> values) {
            addCriterion("check_status not in", values, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusBetween(Byte value1, Byte value2) {
            addCriterion("check_status between", value1, value2, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("check_status not between", value1, value2, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andIsReturnIsNull() {
            addCriterion("is_return is null");
            return (Criteria) this;
        }

        public Criteria andIsReturnIsNotNull() {
            addCriterion("is_return is not null");
            return (Criteria) this;
        }

        public Criteria andIsReturnEqualTo(Byte value) {
            addCriterion("is_return =", value, "isReturn");
            return (Criteria) this;
        }

        public Criteria andIsReturnNotEqualTo(Byte value) {
            addCriterion("is_return <>", value, "isReturn");
            return (Criteria) this;
        }

        public Criteria andIsReturnGreaterThan(Byte value) {
            addCriterion("is_return >", value, "isReturn");
            return (Criteria) this;
        }

        public Criteria andIsReturnGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_return >=", value, "isReturn");
            return (Criteria) this;
        }

        public Criteria andIsReturnLessThan(Byte value) {
            addCriterion("is_return <", value, "isReturn");
            return (Criteria) this;
        }

        public Criteria andIsReturnLessThanOrEqualTo(Byte value) {
            addCriterion("is_return <=", value, "isReturn");
            return (Criteria) this;
        }

        public Criteria andIsReturnIn(List<Byte> values) {
            addCriterion("is_return in", values, "isReturn");
            return (Criteria) this;
        }

        public Criteria andIsReturnNotIn(List<Byte> values) {
            addCriterion("is_return not in", values, "isReturn");
            return (Criteria) this;
        }

        public Criteria andIsReturnBetween(Byte value1, Byte value2) {
            addCriterion("is_return between", value1, value2, "isReturn");
            return (Criteria) this;
        }

        public Criteria andIsReturnNotBetween(Byte value1, Byte value2) {
            addCriterion("is_return not between", value1, value2, "isReturn");
            return (Criteria) this;
        }

        public Criteria andVehicleSeriesIdIsNull() {
            addCriterion("vehicle_series_id is null");
            return (Criteria) this;
        }

        public Criteria andVehicleSeriesIdIsNotNull() {
            addCriterion("vehicle_series_id is not null");
            return (Criteria) this;
        }

        public Criteria andVehicleSeriesIdEqualTo(Integer value) {
            addCriterion("vehicle_series_id =", value, "vehicleSeriesId");
            return (Criteria) this;
        }

        public Criteria andVehicleSeriesIdNotEqualTo(Integer value) {
            addCriterion("vehicle_series_id <>", value, "vehicleSeriesId");
            return (Criteria) this;
        }

        public Criteria andVehicleSeriesIdGreaterThan(Integer value) {
            addCriterion("vehicle_series_id >", value, "vehicleSeriesId");
            return (Criteria) this;
        }

        public Criteria andVehicleSeriesIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("vehicle_series_id >=", value, "vehicleSeriesId");
            return (Criteria) this;
        }

        public Criteria andVehicleSeriesIdLessThan(Integer value) {
            addCriterion("vehicle_series_id <", value, "vehicleSeriesId");
            return (Criteria) this;
        }

        public Criteria andVehicleSeriesIdLessThanOrEqualTo(Integer value) {
            addCriterion("vehicle_series_id <=", value, "vehicleSeriesId");
            return (Criteria) this;
        }

        public Criteria andVehicleSeriesIdIn(List<Integer> values) {
            addCriterion("vehicle_series_id in", values, "vehicleSeriesId");
            return (Criteria) this;
        }

        public Criteria andVehicleSeriesIdNotIn(List<Integer> values) {
            addCriterion("vehicle_series_id not in", values, "vehicleSeriesId");
            return (Criteria) this;
        }

        public Criteria andVehicleSeriesIdBetween(Integer value1, Integer value2) {
            addCriterion("vehicle_series_id between", value1, value2, "vehicleSeriesId");
            return (Criteria) this;
        }

        public Criteria andVehicleSeriesIdNotBetween(Integer value1, Integer value2) {
            addCriterion("vehicle_series_id not between", value1, value2, "vehicleSeriesId");
            return (Criteria) this;
        }

        public Criteria andTaskUserIdIsNull() {
            addCriterion("task_user_id is null");
            return (Criteria) this;
        }

        public Criteria andTaskUserIdIsNotNull() {
            addCriterion("task_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andTaskUserIdEqualTo(String value) {
            addCriterion("task_user_id =", value, "taskUserId");
            return (Criteria) this;
        }

        public Criteria andTaskUserIdNotEqualTo(String value) {
            addCriterion("task_user_id <>", value, "taskUserId");
            return (Criteria) this;
        }

        public Criteria andTaskUserIdGreaterThan(String value) {
            addCriterion("task_user_id >", value, "taskUserId");
            return (Criteria) this;
        }

        public Criteria andTaskUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("task_user_id >=", value, "taskUserId");
            return (Criteria) this;
        }

        public Criteria andTaskUserIdLessThan(String value) {
            addCriterion("task_user_id <", value, "taskUserId");
            return (Criteria) this;
        }

        public Criteria andTaskUserIdLessThanOrEqualTo(String value) {
            addCriterion("task_user_id <=", value, "taskUserId");
            return (Criteria) this;
        }

        public Criteria andTaskUserIdLike(String value) {
            addCriterion("task_user_id like", value, "taskUserId");
            return (Criteria) this;
        }

        public Criteria andTaskUserIdNotLike(String value) {
            addCriterion("task_user_id not like", value, "taskUserId");
            return (Criteria) this;
        }

        public Criteria andTaskUserIdIn(List<String> values) {
            addCriterion("task_user_id in", values, "taskUserId");
            return (Criteria) this;
        }

        public Criteria andTaskUserIdNotIn(List<String> values) {
            addCriterion("task_user_id not in", values, "taskUserId");
            return (Criteria) this;
        }

        public Criteria andTaskUserIdBetween(String value1, String value2) {
            addCriterion("task_user_id between", value1, value2, "taskUserId");
            return (Criteria) this;
        }

        public Criteria andTaskUserIdNotBetween(String value1, String value2) {
            addCriterion("task_user_id not between", value1, value2, "taskUserId");
            return (Criteria) this;
        }

        public Criteria andSysFaultIdIsNull() {
            addCriterion("sys_fault_id is null");
            return (Criteria) this;
        }

        public Criteria andSysFaultIdIsNotNull() {
            addCriterion("sys_fault_id is not null");
            return (Criteria) this;
        }

        public Criteria andSysFaultIdEqualTo(String value) {
            addCriterion("sys_fault_id =", value, "sysFaultId");
            return (Criteria) this;
        }

        public Criteria andSysFaultIdNotEqualTo(String value) {
            addCriterion("sys_fault_id <>", value, "sysFaultId");
            return (Criteria) this;
        }

        public Criteria andSysFaultIdGreaterThan(String value) {
            addCriterion("sys_fault_id >", value, "sysFaultId");
            return (Criteria) this;
        }

        public Criteria andSysFaultIdGreaterThanOrEqualTo(String value) {
            addCriterion("sys_fault_id >=", value, "sysFaultId");
            return (Criteria) this;
        }

        public Criteria andSysFaultIdLessThan(String value) {
            addCriterion("sys_fault_id <", value, "sysFaultId");
            return (Criteria) this;
        }

        public Criteria andSysFaultIdLessThanOrEqualTo(String value) {
            addCriterion("sys_fault_id <=", value, "sysFaultId");
            return (Criteria) this;
        }

        public Criteria andSysFaultIdLike(String value) {
            addCriterion("sys_fault_id like", value, "sysFaultId");
            return (Criteria) this;
        }

        public Criteria andSysFaultIdNotLike(String value) {
            addCriterion("sys_fault_id not like", value, "sysFaultId");
            return (Criteria) this;
        }

        public Criteria andSysFaultIdIn(List<String> values) {
            addCriterion("sys_fault_id in", values, "sysFaultId");
            return (Criteria) this;
        }

        public Criteria andSysFaultIdNotIn(List<String> values) {
            addCriterion("sys_fault_id not in", values, "sysFaultId");
            return (Criteria) this;
        }

        public Criteria andSysFaultIdBetween(String value1, String value2) {
            addCriterion("sys_fault_id between", value1, value2, "sysFaultId");
            return (Criteria) this;
        }

        public Criteria andSysFaultIdNotBetween(String value1, String value2) {
            addCriterion("sys_fault_id not between", value1, value2, "sysFaultId");
            return (Criteria) this;
        }

        public Criteria andTempSysFaultIdIsNull() {
            addCriterion("temp_sys_fault_id is null");
            return (Criteria) this;
        }

        public Criteria andTempSysFaultIdIsNotNull() {
            addCriterion("temp_sys_fault_id is not null");
            return (Criteria) this;
        }

        public Criteria andTempSysFaultIdEqualTo(String value) {
            addCriterion("temp_sys_fault_id =", value, "tempSysFaultId");
            return (Criteria) this;
        }

        public Criteria andTempSysFaultIdNotEqualTo(String value) {
            addCriterion("temp_sys_fault_id <>", value, "tempSysFaultId");
            return (Criteria) this;
        }

        public Criteria andTempSysFaultIdGreaterThan(String value) {
            addCriterion("temp_sys_fault_id >", value, "tempSysFaultId");
            return (Criteria) this;
        }

        public Criteria andTempSysFaultIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_sys_fault_id >=", value, "tempSysFaultId");
            return (Criteria) this;
        }

        public Criteria andTempSysFaultIdLessThan(String value) {
            addCriterion("temp_sys_fault_id <", value, "tempSysFaultId");
            return (Criteria) this;
        }

        public Criteria andTempSysFaultIdLessThanOrEqualTo(String value) {
            addCriterion("temp_sys_fault_id <=", value, "tempSysFaultId");
            return (Criteria) this;
        }

        public Criteria andTempSysFaultIdLike(String value) {
            addCriterion("temp_sys_fault_id like", value, "tempSysFaultId");
            return (Criteria) this;
        }

        public Criteria andTempSysFaultIdNotLike(String value) {
            addCriterion("temp_sys_fault_id not like", value, "tempSysFaultId");
            return (Criteria) this;
        }

        public Criteria andTempSysFaultIdIn(List<String> values) {
            addCriterion("temp_sys_fault_id in", values, "tempSysFaultId");
            return (Criteria) this;
        }

        public Criteria andTempSysFaultIdNotIn(List<String> values) {
            addCriterion("temp_sys_fault_id not in", values, "tempSysFaultId");
            return (Criteria) this;
        }

        public Criteria andTempSysFaultIdBetween(String value1, String value2) {
            addCriterion("temp_sys_fault_id between", value1, value2, "tempSysFaultId");
            return (Criteria) this;
        }

        public Criteria andTempSysFaultIdNotBetween(String value1, String value2) {
            addCriterion("temp_sys_fault_id not between", value1, value2, "tempSysFaultId");
            return (Criteria) this;
        }

        public Criteria andSysFaultDiagnosticIdIsNull() {
            addCriterion("sys_fault_diagnostic_id is null");
            return (Criteria) this;
        }

        public Criteria andSysFaultDiagnosticIdIsNotNull() {
            addCriterion("sys_fault_diagnostic_id is not null");
            return (Criteria) this;
        }

        public Criteria andSysFaultDiagnosticIdEqualTo(String value) {
            addCriterion("sys_fault_diagnostic_id =", value, "sysFaultDiagnosticId");
            return (Criteria) this;
        }

        public Criteria andSysFaultDiagnosticIdNotEqualTo(String value) {
            addCriterion("sys_fault_diagnostic_id <>", value, "sysFaultDiagnosticId");
            return (Criteria) this;
        }

        public Criteria andSysFaultDiagnosticIdGreaterThan(String value) {
            addCriterion("sys_fault_diagnostic_id >", value, "sysFaultDiagnosticId");
            return (Criteria) this;
        }

        public Criteria andSysFaultDiagnosticIdGreaterThanOrEqualTo(String value) {
            addCriterion("sys_fault_diagnostic_id >=", value, "sysFaultDiagnosticId");
            return (Criteria) this;
        }

        public Criteria andSysFaultDiagnosticIdLessThan(String value) {
            addCriterion("sys_fault_diagnostic_id <", value, "sysFaultDiagnosticId");
            return (Criteria) this;
        }

        public Criteria andSysFaultDiagnosticIdLessThanOrEqualTo(String value) {
            addCriterion("sys_fault_diagnostic_id <=", value, "sysFaultDiagnosticId");
            return (Criteria) this;
        }

        public Criteria andSysFaultDiagnosticIdLike(String value) {
            addCriterion("sys_fault_diagnostic_id like", value, "sysFaultDiagnosticId");
            return (Criteria) this;
        }

        public Criteria andSysFaultDiagnosticIdNotLike(String value) {
            addCriterion("sys_fault_diagnostic_id not like", value, "sysFaultDiagnosticId");
            return (Criteria) this;
        }

        public Criteria andSysFaultDiagnosticIdIn(List<String> values) {
            addCriterion("sys_fault_diagnostic_id in", values, "sysFaultDiagnosticId");
            return (Criteria) this;
        }

        public Criteria andSysFaultDiagnosticIdNotIn(List<String> values) {
            addCriterion("sys_fault_diagnostic_id not in", values, "sysFaultDiagnosticId");
            return (Criteria) this;
        }

        public Criteria andSysFaultDiagnosticIdBetween(String value1, String value2) {
            addCriterion("sys_fault_diagnostic_id between", value1, value2, "sysFaultDiagnosticId");
            return (Criteria) this;
        }

        public Criteria andSysFaultDiagnosticIdNotBetween(String value1, String value2) {
            addCriterion("sys_fault_diagnostic_id not between", value1, value2, "sysFaultDiagnosticId");
            return (Criteria) this;
        }

        public Criteria andTempFaultDiagnosticIdIsNull() {
            addCriterion("temp_fault_diagnostic_id is null");
            return (Criteria) this;
        }

        public Criteria andTempFaultDiagnosticIdIsNotNull() {
            addCriterion("temp_fault_diagnostic_id is not null");
            return (Criteria) this;
        }

        public Criteria andTempFaultDiagnosticIdEqualTo(String value) {
            addCriterion("temp_fault_diagnostic_id =", value, "tempFaultDiagnosticId");
            return (Criteria) this;
        }

        public Criteria andTempFaultDiagnosticIdNotEqualTo(String value) {
            addCriterion("temp_fault_diagnostic_id <>", value, "tempFaultDiagnosticId");
            return (Criteria) this;
        }

        public Criteria andTempFaultDiagnosticIdGreaterThan(String value) {
            addCriterion("temp_fault_diagnostic_id >", value, "tempFaultDiagnosticId");
            return (Criteria) this;
        }

        public Criteria andTempFaultDiagnosticIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_fault_diagnostic_id >=", value, "tempFaultDiagnosticId");
            return (Criteria) this;
        }

        public Criteria andTempFaultDiagnosticIdLessThan(String value) {
            addCriterion("temp_fault_diagnostic_id <", value, "tempFaultDiagnosticId");
            return (Criteria) this;
        }

        public Criteria andTempFaultDiagnosticIdLessThanOrEqualTo(String value) {
            addCriterion("temp_fault_diagnostic_id <=", value, "tempFaultDiagnosticId");
            return (Criteria) this;
        }

        public Criteria andTempFaultDiagnosticIdLike(String value) {
            addCriterion("temp_fault_diagnostic_id like", value, "tempFaultDiagnosticId");
            return (Criteria) this;
        }

        public Criteria andTempFaultDiagnosticIdNotLike(String value) {
            addCriterion("temp_fault_diagnostic_id not like", value, "tempFaultDiagnosticId");
            return (Criteria) this;
        }

        public Criteria andTempFaultDiagnosticIdIn(List<String> values) {
            addCriterion("temp_fault_diagnostic_id in", values, "tempFaultDiagnosticId");
            return (Criteria) this;
        }

        public Criteria andTempFaultDiagnosticIdNotIn(List<String> values) {
            addCriterion("temp_fault_diagnostic_id not in", values, "tempFaultDiagnosticId");
            return (Criteria) this;
        }

        public Criteria andTempFaultDiagnosticIdBetween(String value1, String value2) {
            addCriterion("temp_fault_diagnostic_id between", value1, value2, "tempFaultDiagnosticId");
            return (Criteria) this;
        }

        public Criteria andTempFaultDiagnosticIdNotBetween(String value1, String value2) {
            addCriterion("temp_fault_diagnostic_id not between", value1, value2, "tempFaultDiagnosticId");
            return (Criteria) this;
        }

        public Criteria andTaskPlanIdIsNull() {
            addCriterion("task_plan_id is null");
            return (Criteria) this;
        }

        public Criteria andTaskPlanIdIsNotNull() {
            addCriterion("task_plan_id is not null");
            return (Criteria) this;
        }

        public Criteria andTaskPlanIdEqualTo(String value) {
            addCriterion("task_plan_id =", value, "taskPlanId");
            return (Criteria) this;
        }

        public Criteria andTaskPlanIdNotEqualTo(String value) {
            addCriterion("task_plan_id <>", value, "taskPlanId");
            return (Criteria) this;
        }

        public Criteria andTaskPlanIdGreaterThan(String value) {
            addCriterion("task_plan_id >", value, "taskPlanId");
            return (Criteria) this;
        }

        public Criteria andTaskPlanIdGreaterThanOrEqualTo(String value) {
            addCriterion("task_plan_id >=", value, "taskPlanId");
            return (Criteria) this;
        }

        public Criteria andTaskPlanIdLessThan(String value) {
            addCriterion("task_plan_id <", value, "taskPlanId");
            return (Criteria) this;
        }

        public Criteria andTaskPlanIdLessThanOrEqualTo(String value) {
            addCriterion("task_plan_id <=", value, "taskPlanId");
            return (Criteria) this;
        }

        public Criteria andTaskPlanIdLike(String value) {
            addCriterion("task_plan_id like", value, "taskPlanId");
            return (Criteria) this;
        }

        public Criteria andTaskPlanIdNotLike(String value) {
            addCriterion("task_plan_id not like", value, "taskPlanId");
            return (Criteria) this;
        }

        public Criteria andTaskPlanIdIn(List<String> values) {
            addCriterion("task_plan_id in", values, "taskPlanId");
            return (Criteria) this;
        }

        public Criteria andTaskPlanIdNotIn(List<String> values) {
            addCriterion("task_plan_id not in", values, "taskPlanId");
            return (Criteria) this;
        }

        public Criteria andTaskPlanIdBetween(String value1, String value2) {
            addCriterion("task_plan_id between", value1, value2, "taskPlanId");
            return (Criteria) this;
        }

        public Criteria andTaskPlanIdNotBetween(String value1, String value2) {
            addCriterion("task_plan_id not between", value1, value2, "taskPlanId");
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

        public Criteria andGmtCreateIsNull() {
            addCriterion("gmt_create is null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNotNull() {
            addCriterion("gmt_create is not null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateEqualTo(Date value) {
            addCriterion("gmt_create =", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotEqualTo(Date value) {
            addCriterion("gmt_create <>", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThan(Date value) {
            addCriterion("gmt_create >", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_create >=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThan(Date value) {
            addCriterion("gmt_create <", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThanOrEqualTo(Date value) {
            addCriterion("gmt_create <=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIn(List<Date> values) {
            addCriterion("gmt_create in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotIn(List<Date> values) {
            addCriterion("gmt_create not in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateBetween(Date value1, Date value2) {
            addCriterion("gmt_create between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotBetween(Date value1, Date value2) {
            addCriterion("gmt_create not between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNull() {
            addCriterion("gmt_modified is null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNotNull() {
            addCriterion("gmt_modified is not null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedEqualTo(Date value) {
            addCriterion("gmt_modified =", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotEqualTo(Date value) {
            addCriterion("gmt_modified <>", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThan(Date value) {
            addCriterion("gmt_modified >", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_modified >=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThan(Date value) {
            addCriterion("gmt_modified <", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThanOrEqualTo(Date value) {
            addCriterion("gmt_modified <=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIn(List<Date> values) {
            addCriterion("gmt_modified in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotIn(List<Date> values) {
            addCriterion("gmt_modified not in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedBetween(Date value1, Date value2) {
            addCriterion("gmt_modified between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotBetween(Date value1, Date value2) {
            addCriterion("gmt_modified not between", value1, value2, "gmtModified");
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