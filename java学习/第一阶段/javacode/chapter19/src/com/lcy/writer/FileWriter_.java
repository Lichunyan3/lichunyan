package com.lcy.writer;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author 李春艳
 * @version 1.0
 */
public class FileWriter_ {
    public static void main(String[] args) {
        String filePath = "f:/note.txt";
        FileWriter fileWriter = null;
        char[] chars = {'a','b','c'};
        try {
            fileWriter = new FileWriter(filePath);
            fileWriter.write(3);

            fileWriter.write('H');
//            1) write(char[]):写入指定数组
            fileWriter.write(chars);
//            2) write(char[],off,len):写入指定数组的指定部分
            fileWriter.write("韩顺平教育".toCharArray(), 0, 3);
//            3) write（string）：写入整个字符串
            fileWriter.write(" 你好北京~");
            fileWriter.write("风雨之后，定见彩虹");
//            4) write(string,off,len):写入字符串的指定部分
            fileWriter.write("你好北京",0,2);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
