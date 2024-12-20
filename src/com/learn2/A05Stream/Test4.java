package com.learn2.A05Stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌-男-10","周芷若-女-19","赵敏-女-18","张强-女-18","张三丰-男-100");
        List<String> collect = list.stream().filter(s -> "男".equals(s.split("-")[1])).collect(Collectors.toList());
        System.out.println(collect);



        /*
        tomap
            参数一:
                泛型1:流中数据类型
                泛型2:map中键数据类型
                apply:
                    参数:流中每个数据
                    返回值:map中的键
            参数二:
                泛型1:流中数据类型
                泛型2:map中值数据类型
                apply:
                    参数:流中每个数据
                    返回值:map中的值

            注意:
                键不可重复
         */
        Map<String, Integer> lMap = list.stream()
                .filter(s -> "男".equals(s.split("-")[1]))
                .collect(Collectors.toMap(new Function<String, String>() {
                    // 第一个参数是 流里面的类型,第二个是要生成的map键类型
                    @Override
                    public String apply(String s) {
                        return s.split("-")[0];
                    }
                }, new Function<String, Integer>() {
                    // 第一个参数是 流里面的类型, 第二个参数是要生成的值的类型.
                    @Override
                    public Integer apply(String s) {
                        return Integer.parseInt(s.split("-")[2]);
                    }
                }));

        System.out.println(lMap);
    }
}
