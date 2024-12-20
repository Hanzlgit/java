package com.learn2.A01_map;

import java.util.HashMap;
import java.util.Map;

public class A01_map {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
//        System.out.println(map.put("A","B"));
        map.put("A", "B");
        map.put("B", "C");
        map.put("C", "D");

//        System.out.println(map.put("A","D"));
//        System.out.println(map);

//        System.out.println(map.remove("A"));
//        System.out.println(map);
//        System.out.println(map.containsKey("B"));
//        System.out.println(map.containsValue("C"));
//        System.out.println(map.size());


//        Set<String> ks = map.keySet();
//        System.out.println(ks);
//        for (String k : ks) {
////            System.out.println(k);
//            System.out.println(k+"="+map.get(k));
//        }

//        Set<Map.Entry<String, String>> entries = map.entrySet();
//        for (Map.Entry<String, String> entry : entries) {
//            System.out.println(entry.getKey()+"="+entry.getValue());
//        }

        map.forEach((k, v) -> System.out.println(k + "=" + v));

    }
}
