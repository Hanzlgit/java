package com.learn2.A09IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test3Copy {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("a.text");
        byte[] bytes = new byte[2];
        int len = fis.read(bytes);
        System.out.println(new String(bytes,0,len));
//        fis.close();

        FileOutputStream fos = new FileOutputStream("b.text");
        int len1;
        byte[] bytes1 = new byte[1024*1024*5];
        while((len1 = fis.read(bytes1))!=-1){
            fos.write(bytes1,0,len1);
        }
        fos.close();
        fis.close();

    }

}
