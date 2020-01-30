/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy=new ListNode(0); 
        dummy.next=head;
        
        ListNode prev=dummy, current=head;
        while(current!=null){
            while(current.next!=null &&
                 prev.next.val==current.next.val){
                current=current.next;
            }
            
            if(prev.next==current){
                prev=prev.next;
            }
            
            else{
                prev.next=current.next;
            }
            
            current=current.next;
        }
        
        return dummy.next;
    }
}
