package com.learn2.A12PV;

public class Desk {
    //缓冲区
    public static int foodFlag = 0;
    //吃的上线
    public static int count =10;

    public static Object lock = new Object();
}
