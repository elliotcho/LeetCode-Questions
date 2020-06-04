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
    public TreeNode balanceBST(TreeNode root) {
        ArrayList<Integer> list=new ArrayList<>();
        
        fillList(list, root);
        
        return construct(0, list.size()-1, list);
    }
    
    private void fillList(ArrayList<Integer> list, TreeNode root){
        if(root==null){return;}
        
        fillList(list, root.left);
        
        list.add(root.val);
        
        fillList(list, root.right);
    }
    
    private TreeNode construct(int start, int end, ArrayList<Integer> list){
        if(start>end){return null;}
        
        int mid=start+(end-start)/2;
        
        TreeNode root=new TreeNode(list.get(mid));
        
        root.left=construct(start, mid-1, list);
        root.right=construct(mid+1, end, list);
        
        return root;
    }
}