package com.mybatislearn.dao.model;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

public class User2 {
    @Getter private String userId;

    @Getter private String userName;

    @Getter private String mobile;

    @Getter private String email;

    @Getter private String role;

    @Getter private String userMaster;

    @Getter private String userSlave;

    @Getter @Setter private Date modiTime;

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public void setRole(String role) {
        this.role = role == null ? null : role.trim();
    }

    public void setUserMaster(String userMaster) {
        this.userMaster = userMaster == null ? null : userMaster.trim();
    }

    public void setUserSlave(String userSlave) {
        this.userSlave = userSlave == null ? null : userSlave.trim();
    }

}
