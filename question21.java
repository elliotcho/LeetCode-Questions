/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode resHead=new ListNode(0), res=resHead;
        
        ListNode c1=l1, c2=l2;
        while(c1!=null && c2!=null){
            if(c1.val<c2.val){
                res.next=new ListNode(c1.val);
                c1=c1.next;
            }
            
            else{
                res.next=new ListNode(c2.val);
                c2=c2.next;
            }
            
            res=res.next;
        }
        
        while(c1!=null){
            res.next=new ListNode(c1.val);
            c1=c1.next; res=res.next;
        }
        
        while(c2!=null){
            res.next=new ListNode(c2.val);
            c2=c2.next; res=res.next;
        }
   
        return resHead.next;
    }
}