package com.lcy.bignum;

import java.math.BigDecimal;

/**
 * @author 李春艳
 * @version 1.0
 */
public class BigDecimal_ {
    public static void main(String[] args) {
        double d = 199.356767643245d;
        BigDecimal bigDecimal = new BigDecimal("2.567857444445690865432456");
        System.out.println(bigDecimal);
        //四则运输同样要使用对应方法
        BigDecimal bigDecimal1 = new BigDecimal(1.1);
        System.out.println(bigDecimal.add(bigDecimal1));
        //可能抛出异常ArithmeticException  除不尽
        //在调用方法时指定精度即可 保留分子的精度
        System.out.println(bigDecimal.divide(bigDecimal1,BigDecimal.ROUND_CEILING));
    }

}
