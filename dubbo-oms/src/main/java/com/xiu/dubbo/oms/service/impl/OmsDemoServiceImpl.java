package com.xiu.dubbo.oms.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.xiu.dubbo.oms.service.OmsDemoService;
import com.xiu.dubbo.service.DemoService;

/**
 * @ClassName OmsDemoServiceImpl
 * @Desc TODO
 * @Author xieqx
 * @Date 2021/4/27 10:09
 **/
public class OmsDemoServiceImpl implements OmsDemoService {

    @Reference
    private DemoService demoService;

    public void printDemoInfo() {
        String demoInfo = demoService.queryDemoInfo();
        System.out.println(demoInfo);
    }
}
