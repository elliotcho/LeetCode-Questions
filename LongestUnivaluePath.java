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
    public int longestUnivaluePath(TreeNode root) {
        int[]  res={0};
        
        findMax(root, res);
        
        return res[0];
    }
    
    public int findMax(TreeNode root, int[] res){
        if(root==null){return 0;}
        
        int left=findMax(root.left, res);
        int right=findMax(root.right, res);
        
        if(root.left!=null && root.val==root.left.val){left++;}
        else{left=0;}
        
        if(root.right!=null && root.val==root.right.val){right++;}
        else{right=0;}
        
        res[0]=Math.max(res[0], left+right);
        
        return Math.max(left, right);
    }
}