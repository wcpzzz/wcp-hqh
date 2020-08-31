package com.mybatislearn.dao.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.ToString;

import java.util.Date;
@ToString
public class User {
    @ApiModelProperty("uuid字符串")
    private String userId;

    @ApiModelProperty("用户名")
    private String userName;

    @ApiModelProperty("手机号")
    private String userMobile;

    @ApiModelProperty("邮箱")
    private String userEmail;

    @ApiModelProperty("角色（1、终极管理员；2、管理员可以加人，可以改成员，不能改平级管理员；3、成员不能加人）")
    private String userRole;

    @ApiModelProperty("用户的上级")
    private String userMaster;

    @ApiModelProperty("用户的下属")
    private String userSlave;

    @ApiModelProperty("修改时间")
    private Date userModiTime;

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

    public String getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile == null ? null : userMobile.trim();
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole == null ? null : userRole.trim();
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

    public Date getUserModiTime() {
        return userModiTime;
    }

    public void setUserModiTime(Date userModiTime) {
        this.userModiTime = userModiTime;
    }
}
