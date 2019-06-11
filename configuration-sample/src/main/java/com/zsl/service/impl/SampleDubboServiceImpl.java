package com.zsl.service.impl;

import com.zsl.service.sample.SampleDubboService;
import org.springframework.stereotype.Service;

/**
 * TODO
 *
 * @author zsl
 * @version 1.0
 * @date: 2019/6/10 14:47
 **/
@Service("SampleDubboServiceImpl")
public class SampleDubboServiceImpl implements SampleDubboService {
    @Override
    public String dubboTestMethod () {
        return "Sample Dubbo Service Impl";
    }
}
