package com.mybatislearn.service.impl;

import com.mybatislearn.core.utils.ExampleBuilder;
import com.mybatislearn.dao.LocationMapper;
import com.mybatislearn.dao.model.Location;
import com.mybatislearn.dao.model.LocationExample;
import com.mybatislearn.service.GenericService;
import com.mybatislearn.service.WcpLocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * 示例Service实现
 * @author wcpzzz
 * @date 2020/07/06 10:09*/


@Service
public class WcpLocationServiceImpl implements WcpLocationService<Location> {
    @Autowired
    private LocationMapper locationMapper;
    @Override
    public Object findListLocationWithUser(Location location) {
        ExampleBuilder<LocationExample, LocationExample.Criteria> builder = ExampleBuilder.create(LocationExample.class, LocationExample.Criteria.class);
        return locationMapper.selectByExampleWithUser(builder.buildExamplePack(location).getExample());
    }
}
