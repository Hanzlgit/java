package com.learn.neiBuLei;

public class Car {
    String carName;
    int carAge;
    String carColor;
    public void show(){
        System.out.println("Car Name: " + carName);
        Engine e = new Engine();
        System.out.println("engineName: " + e.engineName);
    }
    class Engine{
        String engineName;
        int engineAge;
        public void show(){
            System.out.println(engineName+", "+carName);
        }
    }
}
