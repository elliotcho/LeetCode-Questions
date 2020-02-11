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
    public int sumNumbers(TreeNode root) {
        if(root==null){return 0;}
        
        ArrayList<Integer> paths=new ArrayList<>();
        
        int currentNum=0, sum=0;
        
        paths=dfs(root, currentNum, paths);
          
        for(int path: paths){sum+=path;}
        
        return sum;
    }
     
    public ArrayList<Integer> dfs(TreeNode root, int currentNum, ArrayList<Integer> paths){
        if(root==null){return paths;}
        
        currentNum=currentNum*10+root.val;
        
        if(root.left==null && root.right==null){
            paths.add(currentNum);
            return paths;
        }
        
        if(root.left!=null){paths=dfs(root.left, currentNum, paths);}
        if(root.right!=null){paths=dfs(root.right, currentNum, paths);}
        
        return paths;
    }
}