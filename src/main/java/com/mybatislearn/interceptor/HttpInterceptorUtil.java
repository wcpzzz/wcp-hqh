/*
package com.mybatislearn.interceptor;

import com.alibaba.fastjson.JSONObject;
import com.mybatislearn.filter.BodyReaderHttpServletRequestWrapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;


@Slf4j
@Component
public class HttpInterceptorUtil implements HandlerInterceptor {
    private static final String CONTENT_TYPE = "content-type";
    private static final String APPLICATION_JSON = "application/json";
    private static final String DEFAULT = "application/x-www-form-urlencoded";

    @Autowired
    private TokenUtil tokenUtil;
*/
/*    @Autowired
    private RequestHolder requestHolder;*//*

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        BodyReaderHttpServletRequestWrapper requestWrapper = new BodyReaderHttpServletRequestWrapper (request);
        String contentType = request.getHeader (CONTENT_TYPE);
        String token;
        JSONObject requestJson = JSONObject.parseObject (requestWrapper.getBodyString (request));
        */
/**
         * 检查是请求头content-type ，取得token
         *//*

        if (!ObjectUtils.isEmpty (contentType) && contentType.contains (APPLICATION_JSON)) {
            if (requestJson.containsKey ("Sign")) {
                return true;
            } else {
                token = requestJson.getString ("token");
            }
        } else {
            token = requestWrapper.getParameter ("token");
        }
        //这里进行token校验，输出没有过的请求路径
        if (tokenUtil.verify (token)!=null) {
//            requestJson.put("creater",tokenUtil.verify (token));
            RequestHolder.add (tokenUtil.verify (token));
            return true;
        } else {
            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            response.setCharacterEncoding("UTF-8");
            response.setContentType("application/json; charset=utf-8");
            JSONObject res = new JSONObject();
            res.put("success","-1");
            res.put("msg","去登陆吧");
            PrintWriter out = null ;
            out = response.getWriter();
            out.write(res.toString());
            out.flush();
            out.close();
            return false;
        }
    }
}
*/
