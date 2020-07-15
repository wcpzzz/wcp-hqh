package com.mybatislearn.service;

import com.mybatislearn.core.model.PageData;
import com.mybatislearn.core.model.PageWrap;
import com.mybatislearn.dao.model.User;
import java.util.List;

/**
 * 示例Service定义
 * @author wcpzzz
 * @date 2020/07/06 10:09
 */
public interface CrudService {

    /**
     * 创建
     * @author wcpzzz
     * @date 2020/07/06 10:09
     */
    Integer create(User user);

    /**
     * 主键删除
     * @author wcpzzz
     * @date 2020/07/06 10:09
     */
    void deleteById(Integer id);

    /**
     * 批量主键删除
     * @author wcpzzz
     * @date 2020/07/06 10:09
     */
    void deleteByIdInBatch(List<Integer> ids);

    /**
     * 主键更新
     * @author wcpzzz
     * @date 2020/07/06 10:09
     */
    void updateById(User user);

    /**
     * 批量主键更新
     * @author wcpzzz
     * @date 2020/07/06 10:09
     */
    void updateByIdInBatch(List<User> users);

    /**
     * 主键查询
     * @author wcpzzz
     * @date 2020/07/06 10:09
     */
    User findById(Integer id);

    /**
     * 条件查询单条记录
     * @author wcpzzz
     * @date 2020/07/06 10:09
     */
    User findOne(User user);

    /**
     * 条件查询
     * @author wcpzzz
     * @date 2020/07/06 10:09
     */
    List<User> findList(User user);

    /**
     * 分页查询
     * @author wcpzzz
     * @date 2020/07/06 10:09
     */
    PageData<User> findPage(PageWrap<User> pageWrap);
    /**
     * 条件统计
     * @author wcpzzz
     * @date 2020/07/06 10:09
     */
    long count(User user);
}
