package com.lcy.extend_;

public class ExtendsExercise {
    public static void main(String[] args) {
        PC pc = new PC("intel",16,500,"IBM");
        pc.printInfo();
        NotePad notePad = new NotePad("intel",32,600,"灰色");
        notePad.printInfo();

    }
}

class Computer {
    private String CPU;
    private int memory;//内存
    private int disk;//硬盘

    public Computer(String CPU, int memory, int disk) {
        this.CPU = CPU;
        this.memory = memory;
        this.disk = disk;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getDisk() {
        return disk;
    }

    public void setDisk(int disk) {
        this.disk = disk;
    }

    public String getDetails() {//返回computer详细信息
        return "CPU=" + CPU + " 内存为" + memory + " 硬盘信息" + disk;
    }
}

class PC extends Computer {
    private String brand;
    //直接根据继承的规则，自动把构造器的调用写好
    //继承设计的基本思想，父类的构造器完成父类属性初始化
    //子类的构造器完成子类属性初始化
    public PC(String CPU, int memory, int disk, String brand) {
        super(CPU, memory, disk);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void  printInfo(){
        System.out.println("PC信息=");
        //调用父类的getDetails()方法
        System.out.println(getDetails() + " brand=" + brand);
    }
}

class NotePad extends Computer {
    String color;

    public NotePad(String CPU, int memory, int disk, String color) {
        super(CPU, memory, disk);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void  printInfo(){
        System.out.println("NotePad信息=");
        //调用父类的getDetails()方法
        System.out.println(getDetails() + " color=" + color);
    }
}