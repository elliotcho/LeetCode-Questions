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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode curr = list1;
        
        ListNode left = null;
        ListNode right = null;
        
        int idx = 0;
        
        while(curr != null){
            if(idx == a - 1){
                left = curr;
            }
            
            if(idx == b + 1){
                right = curr;
            }
            
            curr = curr.next;
            idx++;
        }
        
        left.next= list2;
        
        while(list2.next != null){
            list2 = list2.next;    
        }
        
        list2.next = right;
        
        return list1;
    }
}