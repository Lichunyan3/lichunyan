package com.lcy.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author 李春艳
 * @version 1.0
 */
public class ListExercise01 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("hello");
        list.add("hi");
        list.add("h");
        list.add("e");
        list.add("l");
        list.add("l");
        list.add("o");
        list.add("he");
        list.add("llo");
        list.add("lo");
        list.add(2,"韩顺平教育");
        System.out.println(list.get(4));
        list.remove(5);
        list.set(6,"hellohsp");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object object =  iterator.next();
            System.out.println(object);
        }

    }
}
