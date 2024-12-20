package com.learn2.A09IO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) throws IOException {
        String s = "hahaha";
        byte[] arr1 = s.getBytes();
        System.out.println(Arrays.toString(arr1));

        FileOutputStream fos = new FileOutputStream("a.text");
        fos.write(arr1);

        fos.write("\r\n".getBytes());
        fos.write("666".getBytes());
        fos.close();

        FileOutputStream fos2 = new FileOutputStream("a.text",true);//续写
        fos2.write(arr1);
        fos2.close();
    }
}
