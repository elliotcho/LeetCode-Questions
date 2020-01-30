/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode current=head; int length=0;
        
        while(current!=null){
           length++;
           current=current.next;
        }
       
        
        if(length==1){return head;}
        int maxOdd=length-2;
        
        current=head;   
        for(int i=0;i<length;i++){
            if(i%2==0){ 
                int temp=current.val;
                current.val=current.next.val;
                current.next.val=temp;
            }
            
            if(i==maxOdd){break;}
            
            current=current.next;
        }
        
        
        return head;
    }
}
