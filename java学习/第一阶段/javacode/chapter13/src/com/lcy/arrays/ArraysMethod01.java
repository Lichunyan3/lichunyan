package com.lcy.arrays;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author 李春艳
 * @version 1.0
 */
public class ArraysMethod01 {
    public static void main(String[] args) {
        int[] arr = {1,45,25,24,-6};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        Integer[] arr1 = {4,-12,45,1};
        //Comparator实现定制排序
        Arrays.sort(arr1,new Comparator(){
            public int compare(Object o1,Object o2) {
                Integer i1 = (Integer)o1;
                Integer i2 = (Integer)o2;
                return i2 - i1;
            }
        });
        System.out.println(Arrays.toString(arr1));
    }
}
