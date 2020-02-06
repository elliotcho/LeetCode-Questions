/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode firstHead=new ListNode(0), first=firstHead;
        ListNode secondHead=new ListNode(0), second=secondHead;

        while(head!=null){
            if(head.val<x){
                first.next=new ListNode(head.val);
                first=first.next;
            }
            
            else{
                second.next=new ListNode(head.val);
                second=second.next;
            }
            
            head=head.next;
        }
        
        first.next=secondHead.next;
        
        return firstHead.next;
    }
}