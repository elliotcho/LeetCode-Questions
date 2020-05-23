/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean twoSumBSTs(TreeNode root1, TreeNode root2, int target) {
        HashSet<Integer> set=new HashSet<>();
        
        fillSet(set, root1);
        
        return inSet(set, root2, target);
    }
    
    private void fillSet(HashSet<Integer> set, TreeNode root){
        if(root==null){return;}
        
        set.add(root.val);
        
        fillSet(set, root.left);
        fillSet(set, root.right);
    }
    
    private boolean inSet(HashSet<Integer> set, TreeNode root, int target){
        if(root==null){return false;}
        
        if(set.contains(target-root.val)){
            return true;
        }
        
        return inSet(set, root.left, target) || inSet(set, root.right, target);
    }
}