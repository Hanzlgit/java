package com.learn2.A06FunctionDemo;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Integer[] arr = {3,5,1,7,2,9};
//        Arrays.sort(arr,new Comparator<Integer>() {
//
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                // o1第一个参数可以看成this,设o1小于o2:返回负数则o1在左边,返回正数则o1在右边.
//                // 倒序: o1;应在右边, 因此返回正数: o2-o1
//                return o2-o1;
//            }
//        });

//        Arrays.sort(arr,(Integer o1, Integer o2) -> o2-o1);


        // 函数引用  类名::函数名
        Arrays.sort(arr,Test::subtraction);
        System.out.println(Arrays.toString(arr));

    }
    public static int subtraction(int nums1,int nums2){
        return nums2-nums1;
    }
}
