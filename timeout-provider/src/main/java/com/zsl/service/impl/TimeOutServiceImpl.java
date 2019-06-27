package com.zsl.service.impl;

import com.zsl.service.sample.TimeOuitService;
import org.springframework.stereotype.Service;

/**
 * TODO
 * @author zsl
 * @version 1.0
 * @date: 2019/6/10 14:47
 **/
@Service("SampleDubboServiceImpl")
public class TimeOutServiceImpl implements TimeOuitService {
    
    @Override
    public String timeOutMethod () {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Time Out Method Test";
    }
}
