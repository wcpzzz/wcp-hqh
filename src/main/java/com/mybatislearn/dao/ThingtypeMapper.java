package com.mybatislearn.dao;

import com.mybatislearn.dao.model.Thingtype;
import com.mybatislearn.dao.model.ThingtypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface ThingtypeMapper extends GenericMapper<ThingtypeExample, Thingtype, String> {
    //wcp
    List selectByExampleWithUser(ThingtypeExample record);
}
