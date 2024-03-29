package com.wmms.mutils.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TApplyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TApplyExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andIDIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIDIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIDEqualTo(Long value) {
            addCriterion("ID =", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDNotEqualTo(Long value) {
            addCriterion("ID <>", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDGreaterThan(Long value) {
            addCriterion("ID >", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDLessThan(Long value) {
            addCriterion("ID <", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDIn(List<Long> values) {
            addCriterion("ID in", values, "ID");
            return (Criteria) this;
        }

        public Criteria andIDNotIn(List<Long> values) {
            addCriterion("ID not in", values, "ID");
            return (Criteria) this;
        }

        public Criteria andIDBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "ID");
            return (Criteria) this;
        }

        public Criteria andIDNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "ID");
            return (Criteria) this;
        }

        public Criteria andApplicantIsNull() {
            addCriterion("Applicant is null");
            return (Criteria) this;
        }

        public Criteria andApplicantIsNotNull() {
            addCriterion("Applicant is not null");
            return (Criteria) this;
        }

        public Criteria andApplicantEqualTo(Long value) {
            addCriterion("Applicant =", value, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantNotEqualTo(Long value) {
            addCriterion("Applicant <>", value, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantGreaterThan(Long value) {
            addCriterion("Applicant >", value, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantGreaterThanOrEqualTo(Long value) {
            addCriterion("Applicant >=", value, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantLessThan(Long value) {
            addCriterion("Applicant <", value, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantLessThanOrEqualTo(Long value) {
            addCriterion("Applicant <=", value, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantIn(List<Long> values) {
            addCriterion("Applicant in", values, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantNotIn(List<Long> values) {
            addCriterion("Applicant not in", values, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantBetween(Long value1, Long value2) {
            addCriterion("Applicant between", value1, value2, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantNotBetween(Long value1, Long value2) {
            addCriterion("Applicant not between", value1, value2, "applicant");
            return (Criteria) this;
        }

        public Criteria andWareQuantityIsNull() {
            addCriterion("WareQuantity is null");
            return (Criteria) this;
        }

        public Criteria andWareQuantityIsNotNull() {
            addCriterion("WareQuantity is not null");
            return (Criteria) this;
        }

        public Criteria andWareQuantityEqualTo(Integer value) {
            addCriterion("WareQuantity =", value, "wareQuantity");
            return (Criteria) this;
        }

        public Criteria andWareQuantityNotEqualTo(Integer value) {
            addCriterion("WareQuantity <>", value, "wareQuantity");
            return (Criteria) this;
        }

        public Criteria andWareQuantityGreaterThan(Integer value) {
            addCriterion("WareQuantity >", value, "wareQuantity");
            return (Criteria) this;
        }

        public Criteria andWareQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("WareQuantity >=", value, "wareQuantity");
            return (Criteria) this;
        }

        public Criteria andWareQuantityLessThan(Integer value) {
            addCriterion("WareQuantity <", value, "wareQuantity");
            return (Criteria) this;
        }

        public Criteria andWareQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("WareQuantity <=", value, "wareQuantity");
            return (Criteria) this;
        }

        public Criteria andWareQuantityIn(List<Integer> values) {
            addCriterion("WareQuantity in", values, "wareQuantity");
            return (Criteria) this;
        }

        public Criteria andWareQuantityNotIn(List<Integer> values) {
            addCriterion("WareQuantity not in", values, "wareQuantity");
            return (Criteria) this;
        }

        public Criteria andWareQuantityBetween(Integer value1, Integer value2) {
            addCriterion("WareQuantity between", value1, value2, "wareQuantity");
            return (Criteria) this;
        }

        public Criteria andWareQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("WareQuantity not between", value1, value2, "wareQuantity");
            return (Criteria) this;
        }

        public Criteria andApplicationTimeIsNull() {
            addCriterion("ApplicationTime is null");
            return (Criteria) this;
        }

        public Criteria andApplicationTimeIsNotNull() {
            addCriterion("ApplicationTime is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationTimeEqualTo(Date value) {
            addCriterion("ApplicationTime =", value, "applicationTime");
            return (Criteria) this;
        }

        public Criteria andApplicationTimeNotEqualTo(Date value) {
            addCriterion("ApplicationTime <>", value, "applicationTime");
            return (Criteria) this;
        }

        public Criteria andApplicationTimeGreaterThan(Date value) {
            addCriterion("ApplicationTime >", value, "applicationTime");
            return (Criteria) this;
        }

        public Criteria andApplicationTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ApplicationTime >=", value, "applicationTime");
            return (Criteria) this;
        }

        public Criteria andApplicationTimeLessThan(Date value) {
            addCriterion("ApplicationTime <", value, "applicationTime");
            return (Criteria) this;
        }

        public Criteria andApplicationTimeLessThanOrEqualTo(Date value) {
            addCriterion("ApplicationTime <=", value, "applicationTime");
            return (Criteria) this;
        }

        public Criteria andApplicationTimeIn(List<Date> values) {
            addCriterion("ApplicationTime in", values, "applicationTime");
            return (Criteria) this;
        }

        public Criteria andApplicationTimeNotIn(List<Date> values) {
            addCriterion("ApplicationTime not in", values, "applicationTime");
            return (Criteria) this;
        }

        public Criteria andApplicationTimeBetween(Date value1, Date value2) {
            addCriterion("ApplicationTime between", value1, value2, "applicationTime");
            return (Criteria) this;
        }

        public Criteria andApplicationTimeNotBetween(Date value1, Date value2) {
            addCriterion("ApplicationTime not between", value1, value2, "applicationTime");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("`State` is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("`State` is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Object value) {
            addCriterion("`State` =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Object value) {
            addCriterion("`State` <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Object value) {
            addCriterion("`State` >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Object value) {
            addCriterion("`State` >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Object value) {
            addCriterion("`State` <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Object value) {
            addCriterion("`State` <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Object> values) {
            addCriterion("`State` in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Object> values) {
            addCriterion("`State` not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Object value1, Object value2) {
            addCriterion("`State` between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Object value1, Object value2) {
            addCriterion("`State` not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andWarehousingTimeIsNull() {
            addCriterion("WarehousingTime is null");
            return (Criteria) this;
        }

        public Criteria andWarehousingTimeIsNotNull() {
            addCriterion("WarehousingTime is not null");
            return (Criteria) this;
        }

        public Criteria andWarehousingTimeEqualTo(Date value) {
            addCriterion("WarehousingTime =", value, "warehousingTime");
            return (Criteria) this;
        }

        public Criteria andWarehousingTimeNotEqualTo(Date value) {
            addCriterion("WarehousingTime <>", value, "warehousingTime");
            return (Criteria) this;
        }

        public Criteria andWarehousingTimeGreaterThan(Date value) {
            addCriterion("WarehousingTime >", value, "warehousingTime");
            return (Criteria) this;
        }

        public Criteria andWarehousingTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("WarehousingTime >=", value, "warehousingTime");
            return (Criteria) this;
        }

        public Criteria andWarehousingTimeLessThan(Date value) {
            addCriterion("WarehousingTime <", value, "warehousingTime");
            return (Criteria) this;
        }

        public Criteria andWarehousingTimeLessThanOrEqualTo(Date value) {
            addCriterion("WarehousingTime <=", value, "warehousingTime");
            return (Criteria) this;
        }

        public Criteria andWarehousingTimeIn(List<Date> values) {
            addCriterion("WarehousingTime in", values, "warehousingTime");
            return (Criteria) this;
        }

        public Criteria andWarehousingTimeNotIn(List<Date> values) {
            addCriterion("WarehousingTime not in", values, "warehousingTime");
            return (Criteria) this;
        }

        public Criteria andWarehousingTimeBetween(Date value1, Date value2) {
            addCriterion("WarehousingTime between", value1, value2, "warehousingTime");
            return (Criteria) this;
        }

        public Criteria andWarehousingTimeNotBetween(Date value1, Date value2) {
            addCriterion("WarehousingTime not between", value1, value2, "warehousingTime");
            return (Criteria) this;
        }

        public Criteria andWareIsNull() {
            addCriterion("Ware is null");
            return (Criteria) this;
        }

        public Criteria andWareIsNotNull() {
            addCriterion("Ware is not null");
            return (Criteria) this;
        }

        public Criteria andWareEqualTo(Long value) {
            addCriterion("Ware =", value, "ware");
            return (Criteria) this;
        }

        public Criteria andWareNotEqualTo(Long value) {
            addCriterion("Ware <>", value, "ware");
            return (Criteria) this;
        }

        public Criteria andWareGreaterThan(Long value) {
            addCriterion("Ware >", value, "ware");
            return (Criteria) this;
        }

        public Criteria andWareGreaterThanOrEqualTo(Long value) {
            addCriterion("Ware >=", value, "ware");
            return (Criteria) this;
        }

        public Criteria andWareLessThan(Long value) {
            addCriterion("Ware <", value, "ware");
            return (Criteria) this;
        }

        public Criteria andWareLessThanOrEqualTo(Long value) {
            addCriterion("Ware <=", value, "ware");
            return (Criteria) this;
        }

        public Criteria andWareIn(List<Long> values) {
            addCriterion("Ware in", values, "ware");
            return (Criteria) this;
        }

        public Criteria andWareNotIn(List<Long> values) {
            addCriterion("Ware not in", values, "ware");
            return (Criteria) this;
        }

        public Criteria andWareBetween(Long value1, Long value2) {
            addCriterion("Ware between", value1, value2, "ware");
            return (Criteria) this;
        }

        public Criteria andWareNotBetween(Long value1, Long value2) {
            addCriterion("Ware not between", value1, value2, "ware");
            return (Criteria) this;
        }

        public Criteria andApplyQuantityIsNull() {
            addCriterion("ApplyQuantity is null");
            return (Criteria) this;
        }

        public Criteria andApplyQuantityIsNotNull() {
            addCriterion("ApplyQuantity is not null");
            return (Criteria) this;
        }

        public Criteria andApplyQuantityEqualTo(Integer value) {
            addCriterion("ApplyQuantity =", value, "applyQuantity");
            return (Criteria) this;
        }

        public Criteria andApplyQuantityNotEqualTo(Integer value) {
            addCriterion("ApplyQuantity <>", value, "applyQuantity");
            return (Criteria) this;
        }

        public Criteria andApplyQuantityGreaterThan(Integer value) {
            addCriterion("ApplyQuantity >", value, "applyQuantity");
            return (Criteria) this;
        }

        public Criteria andApplyQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("ApplyQuantity >=", value, "applyQuantity");
            return (Criteria) this;
        }

        public Criteria andApplyQuantityLessThan(Integer value) {
            addCriterion("ApplyQuantity <", value, "applyQuantity");
            return (Criteria) this;
        }

        public Criteria andApplyQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("ApplyQuantity <=", value, "applyQuantity");
            return (Criteria) this;
        }

        public Criteria andApplyQuantityIn(List<Integer> values) {
            addCriterion("ApplyQuantity in", values, "applyQuantity");
            return (Criteria) this;
        }

        public Criteria andApplyQuantityNotIn(List<Integer> values) {
            addCriterion("ApplyQuantity not in", values, "applyQuantity");
            return (Criteria) this;
        }

        public Criteria andApplyQuantityBetween(Integer value1, Integer value2) {
            addCriterion("ApplyQuantity between", value1, value2, "applyQuantity");
            return (Criteria) this;
        }

        public Criteria andApplyQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("ApplyQuantity not between", value1, value2, "applyQuantity");
            return (Criteria) this;
        }

        public Criteria andWarehouseIsNull() {
            addCriterion("Warehouse is null");
            return (Criteria) this;
        }

        public Criteria andWarehouseIsNotNull() {
            addCriterion("Warehouse is not null");
            return (Criteria) this;
        }

        public Criteria andWarehouseEqualTo(Long value) {
            addCriterion("Warehouse =", value, "warehouse");
            return (Criteria) this;
        }

        public Criteria andWarehouseNotEqualTo(Long value) {
            addCriterion("Warehouse <>", value, "warehouse");
            return (Criteria) this;
        }

        public Criteria andWarehouseGreaterThan(Long value) {
            addCriterion("Warehouse >", value, "warehouse");
            return (Criteria) this;
        }

        public Criteria andWarehouseGreaterThanOrEqualTo(Long value) {
            addCriterion("Warehouse >=", value, "warehouse");
            return (Criteria) this;
        }

        public Criteria andWarehouseLessThan(Long value) {
            addCriterion("Warehouse <", value, "warehouse");
            return (Criteria) this;
        }

        public Criteria andWarehouseLessThanOrEqualTo(Long value) {
            addCriterion("Warehouse <=", value, "warehouse");
            return (Criteria) this;
        }

        public Criteria andWarehouseIn(List<Long> values) {
            addCriterion("Warehouse in", values, "warehouse");
            return (Criteria) this;
        }

        public Criteria andWarehouseNotIn(List<Long> values) {
            addCriterion("Warehouse not in", values, "warehouse");
            return (Criteria) this;
        }

        public Criteria andWarehouseBetween(Long value1, Long value2) {
            addCriterion("Warehouse between", value1, value2, "warehouse");
            return (Criteria) this;
        }

        public Criteria andWarehouseNotBetween(Long value1, Long value2) {
            addCriterion("Warehouse not between", value1, value2, "warehouse");
            return (Criteria) this;
        }

        public Criteria andApplyIdIsNull() {
            addCriterion("ApplyId is null");
            return (Criteria) this;
        }

        public Criteria andApplyIdIsNotNull() {
            addCriterion("ApplyId is not null");
            return (Criteria) this;
        }

        public Criteria andApplyIdEqualTo(String value) {
            addCriterion("ApplyId =", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdNotEqualTo(String value) {
            addCriterion("ApplyId <>", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdGreaterThan(String value) {
            addCriterion("ApplyId >", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdGreaterThanOrEqualTo(String value) {
            addCriterion("ApplyId >=", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdLessThan(String value) {
            addCriterion("ApplyId <", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdLessThanOrEqualTo(String value) {
            addCriterion("ApplyId <=", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdLike(String value) {
            addCriterion("ApplyId like", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdNotLike(String value) {
            addCriterion("ApplyId not like", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdIn(List<String> values) {
            addCriterion("ApplyId in", values, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdNotIn(List<String> values) {
            addCriterion("ApplyId not in", values, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdBetween(String value1, String value2) {
            addCriterion("ApplyId between", value1, value2, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdNotBetween(String value1, String value2) {
            addCriterion("ApplyId not between", value1, value2, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyStartIdIsNull() {
            addCriterion("ApplyStartId is null");
            return (Criteria) this;
        }

        public Criteria andApplyStartIdIsNotNull() {
            addCriterion("ApplyStartId is not null");
            return (Criteria) this;
        }

        public Criteria andApplyStartIdEqualTo(Long value) {
            addCriterion("ApplyStartId =", value, "applyStartId");
            return (Criteria) this;
        }

        public Criteria andApplyStartIdNotEqualTo(Long value) {
            addCriterion("ApplyStartId <>", value, "applyStartId");
            return (Criteria) this;
        }

        public Criteria andApplyStartIdGreaterThan(Long value) {
            addCriterion("ApplyStartId >", value, "applyStartId");
            return (Criteria) this;
        }

        public Criteria andApplyStartIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ApplyStartId >=", value, "applyStartId");
            return (Criteria) this;
        }

        public Criteria andApplyStartIdLessThan(Long value) {
            addCriterion("ApplyStartId <", value, "applyStartId");
            return (Criteria) this;
        }

        public Criteria andApplyStartIdLessThanOrEqualTo(Long value) {
            addCriterion("ApplyStartId <=", value, "applyStartId");
            return (Criteria) this;
        }

        public Criteria andApplyStartIdIn(List<Long> values) {
            addCriterion("ApplyStartId in", values, "applyStartId");
            return (Criteria) this;
        }

        public Criteria andApplyStartIdNotIn(List<Long> values) {
            addCriterion("ApplyStartId not in", values, "applyStartId");
            return (Criteria) this;
        }

        public Criteria andApplyStartIdBetween(Long value1, Long value2) {
            addCriterion("ApplyStartId between", value1, value2, "applyStartId");
            return (Criteria) this;
        }

        public Criteria andApplyStartIdNotBetween(Long value1, Long value2) {
            addCriterion("ApplyStartId not between", value1, value2, "applyStartId");
            return (Criteria) this;
        }

        public Criteria andReasonIsNull() {
            addCriterion("Reason is null");
            return (Criteria) this;
        }

        public Criteria andReasonIsNotNull() {
            addCriterion("Reason is not null");
            return (Criteria) this;
        }

        public Criteria andReasonEqualTo(String value) {
            addCriterion("Reason =", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotEqualTo(String value) {
            addCriterion("Reason <>", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThan(String value) {
            addCriterion("Reason >", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThanOrEqualTo(String value) {
            addCriterion("Reason >=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThan(String value) {
            addCriterion("Reason <", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThanOrEqualTo(String value) {
            addCriterion("Reason <=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLike(String value) {
            addCriterion("Reason like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotLike(String value) {
            addCriterion("Reason not like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonIn(List<String> values) {
            addCriterion("Reason in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotIn(List<String> values) {
            addCriterion("Reason not in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonBetween(String value1, String value2) {
            addCriterion("Reason between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotBetween(String value1, String value2) {
            addCriterion("Reason not between", value1, value2, "reason");
            return (Criteria) this;
        }
    }

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