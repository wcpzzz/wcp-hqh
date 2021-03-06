package com.mybatislearn.service.genericimpl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mybatislearn.core.model.PageData;
import com.mybatislearn.core.model.PageWrap;
import com.mybatislearn.core.utils.ExampleBuilder;
import com.mybatislearn.dao.ThingtypeMapper;
import com.mybatislearn.dao.model.Thingtype;
import com.mybatislearn.dao.model.ThingtypeExample;
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
public class ThingtypeServiceImpl implements GenericService<Thingtype, String> {
//    GenericService<Thingtype, Integer>前一个为对象，后一个为主键类型
    @Autowired
    private ThingtypeMapper thingtypeMapper;

    @Override
    public String create(Thingtype thingtype) {
        thingtypeMapper.insertSelective(thingtype);
        return thingtype.getThingtypeId ();
    }

    @Override
    public void deleteById(String id) {
        thingtypeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void deleteByIdInBatch(List<String> ids) {
        if (CollectionUtils.isEmpty(ids)) return;
        for (String id: ids) {
            this.deleteById(id);
        }
    }

    @Override
    public void updateById(Thingtype thingtype) {
        thingtypeMapper.updateByPrimaryKeySelective(thingtype);
    }

    @Override
    public void updateByIdInBatch(List<Thingtype> thingtypes) {
        if (CollectionUtils.isEmpty(thingtypes)) return;
        for (Thingtype thingtype: thingtypes) {
            this.updateById(thingtype);
        }
    }

    @Override
    public Thingtype findById(String id) {
        return thingtypeMapper.selectByPrimaryKey(id);
    }

    @Override
    public Thingtype findOne(Thingtype thingtype) {
        ExampleBuilder<ThingtypeExample, ThingtypeExample.Criteria> builder = ExampleBuilder.create(ThingtypeExample.class, ThingtypeExample.Criteria.class);
        List<Thingtype> thingtypes = thingtypeMapper.selectByExample(builder.buildExamplePack(thingtype,"1").getExample());
        if (thingtypes.size() > 0) {
            return thingtypes.get(0);
        }
        return null;
    }

    @Override
    public List<Thingtype> findList(Thingtype thingtype) {
        ExampleBuilder<ThingtypeExample, ThingtypeExample.Criteria> builder = ExampleBuilder.create(ThingtypeExample.class, ThingtypeExample.Criteria.class);
        return thingtypeMapper.selectByExample(builder.buildExamplePack(thingtype).getExample());
    }

    @Override
    public PageData<Thingtype> findPage(PageWrap<Thingtype> pageWrap) {
        PageHelper.startPage(pageWrap.getPage(), pageWrap.getCapacity());//页码，条数
        ExampleBuilder<ThingtypeExample, ThingtypeExample.Criteria> builder = ExampleBuilder.create(ThingtypeExample.class, ThingtypeExample.Criteria.class);
        ExampleBuilder.ExamplePack<ThingtypeExample, ThingtypeExample.Criteria> pack = builder.buildExamplePack(pageWrap.getModel());
        pack.getExample().setOrderByClause(pageWrap.getOrderByClause());
        return PageData.from(new PageInfo<>(thingtypeMapper.selectByExample(pack.getExample())));
    }

    @Override
    public long count(Thingtype thingtype) {
        ExampleBuilder<ThingtypeExample, ThingtypeExample.Criteria> builder = ExampleBuilder.create(ThingtypeExample.class, ThingtypeExample.Criteria.class);
        return thingtypeMapper.countByExample(builder.buildExamplePack(thingtype).getExample());
    }
}
