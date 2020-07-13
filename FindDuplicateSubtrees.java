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
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        LinkedList<TreeNode> res = new LinkedList<>();
        
        dfs(root, res, new HashMap<String, Integer>());
        
        return res;
    }
    
    private String dfs(TreeNode root, List<TreeNode> res, Map<String, Integer> map){
        if(root == null){return "";}
        
        String left = dfs(root.left, res, map);
        String right = dfs(root.right, res, map);
        
        String serialized = root.val + "," + left + "," + right;
        
        map.put(serialized, map.getOrDefault(serialized, 0) + 1);
        
        if(map.get(serialized) == 2){
            res.add(root);
        }
        
        return serialized;
    }
}