package com.lcy.final_;

public class FinalExercise01 {
    public static void main(String[] args) {
        Circle circle = new Circle(2);
        System.out.println(circle.area());
    }
}
class Circle{
    private double radius;
//    private final double PI = 3.14;
    private final double PI;
//    {
//        PI = 3.14;
//    }
    public Circle(double radius){
        this.radius = radius;
        PI = 3.14;
    }
    public double area(){
        return PI * radius * radius;
    }
}