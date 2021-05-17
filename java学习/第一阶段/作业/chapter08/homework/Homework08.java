package com.lcy.homework;

public class Homework08 {
    public static void main(String[] args) {
        Person1 p = new Student();
        p.eat();
        p.run();
        Student s = (Student)p;
        s.run();
        s.study();
        s.eat();    }
}
class Person1{
    public void run(){
        System.out.println("run...");
    }
    public void eat(){
        System.out.println("eat...");
    }
}

class Student extends Person1{
    @Override
    public void run() {
        System.out.println("can run...");
    }
    public void study(){
        System.out.println("is studying...");
    }
}