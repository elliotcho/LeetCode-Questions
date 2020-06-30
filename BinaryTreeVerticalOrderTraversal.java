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
    public List<List<Integer>> verticalOrder(TreeNode root) {
        ArrayList<List<Integer>> res =new ArrayList<>();
        
        if(root==null){return res;}
        
        HashMap<Integer, ArrayList<Integer>> map=new HashMap<>();
        
        int lowerBound=0;
        int upperBound=0;
        
        LinkedList<TreeNode> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);
        
        LinkedList<Integer> colQueue =new LinkedList<>();
        colQueue.add(0);
        
        while(!nodeQueue.isEmpty()){
            TreeNode node = nodeQueue.remove();
            int col = colQueue.remove();
            
            map.putIfAbsent(col, new ArrayList<>());
            
            map.get(col).add(node.val);
            
            if(node.left!=null){
                nodeQueue.add(node.left);
                colQueue.add(col-1);
                
                lowerBound=Math.min(lowerBound, col-1);
            }
            
            if(node.right!=null){
                nodeQueue.add(node.right);
                colQueue.add(col+1);
                
                upperBound=Math.max(upperBound, col+1);
            }
        }
        
        for(int i=lowerBound;i<=upperBound;i++){
            ArrayList<Integer> temp =new ArrayList<>();
            
            for(int val: map.get(i)){
                temp.add(val);
            }
            
            res.add(temp);
        }
        
        return res;
    }
}