/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public int[] nextLargerNodes(ListNode head) {
        if(head==null){return new int[0];}
        
        ArrayList<Integer> values=new ArrayList<>();
        while(head!=null){
            values.add(head.val); 
            head=head.next;
        }
        
        int stack[]=new int[values.size()]; int top=-1;
        int[] res=new int[values.size()];
        
        for(int i=0;i<values.size();i++){
            while(top!=-1 && values.get(i)>values.get(stack[top])){
                res[stack[top]]=values.get(i);
                top--;
            }
            
            top++; stack[top]=i;
        }
        
        return res;
    }
}