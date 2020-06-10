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
    public List<List<Integer>> findLeaves(TreeNode root) {
        ArrayList<List<Integer>> res=new ArrayList<>();
        
        dfs(root, res);
        
        return res;
    }
    
    private int dfs(TreeNode root, List<List<Integer>> res){
        if(root==null){return -1;}
        
        int height=1+Math.max(dfs(root.left, res), dfs(root.right,res));
        
        if(res.size()<=height){
            res.add(new ArrayList<>());
        }
        
        res.get(height).add(root.val);
        
        return height;
    }
}