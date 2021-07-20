package com.lcy.upload;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author 李春艳
 * @version 1.0
 * 文件上传的服务端
 */
public class TCPFileUploadServer {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(8888);
        Socket socket = serverSocket.accept();

        BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
        byte[] bytes = StreamUtils.streamToByteArray(bis);

        String destPath = "src\\vissim交叉口.png";
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destPath));
        bos.write(bytes);
        bis.close();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bw.write("收到图片");
        bw.flush();
        socket.shutdownOutput();

        bw.close();
        bos.close();
        socket.close();
        serverSocket.close();
    }
}
