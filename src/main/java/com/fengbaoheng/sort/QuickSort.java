package com.fengbaoheng.sort;

import com.fengbaoheng.utils.ArrayUtils;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

/**
 * 快速排序
 */
public class QuickSort implements SortService {

    @Override
    public void sort(int[] arr) {
        // 消除对输入顺序的依赖
        shuffle(arr);

        sort(arr, 0, arr.length - 1);
    }

    private void sort(int[] arr, int low, int high) {
        if (high <= low) {
            return;
        }
        // 切分两部分
        int j = partition(arr, low, high);

        sort(arr, low, j - 1);
        sort(arr, j + 1, high);
    }

    private int partition(int[] arr, int low, int high) {
        // 中心界限值
        int v = arr[low];

        // 头尾双指针
        int p = low, q = high + 1;
        while (true) {
            while (arr[++p] < v && p < high) {
            }

            while (v < arr[--q] && low < q) {
            }

            if (p >= q) {
                break;
            }
            ArrayUtils.swap(arr, p, q);
        }
        ArrayUtils.swap(arr, low, q);
        return q;
    }


    /**
     * 组
     *
     * @param arr
     */
    private void shuffle(int[] arr) {
        Random random = new Random();

        final int N = arr.length;
        for (int i = N - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            ArrayUtils.swap(arr, i, j);
        }
    }
}
