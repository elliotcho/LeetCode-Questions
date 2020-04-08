/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    int length=0;
    Random randomGenerator;
    ListNode HEAD;
    
    /** @param head The linked list's head.
        Note that the head is guaranteed to be not null, so it contains at least one node. */
    public Solution(ListNode head) {
        HEAD=head;
        
        while(head!=null){
            head=head.next;
            length++;
        }
        
        randomGenerator=new Random();
    }
    
    /** Returns a random node's value. */
    public int getRandom() {
       int pos=randomGenerator.nextInt(length);
       
       ListNode curr=HEAD;
        
       for(int i=0;i<pos;i++){curr=curr.next;}
      
       return curr.val; 
    }
}
/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */