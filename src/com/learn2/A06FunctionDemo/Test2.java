package com.learn2.A06FunctionDemo;

import java.util.ArrayList;
import java.util.Collections;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"张无忌","周芷若","赵敏","张强","张三丰");
//        list.stream().filter(new Predicate<String>() {
//            @Override
//            public boolean test(String s) {
//                return s.startsWith("张")&&s.length()==3;
//            }
//        }).forEach(System.out::println);

        // 使用类名
        list.stream().filter(Test2StringOperation::stringJudge).forEach(System.out::println);
    }
}
