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
    public boolean findTarget(TreeNode root, int k) {
        ArrayList<Integer> inorder=new ArrayList<>(); 
        
        inorder=dfs(root, inorder);
        
        int start=0, end=inorder.size()-1;
        
        while(start<end){
            int sum=inorder.get(start)+inorder.get(end);
            
            if(sum==k){return true;}
            
            if(sum<k){start++;}
            
            else{end--;}
        }
        
        return false;
    }
    
    public ArrayList<Integer> dfs(TreeNode root, ArrayList<Integer> inorder){
        if(root==null){return inorder;}
        
        if(root.left!=null){inorder=dfs(root.left, inorder);}
        
        inorder.add(root.val);
        
        if(root.right!=null){inorder=dfs(root.right, inorder);}
        
        return inorder;
    }
}