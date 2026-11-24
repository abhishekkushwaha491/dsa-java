
import java.util.Arrays;
import java.util.HashSet;

/*
 * Problem:
 * Find the intersection of two arrays.
 * Each element in the result must be unique.
 *
 * Approach:
 * Use HashSet to store elements of nums1.
 * Traverse nums2 and check whether each element
 * exists in the HashSet.
 * If found, add it to the result and remove it
 * from the HashSet to avoid duplicates.
 *
 * Time Complexity: O(n + m) average
 * Space Complexity: O(n)
 */

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        // Store unique elements of nums1
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums1) {
            set.add(num);
        }

        // Store common elements
        int[] result = new int[Math.min(nums1.length, nums2.length)];
        int k = 0;

        // Find intersection
        for (int num : nums2) {

            if (set.contains(num)) {
                result[k++] = num;

                // Remove to prevent duplicate elements
                set.remove(num);
            }
        }

        // Return only the filled portion
        return Arrays.copyOf(result, k);
    }
}
