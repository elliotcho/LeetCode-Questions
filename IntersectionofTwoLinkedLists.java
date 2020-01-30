/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int diff=length(headA)-length(headB);
        
        ListNode shorter=headB, longer=headA;
        if(diff<0){shorter=headA; longer=headB;}
        
        for(int i=0;i<Math.abs(diff);i++){
            longer=longer.next;
        }
        
        while(shorter!=null && longer!=null){
            if(longer==shorter){return longer;}
            else{
                shorter=shorter.next;
                longer=longer.next;
            }
        }
        
        return null;
    }
   
    
    public int length(ListNode head){
        ListNode current=head; int length=0;
        
        while(current!=null){
            length++; current=current.next;
        }
        
        return length;
    }
}
