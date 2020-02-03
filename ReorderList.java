/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        if(head==null || head.next==null){return;}
        
        ListNode prev=null, slow=head, fast=head;
        
        while(fast!=null && fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        
        prev.next=null;
        slow=reverse(slow);
    
        merge(head, slow);
    }
    
    public ListNode reverse(ListNode head){
        if(head==null || head.next==null){return head;}
        
        ListNode current=reverse(head.next);
        head.next.next=head;
        head.next=null;
        
        return current;
    }
    
    public void merge(ListNode l1, ListNode l2){
        while(l1!=null){
            ListNode temp1=l1.next;
            ListNode temp2=l2.next;
            
            l1.next=l2;
            if(temp1==null){break;}
            
            l2.next=temp1;
            l1=temp1;
            l2=temp2;
        }
    }
}