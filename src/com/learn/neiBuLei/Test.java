package com.learn.neiBuLei;

public class Test {
    public static void main(String[] args) {
//        Car c = new Car();
//        c.carName = "name";
//        c.carAge = 1;
//        c.carColor = "color";
//        c.show();


        Outer.Inner oi = new Outer().new Inner();
        oi.show();
//        Scanner sc = new Scanner(System.in);
//        sc.next();


        StaticInner.staticInner si = new StaticInner.staticInner();
        si.show();
        si.show1();

        StaticInner.staticInner.show1();
    }
}
