package com.learn2.A02_treeMap;

import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;

public class StringCounterTreeMap {
    public static void main(String[] args) {
        String s = "abbbbacabcbabc";
        TreeMap<Character,Integer> tm = new TreeMap<>(new Comparator<Character>() {

            @Override
            public int compare(Character o1, Character o2) {
                return o2.compareTo(o1);
            }
        });
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
//            System.out.println(ch);
            tm.put(ch, tm.getOrDefault(ch, 0) + 1);
        }

        StringBuilder sb = new StringBuilder();
        tm.forEach((k,v)->{
            sb.append(k);
            sb.append("(");
            sb.append(v);
            sb.append(")");
        });
        System.out.println(sb);
        HashMap<String,String> hm = new HashMap<>();
    }
}
