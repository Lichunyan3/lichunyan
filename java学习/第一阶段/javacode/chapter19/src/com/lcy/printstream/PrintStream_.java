package com.lcy.printstream;

import java.io.IOException;
import java.io.PrintStream;

/**
 * @author 李春艳
 * @version 1.0
 */
public class PrintStream_ {
    public static void main(String[] args) throws IOException {
        PrintStream out = System.out;
        out.print("abc");
        out.write("韩顺平".getBytes());
        out.close();
        System.setOut(new PrintStream("f:\\a.txt"));
        System.out.println("明天又是美好的一天");
    }
}
