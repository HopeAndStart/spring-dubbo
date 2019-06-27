package com.zsl.controller;

import com.zsl.service.protocol.DubboProtocolService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
* TODO 协议发布服务消费测试
* @author zsl
* @date: 2019/6/27 9:57
* @version 1.0
**/
@RestController
@RequestMapping("/dubbo")
public class ProtocolController {
    
    private static final Logger LOGGER = LogManager.getLogger(ProtocolController.class);

    @Autowired
    private DubboProtocolService dubboProtocolService;


    @GetMapping("/{id}")
    public String dubboMethod(@PathVariable("id") Integer id) {
        String s = dubboProtocolService.dubboProtocolGetMethod(id);
        return s;
    }
}
