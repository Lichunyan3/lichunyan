package com.lcy.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author 李春艳
 * @version 1.0
 */
public class Collections_ {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("milan");
        list.add("tom");
        list.add("smith");
        list.add("king");
        System.out.println("========反转========");
        Collections.reverse(list);
        System.out.println("list=" + list);
        System.out.println("========随机排序========");
        for (int i = 0; i < 5; i++) {
            Collections.shuffle(list);
            System.out.println("list=" + list);
        }
        System.out.println("========升序排序========");
        Collections.sort(list);
        System.out.println("list=" + list);//按字母顺序排序
        //按照字符串长度大小排序
        Collections.sort(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String) o1).length() - ((String) o2).length();
            }
        });
        System.out.println("按照字符串长度大小排序list=" + list);
        System.out.println("========交换========");
        Collections.swap(list, 1, 3);
        System.out.println("list=" + list);
        System.out.println("========自然顺序最大元素========");
        System.out.println(Collections.max(list));
        System.out.println("========返回长度最大元素========");
        Object maxObject = Collections.max(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String) o1).length() - ((String) o2).length();
            }
        });
        System.out.println(maxObject);
        //最小值min和max相同
        System.out.println("========返回指定元素出现的次数========");
        System.out.println(Collections.frequency(list,"tom"));
        System.out.println("========拷贝========");
        ArrayList dest = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            dest.add("");
        }
        Collections.copy(dest,list);
        System.out.println("dest="+dest);
        System.out.println("========替换========");
        Collections.replaceAll(list,"tom","汤姆");
        System.out.println("list=" + list);
    }
}
