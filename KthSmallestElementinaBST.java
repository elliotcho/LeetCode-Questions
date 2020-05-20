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
    public int kthSmallest(TreeNode root, int k) {
        int[] res={0};
        int[] count={0};
        
        inorder(root, res, k, count);
        
        return res[0];
    }
    
    private void inorder(TreeNode root, int[] res ,int k, int[] count){
        if(root==null || count[0]==k){return;}
        
        inorder(root.left, res, k, count);
        
        count[0]++;
        
        if(count[0]==k){
            res[0]=root.val;
        }
        
        inorder(root.right, res, k, count);
    }
}