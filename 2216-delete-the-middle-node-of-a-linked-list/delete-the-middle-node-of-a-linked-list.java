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
    public ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }

        ListNode curr= head;
        ListNode q= head;
          ListNode prev=null;
        while(q!=null && q.next!=null)
        {
             prev=curr;
            curr=curr.next;
            q=q.next.next;
        }
        prev.next=curr.next;
        return head;
        
    }
}