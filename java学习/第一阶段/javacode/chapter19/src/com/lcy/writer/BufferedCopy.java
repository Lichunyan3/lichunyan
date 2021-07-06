package com.lcy.writer;

import java.io.*;

/**
 * @author 李春艳
 * @version 1.0
 */
public class BufferedCopy {
    public static void main(String[] args) {
        String srcFilePath = "f:/a.txt";
        String destFilePath = "f:/c.txt";
        BufferedReader br = null;
        BufferedWriter bw = null;
        String line;
        try {
            br = new BufferedReader(new FileReader(srcFilePath));
            bw = new BufferedWriter(new FileWriter(destFilePath));
            while ((line = br.readLine())!=null){
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br!=null){
                    br.close();
                }
                if (bw!=null){
                    bw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
