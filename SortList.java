/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        
        ListNode slow=head, fast=head, prev=null;
        while(fast!=null && fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        prev.next=null;
        
        ListNode left=sortList(head);
        ListNode right=sortList(slow);
        
        return merge(left, right);
    }
    
    public ListNode merge(ListNode left, ListNode right){
        ListNode resHead=new ListNode(0), res=resHead;
        
        while(left!=null && right!=null){
            if(left.val<right.val){
                res.next=left;
                left=left.next;
            }
            else{
                res.next=right;
                right=right.next;
            }
            
            res=res.next;
        }
        
        if(left!=null){
            res.next=left;
        }
        
        if(right!=null){
            res.next=right;
        }
        
        return resHead.next;
    }
}
