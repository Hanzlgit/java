package com.learn.duotai;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("liming",18);
        Teacher t1 = new Teacher("laoshi",35);
        Administractor a = new Administractor("guanliyuan",40);
        register(s1);
        register(t1);
        register(a);
    }
    public static void register(Person person){
        person.show();
    }
}
