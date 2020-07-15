package com.mybatislearn.service.impl;

import com.mybatislearn.core.model.PageData;
import com.mybatislearn.core.model.PageWrap;
import com.mybatislearn.core.utils.ExampleBuilder;
import com.mybatislearn.dao.ThingandlocationMapper;
import com.mybatislearn.dao.model.Thingandlocation;
import com.mybatislearn.dao.model.ThingandlocationExample;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mybatislearn.service.GenericService;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * 示例Service实现
 * @author wcpzzz
 * @date 2020/07/06 10:09
 */
@Service
public class ThingandlocationServiceImpl implements GenericService<Thingandlocation, Integer> {
    //    GenericService<Thingandlocation, Integer>前一个为对象，后一个为主键类型
    @Autowired
    private ThingandlocationMapper thingandlocationMapper;

    @Override
    public Integer create(Thingandlocation thingandlocation) {
        thingandlocationMapper.insertSelective(thingandlocation);
        return thingandlocation.getId();
    }

    @Override
    public void deleteById(Integer id) {
        thingandlocationMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void deleteByIdInBatch(List<Integer> ids) {
        if (CollectionUtils.isEmpty(ids)) return;
        for (Integer id: ids) {
            this.deleteById(id);
        }
    }

    @Override
    public void updateById(Thingandlocation thingandlocation) {
        thingandlocationMapper.updateByPrimaryKeySelective(thingandlocation);
    }

    @Override
    public void updateByIdInBatch(List<Thingandlocation> thingandlocations) {
        if (CollectionUtils.isEmpty(thingandlocations)) return;
        for (Thingandlocation thingandlocation: thingandlocations) {
            this.updateById(thingandlocation);
        }
    }

    @Override
    public Thingandlocation findById(Integer id) {
        return thingandlocationMapper.selectByPrimaryKey(id);
    }

    @Override
    public Thingandlocation findOne(Thingandlocation thingandlocation) {
        ExampleBuilder<ThingandlocationExample, ThingandlocationExample.Criteria> builder = ExampleBuilder.create(ThingandlocationExample.class, ThingandlocationExample.Criteria.class);
        List<Thingandlocation> thingandlocations = thingandlocationMapper.selectByExample(builder.buildExamplePack(thingandlocation).getExample());
        if (thingandlocations.size() > 0) {
            return thingandlocations.get(0);
        }
        return null;
    }

    @Override
    public List<Thingandlocation> findList(Thingandlocation thingandlocation) {
        ExampleBuilder<ThingandlocationExample, ThingandlocationExample.Criteria> builder = ExampleBuilder.create(ThingandlocationExample.class, ThingandlocationExample.Criteria.class);
        return thingandlocationMapper.selectByExample(builder.buildExamplePack(thingandlocation).getExample());
    }

    @Override
    public PageData<Thingandlocation> findPage(PageWrap<Thingandlocation> pageWrap) {
        PageHelper.startPage(pageWrap.getPage(), pageWrap.getCapacity());//页码，条数
        ExampleBuilder<ThingandlocationExample, ThingandlocationExample.Criteria> builder = ExampleBuilder.create(ThingandlocationExample.class, ThingandlocationExample.Criteria.class);
        ExampleBuilder.ExamplePack<ThingandlocationExample, ThingandlocationExample.Criteria> pack = builder.buildExamplePack(pageWrap.getModel());
        pack.getExample().setOrderByClause(pageWrap.getOrderByClause());
        return PageData.from(new PageInfo<>(thingandlocationMapper.selectByExample(pack.getExample())));
    }

    @Override
    public long count(Thingandlocation thingandlocation) {
        ExampleBuilder<ThingandlocationExample, ThingandlocationExample.Criteria> builder = ExampleBuilder.create(ThingandlocationExample.class, ThingandlocationExample.Criteria.class);
        return thingandlocationMapper.countByExample(builder.buildExamplePack(thingandlocation).getExample());
    }
}
