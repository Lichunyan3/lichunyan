package com.lcy.reader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author 李春艳
 * @version 1.0
 */
public class BufferedReader_ {
    public static void main(String[] args) throws IOException {
        String filePath = "f:/a.txt";
        BufferedReader br = null;
        String line = null;
        br = new BufferedReader(new FileReader(filePath));
        while ((line=br.readLine())!=null){
            System.out.println(line);
        }
        br.close();

    }
}
