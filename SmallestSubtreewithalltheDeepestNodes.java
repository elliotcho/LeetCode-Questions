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
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        HashMap<TreeNode, Integer> map = new HashMap<>();
        return dfs(root, map);
    }
    
    private TreeNode dfs(TreeNode root, HashMap<TreeNode, Integer> map){
        int leftHeight = findHeight(root.left, map);
        int rightHeight = findHeight(root.right, map);
        
        if(leftHeight == rightHeight){
            return root;
        }
        
        else if(leftHeight > rightHeight){
            return dfs(root.left, map);
        }
        
        else{
            return dfs(root.right, map);
        }
    }
    
    private int findHeight(TreeNode root, HashMap<TreeNode, Integer> map){
        if(root == null){return -1;}
        
        if(map.containsKey(root)){
            return map.get(root);
        }
        
        int left = findHeight(root.left, map) + 1;
        int right = findHeight(root.right, map) + 1;
        
        int height = Math.max(left, right);
        
        map.put(root, height);
        
        return height;
    }
}