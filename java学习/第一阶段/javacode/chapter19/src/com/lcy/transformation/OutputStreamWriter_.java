package com.lcy.transformation;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * @author 李春艳
 * @version 1.0
 */
public class OutputStreamWriter_ {
    public static void main(String[] args) throws IOException {
        String filePath = "f:\\hsp.txt";
        String charSet = "gbk";
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(filePath), charSet);
        osw.write("hi, 韩顺平教育");
        osw.close();
        System.out.println("按照 " + charSet + " 保存文件成功~");
    }
}
