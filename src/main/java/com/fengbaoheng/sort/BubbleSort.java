package com.fengbaoheng.sort;

import com.fengbaoheng.utils.ArrayUtils;

/**
 * 冒泡排序
 */
public class BubbleSort implements SortService {
    @Override
    public void sort(int[] arr) {
        final int N = arr.length;
        for (int j = N - 1; j >= 0; j--) {
            boolean isSorted = true;

            for (int i = 0; i < j; i++) {
                if (arr[i] > arr[i + 1]) {
                    isSorted = false;
                    ArrayUtils.swap(arr, i, i + 1);
                }
            }

            if (isSorted) {
                return;
            }
        }
    }
}
