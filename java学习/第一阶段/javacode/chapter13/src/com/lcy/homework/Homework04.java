package com.lcy.homework;

/**
 * @author 李春艳
 * @version 1.0
 */
public class Homework04 {
    public static void main(String[] args) {
        String str = "rthjSSR77";
        char[] chars = str.toCharArray();
        if (str == null){
            System.out.println("字符串不能为空");
            return;
        }
        int num = 0;
        int low = 0;
        int upper = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= '0' && chars[i] <= '9') {
                num++;
            } else if (chars[i] >= 'a' && chars[i] <= 'z') {
                low++;
            } else if (chars[i] >= 'A' && chars[i] <= 'Z') {
                upper++;
            }
        }
        System.out.println("数字个数" + num + "小写字母个数" + low + "大写字母个数" + upper);
    }
}
