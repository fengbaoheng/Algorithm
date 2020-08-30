package com.fengbaoheng.sort;

import com.fengbaoheng.utils.ArrayUtils;

/**
 * 希尔排序
 */
public class ShellSort implements SortService {
    @Override
    public void sort(int[] arr) {
        final int N = arr.length;

        // h每次缩小, 确保最后一次h==1
        int h = 1;
        while (h < N / 3) {
            h = h * 3 + 1;
        }

        // 一次跨越h步, 最终h==1退化为普通的插入排序
        for (; h >= 1; h /= 3) {

            for (int i = h; i < N; i++) {

                for (int j = i; j - h >= 0; j -= h) {
                    // 当前元素和前面相邻h距离的元素比较
                    if (arr[j] < arr[j - h]) {
                        ArrayUtils.swap(arr, j, j - h);
                    } else {
                        break;
                    }
                }
            }
        }
    }
}
