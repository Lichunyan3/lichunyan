package com.lcy.homework;

/**
 * @author 李春艳
 * @version 1.0
 */
public class Homework03 {
    public static void main(String[] args) {
        CellPhone cellPhone = new CellPhone();
        cellPhone.testWork(new Computer() {
            @Override
            public int work(int n1, int n2) {
                return n1 + n2;
            }
        },1,2);
    }
}

interface Computer {
    public int work(int n1,int n2);//运算功能
}

class CellPhone {
    public void testWork(Computer computer,int n1,int n2) {
        int work = computer.work(n1, n2);
        System.out.println("result=" + work);
    }
}
