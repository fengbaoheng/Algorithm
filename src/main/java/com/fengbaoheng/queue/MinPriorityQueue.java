package com.fengbaoheng.queue;

import com.fengbaoheng.heap.MinHeap;

/**
 * 最小优先队列
 */
public class MinPriorityQueue extends AbstractPriorityQueue {

    public MinPriorityQueue(int maxSize) {
        super(new MinHeap(maxSize));
    }
}
