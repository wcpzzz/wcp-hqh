/*
package com.mybatislearn.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mybatislearn.core.model.PageData;
import com.mybatislearn.core.model.PageWrap;
import com.mybatislearn.core.utils.ExampleBuilder;
import com.mybatislearn.dao.LocationMapper;
import com.mybatislearn.dao.model.Location;
import com.mybatislearn.dao.model.LocationExample;
import com.mybatislearn.service.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

*/
/**
 * 示例Service实现
 * @author wcpzzz
 * @date 2020/07/06 10:09
 *//*

@Service
public class WcpLocationServiceImpl implements GenericService<Location, String> {
//    GenericService<Location, Integer>前一个为对象，后一个为主键类型
    @Autowired
    private LocationMapper locationMapper;

    @Override
    public Object findLocationWithUser2(Location location) {
        ExampleBuilder<LocationExample, LocationExample.Criteria> builder = ExampleBuilder.create(LocationExample.class, LocationExample.Criteria.class);
        return locationMapper.selectByExampleWithUser2(builder.buildExamplePack(location).getExample());
    }
}
*/
