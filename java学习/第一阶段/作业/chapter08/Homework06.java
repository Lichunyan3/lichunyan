package com.lcy.homework;

public class Homework06 {
    public static void main(String[] args) {
        LabelPoint black_thursday = new LabelPoint("Black Thursday", 1929, 230.07);
    }

}
class Point{
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}

class LabelPoint extends Point{
    private String name;

    public LabelPoint(String name,double x, double y) {
        super(x, y);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}