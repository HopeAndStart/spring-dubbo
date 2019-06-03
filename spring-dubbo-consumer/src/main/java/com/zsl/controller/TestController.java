package com.zsl.controller;

import com.zsl.pojo.Student;
import com.zsl.service.DubboTestService;
import com.zsl.service.RestTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:zsl
 * @Despriction:
 * @Date:Create in 2019/6/2 18:26
 * @Modify:
 */
@RestController
public class TestController {

    @Autowired
    private DubboTestService dubboTestService;

    @Autowired
    private RestTestService restTestService;

    @RequestMapping("/dubbo")
    public Student dubboMethod(@RequestParam("id") Integer id){
        Student s = dubboTestService.dubboTestMethod(id);
        return s;
    }

    @RequestMapping("/rest")
    public Student restMethod(@RequestParam("id") Integer id){
        Student student = restTestService.restGetTestMethod(id);
        return student;
    }
}
