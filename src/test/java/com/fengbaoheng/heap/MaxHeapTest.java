package com.fengbaoheng.heap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxHeapTest {

    @Test
    public void test() {
        MaxHeap heap = new MaxHeap(3);

        assertTrue(heap.isEmpty());

        heap.add(-1);
        assertEquals(-1, heap.peek());

        heap.add(2);
        assertEquals(2, heap.peek());

        heap.add(1);
        assertEquals(2, heap.peek());

        assertEquals(3, heap.size());

        assertEquals(2, heap.pop());
        assertEquals(1, heap.pop());
        assertEquals(-1, heap.pop());

        assertTrue(heap.isEmpty());
    }
}