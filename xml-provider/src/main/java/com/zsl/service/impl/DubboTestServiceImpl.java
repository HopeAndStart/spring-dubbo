package com.zsl.service.impl;


import com.zsl.mapper.StudentMapper;
import com.zsl.pojo.Student;
import com.zsl.service.xml.DubboTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author:zsl
 * @Despriction:
 * @Date:Create in 2019/6/2 18:12
 * @Modify:
 */
@Service("DubboTestServiceImpl")
public class DubboTestServiceImpl implements DubboTestService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Student dubboTestMethod(Integer id) {
        return studentMapper.selectByPrimaryKey(id);
    }
}
