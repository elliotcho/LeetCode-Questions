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
    public ListNode plusOne(ListNode head) {
        ListNode resHead=new ListNode(-1);
        
        resHead.next=head;
        
        ListNode left=head;
        ListNode right=head;
        
        while(right!=null){
            if(right.val!=9){
                left=right;
            }
            
            right=right.next;
        }
        
        right=left.next;
        
        if(left==head && left.val==9){
            resHead.val=1;
            left.val=0;
        }
        
        else{
            left.val++;
        }
        
        while(right!=null){
            right.val=0;
            right=right.next;
        }
        
        return (resHead.val==-1)? resHead.next: resHead;
    }
}