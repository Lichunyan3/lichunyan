package com.lcy.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 李春艳
 * @version 1.0
 */
public class Date01 {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();//获取当前系统时间,默认输出国外常用格式，需进行格式转换
        System.out.println("当前日期=" + date);
        Date date1 = new Date(9235455);
        System.out.println("date1="+date1);
        //指定相应的格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年M月dd日 kk:mm:ss E");
        System.out.println(sdf.format(date));

        String s = "2021年5月30日 15:51:26 星期日";
        //得到的parse在输出时仍然是按国外的形式，如果需要指定格式输出，需要转换sdf.format()
        Date parse = sdf.parse(s);
        System.out.println("parse="+parse);
    }
}
