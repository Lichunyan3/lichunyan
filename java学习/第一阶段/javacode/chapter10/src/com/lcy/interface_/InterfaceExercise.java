package com.lcy.interface_;

public class InterfaceExercise {
    public static void main(String[] args) {
        new C().pX();
    }

}
interface A{
    public static final int x = 0;
}
class B{
    int x = 1;
}
class C extends B implements A{
    public void pX(){
        System.out.println(A.x + " " + super.x);//可以明确的指定x
    }
}