package com.learn.duotai;

public class Student extends Person{
    public Student(String name,int age){
        super(name,age);
    }
    @Override
    public void show() {
        System.out.println("学生的信息为:"+getName()+", "+getAge());
    }
}
