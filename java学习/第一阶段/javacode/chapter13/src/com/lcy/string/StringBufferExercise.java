package com.lcy.string;

import java.util.Scanner;

/**
 * @author 李春艳
 * @version 1.0
 */
public class StringBufferExercise {
    //输入商品名称和价格，价格的小数点前面每三位用逗号隔开
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入商品名：");
        String name = scanner.next();
        System.out.println("请输入商品价格：");
        String price = scanner.next();
        System.out.println("商品名\t\t商品价格");
        StringBuffer stringBuffer = new StringBuffer(price);
        int index = stringBuffer.lastIndexOf(".");
        for (int j = index; j - 3> 0; j-=3) {
            stringBuffer.insert(j -3,",");
        }
        price  = new String(stringBuffer);
        System.out.println(name+"\t\t"+price);
    }
}
