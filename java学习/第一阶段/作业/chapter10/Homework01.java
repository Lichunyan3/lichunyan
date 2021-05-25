package com.lcy.homework;

/**
 * @author 李春艳
 * @version 1.0
 */
public class Homework01 {
    public static void main(String[] args) {
        System.out.println(Fork.getNextNum());
        System.out.println(Fork.getNextNum());
        Fork fork = new Fork();
        Fork fork1 = new Fork();
        Fork fork2 = new Fork();
        System.out.println(fork.getSerialNum());
        System.out.println(fork1.getSerialNum());
        System.out.println(fork2.getSerialNum());
    }
}
class Fork{
    private static int currentNum = 100000;//衣服出厂序列的初始值
    private int serialNum;//序列号

    public Fork() {
        int nextNum = getNextNum();
        this.serialNum = nextNum;
    }

    public int getSerialNum() {
        return serialNum;
    }

    public static int getNextNum(){
        //生成上衣唯一序列
        currentNum += 100;
        return currentNum;
    }
}
