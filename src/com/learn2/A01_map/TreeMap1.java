package com.learn2.A01_map;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMap1 {
    public static void main(String[] args) {

        // 默认升序排列
//        TreeMap<Integer,String> tm = new TreeMap<>();
        TreeMap<Integer,String> tm = new TreeMap<>(new Comparator<Integer>(){

            @Override
            public int compare(Integer o1, Integer o2) {
                //o1:当前要添加的元素,o2 原来有的元素
                return o2-o1;
            }
        });

        tm.put(1,"奥利奥");
        tm.put(3,"六个核桃");
        tm.put(2,"康师傅");


        System.out.println(tm);
    }
}
