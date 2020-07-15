package com.mybatislearn.dao;

import com.mybatislearn.dao.model.Thingandlocation;
import com.mybatislearn.dao.model.ThingandlocationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ThingandlocationMapper {
    int countByExample(ThingandlocationExample example);

    int deleteByExample(ThingandlocationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Thingandlocation record);

    int insertSelective(Thingandlocation record);

    List<Thingandlocation> selectByExample(ThingandlocationExample example);

    Thingandlocation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Thingandlocation record, @Param("example") ThingandlocationExample example);

    int updateByExample(@Param("record") Thingandlocation record, @Param("example") ThingandlocationExample example);

    int updateByPrimaryKeySelective(Thingandlocation record);

    int updateByPrimaryKey(Thingandlocation record);
}
