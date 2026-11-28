# Subarray Sum Equals K

## Problem Statement
Given an integer array `nums` and an integer `k`, return the total number of continuous subarrays whose sum equals `k`.

## Approach: Prefix Sum + HashMap

We use a prefix sum and a HashMap to efficiently count subarrays with sum `k`.

The HashMap stores:
Key: Prefix sum
Value:** Frequency of that prefix sum

### Logic
1. Initialize `sum = 0` and `count = 0`.
2. Store `0 → 1` in the HashMap to handle subarrays starting from index `0`.
3. Traverse the array and calculate the current prefix sum.
4. Calculate `rem = sum - k`.
5. If `rem` exists in the HashMap, its frequency represents the number of valid subarrays ending at the current index.
6. Add that frequency to `count`.
7. Update the frequency of the current prefix sum in the HashMap.
8. Return `count`.

import java.util.HashMap;

class Solution {
    public int subarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int count = 0;
        int sum = 0;

        // Handles subarrays starting from index 0
        map.put(0, 1);

        for (int num : nums) {

            // Calculate current prefix sum
            sum += num;

            // Find the required previous prefix sum
            int rem = sum - k;

            // Count valid subarrays ending here
            count += map.getOrDefault(rem, 0);

            // Store frequency of current prefix sum
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}
## Complexity Analysis

Time Complexity: O(n) — We traverse the array once, and HashMap operations take O(1) on average.
Space Complexity: O(n) — The HashMap can store up to n distinct prefix sums.

