package com.zsl.controller;

import com.zsl.service.protocol.DubboProtocolService;
import com.zsl.service.protocol.RestProtocolService;
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
@RequestMapping("/protocol")
public class ProtocolController {
    
    private static final Logger LOGGER = LogManager.getLogger(ProtocolController.class);

    @Autowired
    private DubboProtocolService dubboProtocolService;
    
    @Autowired
    private RestProtocolService restProtocolService;


    /**
    * TODO 测试dubbo协议发布服务
    * @author zsl
    * @date 2019/6/27 11:04
    **/
    @GetMapping("dubbo/{id}")
    public String dubboGetMethod(@PathVariable("id") Integer id) {
        String s = dubboProtocolService.dubboProtocolGetMethod(id);
        return s;
    }
    
    /**
    * TODO 测试Rest协议发布服务
    * @author zsl
    * @date 2019/6/27 11:05
    **/
    @GetMapping("rest/{id}")
    public String restGetMethod(@PathVariable("id") Integer id){
        String s = restProtocolService.restProtocolGetMethod(id);
        return s;
    }
}
