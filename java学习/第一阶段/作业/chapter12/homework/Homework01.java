package com.lcy.homework;

import java.util.Scanner;

/**
 * @author 李春艳
 * @version 1.0
 */
public class Homework01 {
    public static void main(String[] args) {
        try {
            if (args.length!=2){
                throw new ArrayIndexOutOfBoundsException("参数个数不正确");
            }
            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);
            System.out.println(EcmDef.cal(n1, n2));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }catch (NumberFormatException e){
            System.out.println("参数格式错误，必须为整数");
        }catch (ArithmeticException e){
            System.out.println("除数不能为0");
        }
    }
}

class EcmDef{
    public static double cal(int n1,int n2) {
            return n1 / n2;
    }
}
