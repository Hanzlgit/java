package com.learn2.A11Suo;

public class T2 {
    public static void main(String[] args) {
        T2Myrun myrun = new T2Myrun();
        Thread t1 = new Thread(myrun);
        Thread t2 = new Thread(myrun);
        Thread t3 = new Thread(myrun);
        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");


        t1.start();
        t2.start();
        t3.start();

    }
}
