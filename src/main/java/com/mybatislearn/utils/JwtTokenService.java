package com.mybatislearn.utils;

import com.mybatislearn.utils.jwtmodel.JwtInfo;

public interface JwtTokenService {

    //加密
    String generatorToken(JwtInfo jwtInfo);
    //解密
    JwtInfo stringInfoFromToken(String token);
}
