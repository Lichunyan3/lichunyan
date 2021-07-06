package com.lcy.method;

/**
 * @author 李春艳
 * @version 1.0
 */
public class ThreadMethod01 {
    public static void main(String[] args) throws InterruptedException {
        MyDaemonThread myDaemonThread = new MyDaemonThread();
        myDaemonThread.setDaemon(true);
        myDaemonThread.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("宝强在工作...");
            Thread.sleep(1000);
        }
    }
}
//守护线程
class MyDaemonThread extends Thread{
    @Override
    public void run() {
        for (;;){

            System.out.println("马蓉和宋喆快乐地聊天..");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
