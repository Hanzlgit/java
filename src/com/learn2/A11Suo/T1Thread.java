package com.learn2.A11Suo;

public class T1Thread extends Thread {
    public T1Thread(String name) {
        super(name);
    }

    static int counter = 0;
    static final Object lock = new Object();

    @Override
    public void run() {
        while (true) {
            synchronized(lock){
                if(counter<100){
                    counter++;
                    System.out.println(Thread.currentThread().getName()+"正在卖第"+counter+"张票");
                }else{
                    break;
                }
            }
        }
    }
}
