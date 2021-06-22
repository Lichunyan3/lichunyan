package com.lcy.map_;

import java.util.*;

/**
 * @author 李春艳
 * @version 1.0
 */
public class MapFor {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("邓超","孙俪");
        map.put("宋喆","马蓉");
        map.put("刘令博",null);
        map.put(null,"刘亦菲");
        map.put("鹿晗","关晓彤");
        //取出所有的key，通过key取出对应的value
        Set keySet = map.keySet();
        //增强for
        System.out.println("=============");
        for (Object key:keySet){
            System.out.println(key+"-"+map.get(key));
        }
        //迭代器
        System.out.println("==============");
        Iterator iterator = keySet.iterator();
        while (iterator.hasNext()) {
            Object key =  iterator.next();
            System.out.println(key+"::"+map.get(key));

        }
        //把所有的values取出
        Collection values = map.values();
        System.out.println("===========");
        for (Object value:values){
            System.out.println(value);
        }
        System.out.println("=========");
        Iterator iterator1 = values.iterator();
        while (iterator1.hasNext()) {
            Object value =  iterator1.next();
            System.out.println(value);
        }

        //通过EntrySet来获取k-v
        Set entrySet = map.entrySet();
        System.out.println("=======");
        for (Object entry:entrySet){
            Map.Entry m = (Map.Entry)entry;
            System.out.println(m.getKey()+"-"+m.getValue());
        }
        System.out.println("=========");
        Iterator iterator2 = entrySet.iterator();
        while (iterator2.hasNext()) {
            Object entry2 =  iterator2.next();
            Map.Entry m = (Map.Entry)entry2;
            System.out.println(m.getKey()+"-"+m.getValue());
        }

    }
}
