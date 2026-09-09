/**
 * Time Complexity:
 *   Best Case    : O(n²)
 *   Average Case : O(n²)
 *   Worst Case   : O(n²)
 *
 * Space Complexity:
 *   O(1) — In-place sorting
 *
 * Approach:
 * 1. Find the minimum element in the unsorted portion.
 * 2. Swap it with the first element of the unsorted portion.
 * 3. Repeat until the array is sorted.
 */
class Solution {

    void selectionSort(int[] arr) {

        // Traverse the array
        for (int i = 0; i < arr.length - 1; i++) {

            // Assume the current element is the minimum
            int minIndex = i;

            // Find the minimum element in the remaining array
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the minimum element with the current element
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}
```
