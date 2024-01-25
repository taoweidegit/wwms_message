package com.wmms.mutils.entity;

import java.util.ArrayList;
import java.util.List;

public class TModelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TModelExample() {
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

        public Criteria andKindIsNull() {
            addCriterion("Kind is null");
            return (Criteria) this;
        }

        public Criteria andKindIsNotNull() {
            addCriterion("Kind is not null");
            return (Criteria) this;
        }

        public Criteria andKindEqualTo(Long value) {
            addCriterion("Kind =", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindNotEqualTo(Long value) {
            addCriterion("Kind <>", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindGreaterThan(Long value) {
            addCriterion("Kind >", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindGreaterThanOrEqualTo(Long value) {
            addCriterion("Kind >=", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindLessThan(Long value) {
            addCriterion("Kind <", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindLessThanOrEqualTo(Long value) {
            addCriterion("Kind <=", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindIn(List<Long> values) {
            addCriterion("Kind in", values, "kind");
            return (Criteria) this;
        }

        public Criteria andKindNotIn(List<Long> values) {
            addCriterion("Kind not in", values, "kind");
            return (Criteria) this;
        }

        public Criteria andKindBetween(Long value1, Long value2) {
            addCriterion("Kind between", value1, value2, "kind");
            return (Criteria) this;
        }

        public Criteria andKindNotBetween(Long value1, Long value2) {
            addCriterion("Kind not between", value1, value2, "kind");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("`Name` is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("`Name` is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("`Name` =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("`Name` <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("`Name` >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("`Name` >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("`Name` <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("`Name` <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("`Name` like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("`Name` not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("`Name` in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("`Name` not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("`Name` between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("`Name` not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNull() {
            addCriterion("Company is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNotNull() {
            addCriterion("Company is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyEqualTo(Long value) {
            addCriterion("Company =", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotEqualTo(Long value) {
            addCriterion("Company <>", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThan(Long value) {
            addCriterion("Company >", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThanOrEqualTo(Long value) {
            addCriterion("Company >=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThan(Long value) {
            addCriterion("Company <", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThanOrEqualTo(Long value) {
            addCriterion("Company <=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyIn(List<Long> values) {
            addCriterion("Company in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotIn(List<Long> values) {
            addCriterion("Company not in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyBetween(Long value1, Long value2) {
            addCriterion("Company between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotBetween(Long value1, Long value2) {
            addCriterion("Company not between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andUnitIsNull() {
            addCriterion("Unit is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("Unit is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(Long value) {
            addCriterion("Unit =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(Long value) {
            addCriterion("Unit <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(Long value) {
            addCriterion("Unit >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(Long value) {
            addCriterion("Unit >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(Long value) {
            addCriterion("Unit <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(Long value) {
            addCriterion("Unit <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<Long> values) {
            addCriterion("Unit in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<Long> values) {
            addCriterion("Unit not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(Long value1, Long value2) {
            addCriterion("Unit between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(Long value1, Long value2) {
            addCriterion("Unit not between", value1, value2, "unit");
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