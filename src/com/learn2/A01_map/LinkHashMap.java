package com.learn2.A01_map;
// 有序的map,内部使用双链表链接
import java.util.LinkedHashMap;

public class LinkHashMap {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> lhm = new LinkedHashMap<>();
        lhm.put("a",1);
        lhm.put("a",12);
        lhm.put("b",2);
        lhm.put("c",3);

        System.out.println(lhm);
    }
}
