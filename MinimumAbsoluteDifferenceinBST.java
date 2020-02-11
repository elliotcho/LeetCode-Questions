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
    public int getMinimumDifference(TreeNode root) {
        int[] arr={-1, Integer.MAX_VALUE};
        
        findDiff(root, arr);
        
        return arr[1];
    }
    
    public void findDiff(TreeNode root, int[] arr){
        if(root==null){return;}
        
        if(root.left!=null){findDiff(root.left, arr);}
        
        if(arr[0]!=-1){arr[1]=Math.min(arr[1], root.val-arr[0]);}
        
        arr[0]=root.val;
        
        if(root.right!=null){findDiff(root.right, arr);}
    }
}