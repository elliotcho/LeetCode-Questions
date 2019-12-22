/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode current=head; int length=0;
        
        while(current!=null){
            length++;
            current=current.next;
        }
        
        if(length==n){return head.next;}
        
        current=head;
        
        for(int i=0;i<length-n-1;i++){
            current=current.next;
        }
        current.next=current.next.next;
        
        
        return head;
    }
}