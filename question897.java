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
    public TreeNode increasingBST(TreeNode root) {
        ArrayList<Integer> inorder=new ArrayList<>();
        inorder=helper(root, inorder);
        
        TreeNode res=new TreeNode(0), current=res;
        
        for(int i=0;i<inorder.size();i++){
            current.right=new TreeNode(inorder.get(i));
            current=current.right;
        }
        current.right=null;
        
        return res.right;
    }
    
    public ArrayList<Integer> helper(TreeNode root, ArrayList<Integer> inorder){
        if(root==null){return inorder;}
        
        else{
            inorder=helper(root.left, inorder);    
            inorder.add(root.val);
            inorder=helper(root.right,inorder);
            
            return inorder;
        }
    }
    
}