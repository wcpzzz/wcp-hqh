package com.mybatislearn.core.utils;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * MyBatis工具类
 *
 * @author wcpzzz
 * @date 2020/07/06 10:09
 */
public class ExampleBuilder<E, C> {

    private Class<E> exampleClass;

    private Class<C> criteriaClass;

    private ExampleBuilder(Class<E> exampleClass, Class<C> criteriaClass) {
        this.exampleClass = exampleClass;
        this.criteriaClass = criteriaClass;
    }

    /**
     * 创建ExampleBuilder对象
     *
     * @author wcpzzz
     * @date 2020/07/06 10:09
     */
    public static <E, C> ExampleBuilder<E, C> create(Class<E> exampleClass, Class<C> criteriaClass) {
        return new ExampleBuilder<> (exampleClass, criteriaClass);
    }

    /**
     * 构建Example包装类
     *
     * @author wcpzzz
     * @date 2020/07/06 10:09
     */
    public ExamplePack<E, C> buildExamplePack(Object model) {
        try {
            E example = exampleClass.newInstance ();
            Method createCriteria = exampleClass.getMethod ("createCriteria");
            Object criteria = createCriteria.invoke (example);
            if (model == null) {
                return new ExamplePack<> (example, (C) criteria);
            }
            Field[] fields = model.getClass ().getDeclaredFields ();
            for (Field field : fields) {
                field.setAccessible (Boolean.TRUE);
                Object value = field.get (model);
                if (value != null) {
                    String name = field.getName ();
                    //判断一下是不是xxxName驼峰字段，如果是的就用模糊查询，如果不是就用精确查询
                    if (name.indexOf ("Name") != -1) {
                        Method andMethod = criteria.getClass ().getMethod (String.format ("and%sLike", name.substring (0, 1).toUpperCase () + name.substring (1)), field.getType ());
                        andMethod.invoke (criteria, "%" + value + "%");
                    } else {
                        Method andMethod = criteria.getClass ().getMethod (String.format ("and%sEqualTo", name.substring (0, 1).toUpperCase () + name.substring (1)), field.getType ());
                        andMethod.invoke (criteria, value);
                    }
                }
            }
            // 代码警告说明：编译阶段无法预知criteria所属类型
            return new ExamplePack<> (example, (C) criteria);
        } catch (Exception e) {
            throw new RuntimeException ("Method 'toExample' of class ExampleBuilder throw an exception", e);
        }
    }

    /**
     * 构建Example包装类，重载，findOne系列接口不需要模糊查询
     *
     * @author wcpzzz
     * @date 2020/07/06 10:09
     */
    public ExamplePack<E, C> buildExamplePack(Object model, String flag) {
        try {
            E example = exampleClass.newInstance ();
            Method createCriteria = exampleClass.getMethod ("createCriteria");
            Object criteria = createCriteria.invoke (example);
            if (model == null) {
                return new ExamplePack<> (example, (C) criteria);
            }
            Field[] fields = model.getClass ().getDeclaredFields ();
            for (Field field : fields) {
                field.setAccessible (Boolean.TRUE);
                Object value = field.get (model);
                if (value != null) {
                    String name = field.getName ();
                    //findOne不需要模糊查询
                    Method andMethod = criteria.getClass ().getMethod (String.format ("and%sEqualTo", name.substring (0, 1).toUpperCase () + name.substring (1)), field.getType ());
                    andMethod.invoke (criteria, value);
                }
            }
            // 代码警告说明：编译阶段无法预知criteria所属类型
            return new ExamplePack<> (example, (C) criteria);
        } catch (Exception e) {
            throw new RuntimeException ("Method 'toExample' of class ExampleBuilder throw an exception", e);
        }
    }

    /**
     * Example包装类，方便获取Example实例和当前构造的Criteria实例
     *
     * @author wcpzzz
     * @date 2020/07/06 10:09
     */
    public static class ExamplePack<E, C> {

        private E example;

        private C criteria;

        public ExamplePack(E example, C criteria) {
            this.example = example;
            this.criteria = criteria;
        }

        public E getExample() {
            return example;
        }

        public C getCriteria() {
            return criteria;
        }

    }
}
