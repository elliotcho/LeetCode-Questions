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
    public TreeNode addOneRow(TreeNode root, int v, int d) {
        if(d==1){
            TreeNode newRoot=new TreeNode(v);
            
            newRoot.left=root;
            
            return newRoot;
        }
        
        dfs(root, v, d, 1);
        
        return root;
    }
    
    public void dfs(TreeNode root, int v, int d, int level){
        if(root==null){return;}
        
        if(level<d-1){
            dfs(root.left, v, d, level+1);
            dfs(root.right, v, d, level+1);
        }
        
        else{
            TreeNode left=root.left;
            TreeNode right=root.right;
            
            root.left=new TreeNode(v);
            root.right=new TreeNode(v);
            
            root.left.left=left;
            root.right.right=right;
        }
    }
} 