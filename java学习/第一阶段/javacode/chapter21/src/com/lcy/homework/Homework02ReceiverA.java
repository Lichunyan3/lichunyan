package com.lcy.homework;


import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @author 李春艳
 * @version 1.0
 */
public class Homework02ReceiverA {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(8888);
        byte[] data = new byte[1024];
        DatagramPacket packet = new DatagramPacket(data, data.length);
        socket.receive(packet);

        int length = packet.getLength();
        data = packet.getData();
        String s = new String(data, 0, length);
        String ans = "";
        if ("四大名著是哪些".equals(s)){
            ans = "<三国演义><红楼梦><西游记><水浒传>";
        }else {
            ans = "what?";
        }

        data = ans.getBytes();
        packet = new DatagramPacket(data,data.length, InetAddress.getByName("192.168.2.25"),8889);
        socket.send(packet);

        socket.close();
    }
}
