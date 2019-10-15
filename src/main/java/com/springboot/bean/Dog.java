package com.springboot.bean;

public class Dog {
    private Integer age;
    private String name;

    public Dog(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    public Dog() {
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
