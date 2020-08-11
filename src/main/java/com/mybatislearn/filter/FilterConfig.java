package com.mybatislearn.filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class FilterConfig {
    @Bean
    public FilterRegistrationBean<MchFilter> registFilter() {
        FilterRegistrationBean<MchFilter> registration = new FilterRegistrationBean<MchFilter> ();
        registration.setFilter(new MchFilter());
        registration.addUrlPatterns("/*");
        registration.setName("MchFilter");
        registration.setOrder(1);
        return registration;

    }
}
