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
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> res=new ArrayList<>();
        return helper(root, res);
    }
    
    public List<Integer> helper(TreeNode root, List<Integer> res){
        if(root==null){return res;}
        
        else{
            res.add(root.val);    
            res=helper(root.left, res);
            res=helper(root.right, res);
            
            return res;
        }
    }
}