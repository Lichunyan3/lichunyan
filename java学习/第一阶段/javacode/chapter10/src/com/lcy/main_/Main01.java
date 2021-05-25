package com.lcy.main_;

public class Main01 {
    public static String name = "jack";
    public static void hi(){
        System.out.println("hi()..");
    }
    public int n1 = 10;
    private void hello(){
        System.out.println("hello()...");
    }
    public static void main(String[] args) {
        System.out.println(name);
        hi();
        Main01 main01 = new Main01();
        System.out.println(main01.n1);
        main01.hello();
    }
}
