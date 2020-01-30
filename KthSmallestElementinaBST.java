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
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> nodes=new ArrayList<>();
        nodes=inorder(root, nodes);
        return nodes.get(k-1);
    }
    
    public ArrayList<Integer> inorder(TreeNode root, ArrayList<Integer> nodes){
        if(root==null){return nodes;}
        
        if(root.left!=null){nodes=inorder(root.left, nodes);}
        nodes.add(root.val);
        if(root.right!=null){nodes=inorder(root.right, nodes);}
        
        return nodes;
    }
}
