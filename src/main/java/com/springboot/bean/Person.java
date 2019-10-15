package com.springboot.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 将配置文件中配置的属性映射到这个实体的属性上
 *@ConfigurationProperties() 告诉springboot 将本地类所有属性与配置文件中相关的属性绑定
 * prefix ="person",配置文件中哪个下面的属性进行一一映射
 * 只有这个组件是容器(Component)中的组件，才能容器ConfigurationProperties提供的功能
 */
@Component
//自动映射为一个实体
@ConfigurationProperties(prefix ="person")  //默认从全局配置文件中读取,指定前缀
//@PropertySource(value ={"classpath:/person.properties"}) //加载某个配置文件中的属性
//@Validated person下面的字段需要实现校验
public class Person {
    /**
     * <bean class="Person">
     *      <property name="lastName" value="字面量/${key}从环境变量、配置文件中获取值/#{SpEL}"></property>
     * <bean/>
     */
    //基本类型
    //@Value("${person.last-name}")
    // @Email lastName必须填写邮箱格式
    private  String lastName;
    //@Value("#{11*2}")
    private Integer age;
    //@Value("true")
    private Boolean boss;
    private Date birth;

    //复杂数据类型
    private Map<String,Object> map;
    private List<Object> lists;
    private Dog dog;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getBoss() {
        return boss;
    }

    public void setBoss(Boolean boss) {
        this.boss = boss;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public List<Object> getLists() {
        return lists;
    }

    public void setLists(List<Object> lists) {
        this.lists = lists;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", age=" + age +
                ", boss=" + boss +
                ", birth=" + birth +
                ", map=" + map +
                ", lists=" + lists +
                ", dog=" + dog +
                '}';
    }
}
