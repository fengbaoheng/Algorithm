package com.fengbaoheng.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayUtilsTest {

    @Test
    void isSorted() {
        assertTrue(ArrayUtils.isSorted(new int[]{}));
        assertTrue(ArrayUtils.isSorted(new int[]{1, 2, 3}));
        assertFalse(ArrayUtils.isSorted(new int[]{1, 2, 1}));
    }
}