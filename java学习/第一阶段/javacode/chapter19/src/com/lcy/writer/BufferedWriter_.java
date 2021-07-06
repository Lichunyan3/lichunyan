package com.lcy.writer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author 李春艳
 * @version 1.0
 */
public class BufferedWriter_ {
    public static void main(String[] args) throws IOException {
        String filePath = "f:/b.txt";
        BufferedWriter bw = new BufferedWriter(new FileWriter(filePath,true));//追加
        bw.write("hello1,韩顺平教育~");
        bw.newLine();
        bw.write("hello2,韩顺平教育~");
        bw.newLine();
        bw.write("hello3,韩顺平教育~");
        bw.newLine();
        bw.close();
    }

}
