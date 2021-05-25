package com.lcy.single;

import com.sun.org.apache.regexp.internal.RE;

public class Single02 {
    public static void main(String[] args) {
        System.out.println(Cat.getInstance());
    }
}
//懒汉式
class Cat{
    private String name;
    private static Cat cat;
    private Cat(String name){
        this.name = name;
    }
    public static Cat getInstance(){
        if(cat == null){
            cat = new Cat("AMY");
        }
        return cat;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}