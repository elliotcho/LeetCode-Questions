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
    public int findTilt(TreeNode root) {
        int[] res={0};
        
        postorder(root, res);
        
        return res[0];
    }
    
    public int postorder(TreeNode root, int[] res){
        if(root==null){return 0;}
        
        int left=postorder(root.left, res);
        int right=postorder(root.right, res);
        
        res[0]+=Math.abs(left-right);
        
        return left+right+root.val;
    }
}