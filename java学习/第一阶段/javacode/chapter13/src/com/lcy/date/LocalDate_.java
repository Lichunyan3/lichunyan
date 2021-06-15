package com.lcy.date;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @author 李春艳
 * @version 1.0
 */
public class LocalDate_ {
    public static void main(String[] args) {
        //第三代日期
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
        System.out.println("年："+ldt.getYear());
        System.out.println("月："+ldt.getMonth());
        System.out.println("月："+ldt.getMonthValue());
        System.out.println("日："+ldt.getDayOfMonth());
        System.out.println("小时："+ldt.getHour());
        System.out.println("分钟："+ldt.getMinute());
        System.out.println("秒："+ldt.getSecond());

        //格式化
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");
        String format = dtf.format(ldt);
        System.out.println(format);

        //时间戳
        Instant now = Instant.now();
        System.out.println(now);
        //和Date类相互转换
        Date date = Date.from(now);
        Instant instant = date.toInstant();

        //其他方法
        LocalDateTime localDateTime = ldt.plusDays(890);
        System.out.println("890天后是"+dtf.format(localDateTime));
        LocalDateTime localDateTime1 = ldt.minusMinutes(3456);
        System.out.println("3456分钟前是"+dtf.format(localDateTime1));
    }
}
