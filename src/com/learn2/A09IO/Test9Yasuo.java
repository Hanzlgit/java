package com.learn2.A09IO;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Test9Yasuo {
    public static void main(String[] args) throws IOException {
        File src = new File("src/com/learn2/A09IO/obj.txt");
        File dest = new File("src/com/learn2/A09IO/");
        System.out.println(src.getName());
        toZip(src,dest);
    }

    public static void toZip(File src, File dest) throws IOException {
        ZipOutputStream out = new ZipOutputStream(new FileOutputStream(new File(dest, "a.zip")));
        //放entry对象
        ZipEntry entry  =new ZipEntry(src.getName());
        out.putNextEntry(entry);
        //写内容
        FileInputStream in = new FileInputStream(src);
        int ch;
        while( (ch=in.read())!=-1){
            out.write(ch);
        }

        out.closeEntry();
        out.close();
        in.close();
    }

    // src:D://aaa   dest : D://bbb.zip
    public static void toZipFolder(File src, File dest) throws IOException {
        ZipOutputStream zos  = new ZipOutputStream(new FileOutputStream(dest));

        zos.close();
    }
}
