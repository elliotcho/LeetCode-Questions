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
    public int pathSum(TreeNode root, int sum) {
        int[] path=new int[findHeight(root)], res={0};
        
        dfs(root, sum, res, 0, path);
        
        return res[0];
    }
    
    public void dfs(TreeNode root, int sum, int[] res, int level, int[] path){
        if(root==null){return;}
        if(level>=path.length){return;}
        
        path[level]=root.val;
        
        int pathSum=0;
        for(int i=level;i>=0;i--){
            pathSum+=path[i];
           
            if(sum==pathSum){
                res[0]++;
            }
        }
        
        dfs(root.left, sum, res, level+1, path);
        dfs(root.right, sum, res, level+1, path);
    }
    
    public int findHeight(TreeNode root){
        if(root==null){return 0;}
        
        int left=findHeight(root.left);
        int right=findHeight(root.right);
        
        return Math.max(left, right)+1;
    }
}