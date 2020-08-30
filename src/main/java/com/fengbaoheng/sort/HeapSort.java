package com.fengbaoheng.sort;

import com.fengbaoheng.heap.Heap;
import com.fengbaoheng.heap.MinHeap;

public class HeapSort implements SortService {
    @Override
    public void sort(int[] arr) {
        Heap heap = new MinHeap(arr.length);

        for (int num : arr) {
            heap.add(num);
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = heap.pop();
        }
    }
}
