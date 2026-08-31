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
    public ListNode deleteDuplicates(ListNode head) {
        // 1. Create a dummy node to handle cases where the head has duplicates
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        // 2. 'prev' tracks the last node *before* any duplicate sequence
        ListNode prev = dummy;
        ListNode current = head;
        
        while (current != null) {
            // 3. Check if 'current' is the start of a duplicate sequence
            if (current.next != null && current.val == current.next.val) {
                // Move 'current' forward until we find the LAST node of this duplicate value
                while (current.next != null && current.val == current.next.val) {
                    current = current.next;
                }
                // Link 'prev' directly past all duplicates to the next distinct node
                prev.next = current.next;
            } else {
                // No duplicate detected, safe to move 'prev' forward
                prev = prev.next;
            }
            // Move 'current' forward for the next iteration
            current = current.next;
        }
        
        // 4. Return the actual starting node of our modified list
        return dummy.next;
    }
}