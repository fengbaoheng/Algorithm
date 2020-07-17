package com.fengbaoheng.sort;

import java.util.Arrays;

/**
 * 归并排序
 */
public class MergeSort implements SortService {
    /**
     * O(n)大小的辅助数组
     */
    int[] aux;


    @Override
    public void sort(int[] arr) {
        final int N = arr.length;
        aux = new int[N];
        sort(arr, 0, N - 1);
    }

    private void sort(int[] arr, int low, int high) {
        if (high <= low) {
            return;
        }
        int mid = low + (high - low) / 2;

        sort(arr, low, mid);
        sort(arr, mid + 1, high);

        merge(arr, low, mid, high);
    }


    /**
     * 将各自有序的两部分[l, m] [m+1, h]合并
     */
    private void merge(int[] arr, int l, int m, int h) {
        // 先将两部分都赋值到辅助数组中
        for (int i = l; i <= h; i++) {
            aux[i] = arr[i];
        }

        // 从辅助数组中从小到大依次移动回原数组
        int i = l, j = m + 1;
        for (int k = l; k <= h; k++) {
            int num;
            if (i > m) {
                num = aux[j++];
            } else if (j > h) {
                num = aux[i++];
            } else if (aux[i] < aux[j]) {
                num = aux[i++];
            } else {
                num = aux[j++];
            }

            arr[k] = num;
        }
    }
}
