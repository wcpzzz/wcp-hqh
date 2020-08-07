package com.mybatislearn.utils.jwtmodel;

import io.swagger.annotations.ApiModelProperty;
import lombok.ToString;

@ToString
public class Token {
    @ApiModelProperty("token")
    private String token;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }
}
