/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class BSTIterator {
    Stack<TreeNode> stack=new Stack<>();

    public BSTIterator(TreeNode root) {
        while(root!=null){
            stack.push(root);
            root=root.left;
        }
    }
    
    /** @return the next smallest number */
    public int next() {
        TreeNode leftMost=stack.pop();
        
        TreeNode rightNode=leftMost.right;
        
        while(rightNode!=null){
            stack.push(rightNode);
            rightNode=rightNode.left;
        }
        
        return leftMost.val;
    }
    
    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !stack.isEmpty();
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */