package com.lcy.collection;

import java.util.*;

/**
 * @author 李春艳
 * @version 1.0
 */
public class CollectionExercise {
    public static void main(String[] args) {
        //Collection单列集合
        //Map双列集合
        //显示所有快捷键的快捷键ctrl+J
        List<Dog> dogs = new ArrayList<>();

        dogs.add(new Dog("jack", 2));
        dogs.add(new Dog("amy", 1));
        dogs.add(new Dog("george", 3));
        //迭代器
        Iterator<Dog> iterator = dogs.iterator();
        while (iterator.hasNext()) {
            Object object = iterator.next();
            System.out.println(object);
        }
        //增强for循环
        for (Dog dog : dogs) {
            System.out.println(dog);
        }

    }
}

class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
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
                '}';
    }
}
