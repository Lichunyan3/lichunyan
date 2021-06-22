package com.lcy.homework;

import java.util.ArrayList;

/**
 * @author 李春艳
 * @version 1.0
 */
public class Homework01 {
    public static void main(String[] args) {
        News news1 = new News("新冠确诊病例超千万，数百万印度教信徒赴恒河“圣浴”引民众担忧");
        News news2 = new News("男子突然想起两个月前钓的鱼还在网兜里，捞起一看赶紧放生");
        ArrayList<News> news = new ArrayList<>();
        news.add(news1);
        news.add(news2);
        //倒序遍历
        int size = news.size();
        for (int i = size - 1; i >= 0; i--) {
            String str = news.get(i).getTitle();
            if (str.length() > 15) {
                System.out.println(str.substring(0, 15) + "...");
            }else {
                System.out.println(str);
            }
        }
    }
}

class News {
    private String title;
    private String content;

    public News(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "News{" +
                "title='" + title + '\'' +
                '}';
    }
}