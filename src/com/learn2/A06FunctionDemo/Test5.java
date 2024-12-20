package com.learn2.A06FunctionDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Test5 {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,23,4,5,39);
//        Integer[] array = list.stream().toArray(new IntFunction<Integer[]>() {
//            @Override
//            public Integer[] apply(int value) {
//                return new Integer[value];
//            }
//        });

        Integer[] array = list.stream().toArray(Integer[]::new);

        System.out.println(Arrays.toString(array));
    }
}
