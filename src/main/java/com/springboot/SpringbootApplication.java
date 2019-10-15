package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

//表明一个springboot程序
@SpringBootApplication
//注入spring的配置文件
//@ImportResource(locations ={"classpath:/beans.xml"})
public class SpringbootApplication {

    //启动程序
    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class, args);
    }

}
