package com.lcy.socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author 李春艳
 * @version 1.0
 * 服务端，使用字符流方式读写
 */
public class SocketTCP03Server {
    public static void main(String[] args) throws IOException {
        //思路
        //1. 在本机 的9999端口监听, 等待连接
        //   细节: 要求在本机没有其它服务在监听9999
        //   细节：这个 ServerSocket 可以通过 accept() 返回多个Socket[多个客户端连接服务器的并发]
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("服务端，在9999端口监听，等待连接..");
        //2. 当没有客户端连接9999端口时，程序会 阻塞, 等待连接
        //   如果有客户端连接，则会返回Socket对象，程序继续
        Socket socket = serverSocket.accept();

        //3. 通过socket.getInputStream() 读取客户端写入到数据通道的数据, 显示
        InputStream is = socket.getInputStream();
        //4. IO读取
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        String s = br.readLine();
        System.out.println(s);
        //5. 获取socket相关联的输出流
        OutputStream outputStream = socket.getOutputStream();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(outputStream));
        bw.write("hello,client");
        //   设置结束标记
        bw.newLine();
        bw.flush();
        //6.关闭流和socket
        bw.close();
        br.close();
        socket.close();
        serverSocket.close();
        System.out.println("服务端退出..");
    }
}
