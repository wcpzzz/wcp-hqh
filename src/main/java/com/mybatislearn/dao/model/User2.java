package com.mybatislearn.dao.model;

import java.util.Date;

public class User2 {
    private String userId;

    private String userName;

    private String mobile;

    private String email;

    private String role;

    private String userMaster;

    private String userSlave;

    private Date modiTime;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role == null ? null : role.trim();
    }

    public String getUserMaster() {
        return userMaster;
    }

    public void setUserMaster(String userMaster) {
        this.userMaster = userMaster == null ? null : userMaster.trim();
    }

    public String getUserSlave() {
        return userSlave;
    }

    public void setUserSlave(String userSlave) {
        this.userSlave = userSlave == null ? null : userSlave.trim();
    }

    public Date getModiTime() {
        return modiTime;
    }

    public void setModiTime(Date modiTime) {
        this.modiTime = modiTime;
    }
}
