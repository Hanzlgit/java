package com.learn2.A02_treeMap;

public class Student implements Comparable<Student> {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
    }

    @Override
    public int compareTo(Student o) {
        //this:新添加的元素, o:;已经在红黑树中的元素
        //返回值:负数:当前存左边,0:舍弃;正数:当前存右边
        int res = this.getAge() - o.getAge();
        res = res==0?this.getName().compareTo(o.getName()):res;
        return res;
    }
}
