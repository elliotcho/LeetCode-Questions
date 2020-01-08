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
    public List<Integer> postorderTraversal(TreeNode root) {
        LinkedList<Integer> res=new LinkedList<>();
        if(root==null){return res;}
        
        Stack<TreeNode> stack=new Stack<>();
        stack.push(root);
        
        while(!stack.isEmpty()){
            TreeNode current=stack.pop();
            res.addFirst(current.val);
            
            if(current.left!=null){
                stack.push(current.left);
            }
            if(current.right!=null){
                stack.push(current.right);
            }
        }
        
        return res;
    }
    
}
