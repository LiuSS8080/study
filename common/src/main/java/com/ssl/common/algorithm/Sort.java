package com.ssl.common.algorithm;

import java.util.Arrays;

/**
* description:排序算法
* @Date: 2020-08-01
*
*/
public class Sort {
    /**
     * 冒泡
     *
     * @param arr
     */
    public void bubble(int[] arr) {
        int temp = 0;
        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i + 1; j++) {
                if (arr[j] < arr[j - 1]) {
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }

    /**
     * 选择排序
     *
     * @param arr
     */
    public void select(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            int temp = 0;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    /**
     * 插入排序
     *
     * @param arr
     */
    public void insertion(int[] arr) {
        int tmp = 0;
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j >  0; j--) {
                if (arr[j] < arr[j-1]) {
                    tmp = arr[j];
                    arr[j] = arr[j -1];
                    arr[j-1] = tmp;
                }else {
                    break;
                }
            }
        }


    }

}
