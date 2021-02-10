/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || head.next == null || k == 1) {
            return head;
        }       
        
        ListNode result = new ListNode();
        result.next = head;
        
        ListNode start = result;
        int i = 1;
        
        while(head != null) {
            if(i % k == 0) {
                start = reverse(start, head.next);
                head = start.next;
            } else {
                head = head.next;
            }
            
            i++;
        }
        
        return result.next;
    }
    
    public ListNode reverse(ListNode start, ListNode end) {
        ListNode result = start.next;
        
        ListNode curr = start.next;
        ListNode prev = null;
        ListNode next = null;
        
        while(curr != end) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        start.next = prev;
        result.next = curr;
        
        return result;
    }
}