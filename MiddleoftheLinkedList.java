/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode current=head;
        int length=0;
        
        while(current!=null){
            length++;
            current=current.next;
        }
        
        
        current=head;
        for(int i=0;i<length/2;i++){
            current=current.next;
        }
        
        return current;
    }
}
