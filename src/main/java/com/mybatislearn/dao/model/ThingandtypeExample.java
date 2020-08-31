package com.mybatislearn.dao.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ThingandtypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ThingandtypeExample() {
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

        public Criteria andThingandtypeIdIsNull() {
            addCriterion("thingandtype_id is null");
            return (Criteria) this;
        }

        public Criteria andThingandtypeIdIsNotNull() {
            addCriterion("thingandtype_id is not null");
            return (Criteria) this;
        }

        public Criteria andThingandtypeIdEqualTo(String value) {
            addCriterion("thingandtype_id =", value, "thingandtypeId");
            return (Criteria) this;
        }

        public Criteria andThingandtypeIdNotEqualTo(String value) {
            addCriterion("thingandtype_id <>", value, "thingandtypeId");
            return (Criteria) this;
        }

        public Criteria andThingandtypeIdGreaterThan(String value) {
            addCriterion("thingandtype_id >", value, "thingandtypeId");
            return (Criteria) this;
        }

        public Criteria andThingandtypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("thingandtype_id >=", value, "thingandtypeId");
            return (Criteria) this;
        }

        public Criteria andThingandtypeIdLessThan(String value) {
            addCriterion("thingandtype_id <", value, "thingandtypeId");
            return (Criteria) this;
        }

        public Criteria andThingandtypeIdLessThanOrEqualTo(String value) {
            addCriterion("thingandtype_id <=", value, "thingandtypeId");
            return (Criteria) this;
        }

        public Criteria andThingandtypeIdLike(String value) {
            addCriterion("thingandtype_id like", value, "thingandtypeId");
            return (Criteria) this;
        }

        public Criteria andThingandtypeIdNotLike(String value) {
            addCriterion("thingandtype_id not like", value, "thingandtypeId");
            return (Criteria) this;
        }

        public Criteria andThingandtypeIdIn(List<String> values) {
            addCriterion("thingandtype_id in", values, "thingandtypeId");
            return (Criteria) this;
        }

        public Criteria andThingandtypeIdNotIn(List<String> values) {
            addCriterion("thingandtype_id not in", values, "thingandtypeId");
            return (Criteria) this;
        }

        public Criteria andThingandtypeIdBetween(String value1, String value2) {
            addCriterion("thingandtype_id between", value1, value2, "thingandtypeId");
            return (Criteria) this;
        }

        public Criteria andThingandtypeIdNotBetween(String value1, String value2) {
            addCriterion("thingandtype_id not between", value1, value2, "thingandtypeId");
            return (Criteria) this;
        }

        public Criteria andThingandtypeThingIdIsNull() {
            addCriterion("thingandtype_thing_id is null");
            return (Criteria) this;
        }

        public Criteria andThingandtypeThingIdIsNotNull() {
            addCriterion("thingandtype_thing_id is not null");
            return (Criteria) this;
        }

        public Criteria andThingandtypeThingIdEqualTo(String value) {
            addCriterion("thingandtype_thing_id =", value, "thingandtypeThingId");
            return (Criteria) this;
        }

        public Criteria andThingandtypeThingIdNotEqualTo(String value) {
            addCriterion("thingandtype_thing_id <>", value, "thingandtypeThingId");
            return (Criteria) this;
        }

        public Criteria andThingandtypeThingIdGreaterThan(String value) {
            addCriterion("thingandtype_thing_id >", value, "thingandtypeThingId");
            return (Criteria) this;
        }

        public Criteria andThingandtypeThingIdGreaterThanOrEqualTo(String value) {
            addCriterion("thingandtype_thing_id >=", value, "thingandtypeThingId");
            return (Criteria) this;
        }

        public Criteria andThingandtypeThingIdLessThan(String value) {
            addCriterion("thingandtype_thing_id <", value, "thingandtypeThingId");
            return (Criteria) this;
        }

        public Criteria andThingandtypeThingIdLessThanOrEqualTo(String value) {
            addCriterion("thingandtype_thing_id <=", value, "thingandtypeThingId");
            return (Criteria) this;
        }

        public Criteria andThingandtypeThingIdLike(String value) {
            addCriterion("thingandtype_thing_id like", value, "thingandtypeThingId");
            return (Criteria) this;
        }

        public Criteria andThingandtypeThingIdNotLike(String value) {
            addCriterion("thingandtype_thing_id not like", value, "thingandtypeThingId");
            return (Criteria) this;
        }

        public Criteria andThingandtypeThingIdIn(List<String> values) {
            addCriterion("thingandtype_thing_id in", values, "thingandtypeThingId");
            return (Criteria) this;
        }

        public Criteria andThingandtypeThingIdNotIn(List<String> values) {
            addCriterion("thingandtype_thing_id not in", values, "thingandtypeThingId");
            return (Criteria) this;
        }

        public Criteria andThingandtypeThingIdBetween(String value1, String value2) {
            addCriterion("thingandtype_thing_id between", value1, value2, "thingandtypeThingId");
            return (Criteria) this;
        }

        public Criteria andThingandtypeThingIdNotBetween(String value1, String value2) {
            addCriterion("thingandtype_thing_id not between", value1, value2, "thingandtypeThingId");
            return (Criteria) this;
        }

        public Criteria andThingandtypeThingtypeIdIsNull() {
            addCriterion("thingandtype_thingtype_id is null");
            return (Criteria) this;
        }

        public Criteria andThingandtypeThingtypeIdIsNotNull() {
            addCriterion("thingandtype_thingtype_id is not null");
            return (Criteria) this;
        }

        public Criteria andThingandtypeThingtypeIdEqualTo(String value) {
            addCriterion("thingandtype_thingtype_id =", value, "thingandtypeThingtypeId");
            return (Criteria) this;
        }

        public Criteria andThingandtypeThingtypeIdNotEqualTo(String value) {
            addCriterion("thingandtype_thingtype_id <>", value, "thingandtypeThingtypeId");
            return (Criteria) this;
        }

        public Criteria andThingandtypeThingtypeIdGreaterThan(String value) {
            addCriterion("thingandtype_thingtype_id >", value, "thingandtypeThingtypeId");
            return (Criteria) this;
        }

        public Criteria andThingandtypeThingtypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("thingandtype_thingtype_id >=", value, "thingandtypeThingtypeId");
            return (Criteria) this;
        }

        public Criteria andThingandtypeThingtypeIdLessThan(String value) {
            addCriterion("thingandtype_thingtype_id <", value, "thingandtypeThingtypeId");
            return (Criteria) this;
        }

        public Criteria andThingandtypeThingtypeIdLessThanOrEqualTo(String value) {
            addCriterion("thingandtype_thingtype_id <=", value, "thingandtypeThingtypeId");
            return (Criteria) this;
        }

        public Criteria andThingandtypeThingtypeIdLike(String value) {
            addCriterion("thingandtype_thingtype_id like", value, "thingandtypeThingtypeId");
            return (Criteria) this;
        }

        public Criteria andThingandtypeThingtypeIdNotLike(String value) {
            addCriterion("thingandtype_thingtype_id not like", value, "thingandtypeThingtypeId");
            return (Criteria) this;
        }

        public Criteria andThingandtypeThingtypeIdIn(List<String> values) {
            addCriterion("thingandtype_thingtype_id in", values, "thingandtypeThingtypeId");
            return (Criteria) this;
        }

        public Criteria andThingandtypeThingtypeIdNotIn(List<String> values) {
            addCriterion("thingandtype_thingtype_id not in", values, "thingandtypeThingtypeId");
            return (Criteria) this;
        }

        public Criteria andThingandtypeThingtypeIdBetween(String value1, String value2) {
            addCriterion("thingandtype_thingtype_id between", value1, value2, "thingandtypeThingtypeId");
            return (Criteria) this;
        }

        public Criteria andThingandtypeThingtypeIdNotBetween(String value1, String value2) {
            addCriterion("thingandtype_thingtype_id not between", value1, value2, "thingandtypeThingtypeId");
            return (Criteria) this;
        }

        public Criteria andThingandtypeModiTimeIsNull() {
            addCriterion("thingandtype_modi_time is null");
            return (Criteria) this;
        }

        public Criteria andThingandtypeModiTimeIsNotNull() {
            addCriterion("thingandtype_modi_time is not null");
            return (Criteria) this;
        }

        public Criteria andThingandtypeModiTimeEqualTo(Date value) {
            addCriterion("thingandtype_modi_time =", value, "thingandtypeModiTime");
            return (Criteria) this;
        }

        public Criteria andThingandtypeModiTimeNotEqualTo(Date value) {
            addCriterion("thingandtype_modi_time <>", value, "thingandtypeModiTime");
            return (Criteria) this;
        }

        public Criteria andThingandtypeModiTimeGreaterThan(Date value) {
            addCriterion("thingandtype_modi_time >", value, "thingandtypeModiTime");
            return (Criteria) this;
        }

        public Criteria andThingandtypeModiTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("thingandtype_modi_time >=", value, "thingandtypeModiTime");
            return (Criteria) this;
        }

        public Criteria andThingandtypeModiTimeLessThan(Date value) {
            addCriterion("thingandtype_modi_time <", value, "thingandtypeModiTime");
            return (Criteria) this;
        }

        public Criteria andThingandtypeModiTimeLessThanOrEqualTo(Date value) {
            addCriterion("thingandtype_modi_time <=", value, "thingandtypeModiTime");
            return (Criteria) this;
        }

        public Criteria andThingandtypeModiTimeIn(List<Date> values) {
            addCriterion("thingandtype_modi_time in", values, "thingandtypeModiTime");
            return (Criteria) this;
        }

        public Criteria andThingandtypeModiTimeNotIn(List<Date> values) {
            addCriterion("thingandtype_modi_time not in", values, "thingandtypeModiTime");
            return (Criteria) this;
        }

        public Criteria andThingandtypeModiTimeBetween(Date value1, Date value2) {
            addCriterion("thingandtype_modi_time between", value1, value2, "thingandtypeModiTime");
            return (Criteria) this;
        }

        public Criteria andThingandtypeModiTimeNotBetween(Date value1, Date value2) {
            addCriterion("thingandtype_modi_time not between", value1, value2, "thingandtypeModiTime");
            return (Criteria) this;
        }

        public Criteria andThingandtypeUserCreaterIsNull() {
            addCriterion("thingandtype_user_creater is null");
            return (Criteria) this;
        }

        public Criteria andThingandtypeUserCreaterIsNotNull() {
            addCriterion("thingandtype_user_creater is not null");
            return (Criteria) this;
        }

        public Criteria andThingandtypeUserCreaterEqualTo(String value) {
            addCriterion("thingandtype_user_creater =", value, "thingandtypeUserCreater");
            return (Criteria) this;
        }

        public Criteria andThingandtypeUserCreaterNotEqualTo(String value) {
            addCriterion("thingandtype_user_creater <>", value, "thingandtypeUserCreater");
            return (Criteria) this;
        }

        public Criteria andThingandtypeUserCreaterGreaterThan(String value) {
            addCriterion("thingandtype_user_creater >", value, "thingandtypeUserCreater");
            return (Criteria) this;
        }

        public Criteria andThingandtypeUserCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("thingandtype_user_creater >=", value, "thingandtypeUserCreater");
            return (Criteria) this;
        }

        public Criteria andThingandtypeUserCreaterLessThan(String value) {
            addCriterion("thingandtype_user_creater <", value, "thingandtypeUserCreater");
            return (Criteria) this;
        }

        public Criteria andThingandtypeUserCreaterLessThanOrEqualTo(String value) {
            addCriterion("thingandtype_user_creater <=", value, "thingandtypeUserCreater");
            return (Criteria) this;
        }

        public Criteria andThingandtypeUserCreaterLike(String value) {
            addCriterion("thingandtype_user_creater like", value, "thingandtypeUserCreater");
            return (Criteria) this;
        }

        public Criteria andThingandtypeUserCreaterNotLike(String value) {
            addCriterion("thingandtype_user_creater not like", value, "thingandtypeUserCreater");
            return (Criteria) this;
        }

        public Criteria andThingandtypeUserCreaterIn(List<String> values) {
            addCriterion("thingandtype_user_creater in", values, "thingandtypeUserCreater");
            return (Criteria) this;
        }

        public Criteria andThingandtypeUserCreaterNotIn(List<String> values) {
            addCriterion("thingandtype_user_creater not in", values, "thingandtypeUserCreater");
            return (Criteria) this;
        }

        public Criteria andThingandtypeUserCreaterBetween(String value1, String value2) {
            addCriterion("thingandtype_user_creater between", value1, value2, "thingandtypeUserCreater");
            return (Criteria) this;
        }

        public Criteria andThingandtypeUserCreaterNotBetween(String value1, String value2) {
            addCriterion("thingandtype_user_creater not between", value1, value2, "thingandtypeUserCreater");
            return (Criteria) this;
        }

        public Criteria andThingandtypeUserMasterIsNull() {
            addCriterion("thingandtype_user_master is null");
            return (Criteria) this;
        }

        public Criteria andThingandtypeUserMasterIsNotNull() {
            addCriterion("thingandtype_user_master is not null");
            return (Criteria) this;
        }

        public Criteria andThingandtypeUserMasterEqualTo(String value) {
            addCriterion("thingandtype_user_master =", value, "thingandtypeUserMaster");
            return (Criteria) this;
        }

        public Criteria andThingandtypeUserMasterNotEqualTo(String value) {
            addCriterion("thingandtype_user_master <>", value, "thingandtypeUserMaster");
            return (Criteria) this;
        }

        public Criteria andThingandtypeUserMasterGreaterThan(String value) {
            addCriterion("thingandtype_user_master >", value, "thingandtypeUserMaster");
            return (Criteria) this;
        }

        public Criteria andThingandtypeUserMasterGreaterThanOrEqualTo(String value) {
            addCriterion("thingandtype_user_master >=", value, "thingandtypeUserMaster");
            return (Criteria) this;
        }

        public Criteria andThingandtypeUserMasterLessThan(String value) {
            addCriterion("thingandtype_user_master <", value, "thingandtypeUserMaster");
            return (Criteria) this;
        }

        public Criteria andThingandtypeUserMasterLessThanOrEqualTo(String value) {
            addCriterion("thingandtype_user_master <=", value, "thingandtypeUserMaster");
            return (Criteria) this;
        }

        public Criteria andThingandtypeUserMasterLike(String value) {
            addCriterion("thingandtype_user_master like", value, "thingandtypeUserMaster");
            return (Criteria) this;
        }

        public Criteria andThingandtypeUserMasterNotLike(String value) {
            addCriterion("thingandtype_user_master not like", value, "thingandtypeUserMaster");
            return (Criteria) this;
        }

        public Criteria andThingandtypeUserMasterIn(List<String> values) {
            addCriterion("thingandtype_user_master in", values, "thingandtypeUserMaster");
            return (Criteria) this;
        }

        public Criteria andThingandtypeUserMasterNotIn(List<String> values) {
            addCriterion("thingandtype_user_master not in", values, "thingandtypeUserMaster");
            return (Criteria) this;
        }

        public Criteria andThingandtypeUserMasterBetween(String value1, String value2) {
            addCriterion("thingandtype_user_master between", value1, value2, "thingandtypeUserMaster");
            return (Criteria) this;
        }

        public Criteria andThingandtypeUserMasterNotBetween(String value1, String value2) {
            addCriterion("thingandtype_user_master not between", value1, value2, "thingandtypeUserMaster");
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