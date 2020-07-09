package com.mybatislearn.service.user;
import com.mybatislearn.core.model.PageData;
import com.mybatislearn.core.model.PageWrap;
import com.mybatislearn.dao.user.model.User2;

import java.util.List;

/**
 * 示例Service定义
 * @author wcpzzz
 * @date 2020/07/06 10:09
 */
public interface User2Service {

    /**
     * 创建
     * @author wcpzzz
     * @date 2020/07/06 10:09
     * @return
     */
    String create(User2 user);

    /**
     * 主键删除
     * @author wcpzzz
     * @date 2020/07/06 10:09
     */
    void deleteById(String id);

    /**
     * 批量主键删除
     * @author wcpzzz
     * @date 2020/07/06 10:09
     */
    void deleteByIdInBatch(List<String> ids);

    /**
     * 主键更新
     * @author wcpzzz
     * @date 2020/07/06 10:09
     */
    void updateById(User2 user);

    /**
     * 批量主键更新
     * @author wcpzzz
     * @date 2020/07/06 10:09
     */
    void updateByIdInBatch(List<User2> users);

    /**
     * 主键查询
     * @author wcpzzz
     * @date 2020/07/06 10:09
     */
    User2 findById(String id);

    /**
     * 条件查询单条记录
     * @author wcpzzz
     * @date 2020/07/06 10:09
     */
    User2 findOne(User2 user);

    /**
     * 条件查询
     * @author wcpzzz
     * @date 2020/07/06 10:09
     */
    List<User2> findList(User2 user);

    /**
     * 分页查询
     * @author wcpzzz
     * @date 2020/07/06 10:09
     */
    PageData<User2> findPage(PageWrap<User2> pageWrap);
    /**
     * 条件统计
     * @author wcpzzz
     * @date 2020/07/06 10:09
     */
    long count(User2 user);
}
