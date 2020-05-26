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
    public int closestValue(TreeNode root, double target) {
        double[] max={Double.MAX_VALUE};
        
        dfs(root, max, target);
        
        return (int) max[0];
    }
    
    private void dfs(TreeNode root, double[] max, double target){
        if(root==null){return;}
        
        double maxDiff= Math.abs(max[0] - target);
        double currDiff=Math.abs(root.val -target);
        
        if(currDiff<maxDiff){max[0]=root.val;}
        
        dfs(root.left, max, target);
        dfs(root.right, max, target);
    }
}