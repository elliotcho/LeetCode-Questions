/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(head==null){return head;}
        if(m==n){return head;}
        
        ListNode resHead=new ListNode(0), res=resHead;
        ListNode current=head;
        
        for(int i=0;i<m-1;i++){
            res.next=new ListNode(current.val);
            current=current.next;
            res=res.next;
        }
        
        ListNode prev=null, next=null;
        for(int j=0;j<n-m;j++){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        next=current.next;
        current.next=prev;
        
        while(current!=null){
            res.next=new ListNode(current.val);
            current=current.next;
            res=res.next;
        }
        
        while(next!=null){
            res.next=new ListNode(next.val);
            next=next.next;
            res=res.next;
        }
        
        return resHead.next; 
    }
}
