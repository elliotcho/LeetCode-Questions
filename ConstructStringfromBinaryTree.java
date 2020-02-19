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
    public String tree2str(TreeNode t) {
        StringBuilder res=new StringBuilder(); 
        
        dfs(t, res);
        
        return res.toString();
    }
    
    public void dfs(TreeNode root, StringBuilder res){
        if(root!=null){
            res.append(root.val);
            
            if(root.left!=null){
                res.append("(");
                dfs(root.left, res);
                res.append(")");
            }
            
            if(root.right!=null){
                if(root.left==null){res.append("()");}
                
                res.append("(");
                dfs(root.right, res);
                res.append(")");
            }
        }
    }
}