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
    public int maxAncestorDiff(TreeNode root) {
        int[] res={Integer.MIN_VALUE};
        
        dfs(root, root.val, root.val, res);
        
        return res[0];
    }
    
    private void dfs(TreeNode root, int minVal, int maxVal, int[] res){
        if(root==null){return;}
        
        res[0]=Math.max(res[0], Math.max(Math.abs(minVal-root.val), Math.abs(maxVal-root.val)));
        
        if(root.val<minVal){minVal=root.val;}
        if(root.val>maxVal){maxVal=root.val;}
        
        dfs(root.left, minVal, maxVal, res);
        dfs(root.right, minVal, maxVal, res);
    }
}