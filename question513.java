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
    public int findBottomLeftValue(TreeNode root) {
        LinkedList<TreeNode> queue=new LinkedList<>();
        queue.add(root); 
        
        TreeNode front=null;
        while(queue.size()!=0){
            front =queue.remove();
            if(front.right!=null){queue.add(front.right);}
            if(front.left!=null){queue.add(front.left);}
        }
        
        return front.val;
    }
}