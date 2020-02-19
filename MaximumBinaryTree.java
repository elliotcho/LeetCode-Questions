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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return construct(0, nums.length-1, nums);
    }
    
    public TreeNode construct(int start, int end, int[] nums){
        if(start>end){return null;}
        
        int i=findMaxIndex(nums, start, end);
    
        TreeNode root=new TreeNode(nums[i]);
        
        root.left=construct(start, i-1, nums);
        root.right=construct(i+1, end, nums);
        
        return root;
    }
    
    public int findMaxIndex(int[] nums, int start, int end){
        int index=0, max=Integer.MIN_VALUE;
        
        for(int i=start;i<=end;i++){
            if(nums[i]>max){
                index=i;
                max=nums[i];
            }
        }
        
        return index;
    }
}