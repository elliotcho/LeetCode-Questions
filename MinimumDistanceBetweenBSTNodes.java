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
    public int minDiffInBST(TreeNode root) {
        Integer min[]={null, Integer.MAX_VALUE};
        
        inorder(root, min);
        
        return min[1];
    }
    
    public void inorder(TreeNode root, Integer[] min){
        if(root==null){return;}
        
        if(root.left!=null){inorder(root.left, min);}
        
        if(min[0]!=null){min[1]=Math.min(min[1], Math.abs(min[0]-root.val));}
        
        min[0]=root.val;
        
        if(root.right!=null){inorder(root.right, min);}
        
        return;
    }
}