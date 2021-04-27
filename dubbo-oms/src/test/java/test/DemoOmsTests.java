package test;

import com.xiu.dubbo.oms.service.OmsDemoService;
import com.xiu.dubbo.service.DemoService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @ClassName DemoOmsTests
 * @Desc TODO
 * @Author xieqx
 * @Date 2021/4/26 17:02
 **/
public class DemoOmsTests {
    @Test
    public void testStart() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{"dubbo-client.xml"});
        context.start();
        DemoService demoService = (DemoService) context.getBean("demoService");

        System.out.println("服务获取成功");
        String info = demoService.queryDemoInfo();
        System.out.println(info);
    }

    @Test
    public void testAnnation() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{"dubbo-client.xml"});
        context.start();
        OmsDemoService demoService = (OmsDemoService) context.getBean("omsDemoService");
        demoService.printDemoInfo();
    }
}
