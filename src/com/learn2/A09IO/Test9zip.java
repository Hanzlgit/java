package com.learn2.A09IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class Test9zip {
    public static void main(String[] args) {
        File file = new File("//zip");
        File dest = new File("D:\\");

    }
    public static void unzip(File src , File dest) throws IOException {
        ZipInputStream zis = new ZipInputStream(new FileInputStream(src));
        ZipEntry ze ;
        while((ze = zis.getNextEntry())!=null){
            System.out.println(ze);
            if(ze.isDirectory()){
                File file = new File(dest,ze.toString());
                file.mkdirs();
            }else{
                FileOutputStream fos = new FileOutputStream(new File(dest,ze.toString()));
                int ch;
                while ((ch = zis.read()) != -1) {
                    fos.write(ch);
                }
                fos.close();
                zis.closeEntry();
            }
        }

    }
}
