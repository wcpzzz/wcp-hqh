package com.mybatislearn.service;

import com.mybatislearn.utils.jwtmodel.Token;

public interface WxuserService<Wxuser> {
    Token signin(Wxuser user);

    Token signin(String userInfo);
}
