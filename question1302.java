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
    public int deepestLeavesSum(TreeNode root) {
        if(root==null){return 0;}
        
        LinkedList<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        
        int sum=0;
        while(queue.size()!=0){
            int size=queue.size();
            sum=0;
            
            for(int i=0;i<size;i++){
                TreeNode current=queue.remove();
                if(current.left!=null){queue.add(current.left);}
                if(current.right!=null){queue.add(current.right);}
                sum+=current.val;
            }
        }
        
        return sum;
    }
}