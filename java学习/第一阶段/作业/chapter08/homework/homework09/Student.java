package com.lcy.homework.homework09;

public class Student extends Person {
    private String stu_id;

    public Student(String name, char sex, int age, String stu_id) {
        super(name, sex, age);
        this.stu_id = stu_id;
    }

    public String getStu_id() {
        return stu_id;
    }

    public void setStu_id(String stu_id) {
        this.stu_id = stu_id;
    }

    public void study() {
        System.out.println("我承诺，我会好好学习。");
    }

    @Override
    public String play() {
        return super.play() + "足球";
    }

    //输出信息
    public void printInfo(){
        System.out.println("学生的信息：\n"+super.basicInfo()+"\n学号："+stu_id);
        study();
        System.out.println(play());
    }
    @Override
    public String toString() {
        return "Student{" + "name='" + getName() + '\'' +
                ", sex=" + getSex() +
                ", age=" + getAge() +
                ", stu_id=" + stu_id +
                '}';
    }
}
