package com.lcy.transformation;

import java.io.*;

/**
 * @author 李春艳
 * @version 1.0
 */
public class InputStreamReader_ {
    public static void main(String[] args) throws IOException {
        String filePath = "f:\\a.txt";
        InputStreamReader isr = new InputStreamReader(new FileInputStream(filePath),"utf8");
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        System.out.println("读取内容="+s);
        br.close();
    }
}
