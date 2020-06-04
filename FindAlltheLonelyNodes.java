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
    public List<Integer> getLonelyNodes(TreeNode root) {
        List<Integer> res=new ArrayList<>();    
        
        dfs(res, root);
        
        return res;
    }
    
    private void dfs(List<Integer> res, TreeNode root){
        if(root==null){return;}
        
        if(root.left==null && root.right!=null){
            res.add(root.right.val);
        }
        
        else if(root.left!=null && root.right==null){
            res.add(root.left.val);
        }
        
        dfs(res, root.left);
        dfs(res, root.right);
    }
}