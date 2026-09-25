/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        // Step 1: Mark values to be removed using a boolean array for O(1) lookup
        boolean[] toDelete = new boolean[100001];
        for (int num : nums) {
            toDelete[num] = true;
        }

        // Step 2: Use a dummy node to seamlessly handle head deletion edge cases
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = dummy;

        // Step 3: Traverse the list and skip nodes present in the removal list
        while (current.next != null) {
            if (toDelete[current.next.val]) {
                // Bypass the next node
                current.next = current.next.next;
            } else {
                // Move pointer forward only if we didn't delete a node
                current = current.next;
            }
        }

        return dummy.next;
    }
}