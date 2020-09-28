package com.mybatislearn.dao.model;

import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

public class Wxuser {
    @ApiModelProperty("用户ID")
    private String userId;

    @ApiModelProperty("用户名")
    private String userName;

    @ApiModelProperty("手机号")
    private Integer userPhoneNumber;

    @ApiModelProperty("创建时间")
    private Date userCretime;

    @ApiModelProperty("修改时间")
    private Date userModitime;

    @ApiModelProperty("加密后的密码")
    private String userPassword;

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

    public Integer getUserPhoneNumber() {
        return userPhoneNumber;
    }

    public void setUserPhoneNumber(Integer userPhoneNumber) {
        this.userPhoneNumber = userPhoneNumber;
    }

    public Date getUserCretime() {
        return userCretime;
    }

    public void setUserCretime(Date userCretime) {
        this.userCretime = userCretime;
    }

    public Date getUserModitime() {
        return userModitime;
    }

    public void setUserModitime(Date userModitime) {
        this.userModitime = userModitime;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }
}