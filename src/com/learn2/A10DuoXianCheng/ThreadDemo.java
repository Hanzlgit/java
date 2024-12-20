package com.learn2.A10DuoXianCheng;

public class ThreadDemo {
    public static void main(String[] args) {
        //这种方法没有返回值。
        Mythread t1 = new Mythread();
        t1.setName("t1");
        t1.start();

        Mythread t2 = new Mythread();
        t2.setName("t2");
        t2.start();
    }
}
