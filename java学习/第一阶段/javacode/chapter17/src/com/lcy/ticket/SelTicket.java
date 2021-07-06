package com.lcy.ticket;

/**
 * @author 李春艳
 * @version 1.0
 */
public class SelTicket {
    public static void main(String[] args) {
//        SelTicket01 selTicket01 = new SelTicket01();
//        SelTicket01 selTicket02 = new SelTicket01();
//        SelTicket01 selTicket03 = new SelTicket01();
//        selTicket01.start();
//        selTicket02.start();
//        selTicket03.start();

        System.out.println("===使用实现接口方式来售票=====");
        SelTicket02 selTicket022 = new SelTicket02();
        new Thread(selTicket022).start();
        new Thread(selTicket022).start();
        new Thread(selTicket022).start();


    }
}
//使用Thread方式
class SelTicket01 extends Thread{
    private static int ticketNum = 10;
    @Override
    public void run() {
        while (true){
            if (ticketNum<=0){
                System.out.println("售票结束..");
                break;
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("窗口"+Thread.currentThread().getName()+"售出一张票，剩余"
                    +(--ticketNum)+"张票");
        }
    }
}

//使用Runnable方式
class SelTicket02 implements Runnable{
    private static int ticketNum = 10;
    @Override
    public void run() {
        while (true){
            if (ticketNum<=0){
                System.out.println("售票结束..");
                break;
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("窗口"+Thread.currentThread().getName()+"售出一张票，剩余"
                    +(--ticketNum)+"张票");
        }
    }
}