package com.xyjg.sort;

import com.xyjg.util.CalUtil;

/**
 * @ClassName SelectionSort
 * @Description 选择排序
 * @Author xyjg
 * @Date 2019-3-24
 **/
public class SelectionSort {
    public static void sort(int[] array) {

        for(int i = 0; i < array.length - 1; i++) {
            int min_position = i;

            for(int j = i + 1; j < array.length; j++){
                min_position = array[j] < array[min_position] ? j : min_position;
            }

            CalUtil.swap(array, i ,min_position);

        }

    }
}
