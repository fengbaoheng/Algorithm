package com.fengbaoheng.heap;

public class MaxHeap extends AbstractHeap {


    public MaxHeap(int maxSize) {
        super(maxSize);
    }

    @Override
    protected int compareTo(int a, int b) {
        return a - b;
    }
}
