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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null){return root;}
        else if(root.val>key){root.left=deleteNode(root.left, key);}
        else if(root.val<key){root.right=deleteNode(root.right, key);}
        
        else{
            if(root.left==null && root.right==null){root=null;}
            else if(root.left!=null && root.right==null){root=root.left;}
            else if(root.left==null && root.right!=null){root=root.right;}
            
            
            else{
                TreeNode temp=findMin(root.right);
                root.val=temp.val;
                root.right=deleteNode(root.right, root.val);
            }
        }
        
        return root;
    }
    
    
    public TreeNode findMin(TreeNode root){
        if(root==null){return root;}
        
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }
}