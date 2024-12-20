package com.learn2.A09IO;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Test4CharSet {
    public static void main(String[] args) throws UnsupportedEncodingException {
        //编码解码

        String s = "哈哈abc";
        byte[] bytes = s.getBytes(); //默认使用 utf-8 英文一个字节，中文3个字节  ；如果是gbk 英文1个字节，中文两个字节
        System.out.println(Arrays.toString(bytes));//[-27, -109, -120, -27, -109, -120, 97, 98, 99] 前三个是中文哈都是负数。

        byte[] bytes1 = s.getBytes("GBK");//[-71, -2, -71, -2, 97, 98, 99]  两个表示；一个中文
        System.out.println(Arrays.toString(bytes1));



        //解码

        String s1 = new String(bytes);//默认utf-8
        System.out.println(s1);

        String s2 = new String(bytes1);
        System.out.println(s2); //����abc
    }
}
