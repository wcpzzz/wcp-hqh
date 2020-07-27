package com.mybatislearn.dao.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class User2Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public User2Example() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andRoleIsNull() {
            addCriterion("role is null");
            return (Criteria) this;
        }

        public Criteria andRoleIsNotNull() {
            addCriterion("role is not null");
            return (Criteria) this;
        }

        public Criteria andRoleEqualTo(String value) {
            addCriterion("role =", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotEqualTo(String value) {
            addCriterion("role <>", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleGreaterThan(String value) {
            addCriterion("role >", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleGreaterThanOrEqualTo(String value) {
            addCriterion("role >=", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleLessThan(String value) {
            addCriterion("role <", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleLessThanOrEqualTo(String value) {
            addCriterion("role <=", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleLike(String value) {
            addCriterion("role like", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotLike(String value) {
            addCriterion("role not like", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleIn(List<String> values) {
            addCriterion("role in", values, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotIn(List<String> values) {
            addCriterion("role not in", values, "role");
            return (Criteria) this;
        }

        public Criteria andRoleBetween(String value1, String value2) {
            addCriterion("role between", value1, value2, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotBetween(String value1, String value2) {
            addCriterion("role not between", value1, value2, "role");
            return (Criteria) this;
        }

        public Criteria andUserMasterIsNull() {
            addCriterion("user_master is null");
            return (Criteria) this;
        }

        public Criteria andUserMasterIsNotNull() {
            addCriterion("user_master is not null");
            return (Criteria) this;
        }

        public Criteria andUserMasterEqualTo(String value) {
            addCriterion("user_master =", value, "userMaster");
            return (Criteria) this;
        }

        public Criteria andUserMasterNotEqualTo(String value) {
            addCriterion("user_master <>", value, "userMaster");
            return (Criteria) this;
        }

        public Criteria andUserMasterGreaterThan(String value) {
            addCriterion("user_master >", value, "userMaster");
            return (Criteria) this;
        }

        public Criteria andUserMasterGreaterThanOrEqualTo(String value) {
            addCriterion("user_master >=", value, "userMaster");
            return (Criteria) this;
        }

        public Criteria andUserMasterLessThan(String value) {
            addCriterion("user_master <", value, "userMaster");
            return (Criteria) this;
        }

        public Criteria andUserMasterLessThanOrEqualTo(String value) {
            addCriterion("user_master <=", value, "userMaster");
            return (Criteria) this;
        }

        public Criteria andUserMasterLike(String value) {
            addCriterion("user_master like", value, "userMaster");
            return (Criteria) this;
        }

        public Criteria andUserMasterNotLike(String value) {
            addCriterion("user_master not like", value, "userMaster");
            return (Criteria) this;
        }

        public Criteria andUserMasterIn(List<String> values) {
            addCriterion("user_master in", values, "userMaster");
            return (Criteria) this;
        }

        public Criteria andUserMasterNotIn(List<String> values) {
            addCriterion("user_master not in", values, "userMaster");
            return (Criteria) this;
        }

        public Criteria andUserMasterBetween(String value1, String value2) {
            addCriterion("user_master between", value1, value2, "userMaster");
            return (Criteria) this;
        }

        public Criteria andUserMasterNotBetween(String value1, String value2) {
            addCriterion("user_master not between", value1, value2, "userMaster");
            return (Criteria) this;
        }

        public Criteria andUserSlaveIsNull() {
            addCriterion("user_slave is null");
            return (Criteria) this;
        }

        public Criteria andUserSlaveIsNotNull() {
            addCriterion("user_slave is not null");
            return (Criteria) this;
        }

        public Criteria andUserSlaveEqualTo(String value) {
            addCriterion("user_slave =", value, "userSlave");
            return (Criteria) this;
        }

        public Criteria andUserSlaveNotEqualTo(String value) {
            addCriterion("user_slave <>", value, "userSlave");
            return (Criteria) this;
        }

        public Criteria andUserSlaveGreaterThan(String value) {
            addCriterion("user_slave >", value, "userSlave");
            return (Criteria) this;
        }

        public Criteria andUserSlaveGreaterThanOrEqualTo(String value) {
            addCriterion("user_slave >=", value, "userSlave");
            return (Criteria) this;
        }

        public Criteria andUserSlaveLessThan(String value) {
            addCriterion("user_slave <", value, "userSlave");
            return (Criteria) this;
        }

        public Criteria andUserSlaveLessThanOrEqualTo(String value) {
            addCriterion("user_slave <=", value, "userSlave");
            return (Criteria) this;
        }

        public Criteria andUserSlaveLike(String value) {
            addCriterion("user_slave like", value, "userSlave");
            return (Criteria) this;
        }

        public Criteria andUserSlaveNotLike(String value) {
            addCriterion("user_slave not like", value, "userSlave");
            return (Criteria) this;
        }

        public Criteria andUserSlaveIn(List<String> values) {
            addCriterion("user_slave in", values, "userSlave");
            return (Criteria) this;
        }

        public Criteria andUserSlaveNotIn(List<String> values) {
            addCriterion("user_slave not in", values, "userSlave");
            return (Criteria) this;
        }

        public Criteria andUserSlaveBetween(String value1, String value2) {
            addCriterion("user_slave between", value1, value2, "userSlave");
            return (Criteria) this;
        }

        public Criteria andUserSlaveNotBetween(String value1, String value2) {
            addCriterion("user_slave not between", value1, value2, "userSlave");
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