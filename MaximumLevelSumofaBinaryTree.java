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
    public int maxLevelSum(TreeNode root) {
        LinkedList<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        
        int max=0, temp=0, level=1, res=0;
        while(queue.size()!=0){
            int size=queue.size();
            temp=0; 
            
            for(int i=0;i<size;i++){
                TreeNode current=queue.remove();
                if(current.left!=null){queue.add(current.left);}
                if(current.right!=null){queue.add(current.right);}
                temp+=current.val;
            }
            
            if(temp>max){
                max=temp;
                res=level;
            }
            
            level++;
        }
        
        return res;
    }
}
