package com.fengbaoheng.queue;

import com.fengbaoheng.heap.Heap;

/**
 * 优先队列
 */
public abstract class AbstractPriorityQueue implements Queue {

    /**
     * 内部持有的堆
     */
    private final Heap heap;

    public AbstractPriorityQueue(Heap heap) {
        this.heap = heap;
    }

    @Override
    public void offer(int num) {
        heap.add(num);
    }

    @Override
    public int peek() {
        return heap.peek();
    }

    @Override
    public int poll() {
        return heap.pop();
    }

    @Override
    public boolean isEmpty() {
        return heap.isEmpty();
    }

    @Override
    public int size() {
        return heap.pop();
    }
}
