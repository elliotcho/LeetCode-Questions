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
    public boolean isCousins(TreeNode root, int x, int y) {
        if(root==null){return false;}
        
        LinkedList<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        
        HashMap<Integer, Integer> map=new HashMap<>();
        int level=0;
        
        while(queue.size()!=0){
            int size=queue.size();
       
            for(int i=0;i<size;i++){
                TreeNode current=queue.remove();

                if(current.left!=null){
                    queue.add(current.left);
                    map.put(current.left.val, level);
                }
                
                if(current.right!=null){
                    queue.add(current.right);
                    map.put(current.right.val, level);
                }
                
                if(current.left!=null && current.right!=null){
                    if(current.left.val==x && current.right.val==y){
                        return false;
                    }
                
                    if(current.left.val==y && current.right.val==x){
                        return false;
                    }
                }
            }
            
            level++;
        }
        
        return map.get(x)==map.get(y);
    }
}