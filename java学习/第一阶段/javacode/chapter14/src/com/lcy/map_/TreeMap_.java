package com.lcy.map_;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * @author 李春艳
 * @version 1.0
 */
public class TreeMap_ {
    public static void main(String[] args) {
        //TreeMap treeMap = new TreeMap();
        TreeMap treeMap = new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String)o1).compareTo((String)o2);
            }
        });
        treeMap.put("jack","杰克");
        treeMap.put("tom","汤姆");
        treeMap.put("kristina","克瑞斯提诺");
        treeMap.put("smith","斯密斯");
        System.out.println(treeMap);
    }
}
