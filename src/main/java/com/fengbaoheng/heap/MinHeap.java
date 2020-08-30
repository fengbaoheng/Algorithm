package com.fengbaoheng.heap;

public class MinHeap extends AbstractHeap {


    public MinHeap(int maxSize) {
        super(maxSize);
    }

    @Override
    protected int compareTo(int a, int b) {
        return b - a;
    }
}
