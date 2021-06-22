package com.lcy.set_;

import java.util.LinkedHashSet;
import java.util.Objects;

/**
 * @author 李春艳
 * @version 1.0
 */
public class LinkedHashSetExercise {
    public static void main(String[] args) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new Car("奥拓", 1000));
        linkedHashSet.add(new Car("奥迪", 3000000));
        linkedHashSet.add(new Car("法拉利", 100000000));
        linkedHashSet.add(new Car("保时捷", 70000000));
        linkedHashSet.add(new Car("奥迪", 3000000));
        for (Object car : linkedHashSet) {
            System.out.println(car);
        }
    }
}

class Car {
    private String name;
    private double price;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Car car = (Car) o;
//        return Double.compare(car.price, price) == 0 &&
//                Objects.equals(name, car.name);
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        Car car = (Car) o;
        return this.price == car.getPrice() && this.name.equals(car.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}