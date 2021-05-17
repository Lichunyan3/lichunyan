package com.lcy.homework;

public class Homework03 {
    public static void main(String[] args) {
        Manager jack = new Manager("jack", 20, 100, 1.2);
        jack.setBonus(1000);//设置奖金
        jack.showSalary();
        Worker simi = new Worker("simi", 25, 80, 1.1);
        simi.showSalary();
    }
}

//父类 员工类
class Employee {
    private String name;
    private int days;
    private double salary;
    private double grade;

    public Employee(String name, int days, double salary, double grade) {
        this.name = name;
        this.days = days;
        this.salary = salary;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public void showSalary() {
        System.out.println(name + "工资为" + days * salary * grade);
    }
}

//子类 部门经理类
class Manager extends Employee {
    private double bonus;

    //创建对象时，奖金并不确定，在构造器不设置
    public Manager(String name, int days, double salary, double grade) {
        super(name, days, salary, grade);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void showSalary() {
        System.out.println("经理" + getName() + "工资为" + (bonus + getDays() * getSalary() * getGrade()));
    }
}

//子类 普通员工类
class Worker extends Employee {
    public Worker(String name, int days, double salary, double grade) {
        super(name, days, salary, grade);
    }

    @Override
    public void showSalary() {
        super.showSalary();
    }
}