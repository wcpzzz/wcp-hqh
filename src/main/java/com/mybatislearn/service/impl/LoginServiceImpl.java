package com.mybatislearn.service.impl;

import com.mybatislearn.core.utils.ExampleBuilder;
import com.mybatislearn.dao.User2Mapper;
import com.mybatislearn.dao.model.User2;
import com.mybatislearn.dao.model.User2Example;
import com.mybatislearn.interceptor.TokenUtil;
import com.mybatislearn.service.LoginService;
import com.mybatislearn.utils.JwtTokenService;
import com.mybatislearn.utils.jwtmodel.JwtInfo;
import com.mybatislearn.utils.jwtmodel.Token;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class LoginServiceImpl implements LoginService<User2> {
    @Autowired
    private User2Mapper user2Mapper;
    /*    @Autowired
        private JwtTokenService jwtTokenService;*/
    @Autowired
    private TokenUtil tokenUtil;

    public Token login(User2 user) {
        ExampleBuilder<User2Example, User2Example.Criteria> builder = ExampleBuilder.create (User2Example.class, User2Example.Criteria.class);
//        就是打包一下
        List<User2> users = user2Mapper.selectByExample (builder.buildExamplePack (user).getExample ());
        if (users.size () > 0) {
/*            //这里进行token加密运算，返回string token
            Token token = new Token();
            //加密
            JwtInfo jwtInfo = new JwtInfo (users.get(0).getUserId ());
            token.setToken (jwtTokenService.generatorToken (jwtInfo));
            System.out.println (token.getToken ());
            return token;*/
            Token token = new Token();
            log.info ("tokentoken");
            token.setToken (tokenUtil.sign (users.get (0)));
            return token;
//            return users.get(0);
        }
        return null;
    }
}
