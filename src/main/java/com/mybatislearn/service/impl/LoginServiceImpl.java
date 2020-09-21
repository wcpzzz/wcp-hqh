package com.mybatislearn.service.impl;
import com.mybatislearn.core.utils.ExampleBuilder;
import com.mybatislearn.dao.UserMapper;
import com.mybatislearn.dao.model.User;
import com.mybatislearn.dao.model.UserExample;
import com.mybatislearn.interceptor.RequestHolder;
import com.mybatislearn.interceptor.TokenUtil;
import com.mybatislearn.service.LoginService;
import com.mybatislearn.utils.jwtmodel.Token;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class LoginServiceImpl implements LoginService<User> {
    @Autowired
    private UserMapper userMapper;
    /*    @Autowired
        private JwtTokenService jwtTokenService;*/
    @Autowired
    private TokenUtil tokenUtil;

    public Token login(User user) {
        ExampleBuilder<UserExample, UserExample.Criteria> builder = ExampleBuilder.create (UserExample.class, UserExample.Criteria.class);
//        就是打包一下
        List<User> users = userMapper.selectByExample (builder.buildExamplePack (user).getExample ());
        if (users.size () > 0) {
/*            //这里进行token加密运算，返回string token
            Token token = new Token();
            //加密
            JwtInfo jwtInfo = new JwtInfo (users.get(0).getUserId ());
            token.setToken (jwtTokenService.generatorToken (jwtInfo));
            System.out.println (token.getToken ());
            return token;*/
            //这里可以把token存入RequestHolder
            Token token = new Token();
            token.setToken (tokenUtil.sign (users.get (0)));
            RequestHolder.add (tokenUtil.sign (users.get (0)));
            return token;
//            return users.get(0);
        }
        return null;
    }
}
