package com.lcy.debug_;

public class Debug04 {
    public static void main(String[] args) {
        //查看创建对象流程
        Person jack = new Person("jack", 18);
        System.out.println(jack);
    }
}
class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}