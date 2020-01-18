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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
         ArrayList<Integer> res=new ArrayList<>();        
        
        ArrayList<Integer> left=new ArrayList<>();
        left=inorder(root1, left);
        
        ArrayList<Integer> right=new ArrayList<>();
        right=inorder(root2, right);
        
        int i=0, j=0;
        
        while(i<left.size() && j<right.size()){
            if(left.get(i)<right.get(j)){
                res.add(left.get(i));
                i++;
            }
            
            else{
                res.add(right.get(j));
                j++;
            }
        }
        
        while(i<left.size()){
            res.add(left.get(i));
            i++;
        }
        
        while(j<right.size()){
            res.add(right.get(j));
            j++;
        }
        
        return res;
    }
    
    public ArrayList<Integer> inorder(TreeNode root, ArrayList<Integer> nodes){
        if(root==null){return nodes;}
        
        if(root.left!=null){nodes=inorder(root.left, nodes);}
        nodes.add(root.val);
        if(root.right!=null){nodes=inorder(root.right, nodes);}
        
        return nodes;
    }
}