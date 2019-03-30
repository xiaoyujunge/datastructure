package com.xyjg.util;

/**
 * @ClassName CalUtil
 * @Description 计算工具类
 * @Author xyjg
 * @Date 2019-3-24
 **/
public class CalUtil {
    /**
     * 数组中两个数进行交换
     * @param array
     * @param i
     * @param j
     */
    public static void swap(int array[], int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
