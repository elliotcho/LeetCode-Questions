/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isSubPath(ListNode head, TreeNode root) {
        if(root==null){return false;}
        
        if(head.val==root.val){
            if(match(head, root)){return true;}
        }
        
        return isSubPath(head, root.left) || isSubPath(head, root.right);
    }
    
    public boolean match(ListNode head, TreeNode root){
        if(root!=null && head!=null){
            if(head.val==root.val){
                return match(head.next, root.left) || match(head.next, root.right);
            }
            
            else{
                return false;
            }
        }
        
        return head==null;
    }
}