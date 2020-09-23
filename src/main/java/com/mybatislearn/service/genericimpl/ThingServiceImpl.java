package com.mybatislearn.service.genericimpl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mybatislearn.core.model.PageData;
import com.mybatislearn.core.model.PageWrap;
import com.mybatislearn.core.utils.ExampleBuilder;
import com.mybatislearn.dao.ThingMapper;
import com.mybatislearn.dao.model.Thing;
import com.mybatislearn.dao.model.ThingExample;
import com.mybatislearn.interceptor.RequestHolder;
import com.mybatislearn.interceptor.TokenUtil;
import com.mybatislearn.service.GenericService;
import com.mybatislearn.utils.wcputils.EmptyObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.UUID;

/**
 * 示例Service实现
 * @author wcpzzz
 * @date 2020/07/06 10:09
 */
@Service
public class ThingServiceImpl implements GenericService<Thing, String> {
//    GenericService<Thing, Integer>前一个为对象，后一个为主键类型
    @Autowired
    private ThingMapper thingMapper;
    @Autowired
    private TokenUtil tokenUtil;
    @Autowired
    private EmptyObject emptyObject;
    @Override
    public String create(Thing thing) {
//        todo
        thing.setThingUserCreater(tokenUtil.verify(RequestHolder.getId ()).getClaims().get("userId").asString());
        //使用uuid作为主键
        String uuid = UUID.randomUUID().toString().replaceAll("-","");
        thing.setThingId(uuid);
        System.out.println (thing.toString ());
        //判非空
//        if(emptyObject.isNotEmpty(thing.getThingId ())&&emptyObject.isNotEmpty(thing.getThingUserMaster ())&&emptyObject.isNotEmpty(thing.getThingUserOwner ())&&emptyObject.isNotEmpty(thing.getThingName ())&&emptyObject.isNotEmpty(thing.getThingStatus ())){
            thingMapper.insertSelective(thing);
//        }
        return thing.getThingId();
    }

    @Override
    public void deleteById(String id) {
        thingMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void deleteByIdInBatch(List<String> ids) {
        if (CollectionUtils.isEmpty(ids)) return;
        for (String id: ids) {
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
    public Thing findById(String id) {
        return thingMapper.selectByPrimaryKey(id);
    }

    @Override
    public Thing findOne(Thing thing) {
        ExampleBuilder<ThingExample, ThingExample.Criteria> builder = ExampleBuilder.create(ThingExample.class, ThingExample.Criteria.class);
        List<Thing> things = thingMapper.selectByExample(builder.buildExamplePack(thing,"1").getExample());
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
