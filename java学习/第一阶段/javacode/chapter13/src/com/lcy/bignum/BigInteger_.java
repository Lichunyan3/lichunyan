package com.lcy.bignum;

import java.math.BigInteger;

/**
 * @author 李春艳
 * @version 1.0
 */
public class BigInteger_ {
    public static void main(String[] args) {
        long l = 235671987654l;
        BigInteger bigInteger = new BigInteger("4238647874839393442394");
        BigInteger bigInteger1 = new BigInteger("100");
        System.out.println(bigInteger);
        //四则运算要使用相应的方法add subtract multiply divide
        BigInteger add = bigInteger.divide(bigInteger1);
        System.out.println(add);

    }
}
