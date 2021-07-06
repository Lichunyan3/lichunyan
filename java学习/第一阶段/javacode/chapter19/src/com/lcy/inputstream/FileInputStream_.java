package com.lcy.inputstream;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author 李春艳
 * @version 1.0
 */
public class FileInputStream_ {
    public static void main(String[] args) {

    }
    @Test
    public void readFile01(){
        String filePath = "f:/hello.txt";
        int readData;
        FileInputStream fileInputStream=null;
        try {
            //用于读取文件
             fileInputStream= new FileInputStream(filePath);
            while ((readData=fileInputStream.read())!=-1){
                System.out.print((char)readData);//转成char显示
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭文件流，释放资源
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    @Test
    //使用read(byte[] b)提高效率
    public void readFile02(){
        String filePath = "f:/hello.txt";
        byte[] buf = new byte[8];//一次读取8个字节
        int readLen = 0;
        FileInputStream fileInputStream=null;
        try {
            //用于读取文件
            fileInputStream= new FileInputStream(filePath);
            //如果读取正常，返回实际读取的字节数
            while ((readLen=fileInputStream.read(buf))!=-1){
                System.out.print(new String(buf,0,readLen));//
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭文件流，释放资源
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
