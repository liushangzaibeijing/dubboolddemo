package com.xiu.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.xiu.dubbo.service.DemoService;

/**
 * @ClassName DemoService
 * @Desc DemoService接口实现类
 * @Author xieqx
 * @Date 2021/4/25 15:35
 **/
@Service
public class DemoServiceImpl implements DemoService {
    @Override
    public String queryDemoInfo() {
        return "hello dubbo";
    }
}
