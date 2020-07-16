package com.mybatislearn.dao;

import com.mybatislearn.dao.model.User2;
import com.mybatislearn.dao.model.User2Example;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface User2Mapper {

    int countByExample(User2Example example);

    int deleteByExample(User2Example example);

    int deleteByPrimaryKey(String userId);

    int insert(User2 record);

    int insertSelective(User2 record);

    List<User2> selectByExample(User2Example example);

    User2 selectByPrimaryKey(String userId);

    int updateByExampleSelective(@Param("record") User2 record, @Param("example") User2Example example);

    int updateByExample(@Param("record") User2 record, @Param("example") User2Example example);

    int updateByPrimaryKeySelective(User2 record);

    int updateByPrimaryKey(User2 record);
}
