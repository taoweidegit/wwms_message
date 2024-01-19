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

        public Criteria andInventoryIsNull() {
            addCriterion("Inventory is null");
            return (Criteria) this;
        }

        public Criteria andInventoryIsNotNull() {
            addCriterion("Inventory is not null");
            return (Criteria) this;
        }

        public Criteria andInventoryEqualTo(Long value) {
            addCriterion("Inventory =", value, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryNotEqualTo(Long value) {
            addCriterion("Inventory <>", value, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryGreaterThan(Long value) {
            addCriterion("Inventory >", value, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryGreaterThanOrEqualTo(Long value) {
            addCriterion("Inventory >=", value, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryLessThan(Long value) {
            addCriterion("Inventory <", value, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryLessThanOrEqualTo(Long value) {
            addCriterion("Inventory <=", value, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryIn(List<Long> values) {
            addCriterion("Inventory in", values, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryNotIn(List<Long> values) {
            addCriterion("Inventory not in", values, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryBetween(Long value1, Long value2) {
            addCriterion("Inventory between", value1, value2, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryNotBetween(Long value1, Long value2) {
            addCriterion("Inventory not between", value1, value2, "inventory");
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

        public Criteria andQuantityIsNull() {
            addCriterion("Quantity is null");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNotNull() {
            addCriterion("Quantity is not null");
            return (Criteria) this;
        }

        public Criteria andQuantityEqualTo(Integer value) {
            addCriterion("Quantity =", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotEqualTo(Integer value) {
            addCriterion("Quantity <>", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThan(Integer value) {
            addCriterion("Quantity >", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("Quantity >=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThan(Integer value) {
            addCriterion("Quantity <", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("Quantity <=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityIn(List<Integer> values) {
            addCriterion("Quantity in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotIn(List<Integer> values) {
            addCriterion("Quantity not in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityBetween(Integer value1, Integer value2) {
            addCriterion("Quantity between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("Quantity not between", value1, value2, "quantity");
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

        public Criteria andTypeIsNull() {
            addCriterion("`Type` is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("`Type` is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Object value) {
            addCriterion("`Type` =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Object value) {
            addCriterion("`Type` <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Object value) {
            addCriterion("`Type` >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Object value) {
            addCriterion("`Type` >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Object value) {
            addCriterion("`Type` <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Object value) {
            addCriterion("`Type` <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Object> values) {
            addCriterion("`Type` in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Object> values) {
            addCriterion("`Type` not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Object value1, Object value2) {
            addCriterion("`Type` between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Object value1, Object value2) {
            addCriterion("`Type` not between", value1, value2, "type");
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

        public Criteria andApprovalTimeIsNull() {
            addCriterion("ApprovalTime is null");
            return (Criteria) this;
        }

        public Criteria andApprovalTimeIsNotNull() {
            addCriterion("ApprovalTime is not null");
            return (Criteria) this;
        }

        public Criteria andApprovalTimeEqualTo(Date value) {
            addCriterion("ApprovalTime =", value, "approvalTime");
            return (Criteria) this;
        }

        public Criteria andApprovalTimeNotEqualTo(Date value) {
            addCriterion("ApprovalTime <>", value, "approvalTime");
            return (Criteria) this;
        }

        public Criteria andApprovalTimeGreaterThan(Date value) {
            addCriterion("ApprovalTime >", value, "approvalTime");
            return (Criteria) this;
        }

        public Criteria andApprovalTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ApprovalTime >=", value, "approvalTime");
            return (Criteria) this;
        }

        public Criteria andApprovalTimeLessThan(Date value) {
            addCriterion("ApprovalTime <", value, "approvalTime");
            return (Criteria) this;
        }

        public Criteria andApprovalTimeLessThanOrEqualTo(Date value) {
            addCriterion("ApprovalTime <=", value, "approvalTime");
            return (Criteria) this;
        }

        public Criteria andApprovalTimeIn(List<Date> values) {
            addCriterion("ApprovalTime in", values, "approvalTime");
            return (Criteria) this;
        }

        public Criteria andApprovalTimeNotIn(List<Date> values) {
            addCriterion("ApprovalTime not in", values, "approvalTime");
            return (Criteria) this;
        }

        public Criteria andApprovalTimeBetween(Date value1, Date value2) {
            addCriterion("ApprovalTime between", value1, value2, "approvalTime");
            return (Criteria) this;
        }

        public Criteria andApprovalTimeNotBetween(Date value1, Date value2) {
            addCriterion("ApprovalTime not between", value1, value2, "approvalTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeIsNull() {
            addCriterion("CancelTime is null");
            return (Criteria) this;
        }

        public Criteria andCancelTimeIsNotNull() {
            addCriterion("CancelTime is not null");
            return (Criteria) this;
        }

        public Criteria andCancelTimeEqualTo(Date value) {
            addCriterion("CancelTime =", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeNotEqualTo(Date value) {
            addCriterion("CancelTime <>", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeGreaterThan(Date value) {
            addCriterion("CancelTime >", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CancelTime >=", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeLessThan(Date value) {
            addCriterion("CancelTime <", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeLessThanOrEqualTo(Date value) {
            addCriterion("CancelTime <=", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeIn(List<Date> values) {
            addCriterion("CancelTime in", values, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeNotIn(List<Date> values) {
            addCriterion("CancelTime not in", values, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeBetween(Date value1, Date value2) {
            addCriterion("CancelTime between", value1, value2, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeNotBetween(Date value1, Date value2) {
            addCriterion("CancelTime not between", value1, value2, "cancelTime");
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