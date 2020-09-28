package com.mybatislearn.dao.model;

import io.swagger.annotations.ApiModelProperty;

public class Wxlogin {
    @ApiModelProperty("uuid字符串")
    private String uuid;

    @ApiModelProperty("用户名")
    private String name;

    @ApiModelProperty("手机号")
    private String phone;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }
}