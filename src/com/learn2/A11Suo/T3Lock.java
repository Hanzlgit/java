package com.learn2.A11Suo;

public class T3Lock {
    public static void main(String[] args) {
        T3Thread t1 = new T3Thread("第一个窗口");
        T3Thread t2 = new T3Thread("第二个窗口");
        T3Thread t3 = new T3Thread("第三个窗口");
        t1.start();
        t2.start();
        t3.start();
    }
}
