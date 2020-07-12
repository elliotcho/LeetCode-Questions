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
    public double maximumAverageSubtree(TreeNode root) {
        double[] res = {0};
        
        dfs(root, res);
        
        return res[0];
    }
    
    private double[] dfs(TreeNode root, double[] res){
        if(root==null){return new double[]{0,0};}
        
        double sum = root.val;
        double count = 1;
        
        double[] left = dfs(root.left, res);
        double[] right = dfs(root.right, res);
        
        sum+=left[0] + right[0];
        count+=left[1] + right[1];
        
        res[0] = Math.max(res[0], sum/count);
        
        return new double[]{sum, count};
    }
}