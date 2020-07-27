package com.mybatislearn.filters;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class FilterConfig {
    @Bean
    public FilterRegistrationBean<MchFilter> registFilter() {
        FilterRegistrationBean<MchFilter> registration = new FilterRegistrationBean<MchFilter>();
        registration.setFilter(new MchFilter());//注册自定义过滤器
        registration.addUrlPatterns("/*");//过滤所有路径
        registration.setName("MchFilter");//过滤器名称
        registration.setOrder(1);//优先级，最顶级
        return registration;

    }
}
