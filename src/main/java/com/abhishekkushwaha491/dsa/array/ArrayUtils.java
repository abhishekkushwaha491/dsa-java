package com.abhishekkushwaha491.dsa.array;

import java.util.Arrays;

public final class ArrayUtils {

    private ArrayUtils() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * Finds the maximum value in an array.
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     * Edge cases: empty array, single-element array, negative values.
     */
    public static int findMax(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        int max = array[0];
        for (int value : array) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    /**
     * Finds the minimum value in an array.
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     * Edge cases: empty array, single-element array, negative values.
     */
    public static int findMin(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        int min = array[0];
        for (int value : array) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    /**
     * Performs linear search.
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     * Edge cases: target missing, target at first or last index, duplicate values.
     */
    public static int linearSearch(int[] array, int target) {
        if (array == null) {
            throw new IllegalArgumentException("Array must not be null");
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Reverses an array without mutating the original input.
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     * Edge cases: empty array, single-element array, null array.
     */
    public static int[] reverseArray(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Array must not be null");
        }

        int[] reversed = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversed[i] = array[array.length - 1 - i];
        }
        return reversed;
    }

    /**
     * Removes duplicate values while preserving first occurrence order.
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     * Edge cases: empty array, all duplicates, no duplicates, null input.
     */
    public static int[] removeDuplicates(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Array must not be null");
        }

        if (array.length == 0) {
            return new int[0];
        }

        int[] result = new int[array.length];
        int size = 0;

        for (int value : array) {
            boolean exists = false;
            for (int i = 0; i < size; i++) {
                if (result[i] == value) {
                    exists = true;
                    break;
                }
            }

            if (!exists) {
                result[size++] = value;
            }
        }

        return Arrays.copyOf(result, size);
    }

    /**
     * Sorts the array using selection sort.
     * Time Complexity: O(n^2)
     * Space Complexity: O(1)
     * Edge cases: empty array, single-element array, already sorted array, reverse-sorted array.
     */
    public static void selectionSort(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Array must not be null");
        }

        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
    }
}
