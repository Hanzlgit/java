package com.learn2.A06FunctionDemo;

import java.util.ArrayList;
import java.util.Collections;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"1","2","3","4","5","6","7","8","9");

//        list.stream().map(new Function<String, Integer>() {
//
//            @Override
//            public Integer apply(String s) {
//                return Integer.parseInt(s);
//            }
//        }).forEach(s-> System.out.println(s));

        list.stream().map(Integer::parseInt).forEach(System.out::println);
    }
}
