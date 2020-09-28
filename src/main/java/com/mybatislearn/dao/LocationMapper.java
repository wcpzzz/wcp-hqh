package com.mybatislearn.dao;

import com.mybatislearn.dao.model.Location;
import com.mybatislearn.dao.model.LocationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface LocationMapper extends GenericMapper<LocationExample, Location, String> {
    //wcp
    List selectByExampleWithUser(LocationExample record);
}
