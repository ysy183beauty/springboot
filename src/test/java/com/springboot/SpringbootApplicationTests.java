package com.springboot;

import com.springboot.bean.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * springboot单元测试
 * 可以在测试期间实现自动注入功能
 */
@RunWith(SpringRunner.class) //测试器spring,而不是原来的junit
@SpringBootTest //单元测试
public class SpringbootApplicationTests {
     @Autowired
     Person person;
     @Autowired
    ApplicationContext ac;
     private Logger logger = LoggerFactory.getLogger(SpringbootApplicationTests.class);

     @Test
     public void testHelloService(){
         boolean find = ac.containsBean("helloService");
         System.out.println(find);
     }

    @Test
    public void contextLoads() {
        System.out.println(person);
    }

    //输出日志级别
    //日志级别为:trace<debug<info<warn<error
    /*
      可以调整需要输出的日志级别，只输出这个级别及以后高级别生效,
      没有指定的文件按照默认(root,就是info)输出
     */
    @Test
    public void TestLogger(){
         logger.trace("trace日志级别");
         logger.debug("debug日志");
         //springBoot默认日志级别
         logger.info("info日志");
         logger.warn("warn日志");
         logger.error("error日志");
    }

}
