package com.lcy.homework;

public class Homework01 {
    public static void main(String[] args) {
        Person[] persons = new Person[3];
        persons[0] = new Person("jack",24,"teacher");
        persons[1] = new Person("amy",13,"boss");
        persons[2] = new Person("bob",25,"cleaner");
        Person p = new Person();
        p.sort(persons);
    }
}
class Person{
    private String name;
    private int age;
    private String job;

    public Person() {
    }

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }

    //按照age从大到小冒泡排序
    public void sort(Person[] arr){
        Person temp = null;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j].getAge() < arr[j+1].getAge()){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        //遍历输出排序后的元素
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");;
        }
    }
}