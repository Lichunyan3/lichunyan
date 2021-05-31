package com.lcy.innerclass;

public class InnerClassExercise {
    public static void main(String[] args) {
//        new Bell(){
//            @Override
//            public void ring() {
//                System.out.println("懒猪起床了");
//            }
//        }.ring();
        CellPhone cellPhone = new CellPhone();
        cellPhone.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("小伙伴们上课了");
            }
        });
        cellPhone.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("懒猪起床了");
            }
        });
    }
}
interface Bell{
    void ring();
}
class CellPhone{
    public void alarmClock(Bell bell){
        bell.ring();
    }
}