package com.lcy;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author 李春艳
 * @version 1.0
 * 将收到的数据打印到控制台
 */
public class ServerThread extends Thread{
//    private boolean loop = true;
//    public void setLoop(boolean loop) {
//        this.loop = loop;
//    }

    public static void main(String[] args) {
        ServerThread serverThread = new ServerThread();
//        serverThread.setDaemon(true);
        serverThread.start();
    }

    @Override
    public void run() {
        ServerSocket serverSocket = null;
        Socket socket = null;
        InputStream inputStream = null;

        while (true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try {
                serverSocket = new ServerSocket(9999);
                socket = serverSocket.accept();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                inputStream = socket.getInputStream();
                int len = 0;
                byte[] buf = new byte[10];
                while ((len=inputStream.read(buf))!=-1){
                    System.out.println(new String(buf,0,len));
                }
            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                try {
                    inputStream.close();
                    socket.close();
                    serverSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
