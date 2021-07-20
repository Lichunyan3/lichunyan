package com.lcy.homework;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author 李春艳
 * @version 1.0
 * 服务端
 */
public class Homework01Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        Socket socket = serverSocket.accept();
        InputStream inputStream = socket.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
        String s = br.readLine();
        String ans = "";
        if ("name".equals(s)){
            ans = "我是李春艳";
        } else if ("hobby".equals(s)){
            ans = "我爱学习";
        }else {
            ans = "你说啥？";
        }

        OutputStream outputStream = socket.getOutputStream();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(outputStream));
        bw.write(ans);
        bw.newLine();
        bw.flush();

        bw.close();
        br.close();
        socket.close();
        serverSocket.close();



    }
}
