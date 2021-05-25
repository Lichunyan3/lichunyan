package com.lcy.homework;

import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * @author 李春艳
 * @version 1.0
 */
public class Homework04 {
    public static void main(String[] args) {
        A a = new A();
        a.hi();
    }
}
class A{
    private String NAME = "hello";
    public void hi(){
        class B{
            private final String NAME = "jack";
            public void show(){
                System.out.println(NAME +" "+ A.this.NAME);
            }
        }
        B b = new B();
        b.show();
    }
}