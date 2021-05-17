package com.lcy.encap;

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account();
        account.setName("jack");
        account.setLeftMoney(20);
        account.setPassword("234567");
        System.out.println(account.info());
    }
}
