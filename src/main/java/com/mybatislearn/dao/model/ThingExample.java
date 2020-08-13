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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
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

        public Criteria andMasterIsNull() {
            addCriterion("master is null");
            return (Criteria) this;
        }

        public Criteria andMasterIsNotNull() {
            addCriterion("master is not null");
            return (Criteria) this;
        }

        public Criteria andMasterEqualTo(String value) {
            addCriterion("master =", value, "master");
            return (Criteria) this;
        }

        public Criteria andMasterNotEqualTo(String value) {
            addCriterion("master <>", value, "master");
            return (Criteria) this;
        }

        public Criteria andMasterGreaterThan(String value) {
            addCriterion("master >", value, "master");
            return (Criteria) this;
        }

        public Criteria andMasterGreaterThanOrEqualTo(String value) {
            addCriterion("master >=", value, "master");
            return (Criteria) this;
        }

        public Criteria andMasterLessThan(String value) {
            addCriterion("master <", value, "master");
            return (Criteria) this;
        }

        public Criteria andMasterLessThanOrEqualTo(String value) {
            addCriterion("master <=", value, "master");
            return (Criteria) this;
        }

        public Criteria andMasterLike(String value) {
            addCriterion("master like", value, "master");
            return (Criteria) this;
        }

        public Criteria andMasterNotLike(String value) {
            addCriterion("master not like", value, "master");
            return (Criteria) this;
        }

        public Criteria andMasterIn(List<String> values) {
            addCriterion("master in", values, "master");
            return (Criteria) this;
        }

        public Criteria andMasterNotIn(List<String> values) {
            addCriterion("master not in", values, "master");
            return (Criteria) this;
        }

        public Criteria andMasterBetween(String value1, String value2) {
            addCriterion("master between", value1, value2, "master");
            return (Criteria) this;
        }

        public Criteria andMasterNotBetween(String value1, String value2) {
            addCriterion("master not between", value1, value2, "master");
            return (Criteria) this;
        }

        public Criteria andOwnerIsNull() {
            addCriterion("owner is null");
            return (Criteria) this;
        }

        public Criteria andOwnerIsNotNull() {
            addCriterion("owner is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerEqualTo(String value) {
            addCriterion("owner =", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotEqualTo(String value) {
            addCriterion("owner <>", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerGreaterThan(String value) {
            addCriterion("owner >", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerGreaterThanOrEqualTo(String value) {
            addCriterion("owner >=", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLessThan(String value) {
            addCriterion("owner <", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLessThanOrEqualTo(String value) {
            addCriterion("owner <=", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLike(String value) {
            addCriterion("owner like", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotLike(String value) {
            addCriterion("owner not like", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerIn(List<String> values) {
            addCriterion("owner in", values, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotIn(List<String> values) {
            addCriterion("owner not in", values, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerBetween(String value1, String value2) {
            addCriterion("owner between", value1, value2, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotBetween(String value1, String value2) {
            addCriterion("owner not between", value1, value2, "owner");
            return (Criteria) this;
        }

        public Criteria andModiTimeIsNull() {
            addCriterion("modi_time is null");
            return (Criteria) this;
        }

        public Criteria andModiTimeIsNotNull() {
            addCriterion("modi_time is not null");
            return (Criteria) this;
        }

        public Criteria andModiTimeEqualTo(Date value) {
            addCriterion("modi_time =", value, "modiTime");
            return (Criteria) this;
        }

        public Criteria andModiTimeNotEqualTo(Date value) {
            addCriterion("modi_time <>", value, "modiTime");
            return (Criteria) this;
        }

        public Criteria andModiTimeGreaterThan(Date value) {
            addCriterion("modi_time >", value, "modiTime");
            return (Criteria) this;
        }

        public Criteria andModiTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("modi_time >=", value, "modiTime");
            return (Criteria) this;
        }

        public Criteria andModiTimeLessThan(Date value) {
            addCriterion("modi_time <", value, "modiTime");
            return (Criteria) this;
        }

        public Criteria andModiTimeLessThanOrEqualTo(Date value) {
            addCriterion("modi_time <=", value, "modiTime");
            return (Criteria) this;
        }

        public Criteria andModiTimeIn(List<Date> values) {
            addCriterion("modi_time in", values, "modiTime");
            return (Criteria) this;
        }

        public Criteria andModiTimeNotIn(List<Date> values) {
            addCriterion("modi_time not in", values, "modiTime");
            return (Criteria) this;
        }

        public Criteria andModiTimeBetween(Date value1, Date value2) {
            addCriterion("modi_time between", value1, value2, "modiTime");
            return (Criteria) this;
        }

        public Criteria andModiTimeNotBetween(Date value1, Date value2) {
            addCriterion("modi_time not between", value1, value2, "modiTime");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("creater like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("creater not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("creater not between", value1, value2, "creater");
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