package com.xyjg.sort;

import com.xyjg.util.CalUtil;

/**
 * @ClassName BubbleSort
 * @Description 冒泡排序
 * （原理）
 * 比较相邻的元素。如果第一个比第二个大，就交换他们两个
 * 对每一对相邻元素做同样的工作，从开始第一对到结尾的最后一对。在这一点，最后的元素应该会是最大的数。
 * 针对所有的元素重复以上的步骤，除了最后一个
 * 持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。
 * 排序过程中总是小数往前放，大数往后放，相当于气泡往上升，所以称作冒泡排序
 *
 * （大白话）
 * 第一个数和第二个数进行比较，如果第一个数大于第二个数，两个数位置交换，
 * 交换后，第二个数（原第一个数），跟第三个数进行比较，
 * 如果还大于，则再进行交换，第三个数（原第一个数）再跟第四个数比较
 * 如果小于，则第三个数（原第三个数）再跟第四个数比较
 * 直到最大的数排到了数组最后。
 * 下次循环，还从已经交换过位置的数组第一个数开始，
 * 到倒数第二个结尾（倒数第一已经是最大了），倒数第二会是本次循环中最大的
 * 依次进行循环，就是冒泡排序
 * @Author xyjg
 * @Date 2019-3-29
 **/
public class BubbleSort {
    public static void sort(int[] array) {

        for(int i = array.length; i > 0; i--) {
            //判断是否进行过比较，如果没有进行过比较，说明数组已经排好了序
            boolean flag = true;

            for(int j = 0; j < i - 1; j++) {
                if(array[j] > array[j+1]) {
                    CalUtil.swap(array, j, j+1);
                    flag =  false;
                }
            }

            if(flag) {
                break;
            }
        }
    }
}
