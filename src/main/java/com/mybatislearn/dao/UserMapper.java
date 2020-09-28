package com.mybatislearn.dao;

import com.mybatislearn.dao.model.User;
import com.mybatislearn.dao.model.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface UserMapper extends GenericMapper<UserExample, User, String>  {
}