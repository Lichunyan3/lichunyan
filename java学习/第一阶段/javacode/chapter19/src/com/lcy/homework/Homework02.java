package com.lcy.homework;

import java.io.*;

/**
 * @author 李春艳
 * @version 1.0
 */
public class Homework02 {
    public static void main(String[] args) {
        String filePath = "f:/a.txt";
        BufferedReader br = null;
        String line;
        int lineNum = 0;
        try {
            br = new BufferedReader(new InputStreamReader(new FileInputStream(filePath),"gbk"));
            while ((line=br.readLine())!=null){
                System.out.println("行号"+(++lineNum)+line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br!=null){
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
