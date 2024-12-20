package com.learn.fightgame;

public class GameTest {
    public static void main(String[] args) {
        Role r1 = new Role("乔峰",100);
        Role r2 = new Role("鸠摩智",100);
        while(r1.getBlood()>0 && r2.getBlood()>0){
            r1.attack(r2);
            r2.attack(r1);
        }
    }
}
