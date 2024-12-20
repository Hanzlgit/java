package com.learn2.A06FunctionDemo;

import java.util.ArrayList;
import java.util.Collections;

public class Test4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"aaa","bbb","ccc","ddd");
//        list.stream().map(s->s.toUpperCase()).forEach(System.out::println);
        list.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}
