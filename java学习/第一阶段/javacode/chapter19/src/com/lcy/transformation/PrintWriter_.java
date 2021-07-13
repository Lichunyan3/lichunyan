package com.lcy.transformation;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author 李春艳
 * @version 1.0
 */
public class PrintWriter_ {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter(new FileWriter("F:\\a.txt"));
        pw.print("风雨同舟");
        pw.close();//flush + 关闭流, 才会将数据写入到文件..
    }
}
