package com.mybatislearn.service.impl;

import com.mybatislearn.core.utils.ExampleBuilder;
import com.mybatislearn.dao.ThingtypeMapper;
import com.mybatislearn.dao.model.Thingtype;
import com.mybatislearn.dao.model.ThingtypeExample;
import com.mybatislearn.service.WcpThingtypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
*
 * 示例Service实现
 * @author wcpzzz
 * @date 2020/07/06 10:09
*/



@Service
public class WcpThingtypeServiceImpl implements WcpThingtypeService<Thingtype> {
    @Autowired
    private ThingtypeMapper thingtypeMapper;
    @Override
    public Object findThingtypeWithUser(Thingtype thingtype) {
        ExampleBuilder<ThingtypeExample, ThingtypeExample.Criteria> builder = ExampleBuilder.create(ThingtypeExample.class, ThingtypeExample.Criteria.class);
        return thingtypeMapper.selectByExampleWithUser(builder.buildExamplePack(thingtype).getExample());
    }
}
