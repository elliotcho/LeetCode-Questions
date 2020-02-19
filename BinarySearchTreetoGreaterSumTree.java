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
    public TreeNode bstToGst(TreeNode root) {
        int[] total={0};
        
        reverseInorder(root, total);
       
        return root;
    }
    
    public void reverseInorder(TreeNode root, int[] total){
        if(root==null){return;}
        
        if(root.right!=null){reverseInorder(root.right, total);}
        
        total[0]+=root.val;
        
        root.val=total[0];
        
        if(root.left!=null){reverseInorder(root.left, total);}
        
        return;
    }
}
