package com.lcy.codeblock;
//调用顺序演示
public class CallOrder {
    public static void main(String[] args) {
        AA aa = new AA();
    }
}
class AA{
    private int n2 = getN2();
    {
        System.out.println("普通代码块被调用..");
    }
    private int getN2() {
        System.out.println("getN2()方法被调用..");
        return 10;
    }
    //构造器
    public AA(){
        System.out.println("A() 构造器被调用..");
    }
    public static int n1 = getN1();
    static {
        System.out.println("静态代码块被调用..");
    }
    public static int getN1(){
        System.out.println("getN1()方法被调用..");
        return 100;
    }


}
