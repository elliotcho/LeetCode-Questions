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
    public int countUnivalSubtrees(TreeNode root) {
        int[] count = {0};
        
        dfs(root, count);
        
        return count[0];
    }
    
    private boolean dfs(TreeNode root, int[] count){
        if(root == null){return true;}
        
        boolean left = dfs(root.left, count);
        boolean right = dfs(root.right, count);
        
        if(left && right){
            if(root.left!=null && root.val != root.left.val){
                return false;
            }
            
            if(root.right!=null && root.val!= root.right.val){
                return false;
            }
            
            count[0]++;
            
            return true;
        }
        
        return false;
    }
}