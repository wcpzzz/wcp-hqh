package com.mybatislearn.utils;

import com.mybatislearn.utils.jwtmodel.JwtInfo;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.joda.time.DateTime;

import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;
import java.security.Key;

/**
 * @author: huangyibo
 * @Date: 2019/1/13 22:37
 * @Description: 生成token的工具类
 */
public class JwtTokenUtils {

    private static Key getKeyInstance(){
        SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.HS256;
        byte[] bytes = DatatypeConverter.parseBase64Binary("mall-user");
        return new SecretKeySpec(bytes,signatureAlgorithm.getJcaName());
    }

    /**
     * 生成token的方法
     * @param jwtInfo
     * @param expire
     * @return
     */
    public static String generatorToken(JwtInfo jwtInfo, int expire){
        return Jwts.builder().claim(JwtConstants.JWT_KEY_USER_ID,jwtInfo.getUid())
                .setExpiration(DateTime.now().plusSeconds(expire).toDate())
                .signWith(SignatureAlgorithm.HS256,getKeyInstance()).compact();
    }

    /**
     * 根据token获取token中的信息
     * @param token
     * @return
     */
    public static JwtInfo getTokenInfo(String token){
        Jws<Claims> claimsJws = Jwts.parser().setSigningKey(getKeyInstance()).parseClaimsJws(token);
        Claims claims = claimsJws.getBody();
        return new JwtInfo(claims.get(JwtConstants.JWT_KEY_USER_ID).toString());
    }
}
