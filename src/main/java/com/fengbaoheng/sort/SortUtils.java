package com.fengbaoheng.sort;

import java.util.Random;

/**
 * 辅助排序的工具算法
 */
public class SortUtils {

    private static final Random RANDOM = new Random();

    /**
     * @param arr 数组
     * @return 是否已经排好序
     */
    public static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int a = arr[i - 1];
            int b = arr[i];
            if (b < a) {
                return false;
            }
        }
        return true;
    }

    /**
     * 生成一个随机数组
     *
     * @param length 数组长度
     * @return 随机数组
     */
    public static int[] getRandomArray(int length) {
        int[] arr = new int[length];

        for (int i = 0; i < length; i++) {
            arr[i] = RANDOM.nextInt();
        }

        return arr;
    }
}
