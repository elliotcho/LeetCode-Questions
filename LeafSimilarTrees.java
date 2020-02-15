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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> leaves1=new ArrayList<>();
        ArrayList<Integer> leaves2=new ArrayList<>();
        
        leaves1=dfs(root1, leaves1);
        leaves2=dfs(root2, leaves2);
        
        return leaves1.equals(leaves2);
    }
    
    public ArrayList<Integer> dfs(TreeNode root, ArrayList<Integer> leaves){
        if(root==null){return leaves;}
        
        if(root.left==null && root.right==null){leaves.add(root.val);}
        
        leaves=dfs(root.left, leaves);
        leaves=dfs(root.right, leaves);
        
        return leaves;
    }
}