package com.lcy.homework;

public class Homework05 {
    public static void main(String[] args) {
//        CheckingAccount checkingAccount = new CheckingAccount(1000);
//        checkingAccount.deposit(10);
//        checkingAccount.withdraw(9);
//        System.out.println(checkingAccount.getBalance());
        SavingAccount savingAccount = new SavingAccount(1000);
        savingAccount.deposit(10);
        savingAccount.withdraw(8);
        savingAccount.earnMonthlyInterest(0.2);
        System.out.println(savingAccount.getBalance());

    }
}
class BankAccount{
    private double balance;

    public BankAccount(int initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    //存款
    public void deposit(double amount){
        balance += amount;
    }
    //取款
    public void withdraw(double amount){
        balance -= amount;
    }
}

class CheckingAccount extends BankAccount{
    public CheckingAccount(int initialBalance) {
        super(initialBalance);
    }
    //存款

    @Override
    public void deposit(double amount) {
        super.deposit(amount - 1);
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount + 1);
    }
}

class SavingAccount extends BankAccount{
    private double rate = 0.01;//利息
    private int times = 3;//免手续费的次数,每个月有三次
    public SavingAccount(int initialBalance) {
        super(initialBalance);
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getTimes() {
        return times;
    }

    public void setTimes(int times) {
        this.times = times;
    }

    @Override
    public void deposit(double amount) {
        if(times > 0) {
            super.deposit(amount);
        }  else {
            super.deposit(amount - 1);
        }
        times--;
    }

    @Override
    public void withdraw(double amount) {
        if(times > 0) {
            super.withdraw(amount);
        }  else {
            super.withdraw(amount + 1);
        }
        times--;
    }

    public void earnMonthlyInterest(double rate){
        times = 3;//重置为3次
        //统计上个月的利息
        super.deposit(getBalance() * rate);
    }
}