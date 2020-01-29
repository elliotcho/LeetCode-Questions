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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        if(root==null){return res;}
     
        LinkedList<TreeNode> queue=new LinkedList<>();
        queue.add(root); queue.add(null);
        
        ArrayList<Integer>temp=new ArrayList<>();
        
        while(queue.size()!=0){
            TreeNode front=queue.remove();
            
            if(front==null){
                res.add(temp); temp=new ArrayList<>();
                queue.add(null);
                if(queue.getFirst()==null){break;}
            }
            
            else{
                temp.add(front.val);
                if(front.left!=null){queue.add(front.left);}
                if(front.right!=null){queue.add(front.right);}
            }
        }
        
        return res;
    }
}
