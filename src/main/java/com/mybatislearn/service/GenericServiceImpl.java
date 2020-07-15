// package com.mybatislearn.service;

// import com.github.pagehelper.PageHelper;
// import com.github.pagehelper.PageInfo;
// import com.mybatislearn.core.model.PageData;
// import com.mybatislearn.core.model.PageWrap;
// import com.mybatislearn.core.utils.ExampleBuilder;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;
// import org.springframework.util.CollectionUtils;

// import java.util.UUID;
// import java.util.List;

// /**
//  * 示例Service实现
//  * @author wcpzzz
//  * @date 2020/07/06 10:09
//  */
// @Service
// public abstract class GenericServiceImpl<Record, Id, RecordMapper> {

//     @Autowired
//     private RecordMapper recordMapper;

//     public Id create(Record record) {
//         //使用uuid作为主键
//         String uuid = UUID.randomUUID().toString().replaceAll("-","");
//         record.setUserId (uuid);
//         recordMapper.insertSelective(record);
//         return user.getUserId ();
//     }

//     public void deleteById(Id id) {
//         recordMapper.deleteByPrimaryKey(id);
//     }

//     public void deleteByIdInBatch(List<Id> ids) {
//         if (CollectionUtils.isEmpty(ids)) return;
//         for (Id id: ids) {
//             this.deleteById(id);
//         }
//     }

//     public void updateById(Record record) {
//         recordMapper.updateByPrimaryKeySelective(record);
//     }

//     public void updateByIdInBatch(List<Record> records) {
//         if (CollectionUtils.isEmpty(records)) return;
//         for (Record record: records) {
//             this.updateById(record);
//         }
//     }

//     public User2 findById(String id) {
//         return recordMapper.selectByPrimaryKey(id);
//     }

//     public User2 findOne(User2 user) {
//         ExampleBuilder<User2Example, User2Example.Criteria> builder = ExampleBuilder.create(User2Example.class, User2Example.Criteria.class);
// //        就是打包一下
//         List<User2> users = recordMapper.selectByExample(builder.buildExamplePack(user).getExample());
//         if (users.size() > 0) {
//             return users.get(0);
//         }
//         return null;
//     }

//     public List<User2> findList(User2 user) {
//         ExampleBuilder<User2Example, User2Example.Criteria> builder = ExampleBuilder.create(User2Example.class, User2Example.Criteria.class);
//         return recordMapper.selectByExample(builder.buildExamplePack(user).getExample());
//     }

//     public PageData<User2> findPage(PageWrap<User2> pageWrap) {
//         PageHelper.startPage(pageWrap.getPage(), pageWrap.getCapacity());//页码，条数
//         ExampleBuilder<User2Example, User2Example.Criteria> builder = ExampleBuilder.create(User2Example.class, User2Example.Criteria.class);
//         ExampleBuilder.ExamplePack<User2Example, User2Example.Criteria> pack = builder.buildExamplePack(pageWrap.getModel());
//         pack.getExample().setOrderByClause(pageWrap.getOrderByClause());
//         return PageData.from(new PageInfo<>(recordMapper.selectByExample(pack.getExample())));
//     }

//     public long count(User2 user) {
//         ExampleBuilder<User2Example, User2Example.Criteria> builder = ExampleBuilder.create(User2Example.class, User2Example.Criteria.class);
//         return recordMapper.countByExample(builder.buildExamplePack(user).getExample());
//     }
// }
