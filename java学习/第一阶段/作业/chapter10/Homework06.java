package com.lcy.homework;

/**
 * @author 李春艳
 * @version 1.0
 */
public class Homework06 {
    public static void main(String[] args) {
        Car car = new Car(56);
        car.getAir().flow();
        Car car1 = new Car(-9);
        car1.getAir().flow();

    }
}
class Car{
    private double temperature;

    public Car(double temperature) {
        this.temperature = temperature;
    }

    class Air{
        public void flow(){
            if(temperature > 40){
                System.out.println("吹冷风");
            } else if (temperature < 0){
                System.out.println("吹暖气");
            } else {
                System.out.println("关掉空调");
            }
        }
    }
    public Air getAir(){
        return new Air();
    }
}
