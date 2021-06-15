package com.lcy.arrays;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author 李春艳
 * @version 1.0
 */
public class ArraysSortCustom {
    public static void main(String[] args) {
        int[] arr = {1, -4, 67, 24, 0, 20};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
        bubble01(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Integer i1 = (Integer) o1;
                Integer i2 = (Integer) o2;
                return i1-i2;
            }
        });
        System.out.println(Arrays.toString(arr));

    }

    //1、使用冒泡排序
    public static void bubbleSort(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {//从大到小排序
                if (arr[j] < arr[j + 1]) {
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    //结合冒泡+定制排序
    public static void bubble01(int[] arr, Comparator c){
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {//从小到大排序
                if (c.compare(arr[j],arr[j + 1]) > 0) {
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

}
