package com.learn2.A07Exception;

public class Test2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        try{
            System.out.println(arr[10]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("数组越界了");
        }
        System.out.println("后续代码");
    }
}
