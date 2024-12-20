package com.learn2.A09IO;

import java.io.FileInputStream;
import java.io.IOException;

public class Test2In {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("a.text");
        int a = fis.read();
        System.out.println((char)a);
        fis.close();
    }
}
