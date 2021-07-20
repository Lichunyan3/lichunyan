package com.lcy.api;

import com.lcy.homework.StreamUtils;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author 李春艳
 * @version 1.0
 * 客户端 文件下载
 */
public class Homework03Client {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入音乐名");
        String music = scanner.next();

        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write(music.getBytes());
        socket.shutdownOutput();

        BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
        byte[] bytes = StreamUtils.streamToByteArray(bis);
        String musicPath = "f:\\"+music+".mp3";
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(musicPath));
        bos.write(bytes);

        bos.close();
        bis.close();
        outputStream.close();
        socket.close();

        System.out.println("客户端退出..");
    }
}
