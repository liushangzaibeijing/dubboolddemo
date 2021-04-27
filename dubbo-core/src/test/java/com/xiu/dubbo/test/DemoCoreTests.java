package com.xiu.dubbo.test;

import com.alibaba.dubbo.rpc.proxy.InvokerInvocationHandler;
import com.xiu.dubbo.service.DemoService;
import org.junit.Test;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @ClassName DemoCoreTests
 * @Desc TODO
 * @Author xieqx
 * @Date 2021/4/26 17:02
 **/
public class DemoCoreTests {
    @Test
    public void testStart() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{"dubbo-service.xml"});
        context.start();
        System.out.println("服务注册成功");
        //InvokerInvocationHandler
        try {
            System.in.read();//让此程序一直跑，表示一直提供服务
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
