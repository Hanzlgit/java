package com.learn2.A09IO;

import java.io.*;

public class Test8Xuliehua {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Test8Student s = new Test8Student("zhangsan",19);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src\\com\\learn2\\A09IO\\obj.txt"));
        oos.writeObject(s);
        oos.close();


        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src\\com\\learn2\\A09IO\\obj.txt"));
        Test8Student o = (Test8Student)ois.readObject();
        System.out.println(o);
        ois.close();
    }
}
