package com.learn.neiBuLei;

public class StaticInner {

    static class staticInner{
        public void show(){
            System.out.println("非静态方法");
        };
        public static void show1(){
            System.out.println("静态方法");
        }
    }

}
