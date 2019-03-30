package com.xyjg.sort;

import com.xyjg.util.CalUtil;

/**
 * @ClassName InsertionSort
 * @Description 插入排序
 * （大白话）
 * 第二个元素和第一个元素进行比较，如果第二个大于第一个，则两个元素进行交换
 * 第三个元素和第二个元素（原第一和第二中较大的那个）进行比较，如果第三个大于第二个，则两个元素进行交换，
 * 交换后的第二个（原第三个）再跟第一个元素（原第一和第二中较小的那个）进行比较
 * ……
 * 一直到最后一个（前面 n-1 个已经是有序的），再跟前面逐一比较
 * @Author xyjg
 * @Date 2019-3-30
 **/
public class InsertionSort {
    public static void sort(int[] array) {

        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j-- ) {
                if(array[j] < array[j-1]) {
                    CalUtil.swap(array, j, j-1);
                }
            }
        }

    }

    /**
     * 改进的插入排序，记录当前需要交换的数组值，
     * 跟前面依次比较，把大于它的元素向后移，
     * 遇到元素不大于它，就插入在那个元素之后
     * @param array
     */
    public static void optSort(int[] array) {
        int[] array2 = {6,9,5,7,3,4,8,2,1};
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i;
            for (; j >0 && temp < array[j-1]; j-- ) {
                    array[j] = array[j - 1];
            }
            array[j] = temp;
        }

    }

}
