package com.lcy.method;

/**
 * @author 李春艳
 * @version 1.0
 */
public class ThreadMethodExercise {
    public static void main(String[] args) throws InterruptedException {
        A a = new A();
        for (int i = 1; i <= 10; i++) {
            System.out.println("hi"+i);
            if (i==5){
                a.start();
                a.join();
                System.out.println("子线程结束..");
            }
            Thread.sleep(500);
        }
        System.out.println("主线程结束..");
    }
}

class A extends Thread {
    private int count = 0;

    @Override
    public void run() {
        while (true) {
            System.out.println("hello" + (++count));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (count==10){
                break;
            }
        }
    }
}