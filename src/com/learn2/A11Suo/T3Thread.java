package com.learn2.A11Suo;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class T3Thread extends Thread {
    static private int counter = 0;
    static Lock lock = new ReentrantLock();

    public T3Thread(String name) {
        super(name);
    }

    @Override
//    public void run() {
//        while (true) {
//            lock.lock();
//            if(counter==100){
//                lock.unlock();
//                break;
//            }else{
//                counter++;
//                System.out.println(Thread.currentThread().getName()+"正在卖第"+counter+"张票");
//                lock.unlock();
//            }
//        }
//    }

    //或者使用try catch  finally
    public void run() {
        while (true) {
            lock.lock();

            try {
                if(counter==100){
                    break;
                }else{
                    counter++;
                    System.out.println(Thread.currentThread().getName()+"正在卖第"+counter+"张票");
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            } finally {
                lock.unlock();//无论如何,finally都会执行
            }
        }
    }
}
