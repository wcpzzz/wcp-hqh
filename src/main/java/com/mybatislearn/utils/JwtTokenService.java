package com.mybatislearn.utils;

import com.mybatislearn.utils.jwtmodel.JwtInfo;

public interface JwtTokenService {
    String generatorToken(JwtInfo jwtInfo);

    JwtInfo stringInfoFromToken(String token);
}
