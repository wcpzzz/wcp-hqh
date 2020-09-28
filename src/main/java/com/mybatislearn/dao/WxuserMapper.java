package com.mybatislearn.dao;

import com.mybatislearn.dao.model.Wxuser;
import com.mybatislearn.dao.model.WxuserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface WxuserMapper extends GenericMapper<WxuserExample, Wxuser, String> {
}