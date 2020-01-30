/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode current=head;
        
        while(current!=null && head!=null){
            if(head.val==val){
                head=head.next;
            }
            else if(current.next==null){break;}
            
            else if(current.next.val==val){
                current.next=current.next.next;
            }
            
            else{
                current=current.next;
            }
        }
        
        return head;
    }
}
