package com.lcy.set_;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author 李春艳
 * @version 1.0
 */
public class TreeSet_ {
    public static void main(String[] args) {
        //TreeSet treeSet = new TreeSet();
        TreeSet treeSet = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                //return ((String)o1).compareTo((String)o2);
                //按照长度大小排序
                return ((String) o1).length() - ((String) o2).length();
            }
        });
        treeSet.add("jack");
        treeSet.add("sp");
        treeSet.add("tom");
        treeSet.add("a");
        System.out.println("treeSet=" + treeSet);
    }
}
