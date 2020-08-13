package com.mybatislearn.dao;

import com.mybatislearn.dao.model.Thingandtype;
import com.mybatislearn.dao.model.ThingandtypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ThingandtypeMapper {
    long countByExample(ThingandtypeExample example);

    int deleteByExample(ThingandtypeExample example);

    int deleteByPrimaryKey(String id);

    int insert(Thingandtype record);

    int insertSelective(Thingandtype record);

    List<Thingandtype> selectByExample(ThingandtypeExample example);

    Thingandtype selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Thingandtype record, @Param("example") ThingandtypeExample example);

    int updateByExample(@Param("record") Thingandtype record, @Param("example") ThingandtypeExample example);

    int updateByPrimaryKeySelective(Thingandtype record);

    int updateByPrimaryKey(Thingandtype record);
}