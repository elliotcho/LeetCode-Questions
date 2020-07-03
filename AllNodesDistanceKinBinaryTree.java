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
    public List<Integer> distanceK(TreeNode root, TreeNode target, int K) {
        ArrayList<Integer> res=new ArrayList<>();
        HashMap<TreeNode, ArrayList<TreeNode>> map=new HashMap<>();
        
        if(K==0){
            res.add(target.val);
            return res;
        }
        
        dfs(root, null, map);
        
        LinkedList<TreeNode> queue=new LinkedList<>();
        queue.add(target);
        
        HashSet<TreeNode> visited=new HashSet<>();
        
        while(K-->0){
            int size=queue.size();
            
            for(int i=0;i<size;i++){
                TreeNode curr=queue.remove();
                
                visited.add(curr);
                
                for(TreeNode adj: map.get(curr)){
                    if(!visited.contains(adj)){
                        if(K==0){
                            res.add(adj.val);
                        }
                    
                        queue.add(adj);
                    }
                }
            }
        }
        
        return res;
    }
    
    private void dfs(TreeNode curr, TreeNode prev, Map<TreeNode, ArrayList<TreeNode>> map){
        if(curr==null){return;}
        
        map.putIfAbsent(curr, new ArrayList<>());
        
        if(prev!=null){
            map.get(curr).add(prev);
            map.get(prev).add(curr);
        }
        
        dfs(curr.left, curr, map);
        dfs(curr.right, curr, map);
    }
}