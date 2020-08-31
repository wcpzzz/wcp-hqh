package com.mybatislearn.dao.model;

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

        public Criteria andLocationIdIsNull() {
            addCriterion("location_id is null");
            return (Criteria) this;
        }

        public Criteria andLocationIdIsNotNull() {
            addCriterion("location_id is not null");
            return (Criteria) this;
        }

        public Criteria andLocationIdEqualTo(String value) {
            addCriterion("location_id =", value, "locationId");
            return (Criteria) this;
        }

        public Criteria andLocationIdNotEqualTo(String value) {
            addCriterion("location_id <>", value, "locationId");
            return (Criteria) this;
        }

        public Criteria andLocationIdGreaterThan(String value) {
            addCriterion("location_id >", value, "locationId");
            return (Criteria) this;
        }

        public Criteria andLocationIdGreaterThanOrEqualTo(String value) {
            addCriterion("location_id >=", value, "locationId");
            return (Criteria) this;
        }

        public Criteria andLocationIdLessThan(String value) {
            addCriterion("location_id <", value, "locationId");
            return (Criteria) this;
        }

        public Criteria andLocationIdLessThanOrEqualTo(String value) {
            addCriterion("location_id <=", value, "locationId");
            return (Criteria) this;
        }

        public Criteria andLocationIdLike(String value) {
            addCriterion("location_id like", value, "locationId");
            return (Criteria) this;
        }

        public Criteria andLocationIdNotLike(String value) {
            addCriterion("location_id not like", value, "locationId");
            return (Criteria) this;
        }

        public Criteria andLocationIdIn(List<String> values) {
            addCriterion("location_id in", values, "locationId");
            return (Criteria) this;
        }

        public Criteria andLocationIdNotIn(List<String> values) {
            addCriterion("location_id not in", values, "locationId");
            return (Criteria) this;
        }

        public Criteria andLocationIdBetween(String value1, String value2) {
            addCriterion("location_id between", value1, value2, "locationId");
            return (Criteria) this;
        }

        public Criteria andLocationIdNotBetween(String value1, String value2) {
            addCriterion("location_id not between", value1, value2, "locationId");
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

        public Criteria andLocationModiTimeIsNull() {
            addCriterion("location_modi_time is null");
            return (Criteria) this;
        }

        public Criteria andLocationModiTimeIsNotNull() {
            addCriterion("location_modi_time is not null");
            return (Criteria) this;
        }

        public Criteria andLocationModiTimeEqualTo(Date value) {
            addCriterion("location_modi_time =", value, "locationModiTime");
            return (Criteria) this;
        }

        public Criteria andLocationModiTimeNotEqualTo(Date value) {
            addCriterion("location_modi_time <>", value, "locationModiTime");
            return (Criteria) this;
        }

        public Criteria andLocationModiTimeGreaterThan(Date value) {
            addCriterion("location_modi_time >", value, "locationModiTime");
            return (Criteria) this;
        }

        public Criteria andLocationModiTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("location_modi_time >=", value, "locationModiTime");
            return (Criteria) this;
        }

        public Criteria andLocationModiTimeLessThan(Date value) {
            addCriterion("location_modi_time <", value, "locationModiTime");
            return (Criteria) this;
        }

        public Criteria andLocationModiTimeLessThanOrEqualTo(Date value) {
            addCriterion("location_modi_time <=", value, "locationModiTime");
            return (Criteria) this;
        }

        public Criteria andLocationModiTimeIn(List<Date> values) {
            addCriterion("location_modi_time in", values, "locationModiTime");
            return (Criteria) this;
        }

        public Criteria andLocationModiTimeNotIn(List<Date> values) {
            addCriterion("location_modi_time not in", values, "locationModiTime");
            return (Criteria) this;
        }

        public Criteria andLocationModiTimeBetween(Date value1, Date value2) {
            addCriterion("location_modi_time between", value1, value2, "locationModiTime");
            return (Criteria) this;
        }

        public Criteria andLocationModiTimeNotBetween(Date value1, Date value2) {
            addCriterion("location_modi_time not between", value1, value2, "locationModiTime");
            return (Criteria) this;
        }

        public Criteria andLocationUserCreaterIsNull() {
            addCriterion("location_user_creater is null");
            return (Criteria) this;
        }

        public Criteria andLocationUserCreaterIsNotNull() {
            addCriterion("location_user_creater is not null");
            return (Criteria) this;
        }

        public Criteria andLocationUserCreaterEqualTo(String value) {
            addCriterion("location_user_creater =", value, "locationUserCreater");
            return (Criteria) this;
        }

        public Criteria andLocationUserCreaterNotEqualTo(String value) {
            addCriterion("location_user_creater <>", value, "locationUserCreater");
            return (Criteria) this;
        }

        public Criteria andLocationUserCreaterGreaterThan(String value) {
            addCriterion("location_user_creater >", value, "locationUserCreater");
            return (Criteria) this;
        }

        public Criteria andLocationUserCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("location_user_creater >=", value, "locationUserCreater");
            return (Criteria) this;
        }

        public Criteria andLocationUserCreaterLessThan(String value) {
            addCriterion("location_user_creater <", value, "locationUserCreater");
            return (Criteria) this;
        }

        public Criteria andLocationUserCreaterLessThanOrEqualTo(String value) {
            addCriterion("location_user_creater <=", value, "locationUserCreater");
            return (Criteria) this;
        }

        public Criteria andLocationUserCreaterLike(String value) {
            addCriterion("location_user_creater like", value, "locationUserCreater");
            return (Criteria) this;
        }

        public Criteria andLocationUserCreaterNotLike(String value) {
            addCriterion("location_user_creater not like", value, "locationUserCreater");
            return (Criteria) this;
        }

        public Criteria andLocationUserCreaterIn(List<String> values) {
            addCriterion("location_user_creater in", values, "locationUserCreater");
            return (Criteria) this;
        }

        public Criteria andLocationUserCreaterNotIn(List<String> values) {
            addCriterion("location_user_creater not in", values, "locationUserCreater");
            return (Criteria) this;
        }

        public Criteria andLocationUserCreaterBetween(String value1, String value2) {
            addCriterion("location_user_creater between", value1, value2, "locationUserCreater");
            return (Criteria) this;
        }

        public Criteria andLocationUserCreaterNotBetween(String value1, String value2) {
            addCriterion("location_user_creater not between", value1, value2, "locationUserCreater");
            return (Criteria) this;
        }

        public Criteria andLocationUserMasterIsNull() {
            addCriterion("location_user_master is null");
            return (Criteria) this;
        }

        public Criteria andLocationUserMasterIsNotNull() {
            addCriterion("location_user_master is not null");
            return (Criteria) this;
        }

        public Criteria andLocationUserMasterEqualTo(String value) {
            addCriterion("location_user_master =", value, "locationUserMaster");
            return (Criteria) this;
        }

        public Criteria andLocationUserMasterNotEqualTo(String value) {
            addCriterion("location_user_master <>", value, "locationUserMaster");
            return (Criteria) this;
        }

        public Criteria andLocationUserMasterGreaterThan(String value) {
            addCriterion("location_user_master >", value, "locationUserMaster");
            return (Criteria) this;
        }

        public Criteria andLocationUserMasterGreaterThanOrEqualTo(String value) {
            addCriterion("location_user_master >=", value, "locationUserMaster");
            return (Criteria) this;
        }

        public Criteria andLocationUserMasterLessThan(String value) {
            addCriterion("location_user_master <", value, "locationUserMaster");
            return (Criteria) this;
        }

        public Criteria andLocationUserMasterLessThanOrEqualTo(String value) {
            addCriterion("location_user_master <=", value, "locationUserMaster");
            return (Criteria) this;
        }

        public Criteria andLocationUserMasterLike(String value) {
            addCriterion("location_user_master like", value, "locationUserMaster");
            return (Criteria) this;
        }

        public Criteria andLocationUserMasterNotLike(String value) {
            addCriterion("location_user_master not like", value, "locationUserMaster");
            return (Criteria) this;
        }

        public Criteria andLocationUserMasterIn(List<String> values) {
            addCriterion("location_user_master in", values, "locationUserMaster");
            return (Criteria) this;
        }

        public Criteria andLocationUserMasterNotIn(List<String> values) {
            addCriterion("location_user_master not in", values, "locationUserMaster");
            return (Criteria) this;
        }

        public Criteria andLocationUserMasterBetween(String value1, String value2) {
            addCriterion("location_user_master between", value1, value2, "locationUserMaster");
            return (Criteria) this;
        }

        public Criteria andLocationUserMasterNotBetween(String value1, String value2) {
            addCriterion("location_user_master not between", value1, value2, "locationUserMaster");
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