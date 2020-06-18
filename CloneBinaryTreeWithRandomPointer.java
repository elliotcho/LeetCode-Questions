/**
 * Definition for Node.
 * public class Node {
 *     int val;
 *     Node left;
 *     Node right;
 *     Node random;
 *     Node() {}
 *     Node(int val) { this.val = val; }
 *     Node(int val, Node left, Node right, Node random) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *         this.random = random;
 *     }
 * }
 */

class Solution {
    public NodeCopy copyRandomBinaryTree(Node root) {
        HashMap<Node, NodeCopy> map=new HashMap<>();
        
        dfs(map, root);
        
        for(Map.Entry<Node, NodeCopy> entry: map.entrySet()){
            entry.getValue().left=map.get(entry.getKey().left);
            entry.getValue().right=map.get(entry.getKey().right);
            entry.getValue().random=map.get(entry.getKey().random);
        }
        
        return map.get(root);
    }
    
    private void dfs(HashMap<Node, NodeCopy> map, Node root){
        if(root==null){return;}
        
        NodeCopy clone=new NodeCopy(root.val);
        
        map.put(root, clone);
        
        dfs(map, root.left);
        dfs(map, root.right);
    }
}