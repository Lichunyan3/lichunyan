package com.lcy.outputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author 李春艳
 * @version 1.0
 */
public class FileCopy {
    public static void main(String[] args) {
        //完成文件拷贝
        //边读边写
        String srcFilePath = "f:/vissim交叉口.png";
        String destFilePath = "g:/vissim交叉口.png";
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;

        try {
            fileInputStream = new FileInputStream(srcFilePath);
            fileOutputStream = new FileOutputStream(destFilePath);
            byte[] buf = new byte[1024];
            int readLen = 0;
            while ((readLen=fileInputStream.read(buf))!=-1){
                fileOutputStream.write(buf,0,readLen);
            }
            System.out.println("拷贝成功");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileInputStream!=null){
                    fileInputStream.close();
                }
                if (fileOutputStream!=null){
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
