package com.springboot;

import com.springboot.bean.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
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

     @Test
     public void testHelloService(){
         boolean find = ac.containsBean("helloService");
         System.out.println(find);
     }

    @Test
    public void contextLoads() {
        System.out.println(person);
    }

}
