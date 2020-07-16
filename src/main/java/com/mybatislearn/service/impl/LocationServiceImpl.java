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

/**
 * 示例Service实现
 * @author wcpzzz
 * @date 2020/07/06 10:09
 */
@Service
public class LocationServiceImpl implements GenericService<Location, Integer> {
//    GenericService<Location, Integer>前一个为对象，后一个为主键类型
    @Autowired
    private LocationMapper locationMapper;

    @Override
    public Integer create(Location location) {
        locationMapper.insertSelective(location);
        return location.getId();
    }

    @Override
    public void deleteById(Integer id) {
        locationMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void deleteByIdInBatch(List<Integer> ids) {
        if (CollectionUtils.isEmpty(ids)) return;
        for (Integer id: ids) {
            this.deleteById(id);
        }
    }

    @Override
    public void updateById(Location location) {
        locationMapper.updateByPrimaryKeySelective(location);
    }

    @Override
    public void updateByIdInBatch(List<Location> locations) {
        if (CollectionUtils.isEmpty(locations)) return;
        for (Location location: locations) {
            this.updateById(location);
        }
    }

    @Override
    public Location findById(Integer id) {
        return locationMapper.selectByPrimaryKey(id);
    }

    @Override
    public Location findOne(Location location) {
        ExampleBuilder<LocationExample, LocationExample.Criteria> builder = ExampleBuilder.create(LocationExample.class, LocationExample.Criteria.class);
        List<Location> locations = locationMapper.selectByExample(builder.buildExamplePack(location).getExample());
        if (locations.size() > 0) {
            return locations.get(0);
        }
        return null;
    }

    @Override
    public List<Location> findList(Location location) {
        ExampleBuilder<LocationExample, LocationExample.Criteria> builder = ExampleBuilder.create(LocationExample.class, LocationExample.Criteria.class);
        return locationMapper.selectByExample(builder.buildExamplePack(location).getExample());
    }

    @Override
    public PageData<Location> findPage(PageWrap<Location> pageWrap) {
        PageHelper.startPage(pageWrap.getPage(), pageWrap.getCapacity());//页码，条数
        ExampleBuilder<LocationExample, LocationExample.Criteria> builder = ExampleBuilder.create(LocationExample.class, LocationExample.Criteria.class);
        ExampleBuilder.ExamplePack<LocationExample, LocationExample.Criteria> pack = builder.buildExamplePack(pageWrap.getModel());
        pack.getExample().setOrderByClause(pageWrap.getOrderByClause());
        return PageData.from(new PageInfo<>(locationMapper.selectByExample(pack.getExample())));
    }

    @Override
    public long count(Location location) {
        ExampleBuilder<LocationExample, LocationExample.Criteria> builder = ExampleBuilder.create(LocationExample.class, LocationExample.Criteria.class);
        return locationMapper.countByExample(builder.buildExamplePack(location).getExample());
    }
}
