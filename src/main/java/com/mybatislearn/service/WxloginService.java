package com.mybatislearn.service;

import com.mybatislearn.utils.jwtmodel.Token;

public interface WxloginService<Wxlogin> {
    Token login(Wxlogin user);
}
