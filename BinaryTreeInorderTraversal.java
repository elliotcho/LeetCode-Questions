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
    public List<Integer> inorderTraversal(TreeNode root){
        ArrayList<Integer> res=new ArrayList<>();
        return helper(root, res);
    }
    
    public List<Integer> helper(TreeNode root, List<Integer> res) {
        if(root==null){return res;}
        
        if(root.left!=null){helper(root.left, res);}
        res.add(root.val);
        if(root.right!=null){helper(root.right, res);}
        
        return res;
    }
}
