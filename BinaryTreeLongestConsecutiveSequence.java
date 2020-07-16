/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int longestConsecutive(TreeNode root) {
        if(root == null){
            return 0;
        }
        
        int[] res = {0};
        
        dfs(root, res, 0, root.val);
        
        return res[0];
    }
    
    private void dfs(TreeNode root, int[] res, int curr, int target){
        if(root==null){return;}
        
        curr = (root.val == target)? curr + 1: 1;
        
        res[0] = Math.max(res[0], curr);
        
        dfs(root.left, res, curr, root.val + 1);
        dfs(root.right, res, curr, root.val + 1);
    }
}