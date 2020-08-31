package com.mybatislearn.dao.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andUserMobileIsNull() {
            addCriterion("user_mobile is null");
            return (Criteria) this;
        }

        public Criteria andUserMobileIsNotNull() {
            addCriterion("user_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andUserMobileEqualTo(String value) {
            addCriterion("user_mobile =", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileNotEqualTo(String value) {
            addCriterion("user_mobile <>", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileGreaterThan(String value) {
            addCriterion("user_mobile >", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileGreaterThanOrEqualTo(String value) {
            addCriterion("user_mobile >=", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileLessThan(String value) {
            addCriterion("user_mobile <", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileLessThanOrEqualTo(String value) {
            addCriterion("user_mobile <=", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileLike(String value) {
            addCriterion("user_mobile like", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileNotLike(String value) {
            addCriterion("user_mobile not like", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileIn(List<String> values) {
            addCriterion("user_mobile in", values, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileNotIn(List<String> values) {
            addCriterion("user_mobile not in", values, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileBetween(String value1, String value2) {
            addCriterion("user_mobile between", value1, value2, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileNotBetween(String value1, String value2) {
            addCriterion("user_mobile not between", value1, value2, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserEmailIsNull() {
            addCriterion("user_email is null");
            return (Criteria) this;
        }

        public Criteria andUserEmailIsNotNull() {
            addCriterion("user_email is not null");
            return (Criteria) this;
        }

        public Criteria andUserEmailEqualTo(String value) {
            addCriterion("user_email =", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotEqualTo(String value) {
            addCriterion("user_email <>", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailGreaterThan(String value) {
            addCriterion("user_email >", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailGreaterThanOrEqualTo(String value) {
            addCriterion("user_email >=", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLessThan(String value) {
            addCriterion("user_email <", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLessThanOrEqualTo(String value) {
            addCriterion("user_email <=", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLike(String value) {
            addCriterion("user_email like", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotLike(String value) {
            addCriterion("user_email not like", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailIn(List<String> values) {
            addCriterion("user_email in", values, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotIn(List<String> values) {
            addCriterion("user_email not in", values, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailBetween(String value1, String value2) {
            addCriterion("user_email between", value1, value2, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotBetween(String value1, String value2) {
            addCriterion("user_email not between", value1, value2, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserRoleIsNull() {
            addCriterion("user_role is null");
            return (Criteria) this;
        }

        public Criteria andUserRoleIsNotNull() {
            addCriterion("user_role is not null");
            return (Criteria) this;
        }

        public Criteria andUserRoleEqualTo(String value) {
            addCriterion("user_role =", value, "userRole");
            return (Criteria) this;
        }

        public Criteria andUserRoleNotEqualTo(String value) {
            addCriterion("user_role <>", value, "userRole");
            return (Criteria) this;
        }

        public Criteria andUserRoleGreaterThan(String value) {
            addCriterion("user_role >", value, "userRole");
            return (Criteria) this;
        }

        public Criteria andUserRoleGreaterThanOrEqualTo(String value) {
            addCriterion("user_role >=", value, "userRole");
            return (Criteria) this;
        }

        public Criteria andUserRoleLessThan(String value) {
            addCriterion("user_role <", value, "userRole");
            return (Criteria) this;
        }

        public Criteria andUserRoleLessThanOrEqualTo(String value) {
            addCriterion("user_role <=", value, "userRole");
            return (Criteria) this;
        }

        public Criteria andUserRoleLike(String value) {
            addCriterion("user_role like", value, "userRole");
            return (Criteria) this;
        }

        public Criteria andUserRoleNotLike(String value) {
            addCriterion("user_role not like", value, "userRole");
            return (Criteria) this;
        }

        public Criteria andUserRoleIn(List<String> values) {
            addCriterion("user_role in", values, "userRole");
            return (Criteria) this;
        }

        public Criteria andUserRoleNotIn(List<String> values) {
            addCriterion("user_role not in", values, "userRole");
            return (Criteria) this;
        }

        public Criteria andUserRoleBetween(String value1, String value2) {
            addCriterion("user_role between", value1, value2, "userRole");
            return (Criteria) this;
        }

        public Criteria andUserRoleNotBetween(String value1, String value2) {
            addCriterion("user_role not between", value1, value2, "userRole");
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

        public Criteria andUserModiTimeIsNull() {
            addCriterion("user_modi_time is null");
            return (Criteria) this;
        }

        public Criteria andUserModiTimeIsNotNull() {
            addCriterion("user_modi_time is not null");
            return (Criteria) this;
        }

        public Criteria andUserModiTimeEqualTo(Date value) {
            addCriterion("user_modi_time =", value, "userModiTime");
            return (Criteria) this;
        }

        public Criteria andUserModiTimeNotEqualTo(Date value) {
            addCriterion("user_modi_time <>", value, "userModiTime");
            return (Criteria) this;
        }

        public Criteria andUserModiTimeGreaterThan(Date value) {
            addCriterion("user_modi_time >", value, "userModiTime");
            return (Criteria) this;
        }

        public Criteria andUserModiTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("user_modi_time >=", value, "userModiTime");
            return (Criteria) this;
        }

        public Criteria andUserModiTimeLessThan(Date value) {
            addCriterion("user_modi_time <", value, "userModiTime");
            return (Criteria) this;
        }

        public Criteria andUserModiTimeLessThanOrEqualTo(Date value) {
            addCriterion("user_modi_time <=", value, "userModiTime");
            return (Criteria) this;
        }

        public Criteria andUserModiTimeIn(List<Date> values) {
            addCriterion("user_modi_time in", values, "userModiTime");
            return (Criteria) this;
        }

        public Criteria andUserModiTimeNotIn(List<Date> values) {
            addCriterion("user_modi_time not in", values, "userModiTime");
            return (Criteria) this;
        }

        public Criteria andUserModiTimeBetween(Date value1, Date value2) {
            addCriterion("user_modi_time between", value1, value2, "userModiTime");
            return (Criteria) this;
        }

        public Criteria andUserModiTimeNotBetween(Date value1, Date value2) {
            addCriterion("user_modi_time not between", value1, value2, "userModiTime");
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