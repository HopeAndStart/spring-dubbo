package com.zsl.service.impl;

import com.zsl.mapper.StudentMapper;
import com.zsl.pojo.Student;
import com.zsl.service.xml.RestTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author:zsl
 * @Despriction:
 * @Date:Create in 2019/6/3 23:13
 * @Modify:
 */
@Service("RestTestServiceImpl")
public class RestTestServiceImpl implements RestTestService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Student restGetTestMethod(Integer id) {
        Student student = studentMapper.selectByPrimaryKey(id);
        return student;
    }

    @Override
    public String restPostTestMethod(Student student) {
        int insert = studentMapper.insert(student);
        if (insert != 0){
            return "success";
        }
        return "false";
    }
}
