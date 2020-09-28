package com.mybatislearn.dao;

import com.mybatislearn.dao.model.Wxlogin;
import com.mybatislearn.dao.model.WxloginExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public interface WxloginMapper extends GenericMapper<WxloginExample, Wxlogin, String> {
}
