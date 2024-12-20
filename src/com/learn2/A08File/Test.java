package com.learn2.A08File;

import java.io.File;

public class Test {
    public static void main(String[] args) {
        String s = "C:\\Users\\20881\\Desktop\\服务.txt";
        File file = new File(s);
        System.out.println(file.length());
    }
}
