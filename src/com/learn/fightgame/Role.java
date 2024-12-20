package com.learn.fightgame;

import java.util.Random;

public class Role {
    private String name;
    private int blood;

    public Role() {
    }

    public Role(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getBlood() {
        return blood;
    }

    public void attack(Role role){
        Random r = new Random();
        int a = r.nextInt(20)+1;
        int newBlood = role.getBlood()-a;
        role.setBlood(newBlood>=0?newBlood:0);
        System.out.println(this.getName()+"打了"+role.getName()+","+role.getName()+"还剩"+role.getBlood());
    }
}
