package com.zsl.controller;

import com.zsl.pojo.Student;
import com.zsl.service.sample.TimeOutService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
* TODO 协议发布服务消费测试
* @author zsl
* @date: 2019/6/27 9:57
* @version 1.0
**/
@RestController
@RequestMapping("/timeout")
public class TimeOutController {
    
    private static final Logger LOGGER = LogManager.getLogger(TimeOutController.class);

    @Autowired
    private TimeOutService timeOutService;
    

    /**
    * TODO 测试dubbo协议发布查询服务
    * @author zsl
    * @date 2019/6/27 11:04
    **/
    @GetMapping("get/{id}")
    public Student dubboGetMethod(@PathVariable("id") Integer id) {
        Student s = timeOutService.timeOutGetMethod(id);
        return s;
    }
    
    @PostMapping("/post")
    public String dubboAddMethod(@RequestBody Student student){
        boolean b = timeOutService.timeOutAddMethod(student);
        if (b){
            return "success";
        }
        return "false";
    }
    
    
}
