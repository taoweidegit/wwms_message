package com.wmms.mutils.entity;

import java.util.ArrayList;
import java.util.List;

public class TUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TUserExample() {
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

        public Criteria andEidIsNull() {
            addCriterion("Eid is null");
            return (Criteria) this;
        }

        public Criteria andEidIsNotNull() {
            addCriterion("Eid is not null");
            return (Criteria) this;
        }

        public Criteria andEidEqualTo(String value) {
            addCriterion("Eid =", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidNotEqualTo(String value) {
            addCriterion("Eid <>", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidGreaterThan(String value) {
            addCriterion("Eid >", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidGreaterThanOrEqualTo(String value) {
            addCriterion("Eid >=", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidLessThan(String value) {
            addCriterion("Eid <", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidLessThanOrEqualTo(String value) {
            addCriterion("Eid <=", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidLike(String value) {
            addCriterion("Eid like", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidNotLike(String value) {
            addCriterion("Eid not like", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidIn(List<String> values) {
            addCriterion("Eid in", values, "eid");
            return (Criteria) this;
        }

        public Criteria andEidNotIn(List<String> values) {
            addCriterion("Eid not in", values, "eid");
            return (Criteria) this;
        }

        public Criteria andEidBetween(String value1, String value2) {
            addCriterion("Eid between", value1, value2, "eid");
            return (Criteria) this;
        }

        public Criteria andEidNotBetween(String value1, String value2) {
            addCriterion("Eid not between", value1, value2, "eid");
            return (Criteria) this;
        }

        public Criteria andWx_idIsNull() {
            addCriterion("Wx_id is null");
            return (Criteria) this;
        }

        public Criteria andWx_idIsNotNull() {
            addCriterion("Wx_id is not null");
            return (Criteria) this;
        }

        public Criteria andWx_idEqualTo(String value) {
            addCriterion("Wx_id =", value, "wx_id");
            return (Criteria) this;
        }

        public Criteria andWx_idNotEqualTo(String value) {
            addCriterion("Wx_id <>", value, "wx_id");
            return (Criteria) this;
        }

        public Criteria andWx_idGreaterThan(String value) {
            addCriterion("Wx_id >", value, "wx_id");
            return (Criteria) this;
        }

        public Criteria andWx_idGreaterThanOrEqualTo(String value) {
            addCriterion("Wx_id >=", value, "wx_id");
            return (Criteria) this;
        }

        public Criteria andWx_idLessThan(String value) {
            addCriterion("Wx_id <", value, "wx_id");
            return (Criteria) this;
        }

        public Criteria andWx_idLessThanOrEqualTo(String value) {
            addCriterion("Wx_id <=", value, "wx_id");
            return (Criteria) this;
        }

        public Criteria andWx_idLike(String value) {
            addCriterion("Wx_id like", value, "wx_id");
            return (Criteria) this;
        }

        public Criteria andWx_idNotLike(String value) {
            addCriterion("Wx_id not like", value, "wx_id");
            return (Criteria) this;
        }

        public Criteria andWx_idIn(List<String> values) {
            addCriterion("Wx_id in", values, "wx_id");
            return (Criteria) this;
        }

        public Criteria andWx_idNotIn(List<String> values) {
            addCriterion("Wx_id not in", values, "wx_id");
            return (Criteria) this;
        }

        public Criteria andWx_idBetween(String value1, String value2) {
            addCriterion("Wx_id between", value1, value2, "wx_id");
            return (Criteria) this;
        }

        public Criteria andWx_idNotBetween(String value1, String value2) {
            addCriterion("Wx_id not between", value1, value2, "wx_id");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNull() {
            addCriterion("Department is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNotNull() {
            addCriterion("Department is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentEqualTo(Long value) {
            addCriterion("Department =", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotEqualTo(Long value) {
            addCriterion("Department <>", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThan(Long value) {
            addCriterion("Department >", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThanOrEqualTo(Long value) {
            addCriterion("Department >=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThan(Long value) {
            addCriterion("Department <", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThanOrEqualTo(Long value) {
            addCriterion("Department <=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentIn(List<Long> values) {
            addCriterion("Department in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotIn(List<Long> values) {
            addCriterion("Department not in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentBetween(Long value1, Long value2) {
            addCriterion("Department between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotBetween(Long value1, Long value2) {
            addCriterion("Department not between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andRoleIsNull() {
            addCriterion("`Role` is null");
            return (Criteria) this;
        }

        public Criteria andRoleIsNotNull() {
            addCriterion("`Role` is not null");
            return (Criteria) this;
        }

        public Criteria andRoleEqualTo(Long value) {
            addCriterion("`Role` =", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotEqualTo(Long value) {
            addCriterion("`Role` <>", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleGreaterThan(Long value) {
            addCriterion("`Role` >", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleGreaterThanOrEqualTo(Long value) {
            addCriterion("`Role` >=", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleLessThan(Long value) {
            addCriterion("`Role` <", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleLessThanOrEqualTo(Long value) {
            addCriterion("`Role` <=", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleIn(List<Long> values) {
            addCriterion("`Role` in", values, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotIn(List<Long> values) {
            addCriterion("`Role` not in", values, "role");
            return (Criteria) this;
        }

        public Criteria andRoleBetween(Long value1, Long value2) {
            addCriterion("`Role` between", value1, value2, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotBetween(Long value1, Long value2) {
            addCriterion("`Role` not between", value1, value2, "role");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("Mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("Mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("Mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("Mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("Mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("Mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("Mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("Mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("Mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("Mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("Mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("Mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("Mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("Mobile not between", value1, value2, "mobile");
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