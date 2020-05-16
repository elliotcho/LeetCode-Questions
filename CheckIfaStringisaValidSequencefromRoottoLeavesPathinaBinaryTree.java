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
    public boolean isValidSequence(TreeNode root, int[] arr) {
        return dfs(root, arr, 0);
    }
    
    private boolean dfs(TreeNode root, int[] arr, int idx){
        if(root==null){return false;}
        
        if(idx>=arr.length || arr[idx]!=root.val){
            return false;
        }
        
        if(root.left==null && root.right==null && idx==arr.length-1){
            return true;
        }
        
        return dfs(root.left, arr, idx+1) || dfs(root.right, arr, idx+1);
    }
}
