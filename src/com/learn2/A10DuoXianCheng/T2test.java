package com.learn2.A10DuoXianCheng;

public class T2test {
    public static void main(String[] args) {
        //第二种方法也没有线程的返回值
        T2Myrun myrun = new T2Myrun();
        Thread t1 = new Thread(myrun);
        t1.setName("t1");

        Thread t2 = new Thread(myrun);
        t2.setName("t2");

        t1.start();
        t2.start();
    }
}
