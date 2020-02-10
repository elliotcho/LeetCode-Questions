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
    public List<String> binaryTreePaths(TreeNode root) {
        ArrayList<String> res=new ArrayList<>();
        
        if(root==null){return res;}
        
        String path=String.valueOf(root.val);
        
        if(root.left==null && root.right==null){
            res.add(path);
            return res;
        }
        
        if(root.left!=null){res=dfs(root.left, res, path);}
        if(root.right!=null){res=dfs(root.right, res, path);}
        
        return res;
    }
    
    public ArrayList<String> dfs(TreeNode root, ArrayList<String> res, String path){
        path+="->"+root.val;
        
        if(root.left==null && root.right==null){
            res.add(path);
            return res;
        }
        
        if(root.left!=null){res=dfs(root.left, res, path);}
        if(root.right!=null){res=dfs(root.right, res, path);}
        
        return res;
    }
}