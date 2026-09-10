/**
 * Definition for singly-linked list.
 *
 * class ListNode {
 *     int val;
 *     ListNode next;
 *
 *     ListNode() {}
 *
 *     ListNode(int val) {
 *         this.val = val;
 *     }
 *
 *     ListNode(int val, ListNode next) {
 *         this.val = val;
 *         this.next = next;
 *     }
 * }
 */

// Problem:
// Reverse a singly linked list.

// Approach:
// Use three pointers:
// 1. prev
// 2. curr
// 3. next

// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public ListNode reverseList(ListNode head) {

        ListNode prev = null;
        ListNode curr = head;
        ListNode next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
      head = prev;

        return prev;
    }
}

