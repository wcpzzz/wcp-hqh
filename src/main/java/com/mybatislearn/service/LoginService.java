package com.mybatislearn.service;

import com.mybatislearn.dao.model.User2;

public interface LoginService<User2> {
    Object login(User2 user);
}
