/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null){return head;}
        
        ListNode last=head; int length=1;
        while(last.next!=null){
            length++;
            last=last.next;
        }
        
        if(k>length){k=k%length;}
        k=length-k;

        if(k==0){return head;}
        
        ListNode current=head; int count=1;
        while(count<k){
            current=current.next;
            count++;
        }
        
        last.next=head;
        head=current.next;
        current.next=null;
      
        return head;
    }  
}