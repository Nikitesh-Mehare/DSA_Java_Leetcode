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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null) { return l2; }
        if (l2 == null) { return l1; }

        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        
        // Push all digits of l1 onto stack1
        while (l1 != null) {
            stack1.push(l1.val);
            l1 = l1.next;
        }
        
        // Push all digits of l2 onto stack2
        while (l2 != null) {
            stack2.push(l2.val);
            l2 = l2.next;
        }
        
        ListNode head = null;
        int carry = 0;
        
        // Pop and add digits from right to left
        while (!stack1.isEmpty() || !stack2.isEmpty() || carry > 0) {
            int val1 = !stack1.isEmpty() ? stack1.pop() : 0;
            int val2 = !stack2.isEmpty() ? stack2.pop() : 0;
            
            int sum = val1 + val2 + carry;
            int digit = sum % 10;
            carry = sum / 10;
            
            // Build the result list backward (insert at the front)
            ListNode newNode = new ListNode(digit);
            newNode.next = head;
            head = newNode;
        }
        
        return head;
    }
}