package com.lcy.outputstream;

import java.io.*;

/**
 * @author 李春艳
 * @version 1.0
 * 演示使用BufferedOutputStream 和 BufferedInputStream使用
 * 使用他们，可以完成二进制文件拷贝.
 * 思考：字节流可以操作二进制文件，也可以操作文本文件
 */
public class BufferedCopy {
    public static void main(String[] args) {
        String srcFilePath = "f:/vissim交叉口.png";
        String destFilePath = "f:/vissim交叉口2.png";
        BufferedInputStream bi = null;
        BufferedOutputStream bo = null;
        int readLen = 0;
        byte[] buf = new byte[1024];
        try {
            bi = new BufferedInputStream(new FileInputStream(srcFilePath));
            bo = new BufferedOutputStream(new FileOutputStream(destFilePath));
            while ((readLen=bi.read(buf))!=-1){
                bo.write(buf,0,readLen);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bi!=null){
                    bi.close();
                }
                if (bo!=null){
                    bo.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
