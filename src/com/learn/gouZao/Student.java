package com.learn.gouZao;

public class Student extends Person{
    public Student(){
        System.out.println("子类的无参构造");
    }
    public Student(String name,int age){
        super(name,age);
    }
}
