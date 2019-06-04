package com.zsl.pojo;

import org.apache.dubbo.common.serialize.support.SerializationOptimizer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * TODO 采用FST序列化
 * @author zsl
 * @version 1.0
 * @date: 2019/6/4 18:50
 **/
public class SerializationOptimizerImpl implements SerializationOptimizer {
    @Override
    public Collection<Class> getSerializableClasses () {
        List<Class> classList = new ArrayList<>(20);
        classList.add(Student.class);
        return classList;
    }
}
