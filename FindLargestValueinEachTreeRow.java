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
    public List<Integer> largestValues(TreeNode root) {
        ArrayList<Integer> res= new ArrayList<>();
        if(root==null){return res;}
        
        LinkedList<TreeNode> queue=new LinkedList<>();
        queue.add(root); queue.add(null);
        
        int temp=Integer.MIN_VALUE;
        while(queue.size()!=0){
            TreeNode front=queue.remove();
            
            if(front==null){
                res.add(temp); temp=Integer.MIN_VALUE;
                queue.add(null);
                if(queue.getFirst()==null){break;}
            }
            
            else{
                temp=Math.max(temp, front.val);
                if(front.left!=null){queue.add(front.left);}
                if(front.right!=null){queue.add(front.right);}
            } 
        }
        
        return res;
    }
}
