package com.lcy.homework;

/**
 * @author 李春艳
 * @version 1.0
 */
public class Homework03 {
    public static void main(String[] args) {
        String str = "Han shun Ping";
        printName(str);


    }
    public static void printName(String str){
        if (str==null){
            System.out.println("str不能为空");
            return;
        }
        String[] names = str.split(" ");
        if (names.length!=3){
            System.out.println("字符串格式错误");
            return;
        }
        String format = String.format("%s,%s .%c", names[2], names[0], names[1].toUpperCase().charAt(0));
        System.out.println(format);
    }
}
