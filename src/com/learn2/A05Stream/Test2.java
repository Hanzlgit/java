package com.learn2.A05Stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;
import java.util.function.Predicate;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"张无忌","周芷若","赵敏","张强","张三丰");
        list.stream().filter(new Predicate<String>() {

            @Override
            public boolean test(String s) {
//                return false;
                return s.startsWith("张");
            }
        }).forEach(name-> System.out.println(name));

        // limit  : 参数是size
        list.stream().limit(3).forEach(name-> System.out.println(name));
        // skip : 参数是个数
        list.stream().skip(3).forEach(name-> System.out.println(name));

        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2,"张无忌-18","周芷若-19","赵敏-17","张三丰-100","张强-10");
        list2.stream().map(new Function<String, Integer>() {

            @Override
            public Integer apply(String s) {
//                return "";
                String[] arr = s.split("-");
                return Integer.parseInt(arr[1]);
            }
        }).forEach(age-> System.out.println(age));

    }
}
