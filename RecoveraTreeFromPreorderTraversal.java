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
    public TreeNode recoverFromPreorder(String S) {
        HashMap<Integer, TreeNode> map=new HashMap<>();
        
        for(int i=0;i<S.length();i+=0){
            int level=0;
            int value=0;    
        
            while(i<S.length() && S.charAt(i)=='-'){
                level++;
                i++;
            }
            
            while(i<S.length() && Character.isDigit(S.charAt(i))){
                value=value*10 + (int)(S.charAt(i)-'0');
                i++;
            }
            
            TreeNode node=new TreeNode(value);
            
            map.put(level, node);
            
            if(level>0){
                TreeNode parent=map.get(level-1);
                
                if(parent.left==null){
                    parent.left=node;
                }
                
                else{
                    parent.right=node;
                }
            }
        }
        
        return map.get(0);
    }
}