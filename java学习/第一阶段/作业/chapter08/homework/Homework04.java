package com.lcy.homework;

public class Homework04 {
    public static void main(String[] args) {
        Worker1 jack = new Worker1("jack", 2000, 12);
        jack.printSal();
        Teacher1 amy = new Teacher1("amy", 4000, 10, 200);
        amy.printSal();
        Scientist bibo = new Scientist("bibo", 30000, 9, 20000);
        bibo.printSal();

    }
}
class Employee1{
    private String name;
    private double sal;
    private int month;

    public Employee1(String name, double sal, int month) {
        this.name = name;
        this.sal = sal;
        this.month = month;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void printSal(){
        System.out.println(name + "全年工资为"+sal*month);
    }
}

class Worker1 extends Employee1{
    public Worker1(String name, double sal, int month) {
        super(name, sal, month);
    }

    @Override
    public void printSal() {
        System.out.print("工资 ");
        super.printSal();
    }
}

class Teacher1 extends Employee1{
    private double coursePay;

    public Teacher1(String name, double sal, int month, double coursePay) {
        super(name, sal, month);
        this.coursePay = coursePay;
    }

    public double getCoursePay() {
        return coursePay;
    }

    public void setCoursePay(double coursePay) {
        this.coursePay = coursePay;
    }

    @Override
    public void printSal() {
        System.out.println("老师" + getName()+"全年工资为"+(getSal()*getMonth()+coursePay*getMonth()*30));
    }
}

class Scientist extends Employee1{
    private double bonus;

    public Scientist(String name, double sal, int month, double bonus) {
        super(name, sal, month);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void printSal() {
        System.out.println("科学家"+getName()+"全年工资为"+(getSal()*getMonth()+bonus));
    }
}