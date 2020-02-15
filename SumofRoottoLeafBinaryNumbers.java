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
    public int sumRootToLeaf(TreeNode root) {
        ArrayList<Integer> nums=new ArrayList<>();
        
        nums=dfs(root, nums, 0);
        
        int res=0;
        
        for(int i: nums){res+=i;}
        
        return res;
    }
    
    public ArrayList<Integer> dfs(TreeNode root, ArrayList<Integer> nums, int current){
        if(root==null){return nums;}
        
        current=current*2+root.val;
        
        if(root.left==null && root.right==null){
            nums.add(current);
        }
        
        nums=dfs(root.left, nums, current);
        nums=dfs(root.right, nums, current);
        
        return nums;
    }
}