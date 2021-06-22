package com.lcy.homework;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author 李春艳
 * @version 1.0
 */
public class Homework03 {
    public static void main(String[] args) {
        Map<String, Integer> m = new HashMap<>();
        Employee jack = new Employee("jack", 650);
        Employee tom = new Employee("tom", 1200);
        Employee smith = new Employee("smith", 2900);
        m.put(jack.getName(),jack.getSal());
        m.put(tom.getName(),tom.getSal());
        m.put(smith.getName(),smith.getSal());
        m.put(jack.getName(),2600);
        Set<Map.Entry<String, Integer>> entries = m.entrySet();
        for (Map.Entry entry:entries){
            System.out.println(entry.getKey()+"-"+((Integer)(entry.getValue())+100));
        }
        Collection<Integer> values = m.values();
        for (Integer sal:values){
            System.out.println(sal);
        }
    }
}
class Employee{
    private String name;
    private int sal;

    public Employee(String name, int sal) {
        this.name = name;
        this.sal = sal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }
}