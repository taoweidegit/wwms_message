package com.wmms.mutils.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TWareDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TWareDetailExample() {
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

        public Criteria andCertificateNumberIsNull() {
            addCriterion("CertificateNumber is null");
            return (Criteria) this;
        }

        public Criteria andCertificateNumberIsNotNull() {
            addCriterion("CertificateNumber is not null");
            return (Criteria) this;
        }

        public Criteria andCertificateNumberEqualTo(String value) {
            addCriterion("CertificateNumber =", value, "certificateNumber");
            return (Criteria) this;
        }

        public Criteria andCertificateNumberNotEqualTo(String value) {
            addCriterion("CertificateNumber <>", value, "certificateNumber");
            return (Criteria) this;
        }

        public Criteria andCertificateNumberGreaterThan(String value) {
            addCriterion("CertificateNumber >", value, "certificateNumber");
            return (Criteria) this;
        }

        public Criteria andCertificateNumberGreaterThanOrEqualTo(String value) {
            addCriterion("CertificateNumber >=", value, "certificateNumber");
            return (Criteria) this;
        }

        public Criteria andCertificateNumberLessThan(String value) {
            addCriterion("CertificateNumber <", value, "certificateNumber");
            return (Criteria) this;
        }

        public Criteria andCertificateNumberLessThanOrEqualTo(String value) {
            addCriterion("CertificateNumber <=", value, "certificateNumber");
            return (Criteria) this;
        }

        public Criteria andCertificateNumberLike(String value) {
            addCriterion("CertificateNumber like", value, "certificateNumber");
            return (Criteria) this;
        }

        public Criteria andCertificateNumberNotLike(String value) {
            addCriterion("CertificateNumber not like", value, "certificateNumber");
            return (Criteria) this;
        }

        public Criteria andCertificateNumberIn(List<String> values) {
            addCriterion("CertificateNumber in", values, "certificateNumber");
            return (Criteria) this;
        }

        public Criteria andCertificateNumberNotIn(List<String> values) {
            addCriterion("CertificateNumber not in", values, "certificateNumber");
            return (Criteria) this;
        }

        public Criteria andCertificateNumberBetween(String value1, String value2) {
            addCriterion("CertificateNumber between", value1, value2, "certificateNumber");
            return (Criteria) this;
        }

        public Criteria andCertificateNumberNotBetween(String value1, String value2) {
            addCriterion("CertificateNumber not between", value1, value2, "certificateNumber");
            return (Criteria) this;
        }

        public Criteria andAccuracyIsNull() {
            addCriterion("Accuracy is null");
            return (Criteria) this;
        }

        public Criteria andAccuracyIsNotNull() {
            addCriterion("Accuracy is not null");
            return (Criteria) this;
        }

        public Criteria andAccuracyEqualTo(String value) {
            addCriterion("Accuracy =", value, "accuracy");
            return (Criteria) this;
        }

        public Criteria andAccuracyNotEqualTo(String value) {
            addCriterion("Accuracy <>", value, "accuracy");
            return (Criteria) this;
        }

        public Criteria andAccuracyGreaterThan(String value) {
            addCriterion("Accuracy >", value, "accuracy");
            return (Criteria) this;
        }

        public Criteria andAccuracyGreaterThanOrEqualTo(String value) {
            addCriterion("Accuracy >=", value, "accuracy");
            return (Criteria) this;
        }

        public Criteria andAccuracyLessThan(String value) {
            addCriterion("Accuracy <", value, "accuracy");
            return (Criteria) this;
        }

        public Criteria andAccuracyLessThanOrEqualTo(String value) {
            addCriterion("Accuracy <=", value, "accuracy");
            return (Criteria) this;
        }

        public Criteria andAccuracyLike(String value) {
            addCriterion("Accuracy like", value, "accuracy");
            return (Criteria) this;
        }

        public Criteria andAccuracyNotLike(String value) {
            addCriterion("Accuracy not like", value, "accuracy");
            return (Criteria) this;
        }

        public Criteria andAccuracyIn(List<String> values) {
            addCriterion("Accuracy in", values, "accuracy");
            return (Criteria) this;
        }

        public Criteria andAccuracyNotIn(List<String> values) {
            addCriterion("Accuracy not in", values, "accuracy");
            return (Criteria) this;
        }

        public Criteria andAccuracyBetween(String value1, String value2) {
            addCriterion("Accuracy between", value1, value2, "accuracy");
            return (Criteria) this;
        }

        public Criteria andAccuracyNotBetween(String value1, String value2) {
            addCriterion("Accuracy not between", value1, value2, "accuracy");
            return (Criteria) this;
        }

        public Criteria andValidityPeriodIsNull() {
            addCriterion("ValidityPeriod is null");
            return (Criteria) this;
        }

        public Criteria andValidityPeriodIsNotNull() {
            addCriterion("ValidityPeriod is not null");
            return (Criteria) this;
        }

        public Criteria andValidityPeriodEqualTo(Integer value) {
            addCriterion("ValidityPeriod =", value, "validityPeriod");
            return (Criteria) this;
        }

        public Criteria andValidityPeriodNotEqualTo(Integer value) {
            addCriterion("ValidityPeriod <>", value, "validityPeriod");
            return (Criteria) this;
        }

        public Criteria andValidityPeriodGreaterThan(Integer value) {
            addCriterion("ValidityPeriod >", value, "validityPeriod");
            return (Criteria) this;
        }

        public Criteria andValidityPeriodGreaterThanOrEqualTo(Integer value) {
            addCriterion("ValidityPeriod >=", value, "validityPeriod");
            return (Criteria) this;
        }

        public Criteria andValidityPeriodLessThan(Integer value) {
            addCriterion("ValidityPeriod <", value, "validityPeriod");
            return (Criteria) this;
        }

        public Criteria andValidityPeriodLessThanOrEqualTo(Integer value) {
            addCriterion("ValidityPeriod <=", value, "validityPeriod");
            return (Criteria) this;
        }

        public Criteria andValidityPeriodIn(List<Integer> values) {
            addCriterion("ValidityPeriod in", values, "validityPeriod");
            return (Criteria) this;
        }

        public Criteria andValidityPeriodNotIn(List<Integer> values) {
            addCriterion("ValidityPeriod not in", values, "validityPeriod");
            return (Criteria) this;
        }

        public Criteria andValidityPeriodBetween(Integer value1, Integer value2) {
            addCriterion("ValidityPeriod between", value1, value2, "validityPeriod");
            return (Criteria) this;
        }

        public Criteria andValidityPeriodNotBetween(Integer value1, Integer value2) {
            addCriterion("ValidityPeriod not between", value1, value2, "validityPeriod");
            return (Criteria) this;
        }

        public Criteria andLevelIsNull() {
            addCriterion("`Level` is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("`Level` is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(String value) {
            addCriterion("`Level` =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(String value) {
            addCriterion("`Level` <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(String value) {
            addCriterion("`Level` >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(String value) {
            addCriterion("`Level` >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(String value) {
            addCriterion("`Level` <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(String value) {
            addCriterion("`Level` <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLike(String value) {
            addCriterion("`Level` like", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotLike(String value) {
            addCriterion("`Level` not like", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<String> values) {
            addCriterion("`Level` in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<String> values) {
            addCriterion("`Level` not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(String value1, String value2) {
            addCriterion("`Level` between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(String value1, String value2) {
            addCriterion("`Level` not between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andCurrentInspectionDateIsNull() {
            addCriterion("CurrentInspectionDate is null");
            return (Criteria) this;
        }

        public Criteria andCurrentInspectionDateIsNotNull() {
            addCriterion("CurrentInspectionDate is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentInspectionDateEqualTo(Date value) {
            addCriterion("CurrentInspectionDate =", value, "currentInspectionDate");
            return (Criteria) this;
        }

        public Criteria andCurrentInspectionDateNotEqualTo(Date value) {
            addCriterion("CurrentInspectionDate <>", value, "currentInspectionDate");
            return (Criteria) this;
        }

        public Criteria andCurrentInspectionDateGreaterThan(Date value) {
            addCriterion("CurrentInspectionDate >", value, "currentInspectionDate");
            return (Criteria) this;
        }

        public Criteria andCurrentInspectionDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CurrentInspectionDate >=", value, "currentInspectionDate");
            return (Criteria) this;
        }

        public Criteria andCurrentInspectionDateLessThan(Date value) {
            addCriterion("CurrentInspectionDate <", value, "currentInspectionDate");
            return (Criteria) this;
        }

        public Criteria andCurrentInspectionDateLessThanOrEqualTo(Date value) {
            addCriterion("CurrentInspectionDate <=", value, "currentInspectionDate");
            return (Criteria) this;
        }

        public Criteria andCurrentInspectionDateIn(List<Date> values) {
            addCriterion("CurrentInspectionDate in", values, "currentInspectionDate");
            return (Criteria) this;
        }

        public Criteria andCurrentInspectionDateNotIn(List<Date> values) {
            addCriterion("CurrentInspectionDate not in", values, "currentInspectionDate");
            return (Criteria) this;
        }

        public Criteria andCurrentInspectionDateBetween(Date value1, Date value2) {
            addCriterion("CurrentInspectionDate between", value1, value2, "currentInspectionDate");
            return (Criteria) this;
        }

        public Criteria andCurrentInspectionDateNotBetween(Date value1, Date value2) {
            addCriterion("CurrentInspectionDate not between", value1, value2, "currentInspectionDate");
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