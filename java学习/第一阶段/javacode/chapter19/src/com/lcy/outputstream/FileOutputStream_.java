package com.lcy.outputstream;

import org.junit.jupiter.api.Test;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author 李春艳
 * @version 1.0
 */
public class FileOutputStream_ {
    public static void main(String[] args) {

    }

    @Test
    public void writeFile(){
        String filePath = "f:/a.txt";
        FileOutputStream fileOutputStream = null;


        try {
            //new FileOutputStream(filePath)当写入内容时，会覆盖原来的内容
            //new FileOutputStream(filePath,true)当写入内容时，会追加到文件后面
            fileOutputStream = new FileOutputStream(filePath,true);
            //写入一个字节
            //fileOutputStream.write('H');
            //写入字符串
            String str = "hello,world";
            //str.getBytes()可以把 字符串->字节数组
            //fileOutputStream.write(str.getBytes());
            fileOutputStream.write(str.getBytes(),0,3);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
