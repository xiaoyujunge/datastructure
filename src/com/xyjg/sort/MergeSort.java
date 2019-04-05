package com.xyjg.sort;

/**
 * @ClassName MergeSort
 * @Description 归并排序
 * 首先将数组分成两半，要对每一半数组进行排序，规则如下：
 * 每二分之一数组，再进行分成两半操作，再对这四分之一数组进行排序，规则如下：
 * 四分之一数组再进行分两半操作，再对八分之一数组进行排序
 * ……
 * 直到分到最后的数组长度为2或1，不能再分后，再进行排序。
 * 上述是一个递归的操作，到了最后，才会执行下面的排序规则
 *
 * 排序规则：
 * 两个数组（每个数组已经排序完成）
 * 创建长度为两个数组长度相加的一个新的空的数组
 * 依次比较两个数组的值，哪个值小，就先放到新数组中，
 * 再用下一个值与另一个数组当前值比较，小的就继续放到新数组中
 * 最后新数组就是拍好序的两个数组总和
 * @Author xyjg
 * @Date 2019-4-3
 **/
public class MergeSort {

    /**
     * @param array
     * @param left 左边界
     * @param right 右边界
     */
    public static void sort(int[] array, int left, int right) {
        if(left == right) {
            return;
        }
        if(right < left || right <0 || left < 0) {
            throw new RuntimeException("传入参数出问题，left为[" + left + "],right为" + right + "]");
        }

        //找到数组中间位置
        int mid = left + (right - left) / 2;
        //左边数组排序
        sort(array, left, mid);
        //右边数组排序
        sort(array, mid+1, right);
        //归并左右两边
        merge(array, left, mid+1, right);
    }

    /**
     * 将归并数组根据值比较进行排序
     * @param array
     * @param leftPtr 左指针位置
     * @param rightPtr 右指针位置
     * @param rightBound 右边界
     */
    public static void merge(int[] array, int leftPtr, int rightPtr, int rightBound) {
        int mid = rightPtr - 1;
        int[] temp = new int[rightBound - leftPtr + 1];

        int i = leftPtr;
        int j = rightPtr;
        int k = 0;

        while(i <= mid && j <= rightBound) {
            temp[k++] = array[i] <= array[j] ? array[i++] : array[j++];
        }

        while(i <= mid) temp[k++] = array[i++];
        while (j <= rightBound) temp[k++] = array[j++];

        for (int h=0; h < temp.length; h++) {
            array[leftPtr+h] = temp[h];
        }
    }
}
