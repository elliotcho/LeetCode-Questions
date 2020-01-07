/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        int index=1;
        
        ListNode odd=new ListNode(0), even=new ListNode(0);
        ListNode evenhead=even, oddhead=odd;
        
        while(head!=null){
            if(index%2!=0){
                odd.next=head;
                odd=odd.next;}
            else{
                even.next=head;
                even=even.next;}
            
            index++;
            head=head.next;
        }
        
        even.next=null;
        odd.next=evenhead.next;
        
        return oddhead.next;
    }
}