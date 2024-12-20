package com.learn2.A11Suo;

public class T1 {
    public static void main(String[] args) {
        T1Thread t1 = new T1Thread("第一个窗口");
        T1Thread t2 = new T1Thread("第二个窗口");
        T1Thread t3 = new T1Thread("第三个窗口");

        t1.start();
        t2.start();
        t3.start();

    }
}
