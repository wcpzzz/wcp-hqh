package com.mybatislearn.dao.user;

import com.mybatislearn.dao.user.model.Thingandtype;
import com.mybatislearn.dao.user.model.ThingandtypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ThingandtypeMapper {
    int countByExample(ThingandtypeExample example);

    int deleteByExample(ThingandtypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Thingandtype record);

    int insertSelective(Thingandtype record);

    List<Thingandtype> selectByExample(ThingandtypeExample example);

    Thingandtype selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Thingandtype record, @Param("example") ThingandtypeExample example);

    int updateByExample(@Param("record") Thingandtype record, @Param("example") ThingandtypeExample example);

    int updateByPrimaryKeySelective(Thingandtype record);

    int updateByPrimaryKey(Thingandtype record);
}