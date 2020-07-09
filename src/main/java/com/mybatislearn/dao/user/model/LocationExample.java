package com.mybatislearn.dao.user.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LocationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LocationExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andLocationNameIsNull() {
            addCriterion("location_name is null");
            return (Criteria) this;
        }

        public Criteria andLocationNameIsNotNull() {
            addCriterion("location_name is not null");
            return (Criteria) this;
        }

        public Criteria andLocationNameEqualTo(String value) {
            addCriterion("location_name =", value, "locationName");
            return (Criteria) this;
        }

        public Criteria andLocationNameNotEqualTo(String value) {
            addCriterion("location_name <>", value, "locationName");
            return (Criteria) this;
        }

        public Criteria andLocationNameGreaterThan(String value) {
            addCriterion("location_name >", value, "locationName");
            return (Criteria) this;
        }

        public Criteria andLocationNameGreaterThanOrEqualTo(String value) {
            addCriterion("location_name >=", value, "locationName");
            return (Criteria) this;
        }

        public Criteria andLocationNameLessThan(String value) {
            addCriterion("location_name <", value, "locationName");
            return (Criteria) this;
        }

        public Criteria andLocationNameLessThanOrEqualTo(String value) {
            addCriterion("location_name <=", value, "locationName");
            return (Criteria) this;
        }

        public Criteria andLocationNameLike(String value) {
            addCriterion("location_name like", value, "locationName");
            return (Criteria) this;
        }

        public Criteria andLocationNameNotLike(String value) {
            addCriterion("location_name not like", value, "locationName");
            return (Criteria) this;
        }

        public Criteria andLocationNameIn(List<String> values) {
            addCriterion("location_name in", values, "locationName");
            return (Criteria) this;
        }

        public Criteria andLocationNameNotIn(List<String> values) {
            addCriterion("location_name not in", values, "locationName");
            return (Criteria) this;
        }

        public Criteria andLocationNameBetween(String value1, String value2) {
            addCriterion("location_name between", value1, value2, "locationName");
            return (Criteria) this;
        }

        public Criteria andLocationNameNotBetween(String value1, String value2) {
            addCriterion("location_name not between", value1, value2, "locationName");
            return (Criteria) this;
        }

        public Criteria andLocationMemoIsNull() {
            addCriterion("location_memo is null");
            return (Criteria) this;
        }

        public Criteria andLocationMemoIsNotNull() {
            addCriterion("location_memo is not null");
            return (Criteria) this;
        }

        public Criteria andLocationMemoEqualTo(String value) {
            addCriterion("location_memo =", value, "locationMemo");
            return (Criteria) this;
        }

        public Criteria andLocationMemoNotEqualTo(String value) {
            addCriterion("location_memo <>", value, "locationMemo");
            return (Criteria) this;
        }

        public Criteria andLocationMemoGreaterThan(String value) {
            addCriterion("location_memo >", value, "locationMemo");
            return (Criteria) this;
        }

        public Criteria andLocationMemoGreaterThanOrEqualTo(String value) {
            addCriterion("location_memo >=", value, "locationMemo");
            return (Criteria) this;
        }

        public Criteria andLocationMemoLessThan(String value) {
            addCriterion("location_memo <", value, "locationMemo");
            return (Criteria) this;
        }

        public Criteria andLocationMemoLessThanOrEqualTo(String value) {
            addCriterion("location_memo <=", value, "locationMemo");
            return (Criteria) this;
        }

        public Criteria andLocationMemoLike(String value) {
            addCriterion("location_memo like", value, "locationMemo");
            return (Criteria) this;
        }

        public Criteria andLocationMemoNotLike(String value) {
            addCriterion("location_memo not like", value, "locationMemo");
            return (Criteria) this;
        }

        public Criteria andLocationMemoIn(List<String> values) {
            addCriterion("location_memo in", values, "locationMemo");
            return (Criteria) this;
        }

        public Criteria andLocationMemoNotIn(List<String> values) {
            addCriterion("location_memo not in", values, "locationMemo");
            return (Criteria) this;
        }

        public Criteria andLocationMemoBetween(String value1, String value2) {
            addCriterion("location_memo between", value1, value2, "locationMemo");
            return (Criteria) this;
        }

        public Criteria andLocationMemoNotBetween(String value1, String value2) {
            addCriterion("location_memo not between", value1, value2, "locationMemo");
            return (Criteria) this;
        }

        public Criteria andLocationMasterIsNull() {
            addCriterion("location_master is null");
            return (Criteria) this;
        }

        public Criteria andLocationMasterIsNotNull() {
            addCriterion("location_master is not null");
            return (Criteria) this;
        }

        public Criteria andLocationMasterEqualTo(String value) {
            addCriterion("location_master =", value, "locationMaster");
            return (Criteria) this;
        }

        public Criteria andLocationMasterNotEqualTo(String value) {
            addCriterion("location_master <>", value, "locationMaster");
            return (Criteria) this;
        }

        public Criteria andLocationMasterGreaterThan(String value) {
            addCriterion("location_master >", value, "locationMaster");
            return (Criteria) this;
        }

        public Criteria andLocationMasterGreaterThanOrEqualTo(String value) {
            addCriterion("location_master >=", value, "locationMaster");
            return (Criteria) this;
        }

        public Criteria andLocationMasterLessThan(String value) {
            addCriterion("location_master <", value, "locationMaster");
            return (Criteria) this;
        }

        public Criteria andLocationMasterLessThanOrEqualTo(String value) {
            addCriterion("location_master <=", value, "locationMaster");
            return (Criteria) this;
        }

        public Criteria andLocationMasterLike(String value) {
            addCriterion("location_master like", value, "locationMaster");
            return (Criteria) this;
        }

        public Criteria andLocationMasterNotLike(String value) {
            addCriterion("location_master not like", value, "locationMaster");
            return (Criteria) this;
        }

        public Criteria andLocationMasterIn(List<String> values) {
            addCriterion("location_master in", values, "locationMaster");
            return (Criteria) this;
        }

        public Criteria andLocationMasterNotIn(List<String> values) {
            addCriterion("location_master not in", values, "locationMaster");
            return (Criteria) this;
        }

        public Criteria andLocationMasterBetween(String value1, String value2) {
            addCriterion("location_master between", value1, value2, "locationMaster");
            return (Criteria) this;
        }

        public Criteria andLocationMasterNotBetween(String value1, String value2) {
            addCriterion("location_master not between", value1, value2, "locationMaster");
            return (Criteria) this;
        }

        public Criteria andLocationSlaveIsNull() {
            addCriterion("location_slave is null");
            return (Criteria) this;
        }

        public Criteria andLocationSlaveIsNotNull() {
            addCriterion("location_slave is not null");
            return (Criteria) this;
        }

        public Criteria andLocationSlaveEqualTo(String value) {
            addCriterion("location_slave =", value, "locationSlave");
            return (Criteria) this;
        }

        public Criteria andLocationSlaveNotEqualTo(String value) {
            addCriterion("location_slave <>", value, "locationSlave");
            return (Criteria) this;
        }

        public Criteria andLocationSlaveGreaterThan(String value) {
            addCriterion("location_slave >", value, "locationSlave");
            return (Criteria) this;
        }

        public Criteria andLocationSlaveGreaterThanOrEqualTo(String value) {
            addCriterion("location_slave >=", value, "locationSlave");
            return (Criteria) this;
        }

        public Criteria andLocationSlaveLessThan(String value) {
            addCriterion("location_slave <", value, "locationSlave");
            return (Criteria) this;
        }

        public Criteria andLocationSlaveLessThanOrEqualTo(String value) {
            addCriterion("location_slave <=", value, "locationSlave");
            return (Criteria) this;
        }

        public Criteria andLocationSlaveLike(String value) {
            addCriterion("location_slave like", value, "locationSlave");
            return (Criteria) this;
        }

        public Criteria andLocationSlaveNotLike(String value) {
            addCriterion("location_slave not like", value, "locationSlave");
            return (Criteria) this;
        }

        public Criteria andLocationSlaveIn(List<String> values) {
            addCriterion("location_slave in", values, "locationSlave");
            return (Criteria) this;
        }

        public Criteria andLocationSlaveNotIn(List<String> values) {
            addCriterion("location_slave not in", values, "locationSlave");
            return (Criteria) this;
        }

        public Criteria andLocationSlaveBetween(String value1, String value2) {
            addCriterion("location_slave between", value1, value2, "locationSlave");
            return (Criteria) this;
        }

        public Criteria andLocationSlaveNotBetween(String value1, String value2) {
            addCriterion("location_slave not between", value1, value2, "locationSlave");
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