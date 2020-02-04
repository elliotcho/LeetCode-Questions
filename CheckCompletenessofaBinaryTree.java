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
    public boolean isCompleteTree(TreeNode root) {
        if(root==null){return true;}
        
        LinkedList<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        int flag=0;
        
        while(queue.size()!=0){
            TreeNode current=queue.remove();
            
            if(current==null){flag=1;}
            
            else{
                if(flag==1){return false;}
                
                queue.add(current.left);
                
                queue.add(current.right);
            }
        }
        
        return true;
    }
}