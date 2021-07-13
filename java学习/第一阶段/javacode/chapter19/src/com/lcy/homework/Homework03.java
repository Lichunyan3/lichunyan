package com.lcy.homework;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.Properties;

/**
 * @author 李春艳
 * @version 1.0
 */
public class Homework03 {
    public static void main(String[] args) throws IOException {
        String filePath = "src\\dog.properties";
        Properties properties = new Properties();
        properties.load(new FileReader(filePath));
//        properties.list(System.out);
        String name = properties.getProperty("name");
        int age = Integer.parseInt(properties.getProperty("age"));
        String color = properties.getProperty("color");
        Dog dog = new Dog(name, age, color);
        System.out.println(dog);
        //序列化
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("f:\\dog.txt"));
        oos.writeObject(dog);
        oos.close();
    }
    //反序列化
    @Test
    public void m() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("f:\\dog.txt"));
        Dog dog = (Dog)ois.readObject();
        System.out.println(dog);
        ois.close();
    }
}
class Dog implements Serializable{
    private String name;
    private int age;
    private String color;

    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}