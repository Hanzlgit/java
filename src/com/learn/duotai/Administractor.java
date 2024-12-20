package com.learn.duotai;

public class Administractor extends Person{
    public Administractor(String name,int age){
        super(name,age);
    }
    @Override
    public void show() {
        System.out.println("管理员的信息为:"+getName()+", "+getAge());
    }
}
