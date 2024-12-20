package com.learn2.A12PV;

public class ThreadDemo {
    public static void main(String[] args) {
        Cook c = new Cook();
        Eater e = new Eater();

        c.setName("厨师");
        e.setName("吃货");

        c.start();
        e.start();
    }
}
