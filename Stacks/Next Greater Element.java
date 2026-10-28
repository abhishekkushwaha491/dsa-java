# LeetCode 496 — Next Greater Element I

**Problem Link:** https://leetcode.com/problems/next-greater-element-i/

**Topic:** Stack, Monotonic Stack, HashMap

## Approach

Use a **monotonic stack and HashMap** to find the next greater element for every element in `nums2`.

- The stack stores indices of elements in `nums2`.
- Traverse `nums2` from right to left.
- Pop indices whose corresponding values are less than or equal to the current element.
- If the stack is empty, the next greater element is `-1`. Otherwise, the value at the top index is the next greater element.
- Store each result in a HashMap, using the current element as the key and its next greater element as the value.
- Finally, traverse `nums1` and retrieve the answers from the HashMap.

## Procedure

1. Create an empty stack, a HashMap, and an answer array of size `nums1.length`.
2. Traverse `nums2` from right to left.
3. While the stack is not empty and the value at the top index is less than or equal to the current value, pop the stack.
4. If the stack is empty, store `-1` as the next greater element of the current value. Otherwise, store the value at the top index.
5. Push the current index onto the stack.
6. Traverse `nums1` and fill the answer array using the HashMap.
7. Return the answer array.

## Java Solution

```java
import java.util.*;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> s = new Stack<>();
        int[] ans = new int[nums1.length];
        HashMap<Integer, Integer> map = new HashMap<>();

        // Find the next greater element for every value in nums2
        for (int i = nums2.length - 1; i >= 0; i--) {

            // Remove elements that cannot be the next greater element
            while (!s.isEmpty() && nums2[s.peek()] <= nums2[i]) {
                s.pop();
            }

            // Store the next greater element
            if (s.isEmpty()) {
                map.put(nums2[i], -1);
            } else {
                map.put(nums2[i], nums2[s.peek()]);
            }

            // Push the current index
            s.push(i);
        }

        // Build the answer for nums1
        for (int i = 0; i < nums1.length; i++) {
            ans[i] = map.get(nums1[i]);
        }

        return ans;
    }
}
```

```n = nums1.length; and m = nums2.length 
  Time complexity --> O(n+m);

