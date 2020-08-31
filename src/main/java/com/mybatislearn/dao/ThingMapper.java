package com.mybatislearn.dao;

import com.mybatislearn.dao.model.Thing;
import com.mybatislearn.dao.model.ThingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ThingMapper {
    long countByExample(ThingExample example);

    int deleteByExample(ThingExample example);

    int deleteByPrimaryKey(String thingId);

    int insert(Thing record);

    int insertSelective(Thing record);

    List<Thing> selectByExample(ThingExample example);

    Thing selectByPrimaryKey(String thingId);

    int updateByExampleSelective(@Param("record") Thing record, @Param("example") ThingExample example);

    int updateByExample(@Param("record") Thing record, @Param("example") ThingExample example);

    int updateByPrimaryKeySelective(Thing record);

    int updateByPrimaryKey(Thing record);


    //一对多
    List selectByExampleWithUser2(ThingExample example);
    //多对多
    List selectByExampleWithThingtype(ThingExample example);
    //多对多
    List selectByExampleWithLocation(ThingExample example);
}
