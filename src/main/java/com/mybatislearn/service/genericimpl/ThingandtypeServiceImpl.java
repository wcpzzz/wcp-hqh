package com.mybatislearn.service.genericimpl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mybatislearn.core.model.PageData;
import com.mybatislearn.core.model.PageWrap;
import com.mybatislearn.core.utils.ExampleBuilder;
import com.mybatislearn.dao.ThingandtypeMapper;
import com.mybatislearn.dao.model.Thingandtype;
import com.mybatislearn.dao.model.ThingandtypeExample;
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
public class ThingandtypeServiceImpl implements GenericService<Thingandtype, Integer> {
//    GenericService<Thingandtype, Integer>前一个为对象，后一个为主键类型
    @Autowired
    private ThingandtypeMapper thingandtypeMapper;

    @Override
    public Integer create(Thingandtype thingandtype) {
        thingandtypeMapper.insertSelective(thingandtype);
        return thingandtype.getId();
    }

    @Override
    public void deleteById(Integer id) {
        thingandtypeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void deleteByIdInBatch(List<Integer> ids) {
        if (CollectionUtils.isEmpty(ids)) return;
        for (Integer id: ids) {
            this.deleteById(id);
        }
    }

    @Override
    public void updateById(Thingandtype thingandtype) {
        thingandtypeMapper.updateByPrimaryKeySelective(thingandtype);
    }

    @Override
    public void updateByIdInBatch(List<Thingandtype> thingandtypes) {
        if (CollectionUtils.isEmpty(thingandtypes)) return;
        for (Thingandtype thingandtype: thingandtypes) {
            this.updateById(thingandtype);
        }
    }

    @Override
    public Thingandtype findById(Integer id) {
        return thingandtypeMapper.selectByPrimaryKey(id);
    }

    @Override
    public Thingandtype findOne(Thingandtype thingandtype) {
        ExampleBuilder<ThingandtypeExample, ThingandtypeExample.Criteria> builder = ExampleBuilder.create(ThingandtypeExample.class, ThingandtypeExample.Criteria.class);
        List<Thingandtype> thingandtypes = thingandtypeMapper.selectByExample(builder.buildExamplePack(thingandtype).getExample());
        if (thingandtypes.size() > 0) {
            return thingandtypes.get(0);
        }
        return null;
    }

    @Override
    public List<Thingandtype> findList(Thingandtype thingandtype) {
        ExampleBuilder<ThingandtypeExample, ThingandtypeExample.Criteria> builder = ExampleBuilder.create(ThingandtypeExample.class, ThingandtypeExample.Criteria.class);
        return thingandtypeMapper.selectByExample(builder.buildExamplePack(thingandtype).getExample());
    }

    @Override
    public PageData<Thingandtype> findPage(PageWrap<Thingandtype> pageWrap) {
        PageHelper.startPage(pageWrap.getPage(), pageWrap.getCapacity());//页码，条数
        ExampleBuilder<ThingandtypeExample, ThingandtypeExample.Criteria> builder = ExampleBuilder.create(ThingandtypeExample.class, ThingandtypeExample.Criteria.class);
        ExampleBuilder.ExamplePack<ThingandtypeExample, ThingandtypeExample.Criteria> pack = builder.buildExamplePack(pageWrap.getModel());
        pack.getExample().setOrderByClause(pageWrap.getOrderByClause());
        return PageData.from(new PageInfo<>(thingandtypeMapper.selectByExample(pack.getExample())));
    }

    @Override
    public long count(Thingandtype thingandtype) {
        ExampleBuilder<ThingandtypeExample, ThingandtypeExample.Criteria> builder = ExampleBuilder.create(ThingandtypeExample.class, ThingandtypeExample.Criteria.class);
        return thingandtypeMapper.countByExample(builder.buildExamplePack(thingandtype).getExample());
    }
}
