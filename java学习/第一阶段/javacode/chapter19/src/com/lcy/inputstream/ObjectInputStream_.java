package com.lcy.inputstream;

import com.lcy.outputstream.Dog;
import sun.security.x509.OIDMap;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @author 李春艳
 * @version 1.0
 */
public class ObjectInputStream_ {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String filePath = "f:/data.dat";
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath));
        System.out.println(ois.readInt());
        System.out.println(ois.readDouble());
        System.out.println(ois.readBoolean());
        System.out.println(ois.readChar());
        System.out.println(ois.readUTF());
        Object object = ois.readObject();
        System.out.println("运行类型=" + object.getClass());
        System.out.println(object);
        Dog dog = (Dog)object;
        System.out.println(dog.getAge());
        ois.close();
    }
}
