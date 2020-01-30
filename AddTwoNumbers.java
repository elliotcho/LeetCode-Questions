/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l1current=l1, l2current=l2;
        ListNode newHead=new ListNode(0); ListNode newCurrent=newHead;
        int carry=0;
        
        while(l1current!=null || l2current!=null){
            int digit=0;
            
            if(l1current==null && l2current!=null){
                digit=l2current.val+carry;
            }
            if(l1current!=null && l2current==null){
                digit=l1current.val+carry;
            }
            if(l1current!=null && l2current!=null){
                digit=l1current.val+l2current.val+carry;
            }
            
            carry=digit/10;
            digit=digit%10;
            
            newCurrent.next=new ListNode(digit);
            newCurrent=newCurrent.next; 

            if(l1current!=null){l1current=l1current.next;}
            if(l2current!=null){l2current=l2current.next;}
        }
        
        if(carry!=0){
            newCurrent.next=new ListNode(carry);
        }
        
        
        return newHead.next;
    }
}
