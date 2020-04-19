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
    public int sumEvenGrandparent(TreeNode root) {
        int[] res={0};
        
        dfs(root, res);
        
        return res[0];
    }
    
    public void dfs(TreeNode root, int[] res){
        if(root==null){return;}
        
        if(root.val%2==0){
            addGrandChildren(root.left, res);
            addGrandChildren(root.right, res);
        }
        
        dfs(root.left, res);
        dfs(root.right, res);
        
        return;
    }
    
    public void addGrandChildren(TreeNode root, int[] res){
        if(root==null){return;}
        
        if(root.left!=null){res[0]+=root.left.val;}
        if(root.right!=null){res[0]+=root.right.val;}
        
        return;
    }
}