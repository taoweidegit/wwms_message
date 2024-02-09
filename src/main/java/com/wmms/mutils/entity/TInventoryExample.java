package com.wmms.mutils.entity;

import java.util.ArrayList;
import java.util.List;

public class TInventoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TInventoryExample() {
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

        public Criteria andModelIsNull() {
            addCriterion("Model is null");
            return (Criteria) this;
        }

        public Criteria andModelIsNotNull() {
            addCriterion("Model is not null");
            return (Criteria) this;
        }

        public Criteria andModelEqualTo(Long value) {
            addCriterion("Model =", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotEqualTo(Long value) {
            addCriterion("Model <>", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThan(Long value) {
            addCriterion("Model >", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThanOrEqualTo(Long value) {
            addCriterion("Model >=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThan(Long value) {
            addCriterion("Model <", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThanOrEqualTo(Long value) {
            addCriterion("Model <=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelIn(List<Long> values) {
            addCriterion("Model in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotIn(List<Long> values) {
            addCriterion("Model not in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelBetween(Long value1, Long value2) {
            addCriterion("Model between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotBetween(Long value1, Long value2) {
            addCriterion("Model not between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andProductionNumberIsNull() {
            addCriterion("ProductionNumber is null");
            return (Criteria) this;
        }

        public Criteria andProductionNumberIsNotNull() {
            addCriterion("ProductionNumber is not null");
            return (Criteria) this;
        }

        public Criteria andProductionNumberEqualTo(String value) {
            addCriterion("ProductionNumber =", value, "productionNumber");
            return (Criteria) this;
        }

        public Criteria andProductionNumberNotEqualTo(String value) {
            addCriterion("ProductionNumber <>", value, "productionNumber");
            return (Criteria) this;
        }

        public Criteria andProductionNumberGreaterThan(String value) {
            addCriterion("ProductionNumber >", value, "productionNumber");
            return (Criteria) this;
        }

        public Criteria andProductionNumberGreaterThanOrEqualTo(String value) {
            addCriterion("ProductionNumber >=", value, "productionNumber");
            return (Criteria) this;
        }

        public Criteria andProductionNumberLessThan(String value) {
            addCriterion("ProductionNumber <", value, "productionNumber");
            return (Criteria) this;
        }

        public Criteria andProductionNumberLessThanOrEqualTo(String value) {
            addCriterion("ProductionNumber <=", value, "productionNumber");
            return (Criteria) this;
        }

        public Criteria andProductionNumberLike(String value) {
            addCriterion("ProductionNumber like", value, "productionNumber");
            return (Criteria) this;
        }

        public Criteria andProductionNumberNotLike(String value) {
            addCriterion("ProductionNumber not like", value, "productionNumber");
            return (Criteria) this;
        }

        public Criteria andProductionNumberIn(List<String> values) {
            addCriterion("ProductionNumber in", values, "productionNumber");
            return (Criteria) this;
        }

        public Criteria andProductionNumberNotIn(List<String> values) {
            addCriterion("ProductionNumber not in", values, "productionNumber");
            return (Criteria) this;
        }

        public Criteria andProductionNumberBetween(String value1, String value2) {
            addCriterion("ProductionNumber between", value1, value2, "productionNumber");
            return (Criteria) this;
        }

        public Criteria andProductionNumberNotBetween(String value1, String value2) {
            addCriterion("ProductionNumber not between", value1, value2, "productionNumber");
            return (Criteria) this;
        }

        public Criteria andShelveIsNull() {
            addCriterion("Shelve is null");
            return (Criteria) this;
        }

        public Criteria andShelveIsNotNull() {
            addCriterion("Shelve is not null");
            return (Criteria) this;
        }

        public Criteria andShelveEqualTo(Long value) {
            addCriterion("Shelve =", value, "shelve");
            return (Criteria) this;
        }

        public Criteria andShelveNotEqualTo(Long value) {
            addCriterion("Shelve <>", value, "shelve");
            return (Criteria) this;
        }

        public Criteria andShelveGreaterThan(Long value) {
            addCriterion("Shelve >", value, "shelve");
            return (Criteria) this;
        }

        public Criteria andShelveGreaterThanOrEqualTo(Long value) {
            addCriterion("Shelve >=", value, "shelve");
            return (Criteria) this;
        }

        public Criteria andShelveLessThan(Long value) {
            addCriterion("Shelve <", value, "shelve");
            return (Criteria) this;
        }

        public Criteria andShelveLessThanOrEqualTo(Long value) {
            addCriterion("Shelve <=", value, "shelve");
            return (Criteria) this;
        }

        public Criteria andShelveIn(List<Long> values) {
            addCriterion("Shelve in", values, "shelve");
            return (Criteria) this;
        }

        public Criteria andShelveNotIn(List<Long> values) {
            addCriterion("Shelve not in", values, "shelve");
            return (Criteria) this;
        }

        public Criteria andShelveBetween(Long value1, Long value2) {
            addCriterion("Shelve between", value1, value2, "shelve");
            return (Criteria) this;
        }

        public Criteria andShelveNotBetween(Long value1, Long value2) {
            addCriterion("Shelve not between", value1, value2, "shelve");
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

        public Criteria andApplyIsNull() {
            addCriterion("Apply is null");
            return (Criteria) this;
        }

        public Criteria andApplyIsNotNull() {
            addCriterion("Apply is not null");
            return (Criteria) this;
        }

        public Criteria andApplyEqualTo(Long value) {
            addCriterion("Apply =", value, "apply");
            return (Criteria) this;
        }

        public Criteria andApplyNotEqualTo(Long value) {
            addCriterion("Apply <>", value, "apply");
            return (Criteria) this;
        }

        public Criteria andApplyGreaterThan(Long value) {
            addCriterion("Apply >", value, "apply");
            return (Criteria) this;
        }

        public Criteria andApplyGreaterThanOrEqualTo(Long value) {
            addCriterion("Apply >=", value, "apply");
            return (Criteria) this;
        }

        public Criteria andApplyLessThan(Long value) {
            addCriterion("Apply <", value, "apply");
            return (Criteria) this;
        }

        public Criteria andApplyLessThanOrEqualTo(Long value) {
            addCriterion("Apply <=", value, "apply");
            return (Criteria) this;
        }

        public Criteria andApplyIn(List<Long> values) {
            addCriterion("Apply in", values, "apply");
            return (Criteria) this;
        }

        public Criteria andApplyNotIn(List<Long> values) {
            addCriterion("Apply not in", values, "apply");
            return (Criteria) this;
        }

        public Criteria andApplyBetween(Long value1, Long value2) {
            addCriterion("Apply between", value1, value2, "apply");
            return (Criteria) this;
        }

        public Criteria andApplyNotBetween(Long value1, Long value2) {
            addCriterion("Apply not between", value1, value2, "apply");
            return (Criteria) this;
        }

        public Criteria andUsingPlaceIsNull() {
            addCriterion("UsingPlace is null");
            return (Criteria) this;
        }

        public Criteria andUsingPlaceIsNotNull() {
            addCriterion("UsingPlace is not null");
            return (Criteria) this;
        }

        public Criteria andUsingPlaceEqualTo(Long value) {
            addCriterion("UsingPlace =", value, "usingPlace");
            return (Criteria) this;
        }

        public Criteria andUsingPlaceNotEqualTo(Long value) {
            addCriterion("UsingPlace <>", value, "usingPlace");
            return (Criteria) this;
        }

        public Criteria andUsingPlaceGreaterThan(Long value) {
            addCriterion("UsingPlace >", value, "usingPlace");
            return (Criteria) this;
        }

        public Criteria andUsingPlaceGreaterThanOrEqualTo(Long value) {
            addCriterion("UsingPlace >=", value, "usingPlace");
            return (Criteria) this;
        }

        public Criteria andUsingPlaceLessThan(Long value) {
            addCriterion("UsingPlace <", value, "usingPlace");
            return (Criteria) this;
        }

        public Criteria andUsingPlaceLessThanOrEqualTo(Long value) {
            addCriterion("UsingPlace <=", value, "usingPlace");
            return (Criteria) this;
        }

        public Criteria andUsingPlaceIn(List<Long> values) {
            addCriterion("UsingPlace in", values, "usingPlace");
            return (Criteria) this;
        }

        public Criteria andUsingPlaceNotIn(List<Long> values) {
            addCriterion("UsingPlace not in", values, "usingPlace");
            return (Criteria) this;
        }

        public Criteria andUsingPlaceBetween(Long value1, Long value2) {
            addCriterion("UsingPlace between", value1, value2, "usingPlace");
            return (Criteria) this;
        }

        public Criteria andUsingPlaceNotBetween(Long value1, Long value2) {
            addCriterion("UsingPlace not between", value1, value2, "usingPlace");
            return (Criteria) this;
        }

        public Criteria andProcessIsNull() {
            addCriterion("`Process` is null");
            return (Criteria) this;
        }

        public Criteria andProcessIsNotNull() {
            addCriterion("`Process` is not null");
            return (Criteria) this;
        }

        public Criteria andProcessEqualTo(String value) {
            addCriterion("`Process` =", value, "process");
            return (Criteria) this;
        }

        public Criteria andProcessNotEqualTo(String value) {
            addCriterion("`Process` <>", value, "process");
            return (Criteria) this;
        }

        public Criteria andProcessGreaterThan(String value) {
            addCriterion("`Process` >", value, "process");
            return (Criteria) this;
        }

        public Criteria andProcessGreaterThanOrEqualTo(String value) {
            addCriterion("`Process` >=", value, "process");
            return (Criteria) this;
        }

        public Criteria andProcessLessThan(String value) {
            addCriterion("`Process` <", value, "process");
            return (Criteria) this;
        }

        public Criteria andProcessLessThanOrEqualTo(String value) {
            addCriterion("`Process` <=", value, "process");
            return (Criteria) this;
        }

        public Criteria andProcessLike(String value) {
            addCriterion("`Process` like", value, "process");
            return (Criteria) this;
        }

        public Criteria andProcessNotLike(String value) {
            addCriterion("`Process` not like", value, "process");
            return (Criteria) this;
        }

        public Criteria andProcessIn(List<String> values) {
            addCriterion("`Process` in", values, "process");
            return (Criteria) this;
        }

        public Criteria andProcessNotIn(List<String> values) {
            addCriterion("`Process` not in", values, "process");
            return (Criteria) this;
        }

        public Criteria andProcessBetween(String value1, String value2) {
            addCriterion("`Process` between", value1, value2, "process");
            return (Criteria) this;
        }

        public Criteria andProcessNotBetween(String value1, String value2) {
            addCriterion("`Process` not between", value1, value2, "process");
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