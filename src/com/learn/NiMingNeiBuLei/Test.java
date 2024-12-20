package com.learn.NiMingNeiBuLei;

public class Test {
    public static void main(String[] args) {
        new Swim(){

            @Override
            public void swim() {
                System.out.println("swimming");
            }
        };

        new Animal(){

            @Override
            public void eat() {
                System.out.println("eating");
            }
        };

        method(
                new Animal(){

                    @Override
                    public void eat() {
                        System.out.println("狗吃骨头");
                    }
                }
        );

    }
    public static void method(Animal a) {
        a.eat();
    }
}
