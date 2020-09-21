package com.mybatislearn.service;

import com.mybatislearn.utils.jwtmodel.Token;

public interface LoginService<User2> {
    Token login(User2 user);
}
