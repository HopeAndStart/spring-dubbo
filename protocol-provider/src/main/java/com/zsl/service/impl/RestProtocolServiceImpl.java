package com.zsl.service.impl;

import com.zsl.pojo.Student;
import com.zsl.service.protocol.RestProtocolService;
import org.springframework.stereotype.Service;

/**
 * TODO Dubbo发布Rest协议服务实现类
 * @author zsl
 * @version 1.0
 * @date: 2019/6/27 10:53
 **/
@Service("RestProtocolServiceImpl")
public class RestProtocolServiceImpl implements RestProtocolService {
    
    @Override
    public String restProtocolGetMethod (Integer id) {
        return "this is rest protocol get method";
    }
    
    @Override
    public String restProtocolPostMethod (Student student) {
        System.out.println(student.getName());
        return "this is rest protocol post method";
    }
    
}
