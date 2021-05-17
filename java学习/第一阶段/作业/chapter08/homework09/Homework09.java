package com.lcy.homework.homework09;

public class Homework09 {
    public static void main(String[] args) {
        Student student = new Student("小明", '男', 15, "00023102");
        student.printInfo();//封装
        Teacher teacher = new Teacher("张飞", '男', 30, 5);
        System.out.println("========================");
        teacher.printInfo();
        //多态数组
        Person[] persons = new Person[4];
        persons[0] = new Student("小明", '男', 15, "00023102");
        persons[1] = new Student("小军", '男', 25, "00023213");
        persons[2] = new Teacher("小岚", '男', 19, 5);
        persons[3] = new Teacher("小峰", '男', 33, 6);
        Person temp = null;
        for (int i = 0; i < persons.length - 1; i++) {
            for (int j = 0; j < persons.length - 1 - i; j++) {
                if(persons[j].getAge() < persons[j+1].getAge()){
                    temp = persons[j];
                    persons[j] = persons[j+1];
                    persons[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i]);
        }

        Person person = new Person();
        person.method(student);
        person.method(teacher);
    }
}
