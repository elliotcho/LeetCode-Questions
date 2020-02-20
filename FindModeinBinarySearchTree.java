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
    public int[] findMode(TreeNode root) {
        int[] count={0}, max={0}, prev={0};
        
        ArrayList<Integer> list=new ArrayList<>();
        
        inorder(count, max, prev, root, list);
        
        //convert the ArrayList into an array
        int[] res=new int[list.size()];
        
        for(int i=0;i<list.size();i++){res[i]=list.get(i);}
        
        return res;
    }
    
    public void inorder(int[] count, int[] max, int[] prev, TreeNode root, ArrayList<Integer> list){
        if(root==null){return;}
        
        inorder(count, max, prev, root.left, list);
        
        //check if the node's value is equal to the previous node's value
        if(root.val==prev[0]){count[0]++;}
        else{count[0]=1;}
        
        //check if the count of the node's value is equal to max
        if(count[0]==max[0]){list.add(root.val);}
        
        //check if the count of the node's value is greater than max 
        if(count[0]>max[0]){
            list.clear();
            list.add(root.val);
            max[0]=count[0];
        }
        
        prev[0]=root.val;
        
        inorder(count, max, prev, root.right, list);
    }
}