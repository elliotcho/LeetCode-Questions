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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer, Integer> map=new HashMap<>();
        
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i], i);
        }
        
        return helper(0, 0, inorder.length, preorder, inorder, map);
    }
    
    public TreeNode helper(int preStart, int inStart, int inEnd, 
                           int[] preorder, int[] inorder, HashMap<Integer, Integer> map){
       
        if(preStart>preorder.length-1 || inStart>inEnd){return null;}
        
        TreeNode root=new TreeNode(preorder[preStart]);
        int inIndex=map.get(root.val);
        
        root.left=helper(preStart+1, inStart, inIndex-1, preorder, inorder, map);
        root.right=helper(preStart+inIndex-inStart+1, inIndex+1, inEnd, preorder, inorder, map);
        
        return root;
    }
}
