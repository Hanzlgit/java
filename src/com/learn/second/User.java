package com.learn.second;

public class User {
    private String name;
    private String password;
    private String email;
    private String gender;
    private int age;


    public User(){
        System.out.println("构造函数"+this);
    }

    public User(String name, String password, String email, String gender, int age) {
        this.name = name;
        this.password = password;;
        this.email = email;
        this.gender = gender;
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

}
