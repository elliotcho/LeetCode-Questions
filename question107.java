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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        LinkedList<List<Integer>> res=new LinkedList<>();
        if(root==null){return res;}
       
        LinkedList<TreeNode> queue=new LinkedList<>();
        queue.add(root); 
        
        while(queue.size()!=0){
            ArrayList<Integer> level=new ArrayList<>();
            
            int size=queue.size(); 
            for(int i=0;i<size;i++){
                TreeNode current=queue.remove();
                
                if(current.left!=null){queue.add(current.left);}
                if(current.right!=null){queue.add(current.right);}
                
                level.add(current.val);
            }
            
            res.addFirst(level);
        }
 
        return res;
    }
}