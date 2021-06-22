package com.lcy.collection;

import java.util.ArrayList;

/**
 * @author 李春艳
 * @version 1.0
 */
public class ArrayListDebug {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
        for (int i = 11; i <= 15; i++) {
            list.add(i);
        }
        list.add(100);
        list.add(200);
        list.add(null);
    }
}
