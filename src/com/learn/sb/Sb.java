package com.learn.sb;

public class Sb {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("abc");
        sb.append(1);
        sb.reverse();
        System.out.println(sb);
        System.out.println(sb.length());
    }
}
