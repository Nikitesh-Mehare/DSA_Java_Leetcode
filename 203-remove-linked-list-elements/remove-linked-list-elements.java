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
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = dummy;  //start
        while(current.next != null)
        {
            if(current.next.val == val)
            {
                current.next = current.next.next; // delete
            }
            else
            {
                current = current.next;  // move to next
            }
        }
        return dummy.next;
    }
}