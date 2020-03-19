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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        HashMap<Integer, Integer> map=new HashMap<>();
        
        for(int i=0;i<inorder.length;i++){map.put(inorder[i], i);}
        
        return construct(postorder.length-1, 0, inorder.length-1, inorder, postorder, map);
    }

    public TreeNode construct(int postStart, int inStart, int inEnd,
                             int[] inorder, int[] postorder, Map<Integer, Integer> map){
        
        if(postStart<0 || inEnd<inStart){return null;}
        
        TreeNode root=new TreeNode(postorder[postStart]);
        int inIndex=map.get(root.val);
        
        root.left=construct(postStart-(inEnd-inIndex)-1, inStart, inIndex-1, inorder, postorder, map);
        root.right=construct(postStart-1, inIndex+1, inEnd, inorder, postorder, map);
        
        return root;
    }
}