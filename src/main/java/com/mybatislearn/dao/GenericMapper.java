package com.mybatislearn.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public abstract interface GenericMapper<Record, Id, RecordMapper> {
    int countByExample(RecordMapper example);

    int deleteByExample(RecordMapper example);

    int deleteByPrimaryKey(Id userId);

    int insert(Record record);

    int insertSelective(Record record);

    List<Record> selectByExample(RecordMapper example);

    Record selectByPrimaryKey(Id userId);

    int updateByExampleSelective(@Param("record") Record record, @Param("example") RecordMapper example);

    int updateByExample(@Param("record") Record record, @Param("example") RecordMapper example);

    int updateByPrimaryKeySelective(Record record);

    int updateByPrimaryKey(Record record);
}
