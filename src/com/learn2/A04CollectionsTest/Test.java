package com.learn2.A04CollectionsTest;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        Collections.addAll(list,"abc","bcd","cde","def");
        System.out.println(list);

        Collections.shuffle(list);
        System.out.println(list);
    }
}
