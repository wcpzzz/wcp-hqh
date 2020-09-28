package com.mybatislearn.service.impl;
import com.mybatislearn.core.utils.ExampleBuilder;
import com.mybatislearn.dao.UserMapper;
import com.mybatislearn.dao.WxloginMapper;
import com.mybatislearn.dao.WxuserMapper;
import com.mybatislearn.dao.model.User;
import com.mybatislearn.dao.model.UserExample;
import com.mybatislearn.dao.model.Wxuser;
import com.mybatislearn.dao.model.WxuserExample;
import com.mybatislearn.interceptor.RequestHolder;
import com.mybatislearn.interceptor.TokenUtil;
import com.mybatislearn.service.LoginService;
import com.mybatislearn.service.WxuserService;
import com.mybatislearn.utils.hqhutils.AesUtils;
import com.mybatislearn.utils.jwtmodel.Token;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class MoreWxuserServiceImpl implements WxuserService<Wxuser> {
    @Autowired
    private WxuserMapper wxuserMapper;
    /*    @Autowired
        private JwtTokenService jwtTokenService;*/
    @Autowired
    private TokenUtil tokenUtil;

    // TODO 用手机号登录
    public Token signin(Wxuser user) {
        String name = user.getUserName();
        String password = user.getUserPassword();
        user.setUserPassword(null);

        ExampleBuilder<WxuserExample, WxuserExample.Criteria> builder = ExampleBuilder.create (WxuserExample.class, WxuserExample.Criteria.class);
        List<Wxuser> users = wxuserMapper.selectByExample (builder.buildExamplePack (user).getExample ());
        if (users.size () > 0) {
            Wxuser _t = users.get(0);
            String _uid = _t.getUserId();
            String _name = _t.getUserName();
            String _password = _t.getUserPassword();
            String key = _uid;

            System.out.println("passworddd: " + _password);
            System.out.println("key: " + key);

            String res = AesUtils.aesDecrypt(_password, key);
            // 先验证用户名和密码的正确性，当正确再给token
            if (name.equals(_name) && password.equals(res)) {
                System.out.println("匹配");
                Token token = new Token();
                // 使用整个user来签名
                token.setToken (tokenUtil.sign (_t));
                RequestHolder.add (tokenUtil.sign (_t));
                return token;
            }
            System.out.println("不匹配");
        }
        return null;
    }


    public Token signin(String userInfo) {

        return null;
    }

}




