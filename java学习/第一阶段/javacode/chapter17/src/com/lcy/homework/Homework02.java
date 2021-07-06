package com.lcy.homework;

/**
 * @author 李春艳
 * @version 1.0
 */
public class Homework02 {
    public static void main(String[] args) {
        Account account = new Account();
        new Thread(account).start();
        new Thread(account).start();
    }
}
class Account implements Runnable{
    private static int money = 10000;
    @Override
    public void run() {
        while (true){
            synchronized (this) {
                if (money < 1000) {
                    System.out.println("余额不足，无法取款");
                    break;
                }
                money -= 1000;
                System.out.println("用户" + Thread.currentThread().getName() + "取了一次钱，剩余金额为"
                        + money);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}