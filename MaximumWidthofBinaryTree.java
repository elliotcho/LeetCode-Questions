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
    public int widthOfBinaryTree(TreeNode root) {
        if(root==null){return 0;}
        
        LinkedList<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        
        root.val=0;
        
        int res=1;
        
        while(queue.size()!=0){
            res=Math.max(res, queue.getLast().val-queue.getFirst().val+1);
            
            int size=queue.size();
            
            for(int i=0;i<size;i++){
                TreeNode current=queue.remove();
                
                if(current.left!=null){
                    current.left.val=current.val*2+1;
                    queue.add(current.left);
                }
                
                if(current.right!=null){
                    current.right.val=current.val*2+2;
                    queue.add(current.right);
                }
            }
        }
        
        return res;
    }
}