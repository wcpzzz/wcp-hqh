package com.mybatislearn.service;
import com.mybatislearn.core.model.PageData;
import com.mybatislearn.core.model.PageWrap;
import com.mybatislearn.dao.model.User2;

import java.util.List;

/**
 * 示例Service定义
 * @author wcpzzz
 * @date 2020/07/06 10:09
 */
public interface GenericService<Record, Id>{

    Id create(Record record);
    void deleteById(Id id);
    void deleteByIdInBatch(List<Id> ids);
    void updateById(Record record);
    void updateByIdInBatch(List<Record> records);
    User2 findById(Id id);
    User2 findOne(Record record);
    List<Record> findList(Record condition);
    PageData<Record> findPage(PageWrap<Record> pageWrap);
    long count(Record record);
}
