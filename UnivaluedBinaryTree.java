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
    public boolean isUnivalTree(TreeNode root) {
        if(root==null){return true;}
        
        LinkedList<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        int prev=root.val;
        
        while(queue.size()!=0){
            TreeNode current=queue.remove();
            
            if(prev!=current.val){
                return false;
            }
            
            else{
                prev=current.val;
                if(current.left!=null){queue.add(current.left);}
                if(current.right!=null){queue.add(current.right);}
            }
        }
        
        return true;
    }
}
