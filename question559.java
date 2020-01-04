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
    public int maxDepth(Node root) {
        if(root==null){return 0;}
        
        LinkedList<Node> queue=new LinkedList<>();
        
        int res=0;
        queue.add(root); queue.add(null);
        
        while(queue.size()!=0){
            Node front=queue.remove();
            
            if(front==null){
                res++;
                queue.add(null);
                if(queue.getFirst()==null){break;}
            }
            
            else{
                for(int i=0; i<front.children.size();i++){
                    queue.add(front.children.get(i));
                }
            }
        }
        
        return res;
    }
}