package com.zsl.service.impl;


import com.zsl.service.protocol.DubboProtocolService;
import org.springframework.stereotype.Service;

/**
* TODO Dubbo协议发布接口实现
* @author zsl
* @date: 2019/6/27 9:46
* @version 1.0
**/
@Service("DubboProtocolServiceImpl")
public class DubboProtocolServiceImpl implements DubboProtocolService {

    @Override
    public String dubboProtocolGetMethod(Integer id){
        return "this is dubbo protocol test method";
    }
}
