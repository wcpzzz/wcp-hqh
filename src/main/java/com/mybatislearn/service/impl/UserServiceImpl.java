package com.mybatislearn.service.impl;

import com.mybatislearn.core.model.PageData;
import com.mybatislearn.core.model.PageWrap;
import com.mybatislearn.core.utils.ExampleBuilder;
import com.mybatislearn.dao.UserMapper;
import com.mybatislearn.dao.model.User;
import com.mybatislearn.dao.model.UserExample;
import com.mybatislearn.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public Integer create(User user) {
        userMapper.insertSelective(user);
        return user.getId();
    }

    @Override
    public void deleteById(Integer id) {
        userMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void deleteByIdInBatch(List<Integer> ids) {
        if (CollectionUtils.isEmpty(ids)) return;
        for (Integer id: ids) {
            this.deleteById(id);
        }
    }

    @Override
    public void updateById(User user) {
        userMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public void updateByIdInBatch(List<User> users) {
        if (CollectionUtils.isEmpty(users)) return;
        for (User user: users) {
            this.updateById(user);
        }
    }

    @Override
    public User findById(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public User findOne(User user) {
        ExampleBuilder<UserExample, UserExample.Criteria> builder = ExampleBuilder.create(UserExample.class, UserExample.Criteria.class);
        List<User> users = userMapper.selectByExample(builder.buildExamplePack(user).getExample());
        if (users.size() > 0) {
            return users.get(0);
        }
        return null;
    }

    @Override
    public List<User> findList(User user) {
        ExampleBuilder<UserExample, UserExample.Criteria> builder = ExampleBuilder.create(UserExample.class, UserExample.Criteria.class);
        return userMapper.selectByExample(builder.buildExamplePack(user).getExample());
    }

    @Override
    public PageData<User> findPage(PageWrap<User> pageWrap) {
        PageHelper.startPage(pageWrap.getPage(), pageWrap.getCapacity());//页码，条数
        ExampleBuilder<UserExample, UserExample.Criteria> builder = ExampleBuilder.create(UserExample.class, UserExample.Criteria.class);
        ExampleBuilder.ExamplePack<UserExample, UserExample.Criteria> pack = builder.buildExamplePack(pageWrap.getModel());
        pack.getExample().setOrderByClause(pageWrap.getOrderByClause());
        return PageData.from(new PageInfo<>(userMapper.selectByExample(pack.getExample())));
    }

    @Override
    public long count(User user) {
        ExampleBuilder<UserExample, UserExample.Criteria> builder = ExampleBuilder.create(UserExample.class, UserExample.Criteria.class);
        return userMapper.countByExample(builder.buildExamplePack(user).getExample());
    }
}
