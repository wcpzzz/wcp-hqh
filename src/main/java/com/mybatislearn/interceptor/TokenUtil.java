package com.mybatislearn.interceptor;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.mybatislearn.dao.model.User;
import com.mybatislearn.dao.model.Wxuser;
import org.springframework.stereotype.Service;

import java.util.Date;
@Service
public class TokenUtil {

    private static final long EXPIRE_TIME= 15*60*1000;
    private static final String TOKEN_SECRET="token123";  //密钥盐


/**
     * 签名生成
     * @param User
     * @return
     */

    public static String sign(User user){

        String token = null;
        try {
            Date expiresAt = new Date(System.currentTimeMillis() + EXPIRE_TIME);
            token = JWT.create()
                    .withIssuer("auth0")
                    .withClaim("userName", user.getUserName ())
                    .withClaim("userId", user.getUserId ())
                    .withExpiresAt(expiresAt)
                    // 使用了HMAC256加密算法。
                    .sign(Algorithm.HMAC256(TOKEN_SECRET));
        } catch (Exception e){
            e.printStackTrace();
        }
        return token;

    }

    // 使用name和id进行数字签名，并返回token
    public static String sign(Wxuser user){

        String token = null;
        try {
            Date expiresAt = new Date(System.currentTimeMillis() + EXPIRE_TIME);
            token = JWT.create()
                    .withIssuer("auth0")
                    .withClaim("userName", user.getUserName ())
                    .withClaim("userId", user.getUserId ())
                    .withExpiresAt(expiresAt)
                    // 使用了HMAC256加密算法。
                    .sign(Algorithm.HMAC256(TOKEN_SECRET));
        } catch (Exception e){
            e.printStackTrace();
        }
        return token;

    }


    /**
     * 签名验证
     * @param token
     * @return*/


    public static DecodedJWT verify(String token){
        try {
            JWTVerifier verifier = JWT.require(Algorithm.HMAC256(TOKEN_SECRET)).withIssuer("auth0").build();
            DecodedJWT jwt = verifier.verify(token);
            System.out.println("认证通过：");
            System.out.println("issuer: " + jwt.getIssuer());
            System.out.println("username: " + jwt.getClaim("userName").asString());
            System.out.println("userId: " + jwt.getClaim("userId").asString());
            System.out.println("过期时间：      " + jwt.getExpiresAt());
            //暂时先验了一个，返回个string，后期要验多个的话，就返回json
//            return jwt.getClaim("userId").asString();
//            System.out.println (jwt.getClaims().get("userName").asString());
            return jwt;
//            return true;
        } catch (Exception e){
            return null;
        }

    }



}
