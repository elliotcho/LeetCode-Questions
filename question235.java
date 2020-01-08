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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(p.val<q.val){
            return helper(root, p.val, q.val);
        }
        
        else{
            return helper(root, q.val, p.val);
        }
    }
    
    public TreeNode helper(TreeNode root, int min, int max){
        if(root.val<min){return helper(root.right, min, max);}
        if(root.val>max){return helper(root.left, min, max);}
        
        return root;
    }
}