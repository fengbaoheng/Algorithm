package com.fengbaoheng.queue;

import com.fengbaoheng.heap.MaxHeap;

/**
 * 最大优先队列
 */
public class MaxPriorityQueue extends AbstractPriorityQueue {

    public MaxPriorityQueue(int maxSize) {
        super(new MaxHeap(maxSize));
    }
}
