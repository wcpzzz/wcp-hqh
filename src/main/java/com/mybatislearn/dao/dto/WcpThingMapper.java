package com.mybatislearn.dao.dto;


import com.mybatislearn.dao.model.Thing;
import com.mybatislearn.dao.model.ThingExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WcpThingMapper {
    List<Thing> selectByExample(ThingExample example);
}
