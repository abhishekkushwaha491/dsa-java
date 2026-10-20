package com.abhishekkushwaha491.dsa.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayUtilsTest {

    @Test
    void shouldReturnMaxValue() {
        int[] array = {3, 9, 1, 6, 5};
        assertEquals(9, ArrayUtils.findMax(array));
    }

    @Test
    void shouldReturnMinValue() {
        int[] array = {3, 9, 1, 6, 5};
        assertEquals(1, ArrayUtils.findMin(array));
    }

    @Test
    void shouldReturnIndexForTarget() {
        int[] array = {4, 7, 12, 9};
        assertEquals(2, ArrayUtils.linearSearch(array, 12));
    }

    @Test
    void shouldReturnMinusOneWhenTargetMissing() {
        int[] array = {4, 7, 12, 9};
        assertEquals(-1, ArrayUtils.linearSearch(array, 50));
    }

    @Test
    void shouldReverseArray() {
        int[] array = {1, 2, 3};
        assertArrayEquals(new int[]{3, 2, 1}, ArrayUtils.reverseArray(array));
    }

    @Test
    void shouldRemoveDuplicates() {
        int[] array = {1, 2, 2, 3, 1, 4};
        assertArrayEquals(new int[]{1, 2, 3, 4}, ArrayUtils.removeDuplicates(array));
    }

    @Test
    void shouldSortArray() {
        int[] array = {5, 1, 3, 2};
        ArrayUtils.selectionSort(array);
        assertArrayEquals(new int[]{1, 2, 3, 5}, array);
    }
}
