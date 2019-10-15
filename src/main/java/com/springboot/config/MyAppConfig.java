package com.springboot.config;

import com.springboot.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration:指明这个类为配置类，就是来代替spring配置文件的
 * 在配置文件中是使用<bean></bean>指明组件的，
 */
@Configuration
public class MyAppConfig {

    /**
     * 将方法的返回值添加到容器中，容器中这个组件默认的id就是方法名
     * @return
     */
    @Bean
    public HelloService helloService(){
        System.out.println("配置类@Bean给容器中添加组件了....");
        return  new HelloService();
    }
}
