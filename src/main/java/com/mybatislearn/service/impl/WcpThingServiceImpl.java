package com.mybatislearn.service.impl;

import com.mybatislearn.core.utils.ExampleBuilder;
import com.mybatislearn.dao.ThingMapper;
import com.mybatislearn.dao.model.Thing;
import com.mybatislearn.dao.model.ThingExample;
import com.mybatislearn.service.WcpThingService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class WcpThingServiceImpl implements WcpThingService<Thing> {
    @Autowired
    private ThingMapper thingMapper;

    @Override
    public Object findThingWithUser(Thing thing) {
        ExampleBuilder<ThingExample, ThingExample.Criteria> builder = ExampleBuilder.create(ThingExample.class, ThingExample.Criteria.class);
        return thingMapper.selectByExampleWithUser2(builder.buildExamplePack(thing).getExample());
    }

    @Override
    public Object findThingWithThingtype(Thing thing) {
        ExampleBuilder<ThingExample, ThingExample.Criteria> builder = ExampleBuilder.create(ThingExample.class, ThingExample.Criteria.class);
        return thingMapper.selectByExampleWithThingtype(builder.buildExamplePack(thing).getExample());
    }
}
