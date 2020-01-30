/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head==null){return true;}
        
        ListNode slow=head, fast=head;
        
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        
        if(fast!=null){slow=slow.next;}
        
        fast=head;
        slow=reverse(slow);
        
        while(slow!=null){
            if(slow.val!=fast.val){return false;}
            slow=slow.next;
            fast=fast.next;
        }
        
        return true;
    }
    
    public ListNode reverse(ListNode head){
        if(head==null || head.next==null){
            return head;
        }
        
        ListNode current=reverse(head.next);
        head.next.next=head;
        head.next=null;
        
        return current;
    }
}
