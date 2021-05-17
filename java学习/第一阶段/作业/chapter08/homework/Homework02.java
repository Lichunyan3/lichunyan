package com.lcy.homework;

public class Homework02 {
    public static void main(String[] args) {

        Professor professor = new Professor("jack", 45, "教授", 30000, 1.3);
        professor.introduce();
        FuProfessor fuProfessor = new FuProfessor("smith", 29, "副教授",
                                20000, 1.2);
        fuProfessor.introduce();

    }

}
//父类
class Teacher{
    private String name;
    private int age;
    private String post;
    private double salary;
    //增加工资级别
    private double grade;

    public Teacher(String name, int age, String post, double salary, double grade) {
        this.name = name;
        this.age = age;
        this.post = post;
        this.salary = salary;
        this.grade = grade;
    }

    public void introduce(){
        System.out.println("老师名字："+name+" age="+age+"职称是"+post+"基本工资："+salary+"级别为"+grade);
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

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
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
}
//子类 教授
class Professor extends Teacher{
    public Professor(String name, int age, String post, double salary, double grade) {
        super(name, age, post, salary, grade);
    }

    @Override
    public void introduce() {
        System.out.println("这是教授的信息");
        super.introduce();
    }
}
//子类 副教授
class FuProfessor extends Teacher{

    public FuProfessor(String name, int age, String post, double salary, double grade) {
        super(name, age, post, salary, grade);
    }

    @Override
    public void introduce() {
        System.out.println("这是副教授的信息");
        super.introduce();
    }
}
