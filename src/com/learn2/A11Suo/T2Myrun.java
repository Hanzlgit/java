package com.learn2.A11Suo;

public class T2Myrun implements Runnable {

    private int counter = 0;  // myrun 只会有一个对象, 因此不用static 修饰
    @Override
    public void run() {
        while (true) {

                if (method()) break;

        }
    }

    private synchronized boolean method() {
        if(counter==100){
            return true;
        }else{
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            counter++;
            System.out.println(Thread.currentThread().getName()+"在卖第"+counter+"票");
        }
        return false;
    }
}
