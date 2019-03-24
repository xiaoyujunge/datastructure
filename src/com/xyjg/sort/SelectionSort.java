package com.xyjg.sort;

/**
 * @ClassName SelectionSort
 * @Description 选择排序
 * @Author Zhoucj
 * @Date 2019-3-24
 **/
public class SelectionSort {
    public static void main(String[] args) {
        int array[] = {3,5,2,9,1,8,4,7,6};

        int min_position = 0;
        int temp;

        for(int i = 0; i < array.length; i++) {
            for(int j = i; j < array.length; j++){
                if(array[min_position] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            min_position = i + 1;
        }

        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
