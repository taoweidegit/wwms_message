package com.wmms.mutils.entity;

import java.util.ArrayList;
import java.util.List;

public class TWarehouseAdministratorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TWarehouseAdministratorExample() {
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

        public Criteria andAdministratorIsNull() {
            addCriterion("Administrator is null");
            return (Criteria) this;
        }

        public Criteria andAdministratorIsNotNull() {
            addCriterion("Administrator is not null");
            return (Criteria) this;
        }

        public Criteria andAdministratorEqualTo(Long value) {
            addCriterion("Administrator =", value, "administrator");
            return (Criteria) this;
        }

        public Criteria andAdministratorNotEqualTo(Long value) {
            addCriterion("Administrator <>", value, "administrator");
            return (Criteria) this;
        }

        public Criteria andAdministratorGreaterThan(Long value) {
            addCriterion("Administrator >", value, "administrator");
            return (Criteria) this;
        }

        public Criteria andAdministratorGreaterThanOrEqualTo(Long value) {
            addCriterion("Administrator >=", value, "administrator");
            return (Criteria) this;
        }

        public Criteria andAdministratorLessThan(Long value) {
            addCriterion("Administrator <", value, "administrator");
            return (Criteria) this;
        }

        public Criteria andAdministratorLessThanOrEqualTo(Long value) {
            addCriterion("Administrator <=", value, "administrator");
            return (Criteria) this;
        }

        public Criteria andAdministratorIn(List<Long> values) {
            addCriterion("Administrator in", values, "administrator");
            return (Criteria) this;
        }

        public Criteria andAdministratorNotIn(List<Long> values) {
            addCriterion("Administrator not in", values, "administrator");
            return (Criteria) this;
        }

        public Criteria andAdministratorBetween(Long value1, Long value2) {
            addCriterion("Administrator between", value1, value2, "administrator");
            return (Criteria) this;
        }

        public Criteria andAdministratorNotBetween(Long value1, Long value2) {
            addCriterion("Administrator not between", value1, value2, "administrator");
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

        public Criteria andRoleEqualTo(Object value) {
            addCriterion("`Role` =", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotEqualTo(Object value) {
            addCriterion("`Role` <>", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleGreaterThan(Object value) {
            addCriterion("`Role` >", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleGreaterThanOrEqualTo(Object value) {
            addCriterion("`Role` >=", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleLessThan(Object value) {
            addCriterion("`Role` <", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleLessThanOrEqualTo(Object value) {
            addCriterion("`Role` <=", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleIn(List<Object> values) {
            addCriterion("`Role` in", values, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotIn(List<Object> values) {
            addCriterion("`Role` not in", values, "role");
            return (Criteria) this;
        }

        public Criteria andRoleBetween(Object value1, Object value2) {
            addCriterion("`Role` between", value1, value2, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotBetween(Object value1, Object value2) {
            addCriterion("`Role` not between", value1, value2, "role");
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

        public Criteria andIS_MasterIsNull() {
            addCriterion("IS_Master is null");
            return (Criteria) this;
        }

        public Criteria andIS_MasterIsNotNull() {
            addCriterion("IS_Master is not null");
            return (Criteria) this;
        }

        public Criteria andIS_MasterEqualTo(Object value) {
            addCriterion("IS_Master =", value, "IS_Master");
            return (Criteria) this;
        }

        public Criteria andIS_MasterNotEqualTo(Object value) {
            addCriterion("IS_Master <>", value, "IS_Master");
            return (Criteria) this;
        }

        public Criteria andIS_MasterGreaterThan(Object value) {
            addCriterion("IS_Master >", value, "IS_Master");
            return (Criteria) this;
        }

        public Criteria andIS_MasterGreaterThanOrEqualTo(Object value) {
            addCriterion("IS_Master >=", value, "IS_Master");
            return (Criteria) this;
        }

        public Criteria andIS_MasterLessThan(Object value) {
            addCriterion("IS_Master <", value, "IS_Master");
            return (Criteria) this;
        }

        public Criteria andIS_MasterLessThanOrEqualTo(Object value) {
            addCriterion("IS_Master <=", value, "IS_Master");
            return (Criteria) this;
        }

        public Criteria andIS_MasterIn(List<Object> values) {
            addCriterion("IS_Master in", values, "IS_Master");
            return (Criteria) this;
        }

        public Criteria andIS_MasterNotIn(List<Object> values) {
            addCriterion("IS_Master not in", values, "IS_Master");
            return (Criteria) this;
        }

        public Criteria andIS_MasterBetween(Object value1, Object value2) {
            addCriterion("IS_Master between", value1, value2, "IS_Master");
            return (Criteria) this;
        }

        public Criteria andIS_MasterNotBetween(Object value1, Object value2) {
            addCriterion("IS_Master not between", value1, value2, "IS_Master");
            return (Criteria) this;
        }

        public Criteria andIS_DeleteIsNull() {
            addCriterion("IS_Delete is null");
            return (Criteria) this;
        }

        public Criteria andIS_DeleteIsNotNull() {
            addCriterion("IS_Delete is not null");
            return (Criteria) this;
        }

        public Criteria andIS_DeleteEqualTo(Object value) {
            addCriterion("IS_Delete =", value, "IS_Delete");
            return (Criteria) this;
        }

        public Criteria andIS_DeleteNotEqualTo(Object value) {
            addCriterion("IS_Delete <>", value, "IS_Delete");
            return (Criteria) this;
        }

        public Criteria andIS_DeleteGreaterThan(Object value) {
            addCriterion("IS_Delete >", value, "IS_Delete");
            return (Criteria) this;
        }

        public Criteria andIS_DeleteGreaterThanOrEqualTo(Object value) {
            addCriterion("IS_Delete >=", value, "IS_Delete");
            return (Criteria) this;
        }

        public Criteria andIS_DeleteLessThan(Object value) {
            addCriterion("IS_Delete <", value, "IS_Delete");
            return (Criteria) this;
        }

        public Criteria andIS_DeleteLessThanOrEqualTo(Object value) {
            addCriterion("IS_Delete <=", value, "IS_Delete");
            return (Criteria) this;
        }

        public Criteria andIS_DeleteIn(List<Object> values) {
            addCriterion("IS_Delete in", values, "IS_Delete");
            return (Criteria) this;
        }

        public Criteria andIS_DeleteNotIn(List<Object> values) {
            addCriterion("IS_Delete not in", values, "IS_Delete");
            return (Criteria) this;
        }

        public Criteria andIS_DeleteBetween(Object value1, Object value2) {
            addCriterion("IS_Delete between", value1, value2, "IS_Delete");
            return (Criteria) this;
        }

        public Criteria andIS_DeleteNotBetween(Object value1, Object value2) {
            addCriterion("IS_Delete not between", value1, value2, "IS_Delete");
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