package com.mybatislearn.dao.model;

import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

public class User2 {
    @ApiModelProperty("uuid字符串")
    private String userId;

    @ApiModelProperty("用户名")
    private String userName;

    @ApiModelProperty("手机号")
    private String mobile;

    @ApiModelProperty("邮箱")
    private String email;

    @ApiModelProperty("角色（1、终极管理员；2、管理员可以加人，可以改成员，不能改平级管理员；3、成员不能加人）")
    private String role;

    @ApiModelProperty("用户的上级")
    private String userMaster;

    @ApiModelProperty("用户的下属")
    private String userSlave;

    @ApiModelProperty("修改时间")
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
