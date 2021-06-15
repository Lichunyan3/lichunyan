package com.lcy.homework;

/**
 * @author 李春艳
 * @version 1.0
 */
public class Homework01 {
    public static void main(String[] args) {
        String s = "abcdef";
        try {
            System.out.println(reverse(s, 1, 5));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static String reverse(String str, int start, int end) {
        //对输入的参数做一个验证
        if (!(str != null && start >= 0 && end > start && end < str.length())) {
            throw new RuntimeException("参数不正确");
        }
        char[] chars = str.toCharArray();
        char temp = ' ';
        for (int i = start, j = end; i < j; i++, j--) {
            temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }
        return new String(chars);
    }
}
