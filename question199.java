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
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> res= new ArrayList<>();
        
        if(root==null){return res;}
        
        LinkedList<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        
        while(queue.size()!=0){
            int size=queue.size();
            
            for(int i=0;i<size;i++){
                TreeNode current=queue.remove();
                
                if(i==0){res.add(current.val);}
                
                if(current.right!=null){queue.add(current.right);}
                if(current.left!=null){queue.add(current.left);}
            }
        }
            
        return res;
    }
}