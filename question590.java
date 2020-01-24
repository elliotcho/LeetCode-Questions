/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    public List<Integer> postorder(Node root) {
        LinkedList<Integer> res=new LinkedList<>();
        Stack<Node> stack=new Stack<>();
        
        if(root==null){return res;}
        stack.push(root);
        
        while(!stack.isEmpty()){
            Node current=stack.pop();
            res.addFirst(current.val);
            
            for(Node child: current.children){
                stack.push(child);
            }
        }
        
        return res;
    }
}