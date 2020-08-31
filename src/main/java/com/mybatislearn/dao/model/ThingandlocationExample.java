package com.mybatislearn.dao.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ThingandlocationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ThingandlocationExample() {
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

        public Criteria andThingandlocationIdIsNull() {
            addCriterion("thingandlocation_id is null");
            return (Criteria) this;
        }

        public Criteria andThingandlocationIdIsNotNull() {
            addCriterion("thingandlocation_id is not null");
            return (Criteria) this;
        }

        public Criteria andThingandlocationIdEqualTo(String value) {
            addCriterion("thingandlocation_id =", value, "thingandlocationId");
            return (Criteria) this;
        }

        public Criteria andThingandlocationIdNotEqualTo(String value) {
            addCriterion("thingandlocation_id <>", value, "thingandlocationId");
            return (Criteria) this;
        }

        public Criteria andThingandlocationIdGreaterThan(String value) {
            addCriterion("thingandlocation_id >", value, "thingandlocationId");
            return (Criteria) this;
        }

        public Criteria andThingandlocationIdGreaterThanOrEqualTo(String value) {
            addCriterion("thingandlocation_id >=", value, "thingandlocationId");
            return (Criteria) this;
        }

        public Criteria andThingandlocationIdLessThan(String value) {
            addCriterion("thingandlocation_id <", value, "thingandlocationId");
            return (Criteria) this;
        }

        public Criteria andThingandlocationIdLessThanOrEqualTo(String value) {
            addCriterion("thingandlocation_id <=", value, "thingandlocationId");
            return (Criteria) this;
        }

        public Criteria andThingandlocationIdLike(String value) {
            addCriterion("thingandlocation_id like", value, "thingandlocationId");
            return (Criteria) this;
        }

        public Criteria andThingandlocationIdNotLike(String value) {
            addCriterion("thingandlocation_id not like", value, "thingandlocationId");
            return (Criteria) this;
        }

        public Criteria andThingandlocationIdIn(List<String> values) {
            addCriterion("thingandlocation_id in", values, "thingandlocationId");
            return (Criteria) this;
        }

        public Criteria andThingandlocationIdNotIn(List<String> values) {
            addCriterion("thingandlocation_id not in", values, "thingandlocationId");
            return (Criteria) this;
        }

        public Criteria andThingandlocationIdBetween(String value1, String value2) {
            addCriterion("thingandlocation_id between", value1, value2, "thingandlocationId");
            return (Criteria) this;
        }

        public Criteria andThingandlocationIdNotBetween(String value1, String value2) {
            addCriterion("thingandlocation_id not between", value1, value2, "thingandlocationId");
            return (Criteria) this;
        }

        public Criteria andThingandlocationThingIdIsNull() {
            addCriterion("thingandlocation_thing_id is null");
            return (Criteria) this;
        }

        public Criteria andThingandlocationThingIdIsNotNull() {
            addCriterion("thingandlocation_thing_id is not null");
            return (Criteria) this;
        }

        public Criteria andThingandlocationThingIdEqualTo(String value) {
            addCriterion("thingandlocation_thing_id =", value, "thingandlocationThingId");
            return (Criteria) this;
        }

        public Criteria andThingandlocationThingIdNotEqualTo(String value) {
            addCriterion("thingandlocation_thing_id <>", value, "thingandlocationThingId");
            return (Criteria) this;
        }

        public Criteria andThingandlocationThingIdGreaterThan(String value) {
            addCriterion("thingandlocation_thing_id >", value, "thingandlocationThingId");
            return (Criteria) this;
        }

        public Criteria andThingandlocationThingIdGreaterThanOrEqualTo(String value) {
            addCriterion("thingandlocation_thing_id >=", value, "thingandlocationThingId");
            return (Criteria) this;
        }

        public Criteria andThingandlocationThingIdLessThan(String value) {
            addCriterion("thingandlocation_thing_id <", value, "thingandlocationThingId");
            return (Criteria) this;
        }

        public Criteria andThingandlocationThingIdLessThanOrEqualTo(String value) {
            addCriterion("thingandlocation_thing_id <=", value, "thingandlocationThingId");
            return (Criteria) this;
        }

        public Criteria andThingandlocationThingIdLike(String value) {
            addCriterion("thingandlocation_thing_id like", value, "thingandlocationThingId");
            return (Criteria) this;
        }

        public Criteria andThingandlocationThingIdNotLike(String value) {
            addCriterion("thingandlocation_thing_id not like", value, "thingandlocationThingId");
            return (Criteria) this;
        }

        public Criteria andThingandlocationThingIdIn(List<String> values) {
            addCriterion("thingandlocation_thing_id in", values, "thingandlocationThingId");
            return (Criteria) this;
        }

        public Criteria andThingandlocationThingIdNotIn(List<String> values) {
            addCriterion("thingandlocation_thing_id not in", values, "thingandlocationThingId");
            return (Criteria) this;
        }

        public Criteria andThingandlocationThingIdBetween(String value1, String value2) {
            addCriterion("thingandlocation_thing_id between", value1, value2, "thingandlocationThingId");
            return (Criteria) this;
        }

        public Criteria andThingandlocationThingIdNotBetween(String value1, String value2) {
            addCriterion("thingandlocation_thing_id not between", value1, value2, "thingandlocationThingId");
            return (Criteria) this;
        }

        public Criteria andThingandlocationLocationIdIsNull() {
            addCriterion("thingandlocation_location_id is null");
            return (Criteria) this;
        }

        public Criteria andThingandlocationLocationIdIsNotNull() {
            addCriterion("thingandlocation_location_id is not null");
            return (Criteria) this;
        }

        public Criteria andThingandlocationLocationIdEqualTo(String value) {
            addCriterion("thingandlocation_location_id =", value, "thingandlocationLocationId");
            return (Criteria) this;
        }

        public Criteria andThingandlocationLocationIdNotEqualTo(String value) {
            addCriterion("thingandlocation_location_id <>", value, "thingandlocationLocationId");
            return (Criteria) this;
        }

        public Criteria andThingandlocationLocationIdGreaterThan(String value) {
            addCriterion("thingandlocation_location_id >", value, "thingandlocationLocationId");
            return (Criteria) this;
        }

        public Criteria andThingandlocationLocationIdGreaterThanOrEqualTo(String value) {
            addCriterion("thingandlocation_location_id >=", value, "thingandlocationLocationId");
            return (Criteria) this;
        }

        public Criteria andThingandlocationLocationIdLessThan(String value) {
            addCriterion("thingandlocation_location_id <", value, "thingandlocationLocationId");
            return (Criteria) this;
        }

        public Criteria andThingandlocationLocationIdLessThanOrEqualTo(String value) {
            addCriterion("thingandlocation_location_id <=", value, "thingandlocationLocationId");
            return (Criteria) this;
        }

        public Criteria andThingandlocationLocationIdLike(String value) {
            addCriterion("thingandlocation_location_id like", value, "thingandlocationLocationId");
            return (Criteria) this;
        }

        public Criteria andThingandlocationLocationIdNotLike(String value) {
            addCriterion("thingandlocation_location_id not like", value, "thingandlocationLocationId");
            return (Criteria) this;
        }

        public Criteria andThingandlocationLocationIdIn(List<String> values) {
            addCriterion("thingandlocation_location_id in", values, "thingandlocationLocationId");
            return (Criteria) this;
        }

        public Criteria andThingandlocationLocationIdNotIn(List<String> values) {
            addCriterion("thingandlocation_location_id not in", values, "thingandlocationLocationId");
            return (Criteria) this;
        }

        public Criteria andThingandlocationLocationIdBetween(String value1, String value2) {
            addCriterion("thingandlocation_location_id between", value1, value2, "thingandlocationLocationId");
            return (Criteria) this;
        }

        public Criteria andThingandlocationLocationIdNotBetween(String value1, String value2) {
            addCriterion("thingandlocation_location_id not between", value1, value2, "thingandlocationLocationId");
            return (Criteria) this;
        }

        public Criteria andThingandlocationUserCreaterIsNull() {
            addCriterion("thingandlocation_user_creater is null");
            return (Criteria) this;
        }

        public Criteria andThingandlocationUserCreaterIsNotNull() {
            addCriterion("thingandlocation_user_creater is not null");
            return (Criteria) this;
        }

        public Criteria andThingandlocationUserCreaterEqualTo(String value) {
            addCriterion("thingandlocation_user_creater =", value, "thingandlocationUserCreater");
            return (Criteria) this;
        }

        public Criteria andThingandlocationUserCreaterNotEqualTo(String value) {
            addCriterion("thingandlocation_user_creater <>", value, "thingandlocationUserCreater");
            return (Criteria) this;
        }

        public Criteria andThingandlocationUserCreaterGreaterThan(String value) {
            addCriterion("thingandlocation_user_creater >", value, "thingandlocationUserCreater");
            return (Criteria) this;
        }

        public Criteria andThingandlocationUserCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("thingandlocation_user_creater >=", value, "thingandlocationUserCreater");
            return (Criteria) this;
        }

        public Criteria andThingandlocationUserCreaterLessThan(String value) {
            addCriterion("thingandlocation_user_creater <", value, "thingandlocationUserCreater");
            return (Criteria) this;
        }

        public Criteria andThingandlocationUserCreaterLessThanOrEqualTo(String value) {
            addCriterion("thingandlocation_user_creater <=", value, "thingandlocationUserCreater");
            return (Criteria) this;
        }

        public Criteria andThingandlocationUserCreaterLike(String value) {
            addCriterion("thingandlocation_user_creater like", value, "thingandlocationUserCreater");
            return (Criteria) this;
        }

        public Criteria andThingandlocationUserCreaterNotLike(String value) {
            addCriterion("thingandlocation_user_creater not like", value, "thingandlocationUserCreater");
            return (Criteria) this;
        }

        public Criteria andThingandlocationUserCreaterIn(List<String> values) {
            addCriterion("thingandlocation_user_creater in", values, "thingandlocationUserCreater");
            return (Criteria) this;
        }

        public Criteria andThingandlocationUserCreaterNotIn(List<String> values) {
            addCriterion("thingandlocation_user_creater not in", values, "thingandlocationUserCreater");
            return (Criteria) this;
        }

        public Criteria andThingandlocationUserCreaterBetween(String value1, String value2) {
            addCriterion("thingandlocation_user_creater between", value1, value2, "thingandlocationUserCreater");
            return (Criteria) this;
        }

        public Criteria andThingandlocationUserCreaterNotBetween(String value1, String value2) {
            addCriterion("thingandlocation_user_creater not between", value1, value2, "thingandlocationUserCreater");
            return (Criteria) this;
        }

        public Criteria andThingandlocationUserMasterIsNull() {
            addCriterion("thingandlocation_user_master is null");
            return (Criteria) this;
        }

        public Criteria andThingandlocationUserMasterIsNotNull() {
            addCriterion("thingandlocation_user_master is not null");
            return (Criteria) this;
        }

        public Criteria andThingandlocationUserMasterEqualTo(String value) {
            addCriterion("thingandlocation_user_master =", value, "thingandlocationUserMaster");
            return (Criteria) this;
        }

        public Criteria andThingandlocationUserMasterNotEqualTo(String value) {
            addCriterion("thingandlocation_user_master <>", value, "thingandlocationUserMaster");
            return (Criteria) this;
        }

        public Criteria andThingandlocationUserMasterGreaterThan(String value) {
            addCriterion("thingandlocation_user_master >", value, "thingandlocationUserMaster");
            return (Criteria) this;
        }

        public Criteria andThingandlocationUserMasterGreaterThanOrEqualTo(String value) {
            addCriterion("thingandlocation_user_master >=", value, "thingandlocationUserMaster");
            return (Criteria) this;
        }

        public Criteria andThingandlocationUserMasterLessThan(String value) {
            addCriterion("thingandlocation_user_master <", value, "thingandlocationUserMaster");
            return (Criteria) this;
        }

        public Criteria andThingandlocationUserMasterLessThanOrEqualTo(String value) {
            addCriterion("thingandlocation_user_master <=", value, "thingandlocationUserMaster");
            return (Criteria) this;
        }

        public Criteria andThingandlocationUserMasterLike(String value) {
            addCriterion("thingandlocation_user_master like", value, "thingandlocationUserMaster");
            return (Criteria) this;
        }

        public Criteria andThingandlocationUserMasterNotLike(String value) {
            addCriterion("thingandlocation_user_master not like", value, "thingandlocationUserMaster");
            return (Criteria) this;
        }

        public Criteria andThingandlocationUserMasterIn(List<String> values) {
            addCriterion("thingandlocation_user_master in", values, "thingandlocationUserMaster");
            return (Criteria) this;
        }

        public Criteria andThingandlocationUserMasterNotIn(List<String> values) {
            addCriterion("thingandlocation_user_master not in", values, "thingandlocationUserMaster");
            return (Criteria) this;
        }

        public Criteria andThingandlocationUserMasterBetween(String value1, String value2) {
            addCriterion("thingandlocation_user_master between", value1, value2, "thingandlocationUserMaster");
            return (Criteria) this;
        }

        public Criteria andThingandlocationUserMasterNotBetween(String value1, String value2) {
            addCriterion("thingandlocation_user_master not between", value1, value2, "thingandlocationUserMaster");
            return (Criteria) this;
        }

        public Criteria andThingandlocationModiTimeIsNull() {
            addCriterion("thingandlocation_modi_time is null");
            return (Criteria) this;
        }

        public Criteria andThingandlocationModiTimeIsNotNull() {
            addCriterion("thingandlocation_modi_time is not null");
            return (Criteria) this;
        }

        public Criteria andThingandlocationModiTimeEqualTo(Date value) {
            addCriterion("thingandlocation_modi_time =", value, "thingandlocationModiTime");
            return (Criteria) this;
        }

        public Criteria andThingandlocationModiTimeNotEqualTo(Date value) {
            addCriterion("thingandlocation_modi_time <>", value, "thingandlocationModiTime");
            return (Criteria) this;
        }

        public Criteria andThingandlocationModiTimeGreaterThan(Date value) {
            addCriterion("thingandlocation_modi_time >", value, "thingandlocationModiTime");
            return (Criteria) this;
        }

        public Criteria andThingandlocationModiTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("thingandlocation_modi_time >=", value, "thingandlocationModiTime");
            return (Criteria) this;
        }

        public Criteria andThingandlocationModiTimeLessThan(Date value) {
            addCriterion("thingandlocation_modi_time <", value, "thingandlocationModiTime");
            return (Criteria) this;
        }

        public Criteria andThingandlocationModiTimeLessThanOrEqualTo(Date value) {
            addCriterion("thingandlocation_modi_time <=", value, "thingandlocationModiTime");
            return (Criteria) this;
        }

        public Criteria andThingandlocationModiTimeIn(List<Date> values) {
            addCriterion("thingandlocation_modi_time in", values, "thingandlocationModiTime");
            return (Criteria) this;
        }

        public Criteria andThingandlocationModiTimeNotIn(List<Date> values) {
            addCriterion("thingandlocation_modi_time not in", values, "thingandlocationModiTime");
            return (Criteria) this;
        }

        public Criteria andThingandlocationModiTimeBetween(Date value1, Date value2) {
            addCriterion("thingandlocation_modi_time between", value1, value2, "thingandlocationModiTime");
            return (Criteria) this;
        }

        public Criteria andThingandlocationModiTimeNotBetween(Date value1, Date value2) {
            addCriterion("thingandlocation_modi_time not between", value1, value2, "thingandlocationModiTime");
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