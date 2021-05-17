package com.lcy.homework;

/**
 * 多态：方法或对象具有多种形态，建立在封装和继承基础上
 * 具体体现
 * 1、方法多态
 * （1）重载（2）重写
 * 2、对象多态
 * （1）对象的编译类型和运行类型可以不一致，编译类型在定义时就确定，不能变化
 * （2）对象的运行类型是可以变化的，可以通过getClass()来查看运行类型
 * （3）编译类型看定义时=左边，运行类型看=右边
 */
public class Homework10 {
    public static void main(String[] args) {
        AAA a = new BBB();
        AAA b = a;
        System.out.println("a的运行类型="+a.getClass());
        a = new CCC();
        System.out.println("a的运行类型="+a.getClass());
        a = b;
        System.out.println("a的运行类型="+a.getClass());
    }

}
class AAA{}
class BBB extends AAA{}
class CCC extends BBB{}