package com.fengbaoheng.sort;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SortServiceTest {
    private final int N = 100;
    private final SortService[] services = {
            new SelectionSort(), new InsertionSort(),
            new ShellSort(), new MergeSort(), new QuickSort(),
            new BubbleSort(),
    };

    @Test
    void sort() {
        for (int i = 0; i < N; i++) {
            int[] unsortedArr = SortUtils.getRandomArray(N);

            for (SortService service : services) {
                int[] arr = Arrays.copyOf(unsortedArr, N);
                service.sort(arr);
                assertTrue(SortUtils.isSorted(arr), service.getClass().getName());
            }
        }
    }
}