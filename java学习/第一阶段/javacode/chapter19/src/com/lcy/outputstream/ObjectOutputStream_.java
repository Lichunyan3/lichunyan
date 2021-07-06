package com.lcy.outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @author 李春艳
 * @version 1.0
 */
public class ObjectOutputStream_ {
    public static void main(String[] args) throws IOException {
        String filePath = "f:/data.dat";
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath));
        oos.writeInt(100);
        oos.writeDouble(1.0);
        oos.writeBoolean(true);
        oos.writeChar(99);
        oos.writeUTF("你好");
        oos.writeObject(new Dog("jack",3,"China","blue"));
        oos.close();
        System.out.println("数据保存完毕(序列化形式)");
    }
}
