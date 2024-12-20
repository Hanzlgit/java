package com.learn2.A10DuoXianCheng;

public class T2Myrun implements Runnable {

    @Override
    public void run() {
        Thread t = Thread.currentThread();
        for (int i = 0; i < 100; i++) {
            System.out.println(t.getName()+"hello world");
        }
    }
}
