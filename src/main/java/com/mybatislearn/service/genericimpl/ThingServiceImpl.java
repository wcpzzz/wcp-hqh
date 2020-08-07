package com.mybatislearn.service.genericimpl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mybatislearn.core.model.PageData;
import com.mybatislearn.core.model.PageWrap;
import com.mybatislearn.core.utils.ExampleBuilder;
import com.mybatislearn.dao.ThingMapper;
import com.mybatislearn.dao.model.Thing;
import com.mybatislearn.dao.model.ThingExample;
import com.mybatislearn.service.GenericService;
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
public class ThingServiceImpl implements GenericService<Thing, Integer> {
//    GenericService<Thing, Integer>前一个为对象，后一个为主键类型
    @Autowired
    private ThingMapper thingMapper;

    @Override
    public Integer create(Thing thing) {
        thingMapper.insertSelective(thing);
        return thing.getId();
    }

    @Override
    public void deleteById(Integer id) {
        thingMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void deleteByIdInBatch(List<Integer> ids) {
        if (CollectionUtils.isEmpty(ids)) return;
        for (Integer id: ids) {
            this.deleteById(id);
        }
    }

    @Override
    public void updateById(Thing thing) {
        thingMapper.updateByPrimaryKeySelective(thing);
    }

    @Override
    public void updateByIdInBatch(List<Thing> things) {
        if (CollectionUtils.isEmpty(things)) return;
        for (Thing thing: things) {
            this.updateById(thing);
        }
    }

    @Override
    public Thing findById(Integer id) {
        return thingMapper.selectByPrimaryKey(id);
    }

    @Override
    public Thing findOne(Thing thing) {
        ExampleBuilder<ThingExample, ThingExample.Criteria> builder = ExampleBuilder.create(ThingExample.class, ThingExample.Criteria.class);
        List<Thing> things = thingMapper.selectByExample(builder.buildExamplePack(thing).getExample());
        if (things.size() > 0) {
            return things.get(0);
        }
        return null;
    }

    @Override
    public List<Thing> findList(Thing thing) {
        ExampleBuilder<ThingExample, ThingExample.Criteria> builder = ExampleBuilder.create(ThingExample.class, ThingExample.Criteria.class);
        return thingMapper.selectByExample(builder.buildExamplePack(thing).getExample());
    }

    @Override
    public PageData<Thing> findPage(PageWrap<Thing> pageWrap) {
        PageHelper.startPage(pageWrap.getPage(), pageWrap.getCapacity());//页码，条数
        ExampleBuilder<ThingExample, ThingExample.Criteria> builder = ExampleBuilder.create(ThingExample.class, ThingExample.Criteria.class);
        ExampleBuilder.ExamplePack<ThingExample, ThingExample.Criteria> pack = builder.buildExamplePack(pageWrap.getModel());
        pack.getExample().setOrderByClause(pageWrap.getOrderByClause());
        return PageData.from(new PageInfo<>(thingMapper.selectByExample(pack.getExample())));
    }

    @Override
    public long count(Thing thing) {
        ExampleBuilder<ThingExample, ThingExample.Criteria> builder = ExampleBuilder.create(ThingExample.class, ThingExample.Criteria.class);
        return thingMapper.countByExample(builder.buildExamplePack(thing).getExample());
    }
}
