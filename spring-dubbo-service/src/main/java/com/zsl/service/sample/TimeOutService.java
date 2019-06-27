package com.zsl.service.sample;

import com.zsl.pojo.Student;

/**
 * TODO 示例配置方法接口
 * @author zsl
 * @version 1.0
 * @date: 2019/6/10 14:45
 **/
public interface TimeOutService {
    
    Student timeOutGetMethod(Integer id);
    
    boolean timeOutAddMethod(Student student);
}
