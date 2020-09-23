package com.mybatislearn.service.genericimpl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mybatislearn.core.model.PageData;
import com.mybatislearn.core.model.PageWrap;
import com.mybatislearn.core.utils.ExampleBuilder;
import com.mybatislearn.dao.LocationMapper;
import com.mybatislearn.dao.model.Location;
import com.mybatislearn.dao.model.LocationExample;
import com.mybatislearn.interceptor.RequestHolder;
import com.mybatislearn.interceptor.TokenUtil;
import com.mybatislearn.service.GenericService;
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
public class LocationServiceImpl implements GenericService<Location, String> {
//    GenericService<Location, Integer>前一个为对象，后一个为主键类型
    @Autowired
    private LocationMapper locationMapper;
    @Autowired
    private TokenUtil tokenUtil;

    @Override
    public String create(Location location) {
        location.setLocationUserCreater(tokenUtil.verify(RequestHolder.getId ()).getClaims().get("userId").asString());
        //使用uuid作为主键
        String uuid = UUID.randomUUID().toString().replaceAll("-","");
        location.setLocationId(uuid);
        System.out.println (location.toString ());
        //判非空
//        if(emptyObject.isNotEmpty(thing.getThingId ())&&emptyObject.isNotEmpty(thing.getThingUserMaster ())&&emptyObject.isNotEmpty(thing.getThingUserOwner ())&&emptyObject.isNotEmpty(thing.getThingName ())&&emptyObject.isNotEmpty(thing.getThingStatus ())){
        locationMapper.insertSelective(location);
//        }
        return location.getLocationId();
    }

    @Override
    public void deleteById(String id) {
        locationMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void deleteByIdInBatch(List<String> ids) {
        if (CollectionUtils.isEmpty(ids)) return;
        for (String id: ids) {
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
    public Location findById(String id) {
        return locationMapper.selectByPrimaryKey(id);
    }

    @Override
    public Location findOne(Location location) {
        ExampleBuilder<LocationExample, LocationExample.Criteria> builder = ExampleBuilder.create(LocationExample.class, LocationExample.Criteria.class);
        List<Location> locations = locationMapper.selectByExample(builder.buildExamplePack(location,"1").getExample());
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
