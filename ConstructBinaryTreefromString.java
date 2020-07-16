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
    public TreeNode str2tree(String s) {
        if(s.length() == 0){return null;}
        
        TreeNode[] stack = new TreeNode[s.length()];
        int top = -1;
        
        TreeNode root = null;
        
        int i = 0;
        
        while(i<s.length()){
            char c = s.charAt(i);
            
            if(c == '-' || (c>='0' && c<='9')){
                int start = i;
                
                while(i+1 < s.length() && s.charAt(i+1)>='0' && s.charAt(i+1)<='9'){
                    i++;
                }
                
                int val = Integer.parseInt(s.substring(start, i+1));
        
                TreeNode currNode = new TreeNode(val);
                
                if(root!=null){
                    if(root.left==null){
                        root.left = currNode;
                    }
                    
                    else{
                        root.right = currNode;
                    }
                }
                
                stack[++top] = currNode;   
            }
            
            else if(c=='('){
                root = stack[top];   
            }
            
            else{
                top--;
            }
            
            i++;
        }
        
        return stack[top];
    }
}