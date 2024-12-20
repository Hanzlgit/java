package com.learn2.A01_map;

import java.util.*;
// 哈希计数
public class Vote {
    public static void main(String[] args) {
        String[] arr = {"A","B","C","D"};
        ArrayList<String> list = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 80; i++) {
            int index = r.nextInt(arr.length);
//            System.out.println(arr[index]);
            list.add(arr[index]);
        }

        HashMap<String,Integer> hm = new HashMap<>();
        for (String s : list) {
            if(hm.containsKey(s)){
                hm.put(s, hm.get(s)+1);
            }else{
                hm.put(s, 1);
            }
        }
        int maxVote = 0;
        ArrayList<String> maxItem = new ArrayList<>();
        Set<Map.Entry<String, Integer>> entries = hm.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            if(entry.getValue() > maxVote){

                maxItem.clear();
                maxVote = entry.getValue();
                maxItem.add(entry.getKey());

            }else{
                if(entry.getValue() == maxVote) {
                    maxItem.add(entry.getKey());
                }
            }
        }
        System.out.println(hm);
        System.out.println(maxItem);
    }
}
