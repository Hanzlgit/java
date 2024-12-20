package com.learn2.A05Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.IntFunction;

public class Test3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"张无忌","周芷若","赵敏","张强","张三丰");
//        Object[] array = list.stream().toArray();
//        System.out.println(Arrays.toString(array));



        String[] array1 = list.stream().toArray(new IntFunction<String[]>() {
            @Override
            public String[] apply(int value) {
                // value 表示数组长度
                // 返回值 和IntFunction泛型参数一致
//                return new Object[0];
                return new String[value];
            }
        });
        //IntFunction apply 函数 只是创建数组,不用重新赋值.
        System.out.println(Arrays.toString(array1));
    }
}
