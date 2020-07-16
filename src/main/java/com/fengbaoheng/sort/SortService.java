package com.fengbaoheng.sort;

/**
 * 排序算法接口
 */
public interface SortService {

    /**
     * 对传入数组排序
     *
     * @param arr 待排序数组
     */
    void sort(int[] arr);

    /**
     * 交换数组中两个索引的位置
     */
    default void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
