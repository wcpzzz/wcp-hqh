package com.mybatislearn.dao;

import com.mybatislearn.dao.model.Thingandtype;
import com.mybatislearn.dao.model.ThingandtypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface ThingandtypeMapper extends GenericMapper<ThingandtypeExample, Thingandtype, String> {
}