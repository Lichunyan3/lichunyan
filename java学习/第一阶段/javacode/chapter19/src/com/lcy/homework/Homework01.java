package com.lcy.homework;

import java.io.*;

/**
 * @author 李春艳
 * @version 1.0
 */
public class Homework01 {
    public static void main(String[] args) throws IOException {
        String directoryPath = "f:/mytemp";
        File file = new File(directoryPath);
        if (file.exists()){
            System.out.println("该文件已经存在");
        }else {
            if (file.mkdir()){
                System.out.println("创建成功");
            }else {
                System.out.println("创建失败");
            }
        }
        String fileName = "hello.txt";
        File file1 = new File(directoryPath,fileName);
        if (file1.exists()){
            System.out.println(fileName+"已经存在，无需重复创建");
        }else {
            if (file1.createNewFile()){
                System.out.println("创建成功");
                BufferedWriter bw = new BufferedWriter(new FileWriter(directoryPath +"\\"+ fileName));
                bw.write("hello,world~");
                bw.close();
            }else {
                System.out.println("创建失败");
            }
        }
    }
}
