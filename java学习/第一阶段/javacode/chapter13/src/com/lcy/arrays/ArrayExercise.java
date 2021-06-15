package com.lcy.arrays;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author 李春艳
 * @version 1.0
 */
public class ArrayExercise {
    public static void main(String[] args) {
        Book[] books = new Book[4];
        books[0] = new Book("红楼梦~",100);
        books[1] = new Book("金瓶梅~",90);
        books[2] = new Book("青年文摘~",5);
        books[3] = new Book("java从入门到放弃~",300);
        Arrays.sort(books, new Comparator() {//按价格从大到小
            @Override
            public int compare(Object o1, Object o2) {
                Book b1 = (Book) o1;
                Book b2 = (Book) o2;
                double priceDiff = (b2.getPrice() - b1.getPrice());
                if (priceDiff < 0){
                    return -1;
                }else if(priceDiff > 0){
                    return 1;
                }else{
                    return 0;
                }
            }
        });
        System.out.println(Arrays.toString(books));

        Arrays.sort(books, new Comparator() {//按书名长度从大到小
            @Override
            public int compare(Object o1, Object o2) {
                Book b1 = (Book) o1;
                Book b2 = (Book) o2;
                return b2.getName().length() - b1.getName().length();
            }
        });
        System.out.println(Arrays.toString(books));
    }
}
class Book{
  private String name;
  private double price;

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Book() {
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

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
  //定制排序
//  public static void bubble02(Book[] books, Comparator comparator){
//      Book temp = null;
//      for (int i = 0; i < books.length-1; i++) {
//          for (int j = 0; j < books.length - 1 - i; j++) {
//              if (comparator.compare(books[i].getPrice(),books[i+1].getPrice())<0){//从大到小
//                  temp = books[i];
//                  books[i] = books[i+1];
//                  books[i+1] = temp;
//              }
//          }
//      }
//  }

}