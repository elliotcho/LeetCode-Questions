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
    public List<Double> averageOfLevels(TreeNode root) {
        ArrayList<Double> res= new ArrayList<>();
        if(root==null){return res;}
        
        LinkedList<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        
        while(queue.size()!=0){
            double size=queue.size();
            double sum=0;
            
            for(int i=0;i<size;i++){
                TreeNode current=queue.remove();
                sum+=current.val;
                if(current.left!=null){queue.add(current.left);}
                if(current.right!=null){queue.add(current.right);}
            }
            
            res.add(sum/size);
        }
        
        return res;
    }
}