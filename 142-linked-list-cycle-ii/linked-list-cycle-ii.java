/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {

        Boolean loopexixts=false;
        ListNode p=head;
        ListNode q=head;

        while(q != null&& q.next!=null)
        {
            p=p.next;
            q=q.next.next;
        
        
       if(q==p)
       {
        loopexixts=true;
        break;
       }
        }
        
       if(loopexixts)
       {
        p=head;
        while(p!=q)
        {
            q=q.next;
            p=p.next;
        
        }
        return p;

       }
       return null;
    
        
    }
}