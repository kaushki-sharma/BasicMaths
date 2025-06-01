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
    public boolean isPalindrome(ListNode head) {
       /* ArrayList<Integer> arr = new ArrayList<>();
        ListNode p=head;
        while(p!=null)
        {
            arr.add(p.val);
            p=p.next;

        }
        int a=0;
        int b=arr.size()-1;
        while(a<b)
        {
            if(arr.get(a)!=arr.get(b))
            {
                return false;
            }
            
            a++;
            b--;
        }
        return true;*/


        Stack<Integer> st=new Stack();
        ListNode curr=head;
        while(curr!=null)
        {
            st.push(curr.val);
            curr=curr.next;
        }
       curr=head;
       while(curr!=null)
       {
        if(st.isEmpty() || st.pop() != curr.val)
        {
            return false;
        }
        curr=curr.next;


       }
       return st.isEmpty();
        
    }
}