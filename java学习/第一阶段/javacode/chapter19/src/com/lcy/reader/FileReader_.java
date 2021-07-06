package com.lcy.reader;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author 李春艳
 * @version 1.0
 */
public class FileReader_ {
    public static void main(String[] args) {

    }
    /**
     * 单个字符读取文件
     */
    @Test
    public void readFile01(){
        String fileName = "f:/a.txt";
        FileReader fileReader = null;
        int data = 0;
        try {
            fileReader = new FileReader(fileName);
            while ((data = fileReader.read())!=-1){
                System.out.print((char)data);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 字符数组读取文件
     */
    @Test
    public void readFile02(){
        String fileName = "f:/hello.txt";
        FileReader fileReader = null;
        int readLen = 0;
        char[] buf = new char[8];
        try {
            fileReader = new FileReader(fileName);
            while ((readLen = fileReader.read(buf))!=-1){
                System.out.print(new String(buf,0,readLen));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
