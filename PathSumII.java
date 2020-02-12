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
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        ArrayList<List<Integer>> res=new ArrayList<>();
        
        dfs(root, sum, new ArrayList<Integer>(), res);
        
        return res;
    }
    
    public void dfs(TreeNode root, int sum, List<Integer> current, List<List<Integer>> res){
        if(root==null){return;}
        
        current.add(root.val);
        
        if(root.left==null && root.right==null && sum-root.val==0){
            res.add(new ArrayList(current));
        }
        
        dfs(root.left, sum-root.val, current, res);
        dfs(root.right, sum-root.val, current, res);
        
        current.remove(current.size()-1);
    }
}