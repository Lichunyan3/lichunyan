package com.lcy;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author 李春艳
 * @version 1.0
 * 每秒生成随机数发往server
 */
public class ClientThread extends Thread{

    public static void main(String[] args) throws IOException {
        ClientThread clientThread = new ClientThread();
        clientThread.start();
    }

    @Override
    public void run() {
//        ServerThread st = new ServerThread();
        int times = 0;
        Socket socket = null;
        while (true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try {
                socket = new Socket(InetAddress.getLocalHost(), 9999);
            } catch (IOException e) {
                e.printStackTrace();
            }
            int random = (int)(Math.random()*10+1);
            OutputStream outputStream = null;
            try {
                outputStream = socket.getOutputStream();
                outputStream.write((random+"").getBytes());
                times++;
                socket.shutdownOutput();
            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                try {
                    outputStream.close();
                    socket.close();
                    if (times==3){

                        break;
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
//            st.setLoop(false);
        }
    }
}
