package com.learn2.A02_treeMap;

import java.util.TreeMap;

public class StudentTest {
    public static void main(String[] args) {

        TreeMap<Student,String> tm = new TreeMap<>();
        Student s1 = new Student("zhangsan",23);
        Student s2 = new Student("lisi",24);
        Student s3 = new Student("wangwu",25);
        Student s4 = new Student("zhangsan",23);

        tm.put(s1,"天津");
        tm.put(s2,"北京");
        tm.put(s3,"河北");
        tm.put(s4,"上海");

        System.out.println(tm);
    }
}
