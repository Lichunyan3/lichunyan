package com.lcy.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 李春艳
 * @version 1.0
 */
public class ListExercise02 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Book("红楼梦", 100, "曹雪芹"));
        list.add(new Book("水浒传", 90, "施耐庵"));
        list.add(new Book("西游记", 10, "吴承恩"));
        for (Object book : list) {
            System.out.println(book);
        }
        //按价格排序
//        Book temp = null;
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - 1 - i; j++) {
                //向下转型
                Book book1 = (Book) list.get(j);
                Book book2 = (Book) list.get(j + 1);
                if (book1.getPrice() > book2.getPrice()) {
//                    temp = book1;
//                    book1 = book2;
//                    book2 = temp;
                    list.set(j, book2);
                    list.set(j + 1, book1);
                }
            }
        }
        System.out.println("====排序后====");
        for (Object book : list) {
            System.out.println(book);
        }
    }
}

class Book {
    private String name;
    private double price;
    private String author;

    public Book(String name, double price, String author) {
        this.name = name;
        this.price = price;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "名称：" + name +
                "\t价格：" + price +
                "\t作者：" + author;
    }
}
