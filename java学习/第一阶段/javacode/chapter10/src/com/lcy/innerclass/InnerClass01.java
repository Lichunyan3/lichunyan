package com.lcy.innerclass;

public class InnerClass01 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.m2();
    }
}

class Outer {
    private int n1 = 100;

    private void m1() {
        System.out.println("外部类的m1方法..");
    }

    public void m2() {
        class Inner {
            private int n1 = 800;

            public void f1() {
                System.out.println(n1 + " " + Outer.this.n1);
                m1();
            }
        }
        Inner inner = new Inner();
        inner.f1();
    }
}