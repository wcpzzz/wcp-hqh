package com.mybatislearn.dao;

import com.mybatislearn.dao.model.Thingtype;
import com.mybatislearn.dao.model.ThingtypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ThingtypeMapper {
    long countByExample(ThingtypeExample example);

    int deleteByExample(ThingtypeExample example);

    int deleteByPrimaryKey(String thingtypeId);

    int insert(Thingtype record);

    int insertSelective(Thingtype record);

    List<Thingtype> selectByExample(ThingtypeExample example);

    Thingtype selectByPrimaryKey(String thingtypeId);

    int updateByExampleSelective(@Param("record") Thingtype record, @Param("example") ThingtypeExample example);

    int updateByExample(@Param("record") Thingtype record, @Param("example") ThingtypeExample example);

    int updateByPrimaryKeySelective(Thingtype record);

    int updateByPrimaryKey(Thingtype record);
}