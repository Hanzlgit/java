package com.learn2.A06FunctionDemo;

import java.util.ArrayList;
import java.util.Collections;

public class Test6 {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"张无忌,19","周芷若,20","赵敏,18","张强,29","张三丰,100");
        Test3Student[] array = list.stream().map(Test3Student::new).toArray(Test3Student[]::new);
        System.out.println(array);
    }
}
