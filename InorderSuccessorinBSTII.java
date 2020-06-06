/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node parent;
};
*/
class Solution {
    public Node inorderSuccessor(Node node) {
        if(node.right!=null){
            return findMin(node.right);
        }
        
        while(node.parent!=null && node==node.parent.right){
            node=node.parent;
        }
        
        return node.parent;
    }
    
    private Node findMin(Node node){
        while(node.left!=null){
            node=node.left;
        }
        
        return node;
    }
}