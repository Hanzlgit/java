package com.learn2.A01_map;

import java.util.HashMap;

public class StudentTest {
    public static void main(String[] args) {
        HashMap<Student,String> hm = new HashMap<Student,String>();
        Student s1 = new Student("xuesheng1",19);
        Student s2 = new Student("xuesheng2",20);
        Student s3 = new Student("xuesheng3",21);
        hm.put(s1,"江苏");
        hm.put(s2,"浙江");
        hm.put(s3,"河北");

//        Set<Student> keys = hm.keySet();
//        for (Student key : keys) {
//            String loc = hm.get(key);
//            System.out.println(key+"="+loc);
//        }

//        Set<Map.Entry<Student, String>> entries = hm.entrySet();
//        for (Map.Entry<Student, String> entry : entries) {
//            Student key = entry.getKey();
//            String value = entry.getValue();
//            System.out.println(key+"="+value);
//
//        }

        hm.forEach(( student,  s)->
                System.out.println(student+"="+s)
        );

    }
}
