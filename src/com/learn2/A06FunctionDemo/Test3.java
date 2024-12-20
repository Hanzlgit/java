package com.learn2.A06FunctionDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Test3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"张无忌,17","周芷若,19","赵敏,19","张强,18","张三丰,100");
//        List<Test3Student> collect = list.stream().map(new Function<String, Test3Student>() {
//
//            @Override
//            public Test3Student apply(String s) {
//                String[] sarr = s.split(",");
//
//                return new Test3Student(sarr[0], Integer.parseInt(sarr[1]));
//            }
//        }).collect(Collectors.toList());

        List<Test3Student> collect = list.stream().map(Test3Student::new).collect(Collectors.toList());

        System.out.println(collect);
    }
}
