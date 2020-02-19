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
    public TreeNode convertBST(TreeNode root) {
        int[] sum={0};
        
        reverseInorder(root, sum);
        
        return root;
    }
    
    public void reverseInorder(TreeNode root, int[] sum){
        if(root==null){return;}
        
        if(root.right!=null){reverseInorder(root.right,  sum);}
        
        sum[0]+=root.val;
        root.val=sum[0];
        
        if(root.left!=null){reverseInorder(root.left, sum);}
        
        return;
    }
}