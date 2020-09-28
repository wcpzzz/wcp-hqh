package com.mybatislearn.service.genericimpl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mybatislearn.core.model.PageData;
import com.mybatislearn.core.model.PageWrap;
import com.mybatislearn.core.utils.ExampleBuilder;
import com.mybatislearn.dao.WxuserMapper;
import com.mybatislearn.dao.model.Wxuser;
import com.mybatislearn.dao.model.WxuserExample;
import com.mybatislearn.service.GenericService;
import com.mybatislearn.utils.hqhutils.AesUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;
import java.util.UUID;

/**
 * 示例Service实现
 * @author wcpzzz
 * @date 2020/07/06 10:09*/


@Service
public class WxuserServiceImpl implements GenericService<Wxuser, String> {

    @Autowired
    private WxuserMapper wxuserMapper;

    @Override
    public String create(Wxuser user) {

        //使用uuid作为主键
        String uuid = UUID.randomUUID().toString().replaceAll("-","");
        user.setUserId (uuid);
        String key = uuid;
        // 对密码进行加密 -hqh
        try {
            String _str = AesUtils.aesEncrypt(user.getUserPassword(), key);
            user.setUserPassword(_str);

            System.out.println ("password: " + user.getUserPassword());
            System.out.println ("key: " + key);

            String res = AesUtils.aesDecrypt(_str, key);
            System.out.println ("decrypt: " + res);

            wxuserMapper.insertSelective(user);
        }
        catch (Exception e) {
            e.printStackTrace();

            String[] strs = e.getMessage().split(":");
            String msg = strs[strs.length - 1];
            strs = msg.split("'");
            msg = strs[strs.length - 1];
            return msg;
        }
        return user.getUserId();

    }

    @Override
    public void deleteById(String id) {
        wxuserMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void deleteByIdInBatch(List<String> ids) {
        if (CollectionUtils.isEmpty(ids)) return;
        for (String id: ids) {
            this.deleteById(id);
        }
    }

    @Override
    public void updateById(Wxuser user) {
        wxuserMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public void updateByIdInBatch(List<Wxuser> users) {
        if (CollectionUtils.isEmpty(users)) return;
        for (Wxuser user: users) {
            this.updateById(user);
        }
    }

    @Override
    public Wxuser findById(String id) {
        return wxuserMapper.selectByPrimaryKey(id);
    }

    @Override
    public Wxuser findOne(Wxuser user) {
        ExampleBuilder<WxuserExample, WxuserExample.Criteria> builder = ExampleBuilder.create(WxuserExample.class, WxuserExample.Criteria.class);
//        就是打包一下
        List<Wxuser> users = wxuserMapper.selectByExample(builder.buildExamplePack(user,"1").getExample());
        if (users.size() > 0) {
            return users.get(0);
        }
        return null;
    }

    @Override
    public List<Wxuser> findList(Wxuser user) {
        ExampleBuilder<WxuserExample, WxuserExample.Criteria> builder = ExampleBuilder.create(WxuserExample.class, WxuserExample.Criteria.class);
        return wxuserMapper.selectByExample(builder.buildExamplePack(user).getExample());
    }

    @Override
    public PageData<Wxuser> findPage(PageWrap<Wxuser> pageWrap) {
        PageHelper.startPage(pageWrap.getPage(), pageWrap.getCapacity());//页码，条数
        ExampleBuilder<WxuserExample, WxuserExample.Criteria> builder = ExampleBuilder.create(WxuserExample.class, WxuserExample.Criteria.class);
        ExampleBuilder.ExamplePack<WxuserExample, WxuserExample.Criteria> pack = builder.buildExamplePack(pageWrap.getModel());
        pack.getExample().setOrderByClause(pageWrap.getOrderByClause());
        return PageData.from(new PageInfo<>(wxuserMapper.selectByExample(pack.getExample())));
    }

    @Override
    public long count(Wxuser user) {
        ExampleBuilder<WxuserExample, WxuserExample.Criteria> builder = ExampleBuilder.create(WxuserExample.class, WxuserExample.Criteria.class);
        return wxuserMapper.countByExample(builder.buildExamplePack(user).getExample());
    }
}
