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
    public int diameterOfBinaryTree(TreeNode root) {
        int[] path={0};
        
        maxHeight(root, path);
        
        return path[0];
    }
    
    public int maxHeight(TreeNode root, int[] path){
        if(root==null){return 0;}
        
        int left=maxHeight(root.left, path);
        int right=maxHeight(root.right, path);
        
        path[0]=Math.max(path[0], left+right);
        
        return 1+Math.max(left, right);
    }
}