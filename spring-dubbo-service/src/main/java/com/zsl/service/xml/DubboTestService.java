package com.zsl.service.xml;

import com.zsl.pojo.Student;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * @Author:zsl
 * @Despriction:
 * @Date:Create in 2019/6/2 18:09
 * @Modify:
 */
public interface DubboTestService {

    Student dubboTestMethod(Integer id);

}
