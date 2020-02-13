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
    public int maxPathSum(TreeNode root) {
        int[] maxVal={Integer.MIN_VALUE};
        
        helper(root, maxVal);
        
        return maxVal[0];
    }
    
    public int helper(TreeNode root, int[] maxVal){
        if(root==null){return 0;}
        
        int left=Math.max(0, helper(root.left, maxVal));
        int right=Math.max(0, helper(root.right, maxVal));
        
        maxVal[0]=Math.max(maxVal[0], left+right+root.val);
        
        return root.val+Math.max(left, right);
    } 
}