package com.learn.duotai;

public class Teacher extends Person{
    public Teacher(String name,int age){
        super(name,age);
    }
    @Override
    public void show() {
        System.out.println("教师的信息为:"+getName()+", "+getAge());
    }
}
