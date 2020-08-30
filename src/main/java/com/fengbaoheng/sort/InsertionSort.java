package com.fengbaoheng.sort;

import com.fengbaoheng.utils.ArrayUtils;

/**
 * 插入排序
 */
public class InsertionSort implements SortService {
    @Override
    public void sort(int[] arr) {
        final int N = arr.length;

        for (int i = 1; i < N; i++) {

            // 逐个向前比较
            for (int j = i; j > 0; j--) {
                // 找到应该插入的位置
                // 即第一个小于自己的数后侧
                if (arr[j] < arr[j - 1]) {
                    ArrayUtils.swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }
}
