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
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        ArrayList<TreeNode> res=new ArrayList<>();
        HashSet<Integer> toDelete=new HashSet<>();
        
        for(int i: to_delete){toDelete.add(i);}
        
        dfs(root, res, toDelete);
        
        if(!toDelete.contains(root.val)){res.add(root);}
        
        return res;
    }
    
    public TreeNode dfs(TreeNode root, List<TreeNode> res, Set<Integer> toDelete){
        if(root==null){return null;}
        
        root.left=dfs(root.left, res, toDelete);
        root.right=dfs(root.right, res, toDelete);
        
        if(toDelete.contains(root.val)){
            if(root.left!=null){res.add(root.left);}
            
            if(root.right!=null){res.add(root.right);}
            
            root=null;
        }
        
        return root;
    }
}