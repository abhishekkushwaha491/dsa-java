# Rotate Array – Java

## Problem
Given an integer array `nums`, rotate the array to the right by `k` steps, where `k` is non-negative.

## Approach: Reversal Algorithm

Instead of rotating the array one step at a time, we use the reversal technique to achieve an optimal solution.

### Algorithm
1. Calculate `k % n` to handle cases where `k` is greater than the array length.
2. Reverse the entire array.
3. Reverse the first `k` elements.
4. Reverse the remaining `n-k` elements.

### Java Solution

```java
class Solution {

    // Reverses the array between the given left and right indices
    public void rotateArray(int left, int right, int[] nums) {

        while (left < right) {

            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }
    }

    public void rotate(int[] nums, int k) {

        int n = nums.length;

        if (n == 0) return;

        k = k % n;

        // Step 1: Reverse the entire array
        rotateArray(0, n - 1, nums);

        // Step 2: Reverse the first k elements
        rotateArray(0, k - 1, nums);

        // Step 3: Reverse the remaining elements
        rotateArray(k, n - 1, nums);
    }
}
```

### Complexity Analysis

- **Time Complexity:** O(n) – Three reversal operations take linear time overall.
- **Space Complexity:** O(1) – The array is modified in-place without using an extra array.
