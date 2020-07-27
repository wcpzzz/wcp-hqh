package com.mybatislearn.utils;

import com.mybatislearn.utils.jwtmodel.JwtInfo;
import org.springframework.stereotype.Component;

@Component
public class JwtTokenServiceImpl implements JwtTokenService{

    /**
     * token过期时间
     */
    private int expire = 6000;

    public String generatorToken(JwtInfo jwtInfo){
//        加密
        return JwtTokenUtils.generatorToken(jwtInfo,expire);
    }

    public JwtInfo stringInfoFromToken(String token){
//        解密
        return JwtTokenUtils.getTokenInfo(token);
    }
}
