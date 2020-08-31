package com.mybatislearn.dao.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ThingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ThingExample() {
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

        public Criteria andThingIdIsNull() {
            addCriterion("thing_id is null");
            return (Criteria) this;
        }

        public Criteria andThingIdIsNotNull() {
            addCriterion("thing_id is not null");
            return (Criteria) this;
        }

        public Criteria andThingIdEqualTo(String value) {
            addCriterion("thing_id =", value, "thingId");
            return (Criteria) this;
        }

        public Criteria andThingIdNotEqualTo(String value) {
            addCriterion("thing_id <>", value, "thingId");
            return (Criteria) this;
        }

        public Criteria andThingIdGreaterThan(String value) {
            addCriterion("thing_id >", value, "thingId");
            return (Criteria) this;
        }

        public Criteria andThingIdGreaterThanOrEqualTo(String value) {
            addCriterion("thing_id >=", value, "thingId");
            return (Criteria) this;
        }

        public Criteria andThingIdLessThan(String value) {
            addCriterion("thing_id <", value, "thingId");
            return (Criteria) this;
        }

        public Criteria andThingIdLessThanOrEqualTo(String value) {
            addCriterion("thing_id <=", value, "thingId");
            return (Criteria) this;
        }

        public Criteria andThingIdLike(String value) {
            addCriterion("thing_id like", value, "thingId");
            return (Criteria) this;
        }

        public Criteria andThingIdNotLike(String value) {
            addCriterion("thing_id not like", value, "thingId");
            return (Criteria) this;
        }

        public Criteria andThingIdIn(List<String> values) {
            addCriterion("thing_id in", values, "thingId");
            return (Criteria) this;
        }

        public Criteria andThingIdNotIn(List<String> values) {
            addCriterion("thing_id not in", values, "thingId");
            return (Criteria) this;
        }

        public Criteria andThingIdBetween(String value1, String value2) {
            addCriterion("thing_id between", value1, value2, "thingId");
            return (Criteria) this;
        }

        public Criteria andThingIdNotBetween(String value1, String value2) {
            addCriterion("thing_id not between", value1, value2, "thingId");
            return (Criteria) this;
        }

        public Criteria andThingNameIsNull() {
            addCriterion("thing_name is null");
            return (Criteria) this;
        }

        public Criteria andThingNameIsNotNull() {
            addCriterion("thing_name is not null");
            return (Criteria) this;
        }

        public Criteria andThingNameEqualTo(String value) {
            addCriterion("thing_name =", value, "thingName");
            return (Criteria) this;
        }

        public Criteria andThingNameNotEqualTo(String value) {
            addCriterion("thing_name <>", value, "thingName");
            return (Criteria) this;
        }

        public Criteria andThingNameGreaterThan(String value) {
            addCriterion("thing_name >", value, "thingName");
            return (Criteria) this;
        }

        public Criteria andThingNameGreaterThanOrEqualTo(String value) {
            addCriterion("thing_name >=", value, "thingName");
            return (Criteria) this;
        }

        public Criteria andThingNameLessThan(String value) {
            addCriterion("thing_name <", value, "thingName");
            return (Criteria) this;
        }

        public Criteria andThingNameLessThanOrEqualTo(String value) {
            addCriterion("thing_name <=", value, "thingName");
            return (Criteria) this;
        }

        public Criteria andThingNameLike(String value) {
            addCriterion("thing_name like", value, "thingName");
            return (Criteria) this;
        }

        public Criteria andThingNameNotLike(String value) {
            addCriterion("thing_name not like", value, "thingName");
            return (Criteria) this;
        }

        public Criteria andThingNameIn(List<String> values) {
            addCriterion("thing_name in", values, "thingName");
            return (Criteria) this;
        }

        public Criteria andThingNameNotIn(List<String> values) {
            addCriterion("thing_name not in", values, "thingName");
            return (Criteria) this;
        }

        public Criteria andThingNameBetween(String value1, String value2) {
            addCriterion("thing_name between", value1, value2, "thingName");
            return (Criteria) this;
        }

        public Criteria andThingNameNotBetween(String value1, String value2) {
            addCriterion("thing_name not between", value1, value2, "thingName");
            return (Criteria) this;
        }

        public Criteria andThingStatusIsNull() {
            addCriterion("thing_status is null");
            return (Criteria) this;
        }

        public Criteria andThingStatusIsNotNull() {
            addCriterion("thing_status is not null");
            return (Criteria) this;
        }

        public Criteria andThingStatusEqualTo(String value) {
            addCriterion("thing_status =", value, "thingStatus");
            return (Criteria) this;
        }

        public Criteria andThingStatusNotEqualTo(String value) {
            addCriterion("thing_status <>", value, "thingStatus");
            return (Criteria) this;
        }

        public Criteria andThingStatusGreaterThan(String value) {
            addCriterion("thing_status >", value, "thingStatus");
            return (Criteria) this;
        }

        public Criteria andThingStatusGreaterThanOrEqualTo(String value) {
            addCriterion("thing_status >=", value, "thingStatus");
            return (Criteria) this;
        }

        public Criteria andThingStatusLessThan(String value) {
            addCriterion("thing_status <", value, "thingStatus");
            return (Criteria) this;
        }

        public Criteria andThingStatusLessThanOrEqualTo(String value) {
            addCriterion("thing_status <=", value, "thingStatus");
            return (Criteria) this;
        }

        public Criteria andThingStatusLike(String value) {
            addCriterion("thing_status like", value, "thingStatus");
            return (Criteria) this;
        }

        public Criteria andThingStatusNotLike(String value) {
            addCriterion("thing_status not like", value, "thingStatus");
            return (Criteria) this;
        }

        public Criteria andThingStatusIn(List<String> values) {
            addCriterion("thing_status in", values, "thingStatus");
            return (Criteria) this;
        }

        public Criteria andThingStatusNotIn(List<String> values) {
            addCriterion("thing_status not in", values, "thingStatus");
            return (Criteria) this;
        }

        public Criteria andThingStatusBetween(String value1, String value2) {
            addCriterion("thing_status between", value1, value2, "thingStatus");
            return (Criteria) this;
        }

        public Criteria andThingStatusNotBetween(String value1, String value2) {
            addCriterion("thing_status not between", value1, value2, "thingStatus");
            return (Criteria) this;
        }

        public Criteria andThingMoneyIsNull() {
            addCriterion("thing_money is null");
            return (Criteria) this;
        }

        public Criteria andThingMoneyIsNotNull() {
            addCriterion("thing_money is not null");
            return (Criteria) this;
        }

        public Criteria andThingMoneyEqualTo(Double value) {
            addCriterion("thing_money =", value, "thingMoney");
            return (Criteria) this;
        }

        public Criteria andThingMoneyNotEqualTo(Double value) {
            addCriterion("thing_money <>", value, "thingMoney");
            return (Criteria) this;
        }

        public Criteria andThingMoneyGreaterThan(Double value) {
            addCriterion("thing_money >", value, "thingMoney");
            return (Criteria) this;
        }

        public Criteria andThingMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("thing_money >=", value, "thingMoney");
            return (Criteria) this;
        }

        public Criteria andThingMoneyLessThan(Double value) {
            addCriterion("thing_money <", value, "thingMoney");
            return (Criteria) this;
        }

        public Criteria andThingMoneyLessThanOrEqualTo(Double value) {
            addCriterion("thing_money <=", value, "thingMoney");
            return (Criteria) this;
        }

        public Criteria andThingMoneyIn(List<Double> values) {
            addCriterion("thing_money in", values, "thingMoney");
            return (Criteria) this;
        }

        public Criteria andThingMoneyNotIn(List<Double> values) {
            addCriterion("thing_money not in", values, "thingMoney");
            return (Criteria) this;
        }

        public Criteria andThingMoneyBetween(Double value1, Double value2) {
            addCriterion("thing_money between", value1, value2, "thingMoney");
            return (Criteria) this;
        }

        public Criteria andThingMoneyNotBetween(Double value1, Double value2) {
            addCriterion("thing_money not between", value1, value2, "thingMoney");
            return (Criteria) this;
        }

        public Criteria andThingNumIsNull() {
            addCriterion("thing_num is null");
            return (Criteria) this;
        }

        public Criteria andThingNumIsNotNull() {
            addCriterion("thing_num is not null");
            return (Criteria) this;
        }

        public Criteria andThingNumEqualTo(Integer value) {
            addCriterion("thing_num =", value, "thingNum");
            return (Criteria) this;
        }

        public Criteria andThingNumNotEqualTo(Integer value) {
            addCriterion("thing_num <>", value, "thingNum");
            return (Criteria) this;
        }

        public Criteria andThingNumGreaterThan(Integer value) {
            addCriterion("thing_num >", value, "thingNum");
            return (Criteria) this;
        }

        public Criteria andThingNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("thing_num >=", value, "thingNum");
            return (Criteria) this;
        }

        public Criteria andThingNumLessThan(Integer value) {
            addCriterion("thing_num <", value, "thingNum");
            return (Criteria) this;
        }

        public Criteria andThingNumLessThanOrEqualTo(Integer value) {
            addCriterion("thing_num <=", value, "thingNum");
            return (Criteria) this;
        }

        public Criteria andThingNumIn(List<Integer> values) {
            addCriterion("thing_num in", values, "thingNum");
            return (Criteria) this;
        }

        public Criteria andThingNumNotIn(List<Integer> values) {
            addCriterion("thing_num not in", values, "thingNum");
            return (Criteria) this;
        }

        public Criteria andThingNumBetween(Integer value1, Integer value2) {
            addCriterion("thing_num between", value1, value2, "thingNum");
            return (Criteria) this;
        }

        public Criteria andThingNumNotBetween(Integer value1, Integer value2) {
            addCriterion("thing_num not between", value1, value2, "thingNum");
            return (Criteria) this;
        }

        public Criteria andThingUserMasterIsNull() {
            addCriterion("thing_user_master is null");
            return (Criteria) this;
        }

        public Criteria andThingUserMasterIsNotNull() {
            addCriterion("thing_user_master is not null");
            return (Criteria) this;
        }

        public Criteria andThingUserMasterEqualTo(String value) {
            addCriterion("thing_user_master =", value, "thingUserMaster");
            return (Criteria) this;
        }

        public Criteria andThingUserMasterNotEqualTo(String value) {
            addCriterion("thing_user_master <>", value, "thingUserMaster");
            return (Criteria) this;
        }

        public Criteria andThingUserMasterGreaterThan(String value) {
            addCriterion("thing_user_master >", value, "thingUserMaster");
            return (Criteria) this;
        }

        public Criteria andThingUserMasterGreaterThanOrEqualTo(String value) {
            addCriterion("thing_user_master >=", value, "thingUserMaster");
            return (Criteria) this;
        }

        public Criteria andThingUserMasterLessThan(String value) {
            addCriterion("thing_user_master <", value, "thingUserMaster");
            return (Criteria) this;
        }

        public Criteria andThingUserMasterLessThanOrEqualTo(String value) {
            addCriterion("thing_user_master <=", value, "thingUserMaster");
            return (Criteria) this;
        }

        public Criteria andThingUserMasterLike(String value) {
            addCriterion("thing_user_master like", value, "thingUserMaster");
            return (Criteria) this;
        }

        public Criteria andThingUserMasterNotLike(String value) {
            addCriterion("thing_user_master not like", value, "thingUserMaster");
            return (Criteria) this;
        }

        public Criteria andThingUserMasterIn(List<String> values) {
            addCriterion("thing_user_master in", values, "thingUserMaster");
            return (Criteria) this;
        }

        public Criteria andThingUserMasterNotIn(List<String> values) {
            addCriterion("thing_user_master not in", values, "thingUserMaster");
            return (Criteria) this;
        }

        public Criteria andThingUserMasterBetween(String value1, String value2) {
            addCriterion("thing_user_master between", value1, value2, "thingUserMaster");
            return (Criteria) this;
        }

        public Criteria andThingUserMasterNotBetween(String value1, String value2) {
            addCriterion("thing_user_master not between", value1, value2, "thingUserMaster");
            return (Criteria) this;
        }

        public Criteria andThingUserOwnerIsNull() {
            addCriterion("thing_user_owner is null");
            return (Criteria) this;
        }

        public Criteria andThingUserOwnerIsNotNull() {
            addCriterion("thing_user_owner is not null");
            return (Criteria) this;
        }

        public Criteria andThingUserOwnerEqualTo(String value) {
            addCriterion("thing_user_owner =", value, "thingUserOwner");
            return (Criteria) this;
        }

        public Criteria andThingUserOwnerNotEqualTo(String value) {
            addCriterion("thing_user_owner <>", value, "thingUserOwner");
            return (Criteria) this;
        }

        public Criteria andThingUserOwnerGreaterThan(String value) {
            addCriterion("thing_user_owner >", value, "thingUserOwner");
            return (Criteria) this;
        }

        public Criteria andThingUserOwnerGreaterThanOrEqualTo(String value) {
            addCriterion("thing_user_owner >=", value, "thingUserOwner");
            return (Criteria) this;
        }

        public Criteria andThingUserOwnerLessThan(String value) {
            addCriterion("thing_user_owner <", value, "thingUserOwner");
            return (Criteria) this;
        }

        public Criteria andThingUserOwnerLessThanOrEqualTo(String value) {
            addCriterion("thing_user_owner <=", value, "thingUserOwner");
            return (Criteria) this;
        }

        public Criteria andThingUserOwnerLike(String value) {
            addCriterion("thing_user_owner like", value, "thingUserOwner");
            return (Criteria) this;
        }

        public Criteria andThingUserOwnerNotLike(String value) {
            addCriterion("thing_user_owner not like", value, "thingUserOwner");
            return (Criteria) this;
        }

        public Criteria andThingUserOwnerIn(List<String> values) {
            addCriterion("thing_user_owner in", values, "thingUserOwner");
            return (Criteria) this;
        }

        public Criteria andThingUserOwnerNotIn(List<String> values) {
            addCriterion("thing_user_owner not in", values, "thingUserOwner");
            return (Criteria) this;
        }

        public Criteria andThingUserOwnerBetween(String value1, String value2) {
            addCriterion("thing_user_owner between", value1, value2, "thingUserOwner");
            return (Criteria) this;
        }

        public Criteria andThingUserOwnerNotBetween(String value1, String value2) {
            addCriterion("thing_user_owner not between", value1, value2, "thingUserOwner");
            return (Criteria) this;
        }

        public Criteria andThingModiTimeIsNull() {
            addCriterion("thing_modi_time is null");
            return (Criteria) this;
        }

        public Criteria andThingModiTimeIsNotNull() {
            addCriterion("thing_modi_time is not null");
            return (Criteria) this;
        }

        public Criteria andThingModiTimeEqualTo(Date value) {
            addCriterion("thing_modi_time =", value, "thingModiTime");
            return (Criteria) this;
        }

        public Criteria andThingModiTimeNotEqualTo(Date value) {
            addCriterion("thing_modi_time <>", value, "thingModiTime");
            return (Criteria) this;
        }

        public Criteria andThingModiTimeGreaterThan(Date value) {
            addCriterion("thing_modi_time >", value, "thingModiTime");
            return (Criteria) this;
        }

        public Criteria andThingModiTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("thing_modi_time >=", value, "thingModiTime");
            return (Criteria) this;
        }

        public Criteria andThingModiTimeLessThan(Date value) {
            addCriterion("thing_modi_time <", value, "thingModiTime");
            return (Criteria) this;
        }

        public Criteria andThingModiTimeLessThanOrEqualTo(Date value) {
            addCriterion("thing_modi_time <=", value, "thingModiTime");
            return (Criteria) this;
        }

        public Criteria andThingModiTimeIn(List<Date> values) {
            addCriterion("thing_modi_time in", values, "thingModiTime");
            return (Criteria) this;
        }

        public Criteria andThingModiTimeNotIn(List<Date> values) {
            addCriterion("thing_modi_time not in", values, "thingModiTime");
            return (Criteria) this;
        }

        public Criteria andThingModiTimeBetween(Date value1, Date value2) {
            addCriterion("thing_modi_time between", value1, value2, "thingModiTime");
            return (Criteria) this;
        }

        public Criteria andThingModiTimeNotBetween(Date value1, Date value2) {
            addCriterion("thing_modi_time not between", value1, value2, "thingModiTime");
            return (Criteria) this;
        }

        public Criteria andThingUserCreaterIsNull() {
            addCriterion("thing_user_creater is null");
            return (Criteria) this;
        }

        public Criteria andThingUserCreaterIsNotNull() {
            addCriterion("thing_user_creater is not null");
            return (Criteria) this;
        }

        public Criteria andThingUserCreaterEqualTo(String value) {
            addCriterion("thing_user_creater =", value, "thingUserCreater");
            return (Criteria) this;
        }

        public Criteria andThingUserCreaterNotEqualTo(String value) {
            addCriterion("thing_user_creater <>", value, "thingUserCreater");
            return (Criteria) this;
        }

        public Criteria andThingUserCreaterGreaterThan(String value) {
            addCriterion("thing_user_creater >", value, "thingUserCreater");
            return (Criteria) this;
        }

        public Criteria andThingUserCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("thing_user_creater >=", value, "thingUserCreater");
            return (Criteria) this;
        }

        public Criteria andThingUserCreaterLessThan(String value) {
            addCriterion("thing_user_creater <", value, "thingUserCreater");
            return (Criteria) this;
        }

        public Criteria andThingUserCreaterLessThanOrEqualTo(String value) {
            addCriterion("thing_user_creater <=", value, "thingUserCreater");
            return (Criteria) this;
        }

        public Criteria andThingUserCreaterLike(String value) {
            addCriterion("thing_user_creater like", value, "thingUserCreater");
            return (Criteria) this;
        }

        public Criteria andThingUserCreaterNotLike(String value) {
            addCriterion("thing_user_creater not like", value, "thingUserCreater");
            return (Criteria) this;
        }

        public Criteria andThingUserCreaterIn(List<String> values) {
            addCriterion("thing_user_creater in", values, "thingUserCreater");
            return (Criteria) this;
        }

        public Criteria andThingUserCreaterNotIn(List<String> values) {
            addCriterion("thing_user_creater not in", values, "thingUserCreater");
            return (Criteria) this;
        }

        public Criteria andThingUserCreaterBetween(String value1, String value2) {
            addCriterion("thing_user_creater between", value1, value2, "thingUserCreater");
            return (Criteria) this;
        }

        public Criteria andThingUserCreaterNotBetween(String value1, String value2) {
            addCriterion("thing_user_creater not between", value1, value2, "thingUserCreater");
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