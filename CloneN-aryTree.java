/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    
    public Node() {
        children = new ArrayList<Node>();
    }
    
    public Node(int _val) {
        val = _val;
        children = new ArrayList<Node>();
    }
    
    public Node(int _val,ArrayList<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public Node cloneTree(Node root) {
        HashMap<Node, Node> map = new HashMap<>();
        
        dfs(map, root);
        
        for(Map.Entry<Node, Node> entry: map.entrySet()){
            Node original = entry.getKey();
            Node clone = entry.getValue();
            
            for(Node c: original.children){
                clone.children.add(map.get(c));
            }
        }
        
        return map.get(root);
    }
    
    private void dfs(HashMap<Node, Node> map, Node root){
        if(root==null){return;}
        
        map.put(root, new Node(root.val));
        
        for(Node c: root.children){
            dfs(map, c);
        }
        
        return;
    }
}