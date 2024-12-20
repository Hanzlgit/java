package com.learn2.A09IO;

import java.io.Serializable;
//Serializable 是标记型接口，没有抽象方法，只是起到标记作用。

public class Test8Student implements Serializable {
    private String name;
    private int age;
    private transient String address; //不会序列化到文件中，
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Test8Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Test8Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Test8Student() {
    }
}
