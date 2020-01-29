/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public int getDecimalValue(ListNode head) {
        if(head==null){return 0;}
        
        ListNode current=head;
        int length=0;
        
        while(current.next!=null){
            current=current.next;
            length++;   
        }
        
        current=head;
        int res=0;
        
        while(current!=null){
            res+=Math.pow(2,length)*current.val;
            length--;
            current=current.next;
        }
        
        return res;
    }
}
