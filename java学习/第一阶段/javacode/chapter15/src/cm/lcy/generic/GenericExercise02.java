package cm.lcy.generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * @author 李春艳
 * @version 1.0
 */
public class GenericExercise02 {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("amy", 20000, new MyDate(3, 14, 1999)));
        employees.add(new Employee("amy", 23000, new MyDate(6, 4, 1989)));
        employees.add(new Employee("tom", 15000, new MyDate(5, 14, 1979)));
        //先按照name排序，如果name相同，则按生日日期的先后排序
        //先对传入的参数进行验证
        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if (!(o1 instanceof Employee && o2 instanceof Employee)) {
                    System.out.println("传入类型不正确");
                    return 0;
                }
                //比较name
                int i = o1.getName().compareTo(o2.getName());
                if (i!=0){
                    return i;
                }
                //比较birthday
                return o1.getBirthday().compareTo(o2.getBirthday());
            }
        });
        System.out.println("=====排序后=====");
        System.out.println(employees);
    }
}

class Employee {
    private String name;
    private double sal;
    private MyDate birthday;

    public Employee(String name, double sal, MyDate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
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

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "\nEmployee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birthday=" + birthday +
                '}';
    }
}

class MyDate implements Comparable<MyDate>{
    private int month;
    private int day;
    private int year;

    public MyDate() {
    }

    public MyDate(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "month=" + month +
                ", day=" + day +
                ", year=" + year +
                '}';
    }

    @Override
    public int compareTo(MyDate o) {//把对birthday的比较放在这个方法中
        int yearMinus = year-o.getYear();
        if (yearMinus!=0){
            return yearMinus;
        }
        int monthMinus = month-o.getMonth();
        if (monthMinus!=0){
            return monthMinus;
        }
        return day - o.getDay();
    }
}
