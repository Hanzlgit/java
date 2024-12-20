package com.learn.neiBuLei;

public class Outer {
    String name = "outer name";
    public class Inner{
        String innerName;
        String name = "inner name";
        public void show(){
            System.out.println(Outer.this.name);
        }
    }

    public Inner getInstance(){
        return new Inner();
    }
}
