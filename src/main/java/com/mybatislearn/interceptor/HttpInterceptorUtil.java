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

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        BodyReaderHttpServletRequestWrapper requestWrapper = new BodyReaderHttpServletRequestWrapper (request);
        String contentType = request.getHeader (CONTENT_TYPE);
        String token;

        /**
         * 检查是请求头content-type ，取得token
         */
        if (!ObjectUtils.isEmpty (contentType) && contentType.contains (APPLICATION_JSON)) {
            JSONObject requestJson = JSONObject.parseObject (requestWrapper.getBodyString (request));
            if (requestJson.containsKey ("Sign")) {
                return true;
            } else {
                token = requestJson.getString ("token");
            }
        } else {
            token = requestWrapper.getParameter ("token");
        }
        //这里进行token校验
        if (tokenUtil.verify (token)!=null) {
            request.setAttribute("userId",tokenUtil.verify (token));
            log.info ("tokenyes");
            return true;
        } else {
            log.info (tokenUtil.verify (token)+"tokenno");
            return false;
        }
    }
}
