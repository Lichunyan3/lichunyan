package com.lcy.syn;

/**
 * @author 李春艳
 * @version 1.0
 */
public class SellTicket {
    public static void main(String[] args) {
        SellTicket03 sellTicket03 = new SellTicket03();
        new Thread(sellTicket03).start();
        new Thread(sellTicket03).start();
        new Thread(sellTicket03).start();
    }
}
//实现线程同步
class SellTicket03 implements Runnable{
    private static int ticketNum = 10;
    private boolean loop = true;
    public synchronized void sell(){
        if (ticketNum<=0){
            System.out.println("售票结束..");
            loop = false;
            return;
        }
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("窗口"+Thread.currentThread().getName()+"售出一张票，剩余"
                +(--ticketNum)+"张票");
    }
    @Override
    public void run() {
        while (loop){
            sell();
        }
    }
}