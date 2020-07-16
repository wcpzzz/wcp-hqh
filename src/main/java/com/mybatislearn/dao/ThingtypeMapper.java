package com.mybatislearn.dao;

import com.mybatislearn.dao.model.Thingtype;
import com.mybatislearn.dao.model.ThingtypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ThingtypeMapper {

    int countByExample(ThingtypeExample example);

    int deleteByExample(ThingtypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Thingtype record);

    int insertSelective(Thingtype record);

    List<Thingtype> selectByExample(ThingtypeExample example);

    Thingtype selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Thingtype record, @Param("example") ThingtypeExample example);

    int updateByExample(@Param("record") Thingtype record, @Param("example") ThingtypeExample example);

    int updateByPrimaryKeySelective(Thingtype record);

    int updateByPrimaryKey(Thingtype record);
}
