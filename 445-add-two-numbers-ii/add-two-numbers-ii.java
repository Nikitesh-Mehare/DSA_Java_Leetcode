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

    //create the reverse function.
    private ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //Appply the LinkedList + stack pattern here.
        //first reverse the both the linkedlist.
        ListNode curr1=reverse(l1);
        ListNode curr2=reverse(l2);
        //first create dummy linkedlist.
        ListNode dummy=new ListNode(-1);
        ListNode curr=dummy;
        //add two numbers now.
        int carry=0;
        while(curr1!=null || curr2!=null || carry!=0){
            //add carry in sum.
            int sum=carry;
            //add first number from list1.
            if(curr1!=null){
                sum+=curr1.val;
                curr1=curr1.next;
            }
            //add the second number.
            if(curr2!=null){
                sum+=curr2.val;
                curr2=curr2.next;
            }
            //then find the carry.
            carry=sum/10;
            //then create the node of unit place.
            curr.next=new ListNode(sum%10);
            //increment the curr pointer.
            curr=curr.next;
        }
        //at the last return then head of reverse linkedlist(dummy).
        return reverse(dummy.next);
    }
}