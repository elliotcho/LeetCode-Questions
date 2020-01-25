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
    public int sumOfLeftLeaves(TreeNode root) {
        if(root==null){return 0;}
        
        int res=0;
        
        Stack<TreeNode> stack=new Stack<>();
        stack.push(root);
        
        while(!stack.isEmpty()){
            TreeNode current= stack.pop();
            
            if(current.left!=null){
                if(current.left.left==null && current.left.right==null){
                    res+=current.left.val;
                }
                
                else{
                    stack.push(current.left);
                }
            }
            
            if(current.right!=null){
                if(current.right.left!=null || current.right.right!=null){
                    stack.push(current.right);
                }
            }
        }
        
        return res;
    }
}