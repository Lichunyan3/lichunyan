package com.lcy.exception;

import java.util.Scanner;

/**
 * @author 李春艳
 * @version 1.0
 */
public class ExceptionExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;
        do {
            System.out.println("请输入一个整数");
            String str = scanner.next();
            try {
                int i = Integer.parseInt(str);
                loop = false;
            } catch (Exception e) {
                System.out.println("你输入的不是整数，请重新输入：");
            }
        }while (loop);
    }
}
