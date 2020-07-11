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
    public TreeNode[] splitBST(TreeNode root, int V) {
        TreeNode[] res = {null, null};
        
        if(root==null){
            return res;
        }
        
        else if(root.val > V){
            res = splitBST(root.left, V);
            root.left = res[1];
            res[1] = root;
        }
        
        else{
            res = splitBST(root.right, V);    
            root.right = res[0];
            res[0] = root;
        
        }
        
        return res;
    }
}