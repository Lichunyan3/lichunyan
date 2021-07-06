package com.lcy.outputstream;

import java.io.Serializable;

/**
 * @author 李春艳
 * @version 1.0
 */
public class Dog implements Serializable {
    private String name;
    private int age;
    private static String nation;
    private transient String color;

    public Dog(String name, int age, String nation, String color) {
        this.name = name;
        this.age = age;
        this.nation = nation;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                " "+nation+
                '}';
    }
}
