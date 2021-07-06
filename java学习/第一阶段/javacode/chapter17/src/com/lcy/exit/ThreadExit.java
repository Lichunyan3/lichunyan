package com.lcy.exit;

/**
 * @author 李春艳
 * @version 1.0
 */
public class ThreadExit {
    public static void main(String[] args) throws InterruptedException {
        T t = new T();
        t.start();
        System.out.println("主线程休眠5s");
        Thread.sleep(5000);
        t.setLoop(false);
    }
}
class T extends Thread{
    private int count;
    private boolean loop = true;
    @Override
    public void run() {
        while (loop){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("hi"+(++count));
        }

    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }
}