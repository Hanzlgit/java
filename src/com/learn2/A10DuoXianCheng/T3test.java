package com.learn2.A10DuoXianCheng;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class T3test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //创建Mycallable 继承 Callable接口， 实现 call方法有返回值
        //创建Mycallable对象, 创建FutureTask对象(管理多线程执行结果的)
        //创建thread对象,启动
        MyCallable mc = new MyCallable();
        FutureTask<Integer> ft = new FutureTask<>(mc);
        Thread t1 = new Thread(ft);
        t1.start();
        System.out.println(ft.get());
    }
}
