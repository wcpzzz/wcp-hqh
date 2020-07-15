package com.mybatislearn.dao.model;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

public class User {
    @Getter @Setter private Integer id;

    @Getter private String username;

    @Getter private String password;

    @Getter private String nickname;

    @Getter private String realName;

    @Getter @Setter private Date birthday;

    @Getter @Setter private Byte sex;

    @Getter private String email;

    @Getter private String mobile;

    @Getter @Setter private Date createTime;

    @Getter @Setter private Date updateTime;

    @Getter @Setter private Boolean isDelete;

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

}
