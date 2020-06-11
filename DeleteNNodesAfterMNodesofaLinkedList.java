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
    public ListNode deleteNodes(ListNode head, int m, int n) {
        ListNode curr=head;
        
        while(curr!=null){
            for(int i=0;i<m-1 && curr!=null;i++){
                curr=curr.next;
            } 
            
            if(curr==null){break;}
        
            for(int i=0;i<n && curr.next!=null;i++){
                curr.next=curr.next.next;
            }
            
            if(curr!=null){curr=curr.next;}
        }
        
        return head;
    }
}