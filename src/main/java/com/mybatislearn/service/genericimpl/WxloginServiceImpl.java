package com.mybatislearn.service.genericimpl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mybatislearn.core.model.PageData;
import com.mybatislearn.core.model.PageWrap;
import com.mybatislearn.core.utils.ExampleBuilder;
import com.mybatislearn.dao.UserMapper;
import com.mybatislearn.dao.WxloginMapper;
import com.mybatislearn.dao.model.User;
import com.mybatislearn.dao.model.UserExample;
import com.mybatislearn.dao.model.Wxlogin;
import com.mybatislearn.dao.model.WxloginExample;
import com.mybatislearn.service.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.UUID;

/**
 * 示例Service实现
 * @author wcpzzz
 * @date 2020/07/06 10:09*/


@Service
public class WxloginServiceImpl implements GenericService<Wxlogin, String> {

    @Autowired
    private WxloginMapper wxloginrMapper;

    @Override
    public String create(Wxlogin user) {
        //使用uuid作为主键
        String uuid = UUID.randomUUID().toString().replaceAll("-","");
        user.setUuid (uuid);
        System.out.println (user.toString ());

        wxloginrMapper.insertSelective(user);
        return user.getUuid ();
    }

    @Override
    public void deleteById(String id) {
        wxloginrMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void deleteByIdInBatch(List<String> ids) {
        if (CollectionUtils.isEmpty(ids)) return;
        for (String id: ids) {
            this.deleteById(id);
        }
    }

    @Override
    public void updateById(Wxlogin user) {
        wxloginrMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public void updateByIdInBatch(List<Wxlogin> users) {
        if (CollectionUtils.isEmpty(users)) return;
        for (Wxlogin user: users) {
            this.updateById(user);
        }
    }

    @Override
    public Wxlogin findById(String id) {
        return wxloginrMapper.selectByPrimaryKey(id);
    }

    @Override
    public Wxlogin findOne(Wxlogin user) {
        ExampleBuilder<WxloginExample, WxloginExample.Criteria> builder = ExampleBuilder.create(WxloginExample.class, WxloginExample.Criteria.class);
//        就是打包一下
        List<Wxlogin> users = wxloginrMapper.selectByExample(builder.buildExamplePack(user,"1").getExample());
        if (users.size() > 0) {
            return users.get(0);
        }
        return null;
    }

    @Override
    public List<Wxlogin> findList(Wxlogin user) {
        ExampleBuilder<WxloginExample, WxloginExample.Criteria> builder = ExampleBuilder.create(WxloginExample.class, WxloginExample.Criteria.class);
        return wxloginrMapper.selectByExample(builder.buildExamplePack(user).getExample());
    }

    @Override
    public PageData<Wxlogin> findPage(PageWrap<Wxlogin> pageWrap) {
        PageHelper.startPage(pageWrap.getPage(), pageWrap.getCapacity());//页码，条数
        ExampleBuilder<WxloginExample, WxloginExample.Criteria> builder = ExampleBuilder.create(WxloginExample.class, WxloginExample.Criteria.class);
        ExampleBuilder.ExamplePack<WxloginExample, WxloginExample.Criteria> pack = builder.buildExamplePack(pageWrap.getModel());
        pack.getExample().setOrderByClause(pageWrap.getOrderByClause());
        return PageData.from(new PageInfo<>(wxloginrMapper.selectByExample(pack.getExample())));
    }

    @Override
    public long count(Wxlogin user) {
        ExampleBuilder<WxloginExample, WxloginExample.Criteria> builder = ExampleBuilder.create(WxloginExample.class, WxloginExample.Criteria.class);
        return wxloginrMapper.countByExample(builder.buildExamplePack(user).getExample());
    }
}
