package com.lcy.homework;

/**
 * @author 李春艳
 * @version 1.0
 */
public class Homework05 {
    public static void main(String[] args) {
        Horse horse = new Horse();
        Person person = new Person("唐僧", new Horse());
        person.common();
        person.passRiver();
        person.passMountain();

    }
}
interface Vehicles{
    void work();
}
class Horse implements Vehicles{
    @Override
    public void work() {
        System.out.println("骑马");
    }
}
class Boat implements Vehicles{
    @Override
    public void work() {
        System.out.println("坐船");
    }
}
class Plane implements Vehicles{
    @Override
    public void work() {
        System.out.println("坐飞机");
    }
}
class VehicleFactory{
    private static Horse horse = new Horse();
    private VehicleFactory(){}

    public static Horse getHorse() {
        return horse;
    }
    public static Boat getBoat(){
        return new Boat();
    }
    public static Plane getPlane(){
        return new Plane();
    }
}
class Person{
    private String name;
    private Vehicles vehicles;

    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }
    public void passRiver(){
        if(!(vehicles instanceof Boat)){
            vehicles = VehicleFactory.getBoat();
        }
        vehicles.work();
    }
    public void common(){
        if(!(vehicles instanceof Horse)){
            vehicles = VehicleFactory.getHorse();
        }
        vehicles.work();
    }
    public void passMountain(){
        if(!(vehicles instanceof Plane)){
            vehicles = VehicleFactory.getPlane();
        }
        vehicles.work();
    }
}