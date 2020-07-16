package com.mybatislearn.dao;

import com.mybatislearn.dao.model.Thing;
import com.mybatislearn.dao.model.ThingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ThingMapper {

    int countByExample(ThingExample example);

    int deleteByExample(ThingExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Thing record);

    int insertSelective(Thing record);

    List<Thing> selectByExample(ThingExample example);

    Thing selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Thing record, @Param("example") ThingExample example);

    int updateByExample(@Param("record") Thing record, @Param("example") ThingExample example);

    int updateByPrimaryKeySelective(Thing record);

    int updateByPrimaryKey(Thing record);
}
