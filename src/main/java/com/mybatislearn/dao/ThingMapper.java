package com.mybatislearn.dao;

import com.mybatislearn.dao.model.Thing;
import com.mybatislearn.dao.model.ThingExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface ThingMapper extends GenericMapper<ThingExample, Thing, String> {
    //wcp
    List selectByExampleWithUser(ThingExample example);

    List selectByExampleWithThingtypeWithUserWithLocation(ThingExample example);

    List selectByExampleWithLocation(ThingExample example);
}
