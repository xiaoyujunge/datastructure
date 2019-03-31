package com.xyjg.sort;

import com.xyjg.util.CalUtil;

/**
 * @ClassName ShellSort
 * @Description 希尔排序
 * 希尔排序是插入排序的一种更高效改进版本
 * 假设开始增量为4，那么先选择数组下标为 0,4,8,12 ……，4n 的元素，
 * 在这些元素中先进行一次完整的插入排序，
 * 再对 1,5,9,13 ……，4n+1 的元素 进行一次完整的插入排序
 * 再分别对 4n+2、4n+3 的元素们进行一次插入排序
 * 增量为4情况下，每个元素都做了一遍排序。
 * 这时，增量减为 3 或 2，再对它们按照上述方法做排序，
 * 最后，做一遍增量为 1 的插入排序。
 * (不管增量如何变小，最终一定要做一遍增量为 1 的插入排序)
 * 本方法中，增量的开始值和变化计算方法，采用 knuth 序列变化规则
 * @Author xyjg
 * @Date 2019-3-31
 **/
public class ShellSort {
    public static void sort(int[] array) {
        //计算 knuth 序列
        int gap = 1;
        while (gap <= array.length / 3) {
            gap = gap * 3 + 1;
        }

        for(int h = gap; h > 0; h = (h-1)/3) {
            for (int i = h; i < array.length; i++) {
                for (int j = i; j > h - 1; j -= h) {
                    if (array[j - h] > array[j]) {
                        CalUtil.swap(array, j - h, j);
                    }
                }
            }
        }
    }
}
