package com.lcy.encap;

public class Encapsulation01 {
    public static void main(String[] args) {
        Person p = new Person();
        p.setAge(150);
        p.setName("Amy");
        p.setSalary(10000);
        System.out.println(p.info());
        Person jack = new Person("jack", 90, 20000);
        System.out.println(jack.info());

    }
}
class Person{
    public String name;//名字公开
    private int age;//年龄和工资私有化
    private double salary;

    public Person() {
    }

    public Person(String name, int age, double salary) {
//        this.name = name;
//        this.age = age;
//        this.salary = salary;
        //和set方法结合使用，同样可以校验
        setSalary(salary);
        setName(name);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        //进行名字长度校验
        if(name.length() >= 2 && name.length() <= 6) {
            this.name = name;
        }else{
            System.out.println("名字输入有误，长度需要在2-6之间，默认名字为佚名");
            this.name = "佚名";
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        //年龄校验
        if(age >= 0 && age <= 120) {
            this.age = age;
        }else{
            System.out.println("年龄输入有误，需要在0-120之间，默认年龄为20");
            this.age = 20;
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String info(){
        return "人的信息：name="+name+" age="+age+" salary="+salary;
    }
}