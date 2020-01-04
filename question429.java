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
    public List<List<Integer>> levelOrder(Node root) {
        ArrayList<List<Integer>> res=new ArrayList<>();
        if(root==null){return res;}
        
        LinkedList<Node> queue= new LinkedList<>();
        queue.add(root); queue.add(null);
        
        ArrayList<Integer> temp=new ArrayList<>();
        
        while(queue.size()!=0){
            Node front=queue.remove();
            
            if(front==null){
                res.add(temp); temp=new ArrayList<>();
                queue.add(null);
                if(queue.getFirst()==null){break;}
            }
            
            else{
                temp.add(front.val);
                for(int i=0;i<front.children.size();i++){
                    queue.add(front.children.get(i));   
                }
            }
        }
        
        return res;
    }
}