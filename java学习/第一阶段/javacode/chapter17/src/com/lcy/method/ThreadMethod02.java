package com.lcy.method;

/**
 * @author 李春艳
 * @version 1.0
 */
public class ThreadMethod02 {
    public static void main(String[] args) throws InterruptedException {
        T t = new T();
        t.setName("小李");
        t.setPriority(Thread.MIN_PRIORITY);
        t.start();
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println(t.getName() + " 线程的优先级 =" +t.getPriority());
        t.interrupt();//中断t的休眠
    }
}
class T extends Thread{
    @Override
    public void run() {
        while (true) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(Thread.currentThread().getName()+"吃包子" +i);
            }
            try {
                System.out.println(Thread.currentThread().getName()+"休眠中..");
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName()+"被中断了");
            }
        }
    }
}