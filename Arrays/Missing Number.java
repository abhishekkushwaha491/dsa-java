class Solution {
    public int missingNumber(int[] nums) {

        int single = 0;

        // XOR all numbers from 0 to n (complete range)
        for (int i = 0; i <= nums.length; i++) {
            single ^= i;
        }

        // XOR all elements of the given array
        for (int i = 0; i < nums.length; i++) {
            single ^= nums[i];
        }

        // The remaining number is the missing number
        return single;
    }
}

/*
Approach: Bit Manipulation (XOR)

1. XOR all numbers from 0 to n.
2. XOR all elements of the given array.
3. Since a ^ a = 0, all existing numbers cancel each other.
4. The remaining number is the missing number.

Time Complexity: O(n) - Two traversals of the array/range.
Space Complexity: O(1) - Uses only one extra variable.
*/ 
