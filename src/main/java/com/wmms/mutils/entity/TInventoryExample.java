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