package com.learn.ArrayList;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Character> list = new ArrayList<>();
        list.add('a');
        list.add('b');
        list.add('c');
//        System.out.println(list);

        ArrayList<Student> list1 = new ArrayList<>();
        Student s1 = new Student("zhangsan",23);
        Student s2 = new Student("lisi",23);

        list1.add(s1);
        list1.add(s2);

    }
}
