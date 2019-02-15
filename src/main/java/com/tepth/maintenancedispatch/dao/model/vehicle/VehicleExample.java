package com.tepth.maintenancedispatch.dao.model.vehicle;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class VehicleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VehicleExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andVehicleNoIsNull() {
            addCriterion("vehicle_no is null");
            return (Criteria) this;
        }

        public Criteria andVehicleNoIsNotNull() {
            addCriterion("vehicle_no is not null");
            return (Criteria) this;
        }

        public Criteria andVehicleNoEqualTo(String value) {
            addCriterion("vehicle_no =", value, "vehicleNo");
            return (Criteria) this;
        }

        public Criteria andVehicleNoNotEqualTo(String value) {
            addCriterion("vehicle_no <>", value, "vehicleNo");
            return (Criteria) this;
        }

        public Criteria andVehicleNoGreaterThan(String value) {
            addCriterion("vehicle_no >", value, "vehicleNo");
            return (Criteria) this;
        }

        public Criteria andVehicleNoGreaterThanOrEqualTo(String value) {
            addCriterion("vehicle_no >=", value, "vehicleNo");
            return (Criteria) this;
        }

        public Criteria andVehicleNoLessThan(String value) {
            addCriterion("vehicle_no <", value, "vehicleNo");
            return (Criteria) this;
        }

        public Criteria andVehicleNoLessThanOrEqualTo(String value) {
            addCriterion("vehicle_no <=", value, "vehicleNo");
            return (Criteria) this;
        }

        public Criteria andVehicleNoLike(String value) {
            addCriterion("vehicle_no like", value, "vehicleNo");
            return (Criteria) this;
        }

        public Criteria andVehicleNoNotLike(String value) {
            addCriterion("vehicle_no not like", value, "vehicleNo");
            return (Criteria) this;
        }

        public Criteria andVehicleNoIn(List<String> values) {
            addCriterion("vehicle_no in", values, "vehicleNo");
            return (Criteria) this;
        }

        public Criteria andVehicleNoNotIn(List<String> values) {
            addCriterion("vehicle_no not in", values, "vehicleNo");
            return (Criteria) this;
        }

        public Criteria andVehicleNoBetween(String value1, String value2) {
            addCriterion("vehicle_no between", value1, value2, "vehicleNo");
            return (Criteria) this;
        }

        public Criteria andVehicleNoNotBetween(String value1, String value2) {
            addCriterion("vehicle_no not between", value1, value2, "vehicleNo");
            return (Criteria) this;
        }

        public Criteria andLicenseNoIsNull() {
            addCriterion("license_no is null");
            return (Criteria) this;
        }

        public Criteria andLicenseNoIsNotNull() {
            addCriterion("license_no is not null");
            return (Criteria) this;
        }

        public Criteria andLicenseNoEqualTo(String value) {
            addCriterion("license_no =", value, "licenseNo");
            return (Criteria) this;
        }

        public Criteria andLicenseNoNotEqualTo(String value) {
            addCriterion("license_no <>", value, "licenseNo");
            return (Criteria) this;
        }

        public Criteria andLicenseNoGreaterThan(String value) {
            addCriterion("license_no >", value, "licenseNo");
            return (Criteria) this;
        }

        public Criteria andLicenseNoGreaterThanOrEqualTo(String value) {
            addCriterion("license_no >=", value, "licenseNo");
            return (Criteria) this;
        }

        public Criteria andLicenseNoLessThan(String value) {
            addCriterion("license_no <", value, "licenseNo");
            return (Criteria) this;
        }

        public Criteria andLicenseNoLessThanOrEqualTo(String value) {
            addCriterion("license_no <=", value, "licenseNo");
            return (Criteria) this;
        }

        public Criteria andLicenseNoLike(String value) {
            addCriterion("license_no like", value, "licenseNo");
            return (Criteria) this;
        }

        public Criteria andLicenseNoNotLike(String value) {
            addCriterion("license_no not like", value, "licenseNo");
            return (Criteria) this;
        }

        public Criteria andLicenseNoIn(List<String> values) {
            addCriterion("license_no in", values, "licenseNo");
            return (Criteria) this;
        }

        public Criteria andLicenseNoNotIn(List<String> values) {
            addCriterion("license_no not in", values, "licenseNo");
            return (Criteria) this;
        }

        public Criteria andLicenseNoBetween(String value1, String value2) {
            addCriterion("license_no between", value1, value2, "licenseNo");
            return (Criteria) this;
        }

        public Criteria andLicenseNoNotBetween(String value1, String value2) {
            addCriterion("license_no not between", value1, value2, "licenseNo");
            return (Criteria) this;
        }

        public Criteria andIcCardNoIsNull() {
            addCriterion("ic_card_no is null");
            return (Criteria) this;
        }

        public Criteria andIcCardNoIsNotNull() {
            addCriterion("ic_card_no is not null");
            return (Criteria) this;
        }

        public Criteria andIcCardNoEqualTo(String value) {
            addCriterion("ic_card_no =", value, "icCardNo");
            return (Criteria) this;
        }

        public Criteria andIcCardNoNotEqualTo(String value) {
            addCriterion("ic_card_no <>", value, "icCardNo");
            return (Criteria) this;
        }

        public Criteria andIcCardNoGreaterThan(String value) {
            addCriterion("ic_card_no >", value, "icCardNo");
            return (Criteria) this;
        }

        public Criteria andIcCardNoGreaterThanOrEqualTo(String value) {
            addCriterion("ic_card_no >=", value, "icCardNo");
            return (Criteria) this;
        }

        public Criteria andIcCardNoLessThan(String value) {
            addCriterion("ic_card_no <", value, "icCardNo");
            return (Criteria) this;
        }

        public Criteria andIcCardNoLessThanOrEqualTo(String value) {
            addCriterion("ic_card_no <=", value, "icCardNo");
            return (Criteria) this;
        }

        public Criteria andIcCardNoLike(String value) {
            addCriterion("ic_card_no like", value, "icCardNo");
            return (Criteria) this;
        }

        public Criteria andIcCardNoNotLike(String value) {
            addCriterion("ic_card_no not like", value, "icCardNo");
            return (Criteria) this;
        }

        public Criteria andIcCardNoIn(List<String> values) {
            addCriterion("ic_card_no in", values, "icCardNo");
            return (Criteria) this;
        }

        public Criteria andIcCardNoNotIn(List<String> values) {
            addCriterion("ic_card_no not in", values, "icCardNo");
            return (Criteria) this;
        }

        public Criteria andIcCardNoBetween(String value1, String value2) {
            addCriterion("ic_card_no between", value1, value2, "icCardNo");
            return (Criteria) this;
        }

        public Criteria andIcCardNoNotBetween(String value1, String value2) {
            addCriterion("ic_card_no not between", value1, value2, "icCardNo");
            return (Criteria) this;
        }

        public Criteria andArchiveNoIsNull() {
            addCriterion("archive_no is null");
            return (Criteria) this;
        }

        public Criteria andArchiveNoIsNotNull() {
            addCriterion("archive_no is not null");
            return (Criteria) this;
        }

        public Criteria andArchiveNoEqualTo(String value) {
            addCriterion("archive_no =", value, "archiveNo");
            return (Criteria) this;
        }

        public Criteria andArchiveNoNotEqualTo(String value) {
            addCriterion("archive_no <>", value, "archiveNo");
            return (Criteria) this;
        }

        public Criteria andArchiveNoGreaterThan(String value) {
            addCriterion("archive_no >", value, "archiveNo");
            return (Criteria) this;
        }

        public Criteria andArchiveNoGreaterThanOrEqualTo(String value) {
            addCriterion("archive_no >=", value, "archiveNo");
            return (Criteria) this;
        }

        public Criteria andArchiveNoLessThan(String value) {
            addCriterion("archive_no <", value, "archiveNo");
            return (Criteria) this;
        }

        public Criteria andArchiveNoLessThanOrEqualTo(String value) {
            addCriterion("archive_no <=", value, "archiveNo");
            return (Criteria) this;
        }

        public Criteria andArchiveNoLike(String value) {
            addCriterion("archive_no like", value, "archiveNo");
            return (Criteria) this;
        }

        public Criteria andArchiveNoNotLike(String value) {
            addCriterion("archive_no not like", value, "archiveNo");
            return (Criteria) this;
        }

        public Criteria andArchiveNoIn(List<String> values) {
            addCriterion("archive_no in", values, "archiveNo");
            return (Criteria) this;
        }

        public Criteria andArchiveNoNotIn(List<String> values) {
            addCriterion("archive_no not in", values, "archiveNo");
            return (Criteria) this;
        }

        public Criteria andArchiveNoBetween(String value1, String value2) {
            addCriterion("archive_no between", value1, value2, "archiveNo");
            return (Criteria) this;
        }

        public Criteria andArchiveNoNotBetween(String value1, String value2) {
            addCriterion("archive_no not between", value1, value2, "archiveNo");
            return (Criteria) this;
        }

        public Criteria andRecordDateIsNull() {
            addCriterion("record_date is null");
            return (Criteria) this;
        }

        public Criteria andRecordDateIsNotNull() {
            addCriterion("record_date is not null");
            return (Criteria) this;
        }

        public Criteria andRecordDateEqualTo(Date value) {
            addCriterionForJDBCDate("record_date =", value, "recordDate");
            return (Criteria) this;
        }

        public Criteria andRecordDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("record_date <>", value, "recordDate");
            return (Criteria) this;
        }

        public Criteria andRecordDateGreaterThan(Date value) {
            addCriterionForJDBCDate("record_date >", value, "recordDate");
            return (Criteria) this;
        }

        public Criteria andRecordDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("record_date >=", value, "recordDate");
            return (Criteria) this;
        }

        public Criteria andRecordDateLessThan(Date value) {
            addCriterionForJDBCDate("record_date <", value, "recordDate");
            return (Criteria) this;
        }

        public Criteria andRecordDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("record_date <=", value, "recordDate");
            return (Criteria) this;
        }

        public Criteria andRecordDateIn(List<Date> values) {
            addCriterionForJDBCDate("record_date in", values, "recordDate");
            return (Criteria) this;
        }

        public Criteria andRecordDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("record_date not in", values, "recordDate");
            return (Criteria) this;
        }

        public Criteria andRecordDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("record_date between", value1, value2, "recordDate");
            return (Criteria) this;
        }

        public Criteria andRecordDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("record_date not between", value1, value2, "recordDate");
            return (Criteria) this;
        }

        public Criteria andIsNetworkingIsNull() {
            addCriterion("is_networking is null");
            return (Criteria) this;
        }

        public Criteria andIsNetworkingIsNotNull() {
            addCriterion("is_networking is not null");
            return (Criteria) this;
        }

        public Criteria andIsNetworkingEqualTo(Byte value) {
            addCriterion("is_networking =", value, "isNetworking");
            return (Criteria) this;
        }

        public Criteria andIsNetworkingNotEqualTo(Byte value) {
            addCriterion("is_networking <>", value, "isNetworking");
            return (Criteria) this;
        }

        public Criteria andIsNetworkingGreaterThan(Byte value) {
            addCriterion("is_networking >", value, "isNetworking");
            return (Criteria) this;
        }

        public Criteria andIsNetworkingGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_networking >=", value, "isNetworking");
            return (Criteria) this;
        }

        public Criteria andIsNetworkingLessThan(Byte value) {
            addCriterion("is_networking <", value, "isNetworking");
            return (Criteria) this;
        }

        public Criteria andIsNetworkingLessThanOrEqualTo(Byte value) {
            addCriterion("is_networking <=", value, "isNetworking");
            return (Criteria) this;
        }

        public Criteria andIsNetworkingIn(List<Byte> values) {
            addCriterion("is_networking in", values, "isNetworking");
            return (Criteria) this;
        }

        public Criteria andIsNetworkingNotIn(List<Byte> values) {
            addCriterion("is_networking not in", values, "isNetworking");
            return (Criteria) this;
        }

        public Criteria andIsNetworkingBetween(Byte value1, Byte value2) {
            addCriterion("is_networking between", value1, value2, "isNetworking");
            return (Criteria) this;
        }

        public Criteria andIsNetworkingNotBetween(Byte value1, Byte value2) {
            addCriterion("is_networking not between", value1, value2, "isNetworking");
            return (Criteria) this;
        }

        public Criteria andVehicleModelIdIsNull() {
            addCriterion("vehicle_model_id is null");
            return (Criteria) this;
        }

        public Criteria andVehicleModelIdIsNotNull() {
            addCriterion("vehicle_model_id is not null");
            return (Criteria) this;
        }

        public Criteria andVehicleModelIdEqualTo(Integer value) {
            addCriterion("vehicle_model_id =", value, "vehicleModelId");
            return (Criteria) this;
        }

        public Criteria andVehicleModelIdNotEqualTo(Integer value) {
            addCriterion("vehicle_model_id <>", value, "vehicleModelId");
            return (Criteria) this;
        }

        public Criteria andVehicleModelIdGreaterThan(Integer value) {
            addCriterion("vehicle_model_id >", value, "vehicleModelId");
            return (Criteria) this;
        }

        public Criteria andVehicleModelIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("vehicle_model_id >=", value, "vehicleModelId");
            return (Criteria) this;
        }

        public Criteria andVehicleModelIdLessThan(Integer value) {
            addCriterion("vehicle_model_id <", value, "vehicleModelId");
            return (Criteria) this;
        }

        public Criteria andVehicleModelIdLessThanOrEqualTo(Integer value) {
            addCriterion("vehicle_model_id <=", value, "vehicleModelId");
            return (Criteria) this;
        }

        public Criteria andVehicleModelIdIn(List<Integer> values) {
            addCriterion("vehicle_model_id in", values, "vehicleModelId");
            return (Criteria) this;
        }

        public Criteria andVehicleModelIdNotIn(List<Integer> values) {
            addCriterion("vehicle_model_id not in", values, "vehicleModelId");
            return (Criteria) this;
        }

        public Criteria andVehicleModelIdBetween(Integer value1, Integer value2) {
            addCriterion("vehicle_model_id between", value1, value2, "vehicleModelId");
            return (Criteria) this;
        }

        public Criteria andVehicleModelIdNotBetween(Integer value1, Integer value2) {
            addCriterion("vehicle_model_id not between", value1, value2, "vehicleModelId");
            return (Criteria) this;
        }

        public Criteria andVehicleLineIdIsNull() {
            addCriterion("vehicle_line_id is null");
            return (Criteria) this;
        }

        public Criteria andVehicleLineIdIsNotNull() {
            addCriterion("vehicle_line_id is not null");
            return (Criteria) this;
        }

        public Criteria andVehicleLineIdEqualTo(Integer value) {
            addCriterion("vehicle_line_id =", value, "vehicleLineId");
            return (Criteria) this;
        }

        public Criteria andVehicleLineIdNotEqualTo(Integer value) {
            addCriterion("vehicle_line_id <>", value, "vehicleLineId");
            return (Criteria) this;
        }

        public Criteria andVehicleLineIdGreaterThan(Integer value) {
            addCriterion("vehicle_line_id >", value, "vehicleLineId");
            return (Criteria) this;
        }

        public Criteria andVehicleLineIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("vehicle_line_id >=", value, "vehicleLineId");
            return (Criteria) this;
        }

        public Criteria andVehicleLineIdLessThan(Integer value) {
            addCriterion("vehicle_line_id <", value, "vehicleLineId");
            return (Criteria) this;
        }

        public Criteria andVehicleLineIdLessThanOrEqualTo(Integer value) {
            addCriterion("vehicle_line_id <=", value, "vehicleLineId");
            return (Criteria) this;
        }

        public Criteria andVehicleLineIdIn(List<Integer> values) {
            addCriterion("vehicle_line_id in", values, "vehicleLineId");
            return (Criteria) this;
        }

        public Criteria andVehicleLineIdNotIn(List<Integer> values) {
            addCriterion("vehicle_line_id not in", values, "vehicleLineId");
            return (Criteria) this;
        }

        public Criteria andVehicleLineIdBetween(Integer value1, Integer value2) {
            addCriterion("vehicle_line_id between", value1, value2, "vehicleLineId");
            return (Criteria) this;
        }

        public Criteria andVehicleLineIdNotBetween(Integer value1, Integer value2) {
            addCriterion("vehicle_line_id not between", value1, value2, "vehicleLineId");
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