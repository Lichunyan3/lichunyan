package com.lcy.homework;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

/**
 * @author 李春艳
 * @version 1.0
 */
public class Homework02SenderB {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(8889);
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的问题");
        String question = scanner.next();
        byte[] data = question.getBytes();
        DatagramPacket packet = new DatagramPacket(data, data.length, InetAddress.getByName("192.168.2.25"), 8888);
        socket.send(packet);

        byte[] buf = new byte[1024];
        packet = new DatagramPacket(buf,buf.length);
        socket.receive(packet);

        int length = packet.getLength();
        data = packet.getData();
        String s = new String(data, 0, length);
        System.out.println(s);

        socket.close();
    }
}
