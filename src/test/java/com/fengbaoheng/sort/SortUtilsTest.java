package com.fengbaoheng.sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortUtilsTest {

    @Test
    void isSorted() {
        assertTrue(SortUtils.isSorted(new int[]{}));
        assertTrue(SortUtils.isSorted(new int[]{1, 2, 3}));
        assertFalse(SortUtils.isSorted(new int[]{1, 2, 1}));
    }
}