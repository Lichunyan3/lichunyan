package com.lcy.threaduse;

/**
 * @author 李春艳
 * @version 1.0
 */
public class Thread02 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Thread thread = new Thread(dog);
        thread.start();
    }
}
class Dog implements Runnable{
    private int time = 0;
    @Override
    public void run() {
        while (true) {
            System.out.println("汪汪汪 " + (++time) + " 线程名=" + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (time==10){
                break;
            }
        }
    }
}