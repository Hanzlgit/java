package com.learn2.A09IO;

import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("a.text");
        fos.write(97);
        byte[] b = {97,98,99,100,101};
        fos.write(b,1,3);
        fos.close();
    }
}
