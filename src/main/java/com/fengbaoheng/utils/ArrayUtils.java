package com.fengbaoheng.utils;

import java.util.Arrays;
import java.util.Random;

public class ArrayUtils {
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
            arr[i] = RANDOM.nextInt(length);
        }

        return arr;
    }

    /**
     * 随机打乱数组
     */
    public static void shuffle(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            swap(arr, i, RANDOM.nextInt(i + 1));
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
