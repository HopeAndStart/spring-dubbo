package com.zsl.service.impl;

import com.zsl.mapper.StudentMapper;
import com.zsl.pojo.Student;
import com.zsl.service.sample.TimeOutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * TODO 超时服务配置实现类
 * @author zsl
 * @version 1.0
 * @date: 2019/6/10 14:47
 **/
@Service("TimeOutServiceImpl")
public class TimeOutServiceImpl implements TimeOutService {
    
    @Autowired
    private StudentMapper studentMapper;
    
    @Override
    public Student timeOutGetMethod (Integer id) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return studentMapper.selectByPrimaryKey(id);
    }
    
    @Override
    public boolean timeOutAddMethod (Student student) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int i = studentMapper.insertSelective(student);
        if (i == 1){
            return true;
        }
        return false;
    }
}
