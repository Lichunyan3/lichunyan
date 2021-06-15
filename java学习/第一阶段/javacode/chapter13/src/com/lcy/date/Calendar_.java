package com.lcy.date;

import java.util.Calendar;

/**
 * @author 李春艳
 * @version 1.0
 */
public class Calendar_ {
    public static void main(String[] args) {
        Calendar instance = Calendar.getInstance();
        System.out.println("instance="+instance);
        //获取日历对象的某个日历字段
        System.out.println("年："+instance.get(Calendar.YEAR));
        System.out.println("月："+(instance.get(Calendar.MONTH) + 1));
        System.out.println("日："+instance.get(Calendar.DAY_OF_MONTH));
        System.out.println("小时："+instance.get(Calendar.HOUR_OF_DAY));
        System.out.println("分钟："+instance.get(Calendar.MINUTE));
        System.out.println("秒："+instance.get(Calendar.SECOND));
        //Calendar没有专门的格式化方法，需要程序员自己来组合显示
        System.out.println(instance.get(Calendar.YEAR)+"年"+(instance.get(Calendar.MONTH)+1)+"月"
                            +instance.get(Calendar.DAY_OF_MONTH)+"日");

    }
}
