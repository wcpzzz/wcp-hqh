package com.mybatislearn.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mybatislearn.core.model.PageData;
import com.mybatislearn.core.model.PageWrap;
import com.mybatislearn.core.utils.ExampleBuilder;
import com.mybatislearn.dao.User2Mapper;
import com.mybatislearn.dao.model.User2;
import com.mybatislearn.dao.model.User2Example;
import com.mybatislearn.service.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import java.util.UUID;
import java.util.List;

/**
 * 示例Service实现
 * @author wcpzzz
 * @date 2020/07/06 10:09
 */
@Service
public class User2ServiceImpl implements GenericService<User2, String> {

    @Autowired
    private User2Mapper user2Mapper;

    @Override
    public String create(User2 user) {
        //使用uuid作为主键
        String uuid = UUID.randomUUID().toString().replaceAll("-","");
        user.setUserId (uuid);
        user2Mapper.insertSelective(user);
        return user.getUserId ();
    }

    @Override
    public void deleteById(String id) {
        user2Mapper.deleteByPrimaryKey(id);
    }

    @Override
    public void deleteByIdInBatch(List<String> ids) {
        if (CollectionUtils.isEmpty(ids)) return;
        for (String id: ids) {
            this.deleteById(id);
        }
    }

    @Override
    public void updateById(User2 user) {
        user2Mapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public void updateByIdInBatch(List<User2> users) {
        if (CollectionUtils.isEmpty(users)) return;
        for (User2 user: users) {
            this.updateById(user);
        }
    }

    @Override
    public User2 findById(String id) {
        return user2Mapper.selectByPrimaryKey(id);
    }

    @Override
    public User2 findOne(User2 user) {
        ExampleBuilder<User2Example, User2Example.Criteria> builder = ExampleBuilder.create(User2Example.class, User2Example.Criteria.class);
//        就是打包一下
        List<User2> users = user2Mapper.selectByExample(builder.buildExamplePack(user).getExample());
        if (users.size() > 0) {
            return users.get(0);
        }
        return null;
    }

    @Override
    public List<User2> findList(User2 user) {
        ExampleBuilder<User2Example, User2Example.Criteria> builder = ExampleBuilder.create(User2Example.class, User2Example.Criteria.class);
        return user2Mapper.selectByExample(builder.buildExamplePack(user).getExample());
    }

    @Override
    public PageData<User2> findPage(PageWrap<User2> pageWrap) {
        PageHelper.startPage(pageWrap.getPage(), pageWrap.getCapacity());//页码，条数
        ExampleBuilder<User2Example, User2Example.Criteria> builder = ExampleBuilder.create(User2Example.class, User2Example.Criteria.class);
        ExampleBuilder.ExamplePack<User2Example, User2Example.Criteria> pack = builder.buildExamplePack(pageWrap.getModel());
        pack.getExample().setOrderByClause(pageWrap.getOrderByClause());
        return PageData.from(new PageInfo<>(user2Mapper.selectByExample(pack.getExample())));
    }

    @Override
    public long count(User2 user) {
        ExampleBuilder<User2Example, User2Example.Criteria> builder = ExampleBuilder.create(User2Example.class, User2Example.Criteria.class);
        return user2Mapper.countByExample(builder.buildExamplePack(user).getExample());
    }
}
