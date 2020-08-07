//package com.mybatislearn.interceptor;
//
//import cn.hutool.core.bean.BeanUtil;
//import com.alibaba.fastjson.serializer.SerializerFeature;
//import com.alibaba.fastjson.support.config.FastJsonConfig;
//import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
//import com.sssoft.common.response.CommonResult;
//import com.sssoft.dzsj.api.interceptor.AuthInterceptor;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.web.servlet.error.DefaultErrorAttributes;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.Ordered;
//import org.springframework.http.MediaType;
//import org.springframework.http.converter.HttpMessageConverter;
//import org.springframework.http.converter.StringHttpMessageConverter;
//import org.springframework.stereotype.Component;
//import org.springframework.web.context.request.WebRequest;
//import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
//import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
//import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
//
//import java.nio.charset.Charset;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.Map;
//
///**
// * @author Sun
// * @date:10:41 2019/11/27
// * @description: mvc配置
// */
//@Configuration
//@Slf4j
//public class MvcConfig extends WebMvcConfigurationSupport {
//    /**
//     * 配置拦截器
//     * @param registry
//     */
//
//    @Override
//    protected void addInterceptors(InterceptorRegistry registry) {
//        super.addInterceptors(registry);
//        //拦截
//        registry.addInterceptor(authInterceptor())
//                .addPathPatterns(Arrays.asList("/user/online"
//                        ))
//                .excludePathPatterns("/**/*.css", "/**/*.js", "/**/*.png", "/**/*.jpg", "/**/*.jpeg", "/*.html", "/**/*.html","/swagger-ui.html#!","/swagger-resources/**")
//                .excludePathPatterns(Arrays.asList("/user/LoginService"));//不拦截登录和其他
//    }
//    @Bean
//    public AuthInterceptor authInterceptor() {
//        return new AuthInterceptor();
//    }
//    /**
//     * 定制化返回异常信息
//     */
//    @Override
//    public void addViewControllers(ViewControllerRegistry registry) {
//        System.out.println("设置了主页");
//        //设置主页
//        registry.addViewController("/").setViewName("index.html");
//        //设置优先级
//        registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
//        //将主页注册器添加到视图控制器中
//        super.addViewControllers(registry);
//    }
//
//    @Component
//    public class ErrorAttributes extends DefaultErrorAttributes {
//        @Override
//        public Map<String, Object> getErrorAttributes(WebRequest webRequest, boolean includeStackTrace) {
//            Map<String, Object> errorAttributes = super.getErrorAttributes(webRequest, includeStackTrace);
//            Integer status= (Integer) errorAttributes.get("status");
//
//            Map<String, Object> map = BeanUtil.beanToMap(CommonResult.failed(status.toString(),errorAttributes.get("status")+"请求异常!请稍后再试"));
//            return map;
//        }
//    }
//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        // addResourceHandler是指你想在url请求的路径
//        // addResourceLocations是图片存放的真实路径
//        registry.addResourceHandler("/**").addResourceLocations(
//                "classpath:/static/");
//        registry.addResourceHandler("swagger-ui.html").addResourceLocations(
//                "classpath:/META-INF/resources/");
//        registry.addResourceHandler("/webjars/**").addResourceLocations(
//                "classpath:/META-INF/resources/webjars/");
//        super.addResourceHandlers(registry);
//    }
//
//    HttpMessageConverter fastJsonHttpMessageConverters() {
//        FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();
//        FastJsonConfig fastJsonConfig = new FastJsonConfig();
//        fastJsonConfig.setDateFormat("yyyy/MM/dd HH:mm:ss");
//        fastJsonConfig.setSerializerFeatures(SerializerFeature.DisableCircularReferenceDetect);
////        fastJsonConfig.setSerializerFeatures(SerializerFeature.WriteMapNullValue);
//        fastConverter.setFastJsonConfig(fastJsonConfig);
//        fastConverter.setDefaultCharset(Charset.forName("UTF-8"));
//        List<MediaType> supportMediaTypeList = new ArrayList<>();
//        supportMediaTypeList.add(MediaType.APPLICATION_JSON_UTF8);
//        fastConverter.setSupportedMediaTypes(supportMediaTypeList);
//        fastConverter.setFastJsonConfig(fastJsonConfig);
//        return fastConverter;
//    }
//
//
//    @Override
//    public void extendMessageConverters(List<HttpMessageConverter<?>> messageConverters) {
////        spring系统默认使用的是MappingJackson2HttpMessageConverter，
////        但是在使用FastJsonHttpMessageConverter时要特别注意，
////        因为FastJsonHttpMessageConverter很可能就会处理字符串
////        类型，这样就可能会导致字符串在被fastjson序列化时出现转
////        义字符，这样到了服务提供端就会出现无法解析的问题，但
////        是fastjson又没有提供一个序列化特性：不序列化字符串
//        messageConverters.clear();
//        StringHttpMessageConverter converter = new StringHttpMessageConverter(Charset.forName("UTF-8"));
//        messageConverters.add(converter);
//        messageConverters.add(fastJsonHttpMessageConverters());
//
//    }
//}
