/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class CBTInserter {
    TreeNode root;
    
    //nodes with less than 2 children
    LinkedList<TreeNode> incomplete; 
    
    public CBTInserter(TreeNode root) {
        this.root=root;
        
        this.incomplete=new LinkedList<>();
        
        LinkedList<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        
        while(!queue.isEmpty()){
            TreeNode curr=queue.remove();
            
            if(curr.left==null || curr.right==null){
                incomplete.add(curr);
            }
            
            if(curr.left!=null){queue.add(curr.left);}
            if(curr.right!=null){queue.add(curr.right);}
        }
    }
    
    public int insert(int v) {
        TreeNode parent=incomplete.getFirst();
        TreeNode newNode=new TreeNode(v);
        
        if(parent.left==null){
            parent.left=newNode;
        }
        
        else{
            parent.right=newNode;
            incomplete.remove();
        }
        
        incomplete.add(newNode);
        
        return parent.val;
    }
    
    public TreeNode get_root() {
        return root;
    }
}
/**
 * Your CBTInserter object will be instantiated and called as such:
 * CBTInserter obj = new CBTInserter(root);
 * int param_1 = obj.insert(v);
 * TreeNode param_2 = obj.get_root();
 */