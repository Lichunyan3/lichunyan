package com.lcy.api;

import com.lcy.homework.StreamUtils;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author 李春艳
 * @version 1.0
 * 服务端 文件下载
 */
public class Homework03Server {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("服务端，在9989端口监听，等待下载文件");
        Socket socket = serverSocket.accept();
        //读取客户端发送要下载的文件名
        InputStream inputStream = socket.getInputStream();
        byte[] b = new byte[1024];
        int len = 0;
        String downLoadFileName = "";
        while ((len = inputStream.read(b)) != -1) {
            downLoadFileName += new String(b, 0 , len);
        }
        System.out.println("客户端希望下载文件名=" + downLoadFileName);
        String musicName = "";
        if ("高山流水".equals(downLoadFileName)){
            musicName = "src:\\高山流水.mp3";
        } else {
            musicName = "src:\\无名.mp3";
        }

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(musicName));
        byte[] bytes = StreamUtils.streamToByteArray(bis);
        OutputStream outputStream = socket.getOutputStream();
        BufferedOutputStream bos = new BufferedOutputStream(outputStream);
        bos.write(bytes);
        socket.shutdownOutput();

        bis.close();
        inputStream.close();
        socket.close();
        serverSocket.close();
        System.out.println("服务端退出..");
    }
}
