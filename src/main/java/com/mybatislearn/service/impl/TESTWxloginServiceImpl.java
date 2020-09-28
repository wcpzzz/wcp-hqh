package com.mybatislearn.service.impl;
import com.mybatislearn.core.utils.ExampleBuilder;
import com.mybatislearn.dao.WxloginMapper;
import com.mybatislearn.dao.model.Wxlogin;
import com.mybatislearn.dao.model.WxloginExample;
import com.mybatislearn.interceptor.TokenUtil;
import com.mybatislearn.service.WxloginService;
import com.mybatislearn.utils.jwtmodel.Token;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class TESTWxloginServiceImpl implements WxloginService<Wxlogin> {
//    @Autowired
//    private WxloginMapper wxloginMapper;
//    /*    @Autowired
//        private JwtTokenService jwtTokenService;*/
//    @Autowired
//    private TokenUtil tokenUtil;

    public Token login(Wxlogin wxlogin) {
//        ExampleBuilder<WxloginExample, WxloginExample.Criteria> builder = ExampleBuilder.create (WxloginExample.class, WxloginExample.Criteria.class);
////        就是打包一下
//        List<Wxlogin> wxlogins = wxloginMapper.selectByExample (builder.buildExamplePack (wxlogin).getExample ());
        return null;
    }
}


