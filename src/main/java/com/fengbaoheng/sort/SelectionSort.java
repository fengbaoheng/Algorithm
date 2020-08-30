package com.fengbaoheng.sort;

import com.fengbaoheng.utils.ArrayUtils;

/**
 * 选择排序
 */
public class SelectionSort implements SortService {
    @Override
    public void sort(int[] arr) {
        final int N = arr.length;

        for (int i = 0; i < N - 1; i++) {
            // 在i+1~N中查找最小值
            int minValue = arr[i];
            int minIndex = i;
            for (int j = i + 1; j < N; j++) {
                if (arr[j] < minValue) {
                    minValue = arr[j];
                    minIndex = j;
                }
            }

            // 交换最小值， 发生不稳定排序的地方
            ArrayUtils.swap(arr, i, minIndex);
        }
    }
}
