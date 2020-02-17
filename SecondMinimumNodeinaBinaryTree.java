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
    public int findSecondMinimumValue(TreeNode root) {
        if(root==null){return -1;}
        
        Integer[] twoMin={root.val, null};
        
        dfs(root, twoMin);
        
        return twoMin[1]==null? -1: twoMin[1];
    }
    
    public void dfs(TreeNode root, Integer[] twoMin){
        if(root==null){return;}
        
        if((root.val!=twoMin[0] && twoMin[1]==null) || (twoMin[0]<root.val && twoMin[1]>root.val)){
            twoMin[1]=root.val;
        }
        
        else if(root.val==twoMin[0]){
            dfs(root.left, twoMin);
            dfs(root.right, twoMin);
        }
    }
}