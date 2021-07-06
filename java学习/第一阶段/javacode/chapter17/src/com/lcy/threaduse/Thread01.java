package com.lcy.threaduse;

/**
 * @author 李春艳
 * @version 1.0
 */
public class Thread01 {
    public static void main(String[] args) throws InterruptedException {
        Cat cat = new Cat();
        cat.start();
        //主线程和子线程交替执行
        System.out.println("主线程执行..."+Thread.currentThread().getName());
        for (int i = 0; i < 40; i++) {
            System.out.println("主线程 i="+i);
            Thread.sleep(1000);
        }
    }
}

class Cat extends Thread {
    private int time = 0;

    @Override
    public void run() {
        while (true) {
            System.out.println("喵喵喵 " + (++time) + " 线程名=" + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (time==20){
                break;
            }
        }
    }
}
