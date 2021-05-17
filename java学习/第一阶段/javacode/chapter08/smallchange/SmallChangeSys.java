package com.lcy.smallchange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSys {
    //化繁为简
    //1、先完成显示菜单，并可以选择菜单，给出对应提示
    public static void main(String[] args) {
        boolean loop = true;
        Scanner scanner = new Scanner(System.in);
        int key;
        //2、添加明细功能
        String details = "-----------------零钱通菜单-----------------";

        //3、定义新变量，记录收益情况
        double money;//记录每次收支金额
        double balance = 0;//余额
        Date date = null;//获取日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");//用于日期格式化

        //4、记录消费情况
        String note;//保存消费原因
        do{
            System.out.println("==================零钱通菜单==================");
            System.out.println("\t\t\t1 零钱通明细");
            System.out.println("\t\t\t2 收益入账");
            System.out.println("\t\t\t3 消费");
            System.out.println("\t\t\t4 退     出");
            System.out.println("请选择（1-4）：");
            key = scanner.nextInt();
            switch (key){
                case 1:
                    System.out.println(details);
                    break;
                case 2:
                    System.out.println("收入金额:");
                    money = scanner.nextDouble();
                    //money校验
                    //思路：找出不正确的条件，然后给出提示，直接break
                    if(money <= 0){
                        System.out.println("收入金额应该大于0");
                        break;
                    }
                    balance += money;
                    date = new Date();
                    details += "\n收益入账\t+" + money + "\t" + sdf.format(date) + "\t余额:" + balance;
                    break;
                case 3:
                    System.out.println("消费金额:");
                    money = scanner.nextDouble();
                    //消费校验
                    if (money <= 0 || money > balance){
                        System.out.println("你消费金额应该在0~" + balance);
                        break;
                    }
                    System.out.println("消费说明:");
                    note = scanner.next();
                    balance -= money;
                    date = new Date();
                    details += "\n" + note + "\t-" + money + "\t" + sdf.format(date) + "\t余额:" + balance;
                    break;
                case 4:
                    //提示是否真的退出，用户只能输入y/n，否则阈值循环
                    String answer = "";
                    while (true){//只能输入y/n
                        System.out.println("你确定要退出吗？y/n");
                        answer = scanner.next();
                        if("y".equals(answer) || "n".equals(answer)){
                            break;
                        }
                    }
                    if(answer.equals("y")){
                        loop = false;
                        System.out.println("-----------------退出零钱通项目-----------------");

                    }
                    break;
                default:
                    System.out.println("你输入的数字不对，请重新输入");
            }
        }while (loop);
    }
}
