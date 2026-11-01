283. Move Zeroes

-->Approach: Two Pointers

- Use two pointers, left and right, both initially pointing to index 0.
- The right pointer traverses the entire array.
- Whenever a non-zero element is found, swap it with the element at the `left` pointer.
- Increment left after every non-zero element.
- This places all non-zero elements at the beginning while maintaining their relative order, moving all zeroes to the end.


class Solution {
    public void moveZeroes(int[] nums) {
        int left = 0;
        int right = 0;

        while (right < nums.length) {
            if (nums[right] != 0) {
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;

                left++;
            }

            right++;
        }
    }
}

### Complexity Analysis

Time Complexity: O(n) — The array is traversed only once.
Space Complexity: O(1) — No extra data structure is used.

-->Key Concepts
Two Pointers
In-place Array Modification
Swapping
