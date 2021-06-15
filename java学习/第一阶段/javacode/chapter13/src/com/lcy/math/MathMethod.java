package com.lcy.math;

/**
 * @author 李春艳
 * @version 1.0
 */
public class MathMethod {
    public static void main(String[] args) {
        int abs = Math.abs(-4);//绝对值
        System.out.println(abs);
        double pow = Math.pow(2, 4);//2的4次方
        System.out.println(pow);
        double ceil = Math.ceil(-3.9);
        System.out.println(ceil);//向上取整，返回该参数的最小整数（转成double）
        double floor = Math.floor(-4.999);
        System.out.println(floor);//向下取整，返回该参数的最大整数（转成double）
        long round = Math.round(-5.501);
        System.out.println(round);//四舍五入
        double sqrt = Math.sqrt(9.0);//求开方
        System.out.println(sqrt);
        for (int i = 0; i < 10; i++) {
            System.out.println(Math.random());//random返回的是0<=x<1之间的一个随机小数
        }
        //获取a-b之间的一个随机整数，2-7
        //(int)(a) <= x <= (int)(a + Math.random() * (b - a + 1))
        System.out.println((int) (Math.random() * 6) + 2);
        int max = Math.max(1, 7);//返回最小值
        int min = Math.min(2, 4);//返回最小大值
        System.out.println(max + " , " + min);
    }
}
