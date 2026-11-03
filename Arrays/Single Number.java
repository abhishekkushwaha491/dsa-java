class Solution {
    public int singleNumber(int[] nums) {

        int temp = 0;

        // XOR all elements of the array
        for (int i = 0; i < nums.length; i++) {
            temp ^= nums[i];
        }

        // Duplicate elements cancel each other,
        // leaving the element that appears only once
        return temp;
    }
}

/*
Approach: Bit Manipulation (XOR)

1. Traverse the entire array.
2. XOR each element with the result.
3. Since a ^ a = 0 and a ^ 0 = a,
   all duplicate elements cancel each other.
4. The remaining value is the single number.

Time Complexity: O(n) - Traverses the array once.
Space Complexity: O(1) - Uses only one extra variable.
*/
