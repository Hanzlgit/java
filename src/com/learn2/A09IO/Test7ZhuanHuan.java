package com.learn2.A09IO;

import java.io.*;
import java.nio.charset.Charset;

public class Test7ZhuanHuan {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("a_gbk.txt"),"GBK");
        int ch;
        while((ch = isr.read())!=-1){
            System.out.print((char)ch);
        }
        isr.close();

        //转gbk为utf-8


        FileReader fr = new FileReader("a_gbk.txt", Charset.forName("GBK"));
        FileWriter fw = new FileWriter("a_utf8.txt",Charset.forName("UTF-8"));
        int ch1;
        while((ch1=fr.read())!=-1){
            fw.write(ch1);
        }
        fw.close();
        fr.close();
    }
}
