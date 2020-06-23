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
    public int[] findFrequentTreeSum(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] maxCount = {0};
        
        dfs(root, map, maxCount);
        
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue() == maxCount[0]){
                list.add(entry.getKey());
            }
        }
        
        int[] res=new int[list.size()];
        
        for(int i=0;i<res.length;i++){
            res[i]=list.get(i);
        }
        
        return res;
    }
    
    private int dfs(TreeNode root, HashMap<Integer, Integer> map, int[] maxCount){
        if(root==null){return 0;}
        
        int sum = root.val + dfs(root.left, map, maxCount) + dfs(root.right, map, maxCount);
        
        map.put(sum, map.getOrDefault(sum,0) + 1);
        
        maxCount[0]=Math.max(maxCount[0], map.get(sum));
        
        return sum;
    }
}