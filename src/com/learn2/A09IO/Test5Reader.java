package com.learn2.A09IO;

import java.io.FileReader;
import java.io.IOException;

public class Test5Reader {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("ch.text");
        int ch;
        while((ch = fr.read())!=-1){
            System.out.print((char)ch);//转为十进制赋值给ch
        }


        int len;
        char[] chars = new char[2];

        while((len = fr.read(chars))!=-1){
            System.out.print(new String(chars,0,len));//
        }


        fr.close();
    }
}
