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
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        if(root==null){return null;}
        
        int leftHeight=height(root.left);
        int rightHeight=height(root.right);
        
        if(leftHeight==rightHeight){return root;}
        
        else if(leftHeight>rightHeight){return lcaDeepestLeaves(root.left);}
        
        else{return lcaDeepestLeaves(root.right);}
    }
    
    public int height(TreeNode root){
        return root==null? 0: 1+Math.max(height(root.left), height(root.right));
    }
}