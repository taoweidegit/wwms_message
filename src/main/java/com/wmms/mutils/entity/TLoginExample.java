package com.wmms.mutils.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TLoginExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TLoginExample() {
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

        public Criteria andUserIsNull() {
            addCriterion("`User` is null");
            return (Criteria) this;
        }

        public Criteria andUserIsNotNull() {
            addCriterion("`User` is not null");
            return (Criteria) this;
        }

        public Criteria andUserEqualTo(Long value) {
            addCriterion("`User` =", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotEqualTo(Long value) {
            addCriterion("`User` <>", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserGreaterThan(Long value) {
            addCriterion("`User` >", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserGreaterThanOrEqualTo(Long value) {
            addCriterion("`User` >=", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserLessThan(Long value) {
            addCriterion("`User` <", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserLessThanOrEqualTo(Long value) {
            addCriterion("`User` <=", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserIn(List<Long> values) {
            addCriterion("`User` in", values, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotIn(List<Long> values) {
            addCriterion("`User` not in", values, "user");
            return (Criteria) this;
        }

        public Criteria andUserBetween(Long value1, Long value2) {
            addCriterion("`User` between", value1, value2, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotBetween(Long value1, Long value2) {
            addCriterion("`User` not between", value1, value2, "user");
            return (Criteria) this;
        }

        public Criteria andAccessTokenIsNull() {
            addCriterion("AccessToken is null");
            return (Criteria) this;
        }

        public Criteria andAccessTokenIsNotNull() {
            addCriterion("AccessToken is not null");
            return (Criteria) this;
        }

        public Criteria andAccessTokenEqualTo(String value) {
            addCriterion("AccessToken =", value, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenNotEqualTo(String value) {
            addCriterion("AccessToken <>", value, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenGreaterThan(String value) {
            addCriterion("AccessToken >", value, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenGreaterThanOrEqualTo(String value) {
            addCriterion("AccessToken >=", value, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenLessThan(String value) {
            addCriterion("AccessToken <", value, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenLessThanOrEqualTo(String value) {
            addCriterion("AccessToken <=", value, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenLike(String value) {
            addCriterion("AccessToken like", value, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenNotLike(String value) {
            addCriterion("AccessToken not like", value, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenIn(List<String> values) {
            addCriterion("AccessToken in", values, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenNotIn(List<String> values) {
            addCriterion("AccessToken not in", values, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenBetween(String value1, String value2) {
            addCriterion("AccessToken between", value1, value2, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenNotBetween(String value1, String value2) {
            addCriterion("AccessToken not between", value1, value2, "accessToken");
            return (Criteria) this;
        }

        public Criteria andRefreshTokenIsNull() {
            addCriterion("RefreshToken is null");
            return (Criteria) this;
        }

        public Criteria andRefreshTokenIsNotNull() {
            addCriterion("RefreshToken is not null");
            return (Criteria) this;
        }

        public Criteria andRefreshTokenEqualTo(String value) {
            addCriterion("RefreshToken =", value, "refreshToken");
            return (Criteria) this;
        }

        public Criteria andRefreshTokenNotEqualTo(String value) {
            addCriterion("RefreshToken <>", value, "refreshToken");
            return (Criteria) this;
        }

        public Criteria andRefreshTokenGreaterThan(String value) {
            addCriterion("RefreshToken >", value, "refreshToken");
            return (Criteria) this;
        }

        public Criteria andRefreshTokenGreaterThanOrEqualTo(String value) {
            addCriterion("RefreshToken >=", value, "refreshToken");
            return (Criteria) this;
        }

        public Criteria andRefreshTokenLessThan(String value) {
            addCriterion("RefreshToken <", value, "refreshToken");
            return (Criteria) this;
        }

        public Criteria andRefreshTokenLessThanOrEqualTo(String value) {
            addCriterion("RefreshToken <=", value, "refreshToken");
            return (Criteria) this;
        }

        public Criteria andRefreshTokenLike(String value) {
            addCriterion("RefreshToken like", value, "refreshToken");
            return (Criteria) this;
        }

        public Criteria andRefreshTokenNotLike(String value) {
            addCriterion("RefreshToken not like", value, "refreshToken");
            return (Criteria) this;
        }

        public Criteria andRefreshTokenIn(List<String> values) {
            addCriterion("RefreshToken in", values, "refreshToken");
            return (Criteria) this;
        }

        public Criteria andRefreshTokenNotIn(List<String> values) {
            addCriterion("RefreshToken not in", values, "refreshToken");
            return (Criteria) this;
        }

        public Criteria andRefreshTokenBetween(String value1, String value2) {
            addCriterion("RefreshToken between", value1, value2, "refreshToken");
            return (Criteria) this;
        }

        public Criteria andRefreshTokenNotBetween(String value1, String value2) {
            addCriterion("RefreshToken not between", value1, value2, "refreshToken");
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

        public Criteria andAccessTimeIsNull() {
            addCriterion("AccessTime is null");
            return (Criteria) this;
        }

        public Criteria andAccessTimeIsNotNull() {
            addCriterion("AccessTime is not null");
            return (Criteria) this;
        }

        public Criteria andAccessTimeEqualTo(Date value) {
            addCriterion("AccessTime =", value, "accessTime");
            return (Criteria) this;
        }

        public Criteria andAccessTimeNotEqualTo(Date value) {
            addCriterion("AccessTime <>", value, "accessTime");
            return (Criteria) this;
        }

        public Criteria andAccessTimeGreaterThan(Date value) {
            addCriterion("AccessTime >", value, "accessTime");
            return (Criteria) this;
        }

        public Criteria andAccessTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("AccessTime >=", value, "accessTime");
            return (Criteria) this;
        }

        public Criteria andAccessTimeLessThan(Date value) {
            addCriterion("AccessTime <", value, "accessTime");
            return (Criteria) this;
        }

        public Criteria andAccessTimeLessThanOrEqualTo(Date value) {
            addCriterion("AccessTime <=", value, "accessTime");
            return (Criteria) this;
        }

        public Criteria andAccessTimeIn(List<Date> values) {
            addCriterion("AccessTime in", values, "accessTime");
            return (Criteria) this;
        }

        public Criteria andAccessTimeNotIn(List<Date> values) {
            addCriterion("AccessTime not in", values, "accessTime");
            return (Criteria) this;
        }

        public Criteria andAccessTimeBetween(Date value1, Date value2) {
            addCriterion("AccessTime between", value1, value2, "accessTime");
            return (Criteria) this;
        }

        public Criteria andAccessTimeNotBetween(Date value1, Date value2) {
            addCriterion("AccessTime not between", value1, value2, "accessTime");
            return (Criteria) this;
        }

        public Criteria andRefreshTimeIsNull() {
            addCriterion("RefreshTime is null");
            return (Criteria) this;
        }

        public Criteria andRefreshTimeIsNotNull() {
            addCriterion("RefreshTime is not null");
            return (Criteria) this;
        }

        public Criteria andRefreshTimeEqualTo(Date value) {
            addCriterion("RefreshTime =", value, "refreshTime");
            return (Criteria) this;
        }

        public Criteria andRefreshTimeNotEqualTo(Date value) {
            addCriterion("RefreshTime <>", value, "refreshTime");
            return (Criteria) this;
        }

        public Criteria andRefreshTimeGreaterThan(Date value) {
            addCriterion("RefreshTime >", value, "refreshTime");
            return (Criteria) this;
        }

        public Criteria andRefreshTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("RefreshTime >=", value, "refreshTime");
            return (Criteria) this;
        }

        public Criteria andRefreshTimeLessThan(Date value) {
            addCriterion("RefreshTime <", value, "refreshTime");
            return (Criteria) this;
        }

        public Criteria andRefreshTimeLessThanOrEqualTo(Date value) {
            addCriterion("RefreshTime <=", value, "refreshTime");
            return (Criteria) this;
        }

        public Criteria andRefreshTimeIn(List<Date> values) {
            addCriterion("RefreshTime in", values, "refreshTime");
            return (Criteria) this;
        }

        public Criteria andRefreshTimeNotIn(List<Date> values) {
            addCriterion("RefreshTime not in", values, "refreshTime");
            return (Criteria) this;
        }

        public Criteria andRefreshTimeBetween(Date value1, Date value2) {
            addCriterion("RefreshTime between", value1, value2, "refreshTime");
            return (Criteria) this;
        }

        public Criteria andRefreshTimeNotBetween(Date value1, Date value2) {
            addCriterion("RefreshTime not between", value1, value2, "refreshTime");
            return (Criteria) this;
        }

        public Criteria andDeviceIsNull() {
            addCriterion("Device is null");
            return (Criteria) this;
        }

        public Criteria andDeviceIsNotNull() {
            addCriterion("Device is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceEqualTo(Object value) {
            addCriterion("Device =", value, "device");
            return (Criteria) this;
        }

        public Criteria andDeviceNotEqualTo(Object value) {
            addCriterion("Device <>", value, "device");
            return (Criteria) this;
        }

        public Criteria andDeviceGreaterThan(Object value) {
            addCriterion("Device >", value, "device");
            return (Criteria) this;
        }

        public Criteria andDeviceGreaterThanOrEqualTo(Object value) {
            addCriterion("Device >=", value, "device");
            return (Criteria) this;
        }

        public Criteria andDeviceLessThan(Object value) {
            addCriterion("Device <", value, "device");
            return (Criteria) this;
        }

        public Criteria andDeviceLessThanOrEqualTo(Object value) {
            addCriterion("Device <=", value, "device");
            return (Criteria) this;
        }

        public Criteria andDeviceIn(List<Object> values) {
            addCriterion("Device in", values, "device");
            return (Criteria) this;
        }

        public Criteria andDeviceNotIn(List<Object> values) {
            addCriterion("Device not in", values, "device");
            return (Criteria) this;
        }

        public Criteria andDeviceBetween(Object value1, Object value2) {
            addCriterion("Device between", value1, value2, "device");
            return (Criteria) this;
        }

        public Criteria andDeviceNotBetween(Object value1, Object value2) {
            addCriterion("Device not between", value1, value2, "device");
            return (Criteria) this;
        }

        public Criteria andQueueListenerIsNull() {
            addCriterion("QueueListener is null");
            return (Criteria) this;
        }

        public Criteria andQueueListenerIsNotNull() {
            addCriterion("QueueListener is not null");
            return (Criteria) this;
        }

        public Criteria andQueueListenerEqualTo(String value) {
            addCriterion("QueueListener =", value, "queueListener");
            return (Criteria) this;
        }

        public Criteria andQueueListenerNotEqualTo(String value) {
            addCriterion("QueueListener <>", value, "queueListener");
            return (Criteria) this;
        }

        public Criteria andQueueListenerGreaterThan(String value) {
            addCriterion("QueueListener >", value, "queueListener");
            return (Criteria) this;
        }

        public Criteria andQueueListenerGreaterThanOrEqualTo(String value) {
            addCriterion("QueueListener >=", value, "queueListener");
            return (Criteria) this;
        }

        public Criteria andQueueListenerLessThan(String value) {
            addCriterion("QueueListener <", value, "queueListener");
            return (Criteria) this;
        }

        public Criteria andQueueListenerLessThanOrEqualTo(String value) {
            addCriterion("QueueListener <=", value, "queueListener");
            return (Criteria) this;
        }

        public Criteria andQueueListenerLike(String value) {
            addCriterion("QueueListener like", value, "queueListener");
            return (Criteria) this;
        }

        public Criteria andQueueListenerNotLike(String value) {
            addCriterion("QueueListener not like", value, "queueListener");
            return (Criteria) this;
        }

        public Criteria andQueueListenerIn(List<String> values) {
            addCriterion("QueueListener in", values, "queueListener");
            return (Criteria) this;
        }

        public Criteria andQueueListenerNotIn(List<String> values) {
            addCriterion("QueueListener not in", values, "queueListener");
            return (Criteria) this;
        }

        public Criteria andQueueListenerBetween(String value1, String value2) {
            addCriterion("QueueListener between", value1, value2, "queueListener");
            return (Criteria) this;
        }

        public Criteria andQueueListenerNotBetween(String value1, String value2) {
            addCriterion("QueueListener not between", value1, value2, "queueListener");
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