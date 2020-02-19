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
    public TreeNode bstFromPreorder(int[] preorder) {
        int[] index={0};
        return construct(index, Integer.MAX_VALUE, preorder);
    }
    
    public TreeNode construct(int[] index, int bound, int[] preorder){
        if(index[0]>=preorder.length || preorder[index[0]]>bound){
            return null;
        }
        
        TreeNode root=new TreeNode(preorder[index[0]++]);
        
        root.left=construct(index, root.val, preorder);
        root.right=construct(index, bound, preorder);
        
        return root;
    }
}