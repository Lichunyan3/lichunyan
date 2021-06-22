package com.lcy.homework;

import java.util.ArrayList;

/**
 * @author 李春艳
 * @version 1.0
 */
public class Homework02 {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        Car car1 = new Car("宝马", 400000);
        Car car2 = new Car("宾利",5000000);
        cars.add(car1);
        cars.add(car2);
        cars.remove(car1);
        System.out.println(cars.contains(car1));
        System.out.println(cars.size());
        System.out.println(cars.isEmpty());
        //cars.clear();
        cars.addAll(cars);
        System.out.println(cars);
        System.out.println(cars.containsAll(cars));
        //cars.removeAll(cars);
        for (Car car:cars){
            System.out.println(car);
        }
    }
}
class Car{
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
}