package com.learn2.A06FunctionDemo;

public class Test3Student {
    private String name;
    private int age;

    public String getName() {
        return name;
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

    public Test3Student() {
    }
    public Test3Student(String s){
        String[] ss = s.split(",");
        this.name = ss[0];
        this.age = Integer.parseInt(ss[1]);
    }
    public Test3Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Test3Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
