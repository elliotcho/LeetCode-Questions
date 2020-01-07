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
    public List<Integer> postorderTraversal(TreeNode root) {
        return helper(root, new ArrayList<Integer>());
    }
    
    public ArrayList<Integer> helper(TreeNode root, ArrayList<Integer> res){
        if(root==null){return res;}
        
        if(root.left!=null){helper(root.left, res);}
        if(root.right!=null){helper(root.right, res);}
        res.add(root.val);
        
        return res;
    }
}