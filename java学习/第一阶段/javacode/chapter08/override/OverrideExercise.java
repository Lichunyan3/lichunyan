package com.lcy.override;

public class OverrideExercise {
    public static void main(String[] args) {
        Person person = new Person("小明", 18);
        Student student = new Student("小红", 18, 1, 90);
        System.out.println(person.say());
        System.out.println(student.say());
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
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

    public String say() {
        return "我的名字是" + name + "，今年" + age + "岁了";
    }
}

class Student extends Person {
    private int id;
    private double score;

    public Student(String name, int age, int id, double score) {
        super(name, age);
        this.id = id;
        this.score = score;
    }

    public String say() {
        //return "我的名字是" + getName() + "，今年" + getAge() + "岁了，"
        //        + "id=" + id + "，分数=" + score;
        return super.say() +  "id=" + id + "，分数=" + score;
    }
}