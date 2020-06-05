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
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        TreeNode target=search(root, p);
        
        if(target==null){return null;}
        
        else if(target.right!=null){
            return findMin(target.right);
        }
        
        else{
            TreeNode successor=null;
            TreeNode ancestor=root;
            
            while(target!=ancestor){
                if(ancestor.val>target.val){
                    successor=ancestor;
                    ancestor=ancestor.left;
                }
                
                else{
                    ancestor=ancestor.right;
                }
            }
            
            return successor;
        }
    }
    
    private TreeNode search(TreeNode root, TreeNode p){
        if(root==null){return null;}
        
        if(root==p){
            return p;
        }
        
        else if(root.val>p.val){
            return search(root.left, p);
        }
        
        else{
            return search(root.right, p);
        }
    }
    
    private TreeNode findMin(TreeNode root){
        while(root.left!=null){
            root=root.left;
        }
        
        return root;
    }
}