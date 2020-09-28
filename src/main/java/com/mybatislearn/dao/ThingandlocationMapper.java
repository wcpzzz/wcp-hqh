package com.mybatislearn.dao;

import com.mybatislearn.dao.model.Thingandlocation;
import com.mybatislearn.dao.model.ThingandlocationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface ThingandlocationMapper extends GenericMapper<ThingandlocationExample, Thingandlocation, String>{
}