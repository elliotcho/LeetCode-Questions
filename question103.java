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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        ArrayList<List<Integer>> res=new ArrayList<>();
        if(root==null){return res;}
        
        LinkedList<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        
        int level=0;            
        while(queue.size()!=0){
            ArrayList<Integer> temp=new ArrayList<>();
            Stack<Integer> stack=new Stack<>();
            
            int size=queue.size();
            for(int i=0;i<size;i++){
                TreeNode current=queue.remove();
                
                if(level%2==0){temp.add(current.val);}
                if(level%2!=0){stack.push(current.val);}
                
                if(current.left!=null){queue.add(current.left);}
                if(current.right!=null){queue.add(current.right);}
            }

            if(level%2!=0){
                while(!stack.isEmpty()){
                    temp.add(stack.pop());
                }
            }
            
            res.add(temp); level++;
        }
        
        return res;
    }
}