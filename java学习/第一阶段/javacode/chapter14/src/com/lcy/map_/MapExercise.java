package com.lcy.map_;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author 李春艳
 * @version 1.0
 */
public class MapExercise {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put(1,new Employee("jack",10000,1));
        map.put(2,new Employee("amy",20000,2));
        map.put(3,new Employee("bob",19000,3));
        //遍历显示工资>18000的员工
        //方式一
        Set set = map.keySet();
        for (Object key:set){
            Object value = map.get(key);
            Employee employee = (Employee)value;
            if (employee.getSal()>18000){
                System.out.println(key+"-"+map.get(key));
            }

        }
        //方式二
        Set entrySet = map.entrySet();
        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Object entry =  iterator.next();
            Map.Entry m = (Map.Entry)entry;
            Object value = m.getValue();
            Employee employee = (Employee)value;
            if (employee.getSal()>18000){
                System.out.println(m.getKey()+"::"+m.getValue());
            }

        }
    }
}
class Employee{
    private String name;
    private int sal;
    private int id;

    public Employee(String name, int sal, int id) {
        this.name = name;
        this.sal = sal;
        this.id = id;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", id=" + id +
                '}';
    }
}