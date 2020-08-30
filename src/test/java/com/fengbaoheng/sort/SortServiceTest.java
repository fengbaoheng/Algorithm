package com.fengbaoheng.sort;

import com.fengbaoheng.utils.ArrayUtils;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

class SortServiceTest {
    private final int N = 100;
    private final SortService[] services = {
            new SelectionSort(), new InsertionSort(),
            new ShellSort(), new MergeSort(), new QuickSort(),
            new BubbleSort(), new HeapSort()
    };

    @Test
    void sort() {
        for (int i = 0; i < N; i++) {
            int[] unsortedArr = ArrayUtils.getRandomArray(N);

            for (SortService service : services) {
                int[] arr = Arrays.copyOf(unsortedArr, N);
                service.sort(arr);
                assertTrue(ArrayUtils.isSorted(arr), service.getClass().getName());
            }
        }
    }
}