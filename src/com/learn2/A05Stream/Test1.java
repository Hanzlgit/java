package com.learn2.A05Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Test1 {
    public static void main(String[] args) {
        /*
        单列集合:  .stream()
        双列集合:  转成单列
        数组:     Arrays.stream(arr)
        Stream<T> of(T... args)


         */

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"a","b","c","d","e","f","g","h");
        Stream<String> stream = list.stream();
        stream.forEach(new Consumer<String>() {

            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });


        int[] arr = {1,2,3,4,5,6,7,8,9};
        Arrays.stream(arr).forEach(num-> System.out.println(num));
    }
}
