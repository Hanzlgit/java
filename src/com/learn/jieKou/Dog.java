package com.learn.jieKou;

public class Dog extends Animal implements Swim{
    public Dog(String name, int age) {
        super(name, age);
    }

    public Dog() {
    }
    public void swim(){
        System.out.println("狗在狗刨");
    }
    public void eat(){
        System.out.println("狗在吃骨头");
    }
}
